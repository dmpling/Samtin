package Parking_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Parking {

	public JFrame FrParking;

	JButton s1 = new JButton("Slot 1");
	JButton s2 = new JButton("Slot 2");
	JButton s3 = new JButton("Slot 3");
	JButton s4 = new JButton("Slot 4");
	JButton s5 = new JButton("Slot 5");
	JButton s6 = new JButton("Slot 6");
	JButton s7 = new JButton("Slot 7");
	JButton s8 = new JButton("Slot 8");
	JButton s9 = new JButton("Slot 9");
	JButton s10 = new JButton("Slot 10");
	
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	Calendar cal = Calendar.getInstance();
	String cTime = sdf.format(cal.getTime());
	String slotNumberGetter;
	Calendar time = new GregorianCalendar();
	
	private final JLabel lblNewLabel = new JLabel("");
	
	
	public Parking() {
		
		FrParking = new JFrame();
		FrParking.getContentPane().setBackground(Color.DARK_GRAY);
		FrParking.setForeground(new Color(0, 0, 0));
		FrParking.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		FrParking.setTitle("Whatchamacallit Parking Space Thingy");
		FrParking.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\imageedit_12_4357411660.png"));
		FrParking.setBounds(100, 100, 700, 500);
		FrParking.setVisible(true);
		FrParking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrParking.getContentPane().setLayout(null);
		
		s1.setFont(new Font("Roboto", Font.PLAIN, 13));
		s1.setForeground(Color.WHITE);
		s1.setBackground(new Color(0, 139, 139));
		s1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Park slot = new Park();
			FrParking.dispose();
			
				if (s1.getText().equals("Slot 1")) {
					
					slot.txtSlot.setText("Slot 1");
					slot.txtSlot.setEditable(false);
					
					slot.txtIn.setText(cTime);
				}
				
			}
		});
		
		
		s1.setBounds(64, 40, 89, 80);
		FrParking.getContentPane().add(s1);
		s2.setFont(new Font("Roboto", Font.PLAIN, 13));
		s2.setForeground(Color.WHITE);
		s2.setBackground(new Color(0, 139, 139));
		
		s2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Park slot = new Park();
			FrParking.dispose();
			
				if (s2.getText().equals("Slot 2")) {
					slot.txtSlot.setText("Slot 2");
					slot.txtSlot.setEditable(false);
					
					slot.txtIn.setText(cTime);
				}


			}
		});
		
		
		s2.setBounds(183, 40, 89, 80);
		FrParking.getContentPane().add(s2);
		s3.setFont(new Font("Roboto", Font.PLAIN, 13));
		s3.setForeground(Color.WHITE);
		s3.setBackground(new Color(0, 139, 139));
		
		s3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Park slot = new Park();
			FrParking.dispose();
				
				if (s3.getText().equals("Slot 3")) {
					slot.txtSlot.setText("Slot 3");
					slot.txtSlot.setEditable(false);
					
					slot.txtIn.setText(cTime);
				}
			}
		});
		
		
		s3.setBounds(301, 40, 89, 80);
		FrParking.getContentPane().add(s3);
		s4.setFont(new Font("Roboto", Font.PLAIN, 13));
		s4.setForeground(Color.WHITE);
		s4.setBackground(new Color(0, 139, 139));
		
		s4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Park slot = new Park();
			FrParking.dispose();
				
				if (s4.getText().equals("Slot 4")) {
					slot.txtSlot.setText("Slot 4");
					slot.txtSlot.setEditable(false);
					 
					slot.txtIn.setText(cTime);
				}
			}
		});
		
		
		s4.setBounds(420, 40, 89, 80);
		FrParking.getContentPane().add(s4);
		s5.setFont(new Font("Roboto", Font.PLAIN, 13));
		s5.setForeground(Color.WHITE);
		s5.setBackground(new Color(0, 139, 139));
		
		s5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Park slot = new Park();
			FrParking.dispose();
				
				if (s5.getText().equals("Slot 5")) {
					slot.txtSlot.setText("Slot 5");
					slot.txtSlot.setEditable(false);
					
					slot.txtIn.setText(cTime);
				}
			}
		});
		
		
		s5.setBounds(543, 40, 89, 80);
		FrParking.getContentPane().add(s5);
		s6.setFont(new Font("Roboto", Font.PLAIN, 13));
		s6.setForeground(Color.WHITE);
		s6.setBackground(new Color(0, 139, 139));
		
		
		s6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Park slot = new Park();
			FrParking.dispose();
				
				if (s6.getText().equals("Slot 6")) {
					slot.txtSlot.setText("Slot 6");
					slot.txtSlot.setEditable(false);
					
					slot.txtIn.setText(cTime);
				}
			}
		});
		
		
		s6.setBounds(64, 337, 89, 80);
		FrParking.getContentPane().add(s6);
		s7.setFont(new Font("Roboto", Font.PLAIN, 13));
		s7.setForeground(Color.WHITE);
		s7.setBackground(new Color(0, 139, 139));
		
		s7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			Park slot = new Park();
			FrParking.dispose();
				
				if (s7.getText().equals("Slot 7")) {
					slot.txtSlot.setText("Slot 7");
					slot.txtSlot.setEditable(false);
					
					slot.txtIn.setText(cTime);
				}
			}
		});
		
		
		s7.setBounds(183, 337, 89, 80);
		FrParking.getContentPane().add(s7);
		s8.setFont(new Font("Roboto", Font.PLAIN, 13));
		s8.setForeground(Color.WHITE);
		s8.setBackground(new Color(0, 139, 139));
		
		s8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Park slot = new Park();
			FrParking.dispose();
				
				if (s8.getText().equals("Slot 8")) {
					slot.txtSlot.setText("Slot 8");
					slot.txtSlot.setEditable(false);
					 
					slot.txtIn.setText(cTime);
				}
			}
		});
		
		
		s8.setBounds(301, 337, 89, 80);
		FrParking.getContentPane().add(s8);
		s9.setFont(new Font("Roboto", Font.PLAIN, 13));
		s9.setForeground(Color.WHITE);
		s9.setBackground(new Color(0, 139, 139));
		
		s9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Park slot = new Park();
			FrParking.dispose();
				
				if (s9.getText().equals("Slot 9")) {
					slot.txtSlot.setText("Slot 9");
					slot.txtSlot.setEditable(false);
					
					slot.txtIn.setText(cTime);
				}
			}
		});
		
		
		s9.setBounds(420, 337, 89, 80);
		FrParking.getContentPane().add(s9);
		s10.setFont(new Font("Roboto", Font.PLAIN, 13));
		s10.setForeground(Color.WHITE);
		s10.setBackground(new Color(0, 139, 139));
		
		s10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Park slot = new Park();
			FrParking.dispose();
				
				if (s10.getText().equals("Slot 10")) {
					slot.txtSlot.setText("Slot 10");
					slot.txtSlot.setEditable(false);
				 
					slot.txtIn.setText(cTime);
				}
			}
		});
		
		
		s10.setBounds(543, 337, 89, 80);
		FrParking.getContentPane().add(s10);
		lblNewLabel.setIcon(new ImageIcon("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\Parking.gif"));
		lblNewLabel.setBounds(22, 21, 641, 414);
		
		FrParking.getContentPane().add(lblNewLabel);
	}

}
