package Parking_Project;

import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Park {

	public JFrame FrPark;
	public JTextField txtSlot;
	public JTextField txtPlate;
	public JTextField txtIn;
	
	PreparedStatement pst,pst1;


	public Park() {
		FrPark = new JFrame();
		FrPark.getContentPane().setBackground(Color.DARK_GRAY);
		FrPark.setForeground(new Color(0, 0, 0));
		FrPark.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		FrPark.setTitle("Whatchamacallit Parking Space Thingy");
		FrPark.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\imageedit_12_4357411660.png"));
		FrPark.setBounds(100, 100, 700, 500);
		FrPark.setVisible(true);
		FrPark.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrPark.getContentPane().setLayout(null);
		
		JLabel lblSlot = new JLabel("Slot:");
		lblSlot.setFont(new Font("Belgium", Font.BOLD, 19));
		lblSlot.setBounds(115, 78, 62, 21);
		FrPark.getContentPane().add(lblSlot);
		
		JLabel lblPlate = new JLabel("Plate Number:");
		lblPlate.setFont(new Font("Belgium", Font.BOLD, 19));
		lblPlate.setBounds(88, 187, 140, 21);
		FrPark.getContentPane().add(lblPlate);
		
		JLabel lblTimein = new JLabel("Time-In");
		lblTimein.setFont(new Font("Belgium", Font.BOLD, 19));
		lblTimein.setBounds(102, 290, 101, 21);
		FrPark.getContentPane().add(lblTimein);
		
		txtSlot = new JTextField();
		txtSlot.setForeground(Color.WHITE);
		txtSlot.setBackground(new Color(0, 128, 128));
		txtSlot.setFont(new Font("Belgium", Font.BOLD, 18));
		txtSlot.setBounds(52, 110, 182, 44);
		FrPark.getContentPane().add(txtSlot);
		txtSlot.setColumns(10);
		
		txtPlate = new JTextField();
		txtPlate.setForeground(Color.WHITE);
		txtPlate.setBackground(new Color(0, 128, 128));
		txtPlate.setFont(new Font("Belgium", Font.BOLD, 18));
		txtPlate.setColumns(10);
		txtPlate.setBounds(52, 217, 182, 44);
		FrPark.getContentPane().add(txtPlate);
		
		txtIn = new JTextField();
		txtIn.setForeground(Color.WHITE);
		txtIn.setBackground(new Color(0, 128, 128));
		txtIn.setFont(new Font("Belgium", Font.BOLD, 18));
		txtIn.setColumns(10);
		txtIn.setBounds(53, 322, 181, 44);
		FrPark.getContentPane().add(txtIn);
		
		JButton btnPark = new JButton("Park");
		btnPark.setForeground(Color.WHITE);
		btnPark.setBackground(new Color(0, 0, 0));
		btnPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con;
				
				String plateNumber, TimeIn, Slot;
				
				plateNumber = txtPlate.getText();
				TimeIn = txtIn.getText();
				Slot = txtSlot.getText();
				
				try {
					
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\db\\Records.accdb");
					pst = con.prepareStatement("insert into In (Slot, Plate, In) values (?,?,?)");
					pst1 = con.prepareStatement("insert into Details(Slot, Plate, In) values (?,?,?)");
					
					pst.setString(1, Slot);
					pst.setString(2, plateNumber);
					pst.setString(3, TimeIn);
					
					
					pst1.setString(1, Slot);
					pst1.setString(2, plateNumber);
					pst1.setString(3, TimeIn);
		
					
					pst.executeUpdate();
					pst1.executeUpdate();
					
					JOptionPane.showMessageDialog(btnPark,"Recorded");
					
					FrPark.dispose();
					
					new Main_Menu();
					
				} catch (ClassNotFoundException e1) {
					Logger.getLogger(Park.class.getName()).log(Level.SEVERE, null, e1);
					JOptionPane.showMessageDialog(btnPark,e1);
					System.out.println("Error in Connection");
				}
				catch (SQLException e1) {
					Logger.getLogger(Park.class.getName()).log(Level.SEVERE, null, e1);
					System.out.println("Error in Connection");
					JOptionPane.showMessageDialog(btnPark,e1);
				}
			}
		});
		btnPark.setBounds(300, 373, 95, 44);
		FrPark.getContentPane().add(btnPark);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrPark.dispose();
				new Main_Menu();
			}
		});
		btnBack.setBounds(474, 373, 101, 44);
		FrPark.getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\Park.gif"));
		lblNewLabel.setBounds(24, 21, 638, 414);
		FrPark.getContentPane().add(lblNewLabel);
	}

}
