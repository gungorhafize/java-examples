package swingawt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Merhaba {
             
	JTextField text;
	JButton buton;
	JLabel label;
	public Merhaba(){
		
		JFrame jfr = new JFrame("Merhaba");
		jfr.getContentPane().setLayout(new FlowLayout());
		jfr.setSize(400, 150);
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		text = new JTextField(10); /*Bu iki satýrda, 
		kullanýcýnýn ismini girmesine imkan tanýyan,
	    10 sütun geniþliðinde bir JTextField bileþeni
	    tanýmlýyoruz ve penceremizin ContentPane'ine ekliyoruz. */
		jfr.getContentPane().add(text);
		buton = new JButton("Tamam");//Düðmemizi, üzerinde "Tamam"
		//yazýsý görünecek þekilde oluþturuyoruz. 
		
		jfr.getContentPane().add(buton);//butonumuzu pencerenin contentpane ine ekledik.
		label = new JLabel("Lutfen isminizi giriniz:");//Bu satýrlarda,
		//baþlangýçta "Lutfen isminizi girin." yazýsýný
		//gösteren bir JLabel oluþturuyoruz ve 
		//pencerenin ContentPane'ine ekliyoruz.
		jfr.getContentPane().add(label);
		
		//JButton'ýn addActionListener metodunu, bir ActionListener ile çaðýrýyoruz.
		//
		buton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){ //ctionListener,
				//içinde actionPerformed metodunu barýndýran bir arabirim (interface)dir.
				label.setText("Merhaba "+ text.getText());
			}
		});
		//ctionPerformed metodu yukarýdaki gibi tanýmlanmýþ bir ActionListener
		//nesnesini JButton'a göndererek,
		//düðmenin týklanmasý durumunda yapýlacak þeyi belirlemiþ oluyoruz.
		jfr.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Merhaba mr = new Merhaba();

	}

}
