package Parking_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Records {

	private JFrame RcFrame;
	private JTable table;
	private JLabel lblNewLabel;


	public Records() {
		RcFrame = new JFrame();
		RcFrame.getContentPane().setBackground(Color.DARK_GRAY);
		RcFrame.setBackground(Color.BLACK);
		RcFrame.setForeground(Color.WHITE);
		RcFrame.setTitle("Whatchamacallit Parking Space Thingy");
		RcFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\imageedit_12_4357411660.png"));
		RcFrame.setBounds(100, 100, 700, 535);
		RcFrame.setVisible(true);
		RcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RcFrame.getContentPane().setLayout(null);
		table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(91, 67, 514, 350);
		RcFrame.getContentPane().add(scrollPane);
		
		Object [] columns = {"Car Number","Slot","Plate Number","Time-In"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(table);
		panel.setLayout(null);
		
	
		table.setBounds(10, 22, 494, 349);
		//panel.add(table);
		
		JButton btnGnrT = new JButton("Generate Time-In Records");
		btnGnrT.setForeground(Color.WHITE);
		btnGnrT.setBackground(new Color(0, 128, 128));
		btnGnrT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					Connection con;
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\db\\Records.accdb");
					String sql = "select * from In";
					PreparedStatement pst=con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (ClassNotFoundException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					JOptionPane.showMessageDialog(RcFrame,e1);
					System.out.println("Error in Connection");
				}
				catch (SQLException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					System.out.println("Error in Connection");
					JOptionPane.showMessageDialog(RcFrame,e1);
				}
			}
		});
		btnGnrT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnGnrT.setBounds(89, 33, 212, 23);
		RcFrame.getContentPane().add(btnGnrT);
		
		JButton btnGnrTo = new JButton("Generate Time-Out Records");
		btnGnrTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Connection con;
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\db\\Records.accdb");
					String sql = "select * from Out";
					PreparedStatement pst=con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (ClassNotFoundException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					JOptionPane.showMessageDialog(RcFrame,e1);
					System.out.println("Error in Connection");
				}
				catch (SQLException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					System.out.println("Error in Connection");
					JOptionPane.showMessageDialog(RcFrame,e1);
				}
			}
		});
		btnGnrTo.setForeground(Color.WHITE);
		btnGnrTo.setBackground(new Color(0, 128, 128));
		btnGnrTo.setBounds(393, 33, 212, 23);
		RcFrame.getContentPane().add(btnGnrTo);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RcFrame.dispose();
				new Main_Menu();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(new Color(0, 128, 128));
		btnBack.setBounds(300, 428, 116, 23);
		RcFrame.getContentPane().add(btnBack);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\Record and Exit.gif"));
		lblNewLabel.setBounds(21, 24, 640, 437);
		RcFrame.getContentPane().add(lblNewLabel);
	}
}
