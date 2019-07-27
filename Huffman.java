import java.awt.FlowLayout;
import java.io.*;
import java.io.File;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
public class Huffman 
{ 
	public static void main(String args[]) {
		JFrame jfr = new JFrame("***Huffman Coding - Dynamic and Static***");
		jfr.setSize(600, 350);
		jfr.getContentPane().setLayout(new FlowLayout());
		JLabel label = new JLabel("Dosya Ýsmi:");
		jfr.getContentPane().add(label);
		final JLabel label1 = new JLabel("                                       ");
		jfr.getContentPane().add(label1);
		JLabel label2 = new JLabel("Dosya Boyutu:");
		jfr.getContentPane().add(label2);
		final JLabel label3 = new JLabel("                                       ");
		jfr.getContentPane().add(label3);
	    final JButton buton = new JButton("Dosya Yükle");
	    jfr.getContentPane().add(buton);
		final JFileChooser fc = new JFileChooser();
		fc.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));	fc.setCurrentDirectory(new java.io.File("C:/Users/Hafize/Desktop"));
		fc.setDialogTitle("Dosya Seç");
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		
		buton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){ //ActionListener,
				if(fc.showOpenDialog(buton)== JFileChooser.APPROVE_OPTION){
					System.out.println(fc.getSelectedFile().getName());
					label1.setText(fc.getSelectedFile().getName());
					File dosya = new File("fc");
					double dosyaBoyutu = dosya.length();
					double dosyaBoyutuKB = dosyaBoyutu / 1024;
					double bytes = fc.getSelectedFile().length();
					label3.setText(String.valueOf(dosyaBoyutuKB));
				}
				
			}
		});
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfr.setVisible(true);
		
		/*Static Huffman*/
		
		Huffman staticHuffman = new Huffman();
		if (args.length == 3){long startTime = System.currentTimeMillis();
		if (args[0].compareTo("-d") == 0) {
			System.out.print("Decoding");
			staticHuffman.decode(args[1], args[2]);
		} else if (args[0].compareTo("-e") == 0) {
			System.out.println("Encoding");
			staticHuffman.encode(args[1], args[2]);
			System.out.println(" Sýkýþtýrma Oraný %" + (100 - (new File(args[2])).length() * 100 / (new File(args[1])).length()));
		} else {
			System.out.println("illegal parameter!");
			return;
		}
		System.out.println(" took " + (System.currentTimeMillis() - startTime) + " miliseconds.");
		} else {
			System.out.println("USAGE: java SHuffman -option inputFile outputFile");
			System.out.println("\toptions are:");
			System.out.println("\t -d decode (uncompress)");
			System.out.println("\t -e encode (compress)");
		}
			
		}
	public Huffman() {
		freqTable = new int[257]; /* + 1 for EOF */
		table = new Tree[257];
	}//end of constructor
