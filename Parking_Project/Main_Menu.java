package Parking_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JEditorPane;

public class Main_Menu {

	public JFrame FrMain;


	public Main_Menu() {
		FrMain = new JFrame();
		FrMain.getContentPane().setBackground(Color.DARK_GRAY);
		FrMain.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		FrMain.setBackground(new Color(51, 153, 153));
		FrMain.setTitle("Whatchamacallit Parking Space Thingy");
		FrMain.setForeground(new Color(0, 139, 139));
		FrMain.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\imageedit_12_4357411660.png"));
		FrMain.setBounds(100, 100, 700, 500);
		FrMain.setVisible(true);
		FrMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrMain.getContentPane().setLayout(null);
		
		JButton btnParking = new JButton("Park");
		btnParking.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnParking.setForeground(Color.WHITE);
		btnParking.setBackground(new Color(0, 128, 128));
		btnParking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrMain.dispose();
				new Parking();
			}
		});
		btnParking.setBounds(103, 90, 144, 69);
		FrMain.getContentPane().add(btnParking);
		
		JButton btnExiting = new JButton("Exit");
		btnExiting.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnExiting.setForeground(Color.WHITE);
		btnExiting.setBackground(new Color(0, 128, 128));
		btnExiting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrMain.dispose();
				new Exit();
				//Exit Fr = new Exit();
				//Fr.tableUpdate();
			}
		});
		btnExiting.setBounds(103, 183, 144, 69);
		FrMain.getContentPane().add(btnExiting);
		
		JButton btnRc = new JButton("Records");
		btnRc.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnRc.setForeground(Color.WHITE);
		btnRc.setBackground(new Color(0, 128, 128));
		btnRc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrMain.dispose();
				new Records();
			}
		});
		btnRc.setBounds(103, 279, 144, 69);
		FrMain.getContentPane().add(btnRc);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\Main_Menu.gif"));
		lblNewLabel.setBounds(25, 25, 631, 411);
		FrMain.getContentPane().add(lblNewLabel);
	}
}
