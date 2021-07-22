package Parking_Project;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;


public class Exit {

	private JFrame FrExit;
	private JTable table;
	private JTextField txtSlot;
	private JTextField txtPlate;
	private JTextField txtIn;
	public JTextField txtOut;
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	Calendar cal = Calendar.getInstance();
	String cTime = sdf.format(cal.getTime());
	String slotNumberGetter;
	Calendar time = new GregorianCalendar();
	String timeIn; //dagdag


	public Exit() {
		FrExit = new JFrame();
		FrExit.getContentPane().setBackground(Color.DARK_GRAY);
		FrExit.setForeground(Color.WHITE);
		FrExit.setBackground(Color.BLACK);
		FrExit.setTitle("Whatchamacallit Parking Space Thingy");
		FrExit.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\imageedit_12_4357411660.png"));
		FrExit.setBounds(100, 100, 700, 500);
		FrExit.setVisible(true);
		FrExit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrExit.getContentPane().setLayout(null);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					int row = table.getSelectedRow();
					String Plate = (table.getModel().getValueAt(row,0)).toString();
					Connection con;
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\db\\Records.accdb");
					String sql = "select * from Details where Plate = '" + Plate + "' ";
					PreparedStatement pst=con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					
					while (rs.next()) {
						txtSlot.setText(rs.getString("Slot"));
						txtPlate.setText(rs.getString("Plate"));
						txtIn.setText(rs.getString("In"));
					}
				
					
				}catch (ClassNotFoundException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					JOptionPane.showMessageDialog(FrExit,e1);
					System.out.println("Error in Connection");
				}
				catch (SQLException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					System.out.println("Error in Connection");
					JOptionPane.showMessageDialog(FrExit,e1);
				}
				
			}
		});
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(254, 89, 386, 315);
		FrExit.getContentPane().add(scrollPane);
		
		//Table Display
		Object [] columns = {"Slot","Plate","Time-In"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		JPanel panel = new JPanel();
		scrollPane.setViewportView(table);
		panel.setLayout(null);
		
		table.setBounds(10, 11, 366, 293);
		
		//Up to here
		
		JLabel lblNewLabel = new JLabel("Slot:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(62, 163, 67, 21);
		FrExit.getContentPane().add(lblNewLabel);
		
		JLabel lblPlate = new JLabel("Plate Number:");
		lblPlate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblPlate.setBounds(62, 222, 89, 21);
		FrExit.getContentPane().add(lblPlate);
		
		JLabel lblTimein = new JLabel("Time-In:");
		lblTimein.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTimein.setBounds(62, 282, 67, 21);
		FrExit.getContentPane().add(lblTimein);
		
		txtSlot = new JTextField();
		txtSlot.setForeground(Color.WHITE);
		txtSlot.setBackground(new Color(0, 128, 128));
		txtSlot.setBounds(88, 183, 119, 28);
		FrExit.getContentPane().add(txtSlot);
		txtSlot.setColumns(10);
		
		txtPlate = new JTextField();
		txtPlate.setForeground(Color.WHITE);
		txtPlate.setBackground(new Color(0, 128, 128));
		txtPlate.setColumns(10);
		txtPlate.setBounds(88, 243, 119, 28);
		FrExit.getContentPane().add(txtPlate);
		
		txtIn = new JTextField();
		txtIn.setForeground(Color.WHITE);
		txtIn.setBackground(new Color(0, 128, 128));
		txtIn.setColumns(10);
		txtIn.setBounds(88, 301, 119, 30);
		FrExit.getContentPane().add(txtIn);

		JButton btnGnrT = new JButton("Generate Table");
		btnGnrT.setForeground(Color.WHITE);
		btnGnrT.setBackground(new Color(0, 0, 0));
		btnGnrT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					Connection con;
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\db\\Records.accdb");
					String sql = "select * from Details";
					PreparedStatement pst=con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (ClassNotFoundException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					JOptionPane.showMessageDialog(FrExit,e1);
					System.out.println("Error in Connection");
				}
				catch (SQLException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					System.out.println("Error in Connection");
					JOptionPane.showMessageDialog(FrExit,e1);
				}
			}
		});
		btnGnrT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGnrT.setBounds(80, 82, 140, 30);
		FrExit.getContentPane().add(btnGnrT);
		
		//dagdag
		timeIn = txtIn.getText().toString() ;
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrExit.dispose();
				new Main_Menu();
			}
		});
		btnBack.setBounds(145, 368, 89, 36);
		FrExit.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
					
					Connection con;
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\db\\Records.accdb");
					String query = "delete * from Details where Plate = '" + txtPlate.getText() + "' ";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					String sql = "select * from Details";
					PreparedStatement pst1=con.prepareStatement(sql);
					ResultSet rs = pst1.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				
					Amount Aset  = new Amount ();
					Aset.In = timeIn ;//dagdag
					Aset.txtOut.setText(cTime);
					
					Aset.PlateN = txtPlate.getText();
					Aset.txtTimeIn.setText(txtIn.getText());
					
					txtSlot.setText("");
					txtPlate.setText("");
					txtIn.setText("");
					
					FrExit.dispose();
				}catch (ClassNotFoundException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					JOptionPane.showMessageDialog(FrExit,e1);
					System.out.println("Error in Connection");
				}
				catch (SQLException e1) {
					Logger.getLogger(Exit.class.getName()).log(Level.SEVERE, null, e1);
					System.out.println("Error in Connection");
					JOptionPane.showMessageDialog(FrExit,e1);
				}
				
				
				
				
			}
		});
		btnExit.setBounds(46, 368, 89, 36);
		FrExit.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\Record and Exit.gif"));
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(22, 23, 640, 416);
		FrExit.getContentPane().add(lblNewLabel_1);
	}
}