/*Bu fonksiyon huffman kodlamasý yapýlmýþ input dosyasýný decode ediyor orijinal haline döndürür.*/
   public void decode(String inputFile, String outputFile) {
	inputFile = "sample1.txt";
	DataInputStream in = null;
	BufferedOutputStream out = null;
	try {
		in = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFile)));
		out = new BufferedOutputStream(new FileOutputStream(outputFile));
	}
	catch (FileNotFoundException e) {e.printStackTrace(); System.exit(1);}
	try {

		// load freqTable
		for (int i = 0; i < 256; i++) {
			freqTable[i] = in.readInt();
		}
		// generate Huffman Tree
		freqTable[256] = 1;
		Tree root = buildHuffmanTree();

		Tree iterator = root; // start at root
		int bitNumber = 7;
		int nextByte;

		while ((nextByte = in.read()) != -1) {
			while (true) {
				if (iterator.left != null) { // is a leaf? no
					if ((1 << bitNumber & (byte) nextByte) == 0) iterator = iterator.left;
					 else iterator = iterator.right;
					if (bitNumber-- == 0) {bitNumber = 7; break;}
				} else { // is a leaf? yes
					if (iterator == table[256]) break;
					out.write(iterator.val);
					iterator = root; // go back to the root
				}
			}
		}
		in.close();
		out.close();
	} catch (IOException e) {e.printStackTrace(); System.exit(2);}
}
	/* this function encodes given input file and produces a Huffman coded file */
	public void encode(String inputFile, String outputFile) {
		buildFreqTable(inputFile); // generate frequency table
		Tree root = buildHuffmanTree(); // build huffman tree

		BufferedInputStream in = null;
		DataOutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(inputFile));
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)));
		} catch (FileNotFoundException e) {e.printStackTrace(); System.exit(1);}

		try {
			Tree temp;
			int intRead;
			byte data[] = new byte[1000]; // stack like structure
			int top; // top value for data[]
			int nextByte = 0;
			int bitNumber = 7;

			// write freq table
			for (int i = 0; i < 256; i++) {
				out.writeInt(freqTable[i]);
			}

			// write code
			while ((intRead = in.read()) != -1) {
				if (table[intRead] != null) {
					temp = table[intRead];
					top = 0;
					while (temp.parent != null) {
						if (temp.parent.left == temp) data[top++] = 0;
						 else data[top++] = 1;
						temp = temp.parent;
					}
					for (int i = top; i > 0; i--) {
						if (data[--top] == 1) // write 1
						 nextByte |= 1 << bitNumber;
						if (bitNumber-- == 0) {
							bitNumber = 7;
							out.write(nextByte);
							nextByte = 0;
						}
					}
				} else {System.out.println("this should not happen"); System.exit(2);}
			};
			// write eof
			temp = table[256];
			top = 0;
			while (temp.parent != null) {
				if (temp.parent.left == temp) data[top++] = 0;
				 else data[top++] = 1;
				temp = temp.parent;
			}
			for (int i = top; i > 0; i--) {
				if (data[--top] == 1) // write 1
				 nextByte |= 1 << bitNumber;
				if (bitNumber-- == 0) {
					bitNumber = 7;
					out.write(nextByte);
					nextByte = 0;
				}
			}
			in.close();
			if (bitNumber < 7) out.write(nextByte);
			out.close();
		} catch (IOException e) {e.printStackTrace(); System.exit(2);}
	}
	private Tree buildHuffmanTree() {

		LinkedList list = new LinkedList();

		for (int i = 0; i < 257; i++) {
			if (freqTable[i] > 0) {
				int j = 0;
				for (; j < list.size(); j++)
					if (((Tree) list.get(j)).weight >= freqTable[i]) break;
				list.add(j, table[i] = new Tree(i, freqTable[i], null, null, null));
			}
		}

		while (list.size() > 1) {
			Tree left = (Tree) list.removeFirst();
			Tree right = (Tree) list.removeFirst();
			Tree tmpTree = new Tree(0, left.weight + right.weight, left, right, null);
			left.parent = tmpTree;
			right.parent = tmpTree;
			int i = 0;
			for (; i < list.size(); i++)
				if (((Tree) list.get(i)).weight >= tmpTree.weight) break;
			list.add(i, tmpTree);
		}

		return (Tree) list.removeFirst();
	} /* end of private Tree buildHuffmanTree() */

	/* this function generates frequency table from given file */
	private void buildFreqTable(String inputFile) {
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(inputFile));
		} catch (Exception e) {e.printStackTrace(); System.exit(1);}

		try {
			int ch;
			while ((ch = in.read()) != -1) {
					freqTable[ch]++;
			}
			freqTable[256] = 1;
			in.close();
		} catch (Exception e) {e.printStackTrace(); System.exit(2);}
	} /* end of private void buildFreqTable(String inputFile) */

	private int freqTable[]; // frequency table
	private Tree table[]; // fast look up for leaves

	private class Tree {

		Tree() {
			val = 0;
			weight = 0;
			left = null;
			right = null;
			parent = null;
		} // end of default constructor

		Tree(int value, int wei, Tree l, Tree r, Tree p) {
			val = value;
			weight = wei;
			left = l;
			right = r;
			parent = p;
		} // end of constructor Tree(int value, int wei, Tree l, Tree r, Tree p)

		Tree parent;
		Tree left;
		Tree right;
		int val;
		int weight;
	} /* end of private class Tree */

}


