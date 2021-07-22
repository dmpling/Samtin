package Parking_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Amount {

	public JFrame FrAmount;
	public JTextField txtOut;
	public JTextField txtDuration;
	public JTextField txtTimeIn;
	public String In, PlateN, Amountt;

	PreparedStatement pst;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	


	public Amount() {
		
		FrAmount = new JFrame();
		FrAmount.getContentPane().setBackground(Color.DARK_GRAY);
		FrAmount.setForeground(Color.WHITE);
		FrAmount.setBackground(Color.BLACK);
		FrAmount.setTitle("Whatchamacallit Parking Space Thingy");
		FrAmount.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\imageedit_12_4357411660.png"));
		FrAmount.setBounds(100, 100, 700, 500);
		FrAmount.setVisible(true);
		FrAmount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrAmount.getContentPane().setLayout(null);
		
	
		JLabel lblNewLabel = new JLabel("Time-Out:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel.setBounds(90, 186, 75, 24);
		FrAmount.getContentPane().add(lblNewLabel);
		
		JLabel lblAmount = new JLabel("Duration (In Mins):");
		lblAmount.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblAmount.setBounds(28, 239, 137, 24);
		FrAmount.getContentPane().add(lblAmount);
		
		txtOut = new JTextField();
		txtOut.setEditable(false);
		txtOut.setForeground(Color.WHITE);
		txtOut.setBackground(new Color(0, 128, 128));
		txtOut.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtOut.setBounds(175, 180, 144, 37);
		FrAmount.getContentPane().add(txtOut);
		txtOut.setColumns(10);
		
		txtDuration = new JTextField();
		txtDuration.setForeground(Color.WHITE);
		txtDuration.setBackground(new Color(0, 128, 128));
		txtDuration.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtDuration.setColumns(10);
		txtDuration.setBounds(175, 233, 144, 37);
		FrAmount.getContentPane().add(txtDuration);
		
		txtTimeIn = new JTextField();
		txtTimeIn.setEditable(false);
		txtTimeIn.setForeground(Color.WHITE);
		txtTimeIn.setBackground(new Color(0, 128, 128));
		txtTimeIn.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtTimeIn.setColumns(10);
		txtTimeIn.setBounds(175, 128, 144, 37);
		FrAmount.getContentPane().add(txtTimeIn);
	
		
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnOkay.setForeground(Color.WHITE);
		btnOkay.setBackground(Color.BLACK);
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				String TimeOut = txtOut.getText();
				Amountt = txtDuration.getText();
				double dDuration; 
				double iduration, subTotal, Tax, Total, Payment;
				String ssubTotal, sTax, sTotal;
				
				
				try {
					
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\db\\Records.accdb");
					pst = con.prepareStatement("insert into Out (Plate, Out, Duration) values (?,?,?)");
					
					
					pst.setString(1, PlateN);
					pst.setString(2, TimeOut);
					pst.setString(3, Amountt);
				
					pst.executeUpdate();
					
					Invoice inv = new Invoice();

					iduration = Double.parseDouble(Amountt);
					inv.itxtDuration.setText(Amountt);
					
					inv.textTimeIn.setText(txtTimeIn.getText());
					inv.textTimeOut.setText(txtOut.getText());
					
					subTotal = iduration*3.00;
					Tax = subTotal*0.08;
					Total = subTotal + Tax;
					
					ssubTotal = Double.toString(subTotal);
					sTax = Double.toString(Tax);
					sTotal = Double.toString(Total);
					
					inv.txtSubTotal.setText(ssubTotal);
					inv.txtTax.setText(sTax); 
					inv.txtTotal.setText(sTotal);

					FrAmount.dispose();
					//new Exit();
					

				} catch (ClassNotFoundException e1) {
					Logger.getLogger(Park.class.getName()).log(Level.SEVERE, null, e1);
					JOptionPane.showMessageDialog(btnOkay,e1);
					System.out.println("Error in Connection");
				}
				catch (SQLException e1) {
					Logger.getLogger(Park.class.getName()).log(Level.SEVERE, null, e1);
					System.out.println("Error in Connection");
					JOptionPane.showMessageDialog(btnOkay,e1);
				}
			}
		});
		btnOkay.setBounds(294, 348, 119, 60);
		FrAmount.getContentPane().add(btnOkay);
		
		JLabel lblTimein = new JLabel("Time-In:");
		lblTimein.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblTimein.setBounds(90, 134, 75, 24);
		FrAmount.getContentPane().add(lblTimein);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\Amount.gif"));
		lblNewLabel_1.setBounds(21, 21, 641, 418);
		
		FrAmount.getContentPane().add(lblNewLabel_1);
	}
}
