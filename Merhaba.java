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
		text = new JTextField(10); /*Bu iki sat�rda, 
		kullan�c�n�n ismini girmesine imkan tan�yan,
	    10 s�tun geni�li�inde bir JTextField bile�eni
	    tan�ml�yoruz ve penceremizin ContentPane'ine ekliyoruz. */
		jfr.getContentPane().add(text);
		buton = new JButton("Tamam");//D��memizi, �zerinde "Tamam"
		//yaz�s� g�r�necek �ekilde olu�turuyoruz. 
		
		jfr.getContentPane().add(buton);//butonumuzu pencerenin contentpane ine ekledik.
		label = new JLabel("Lutfen isminizi giriniz:");//Bu sat�rlarda,
		//ba�lang��ta "Lutfen isminizi girin." yaz�s�n�
		//g�steren bir JLabel olu�turuyoruz ve 
		//pencerenin ContentPane'ine ekliyoruz.
		jfr.getContentPane().add(label);
		
		//JButton'�n addActionListener metodunu, bir ActionListener ile �a��r�yoruz.
		//
		buton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){ //ctionListener,
				//i�inde actionPerformed metodunu bar�nd�ran bir arabirim (interface)dir.
				label.setText("Merhaba "+ text.getText());
			}
		});
		//ctionPerformed metodu yukar�daki gibi tan�mlanm�� bir ActionListener
		//nesnesini JButton'a g�ndererek,
		//d��menin t�klanmas� durumunda yap�lacak �eyi belirlemi� oluyoruz.
		jfr.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Merhaba mr = new Merhaba();

	}

}
