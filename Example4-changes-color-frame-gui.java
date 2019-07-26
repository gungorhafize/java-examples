package exp4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;


	public class exp4 extends JFrame implements ActionListener {
		public exp4() {
			setLayout(new FlowLayout());
			JButton buttonb = new JButton("Blue");
			JButton buttong = new JButton("Gray");
			JButton buttonr = new JButton("Red");
			JButton buttongr = new JButton("Green");
			buttonr.addActionListener(this);
			buttonb.addActionListener(this);
			buttong.addActionListener(this);
			buttongr.addActionListener(this);
			add(buttonr);
			add(buttonb);
			add(buttong);
			add(buttongr);
			setTitle("Baslik");
			setSize(500, 500);
			setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Red")) {
				getContentPane().setBackground(Color.red);	
			}
			 else if (e.getActionCommand().equals("Green")) {
			    getContentPane().setBackground(Color.green);
			}else if (e.getActionCommand().equals("Blue")) {
				getContentPane().setBackground(Color.blue);
			} else if (e.getActionCommand().equals("Gray")) {
				getContentPane().setBackground(Color.gray);
			}
		}

		public static void main(String[] args) {
			new exp4();
		}

	}

