import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
public class exp6 {
	private JFrame frame;
	private JTextField textField;
	
	Connection con;
	Statement st;
    ResultSet result;
    private JTable table;
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exp6 window = new exp6();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public exp6() {
		createwindow();
		
		try {
			con = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql:///test", "root", "");
			//Veritabaný ismi java_exp6
			
			st = con.createStatement();
			
			st.executeUpdate("Drop Table if exists books");
			st.executeUpdate("Create Table books (Book_Name varchar(150), Author varchar(50) , Book_Number varchar(3)) ");
			
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Great Gatsby','F. Scott Fitzgerald','1') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Fault in Our Stars','John Grenn','2') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Divergent','Veronica Roth','3') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Allegiant','Veronica Roth','4') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Gone Girl','Gillian Flynn','5') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Insurgent','Veronica Roth','6') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Hobbit','J.R.R. Tolkien','7') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Catcher in the Rye','J.D. Salinger','8') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Life of Pi',' Yann Martel','9') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Wild: From Lost to Found on the Pacific Crest Trail','Cheryl Strayed','10') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Book Thief','Markus Zusak','11') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Slaughterhouse-Five','Kurt Vonnegut','12') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Night Circus','Erin Morgenstern','13') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Looking for Alaska','John Green','14') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Catching Fire','Suzanne Collins','15') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Hunger Games','Suzanne Collins','16') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Where''d You Go, Bernadette','Maria Semple','17') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Ocean at the End of the Lane','Neil Gaiman','18') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Clockwork Princess','Cassandre Clare','19') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('To Kill a Mockingbird','Harper Lee','20') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('City of Lost Souls','Cassandre Clare','21') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Brave new World','Paperback','22') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Fahrenheit 451','Ray Bradbury','23') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Perks of Being A Wallflower','Stephen Chbosky','24') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Quiet: The Power of Introverts in a World That Can''t Stop Talking','Susan Cain','25') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Harry Potter and the Chamber of Secrets ','J.K Rowling','26') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Harry Potter and the Sorcerer's Stone','J.K Rowling','27') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Harry Potter and the Goblet of Fire','J.K Rowling','28') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Miss Peregrine’s Home for Peculiar Children (Miss Peregrine’s Peculiar Children, #1) ','Ransom Riggs','29') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('A Game of Thrones (A Song of Ice and Fire, #1)','George R.R Martin','30') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('World War Z: An Oral History of the Zombie War (Hardcover) ','Max brooks','31') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Casual Vacancy (Hardcover)','J.K Rowling','32') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Harry Potter and the Prisoner of Azkaban (Harry Potter, #3) ','R.K Rowling','33') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Unbroken: A World War II Story of Survival, Resilience, and Redemption (Hardcover)',' Laura Hillenbrand','34') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('City of Bones (The Mortal Instruments, #1)',' Cassandra Clare','35') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Wuthering Heights (Paperback)',' Emily Brontë','36') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Bossypants (Kindle Edition) ',' Tina Fey','37') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('1984 (Mass Market Paperback) ',' George Orwell','38') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Pride and Prejudice (Paperback)',' Jane Austen','39') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Life After Life (Hardcover)',' Kate Atkinson','40') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Ender's Game (Ender's Saga, #1)',' Orson Scott Card','41') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Matched (Matched, #1)',' Ally Condie','42') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('City of Fallen Angels (The Mortal Instruments, #4) ',' Cassandra Clare','43') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Hitchhiker's Guide to the Galaxy (Hitchhiker's Guide to the Galaxy, #1) ',' Douglas Adams','43') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Mockingjay (The Hunger Games, #3)',' Suzanne Collins','44') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Road (Hardcover)',' Cormac McCarthy','45') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('A Clash of Kings (A Song of Ice and Fire, #2)',' George R.R. Martin','46') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('The Fellowship of the Ring (The Lord of the Rings, #1)',' J.R.R. Tolkien','47') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Animal Farm (Paperback)',' George Orwell','48') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('A Farewell to Arms (Paperback)',' Ernest Hemingway','49') ");
	        st.executeUpdate("Insert into books(Book_Name,Author,Book_Number) values ('Gone Girl (Paperback) ',' Gillian Flynn','50') ");

	        System.out.println("eklendi");
			
			
		}catch (Exception e) {
			System.out.println("hata: " + e.getMessage());
		}
	}


	private void createwindow() {
		frame = new JFrame("2013 yýlýnda en çok okunan kitaplar");
		frame.setBounds(100, 100, 436, 260);
		frame.setBackground(Color.blue);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton bt = new JButton("ARA");
		bt.setFont(new Font("SansSerif", Font.PLAIN, 11));
		bt.setBackground(Color.gray);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (!con.isClosed()) {						
						
						//int BookNumber = Integer.parseInt(textField.getText());
						String Book_Number = textField.getText();
						
						st = con.createStatement();
				        result = st.executeQuery("select Book_Name, Author from books where Book_Number='" + Book_Number + "'   ");
				        
				        
				        int kolSayisi   = result.getMetaData().getColumnCount();
				        //veritabaný sutun sayýsýný aldýk.
		                DefaultTableModel tablo = new DefaultTableModel();
		                //yeni tablo oluþturduk.
		                for(int i=1 ; i<=kolSayisi;i++){
		                    tablo.addColumn(result.getMetaData().getColumnName(i));
		                    //tablo sutunu eklemek için yazýldý		                }
		                while(result.next()){
		                    Object [] satir = new Object[kolSayisi];
		                    
		                    for(int  j=1;j<=kolSayisi;j++){
		                        satir[j-1] = result.getObject(j);
		                    }
		                        tablo.addRow(satir);
		                }
		                
		                
		                table.setModel(tablo);
					}
					
					}}catch (Exception e) {
					System.out.println("hata: " + e.getMessage());
				}
				
			}
		});
		
		bt.setBounds(244, 10, 141, 23);
		frame.getContentPane().add(bt);
		
		JLabel lblBookId = new JLabel("Kitap numarasýný gir");
		lblBookId.setBounds(84, 43, 122, 14);
		frame.getContentPane().add(lblBookId);
		
		textField = new JTextField();
		textField.setBounds(84, 12, 150, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(46, 201, 220, -89);
		frame.getContentPane().add(table);
		
		JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 69, 400, 141);
        frame.getContentPane().add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
		
        

}
}




