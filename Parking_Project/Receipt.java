package Parking_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Receipt {

	public JFrame frmWhatchamacallitParkingThingy;
	public JTextField txtIn;
	public JTextField txtOut;
	public JTextField txtDuration;
	public JTextField txtSubTotal;
	public JTextField txtTax;
	public JTextField txtTotal;
	public JTextField txtPayment;
	public JTextField txtChange;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtReceipt;
	
	public Receipt() {
		frmWhatchamacallitParkingThingy = new JFrame();
		frmWhatchamacallitParkingThingy.getContentPane().setBackground(Color.DARK_GRAY);
		frmWhatchamacallitParkingThingy.setBackground(Color.BLACK);
		frmWhatchamacallitParkingThingy.setForeground(Color.WHITE);
		frmWhatchamacallitParkingThingy.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\imageedit_12_4357411660.png"));
		frmWhatchamacallitParkingThingy.setTitle("Whatchamacallit Parking Space Thingy");
		frmWhatchamacallitParkingThingy.setBounds(100, 100, 700, 500);
		frmWhatchamacallitParkingThingy.setVisible(true);
		frmWhatchamacallitParkingThingy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWhatchamacallitParkingThingy.getContentPane().setLayout(null);
		
		txtReceipt = new JTextField();
		txtReceipt.setEditable(false);
		txtReceipt.setFont(new Font("Rockwell", Font.BOLD, 25));
		txtReceipt.setText("Receipt");
		txtReceipt.setBounds(250, 102, 109, 42);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtReceipt);
		txtReceipt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Time In");
		lblNewLabel.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lblNewLabel.setBounds(217, 165, 87, 22);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblNewLabel);
		
		JLabel lblTimeOut = new JLabel("Time Out");
		lblTimeOut.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lblTimeOut.setBounds(217, 198, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblTimeOut);
		
		JLabel lblDuration = new JLabel("Duration (In Mins)");
		lblDuration.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lblDuration.setBounds(167, 223, 109, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblDuration);
		
		JLabel lblAmount = new JLabel("Sub Total");
		lblAmount.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lblAmount.setBounds(217, 248, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblAmount);
		
		JLabel lblTax = new JLabel("Tax 8%");
		lblTax.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lblTax.setBounds(217, 273, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblTax);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lblTotal.setBounds(217, 298, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblTotal);
		
		JLabel lblPayme = new JLabel("Payment");
		lblPayme.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lblPayme.setBounds(217, 323, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblPayme);
		
		txtIn = new JTextField();
		txtIn.setBackground(Color.WHITE);
		txtIn.setEditable(false);
		txtIn.setBounds(278, 165, 103, 20);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtIn);
		txtIn.setColumns(10);
		
		txtOut = new JTextField();
		txtOut.setBackground(Color.WHITE);
		txtOut.setEditable(false);
		txtOut.setColumns(10);
		txtOut.setBounds(278, 192, 103, 20);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtOut);
		
		txtDuration = new JTextField();
		txtDuration.setBackground(Color.WHITE);
		txtDuration.setEditable(false);
		txtDuration.setColumns(10);
		txtDuration.setBounds(278, 217, 103, 20);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtDuration);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setBackground(Color.WHITE);
		txtSubTotal.setEditable(false);
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(278, 246, 103, 20);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtSubTotal);
		
		txtTax = new JTextField();
		txtTax.setBackground(Color.WHITE);
		txtTax.setEditable(false);
		txtTax.setColumns(10);
		txtTax.setBounds(278, 271, 103, 20);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtTax);
		
		txtTotal = new JTextField();
		txtTotal.setBackground(Color.WHITE);
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);
		txtTotal.setBounds(278, 296, 103, 20);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtTotal);
		
		txtPayment = new JTextField();
		txtPayment.setBackground(Color.WHITE);
		txtPayment.setEditable(false);
		txtPayment.setColumns(10);
		txtPayment.setBounds(278, 321, 103, 20);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtPayment);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lblChange.setBounds(217, 351, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblChange);
		
		txtChange = new JTextField();
		txtChange.setBackground(Color.WHITE);
		txtChange.setEditable(false);
		txtChange.setColumns(10);
		txtChange.setBounds(278, 349, 103, 20);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtChange);
		
		btnNewButton = new JButton("Okay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Menu main = new Main_Menu();
				frmWhatchamacallitParkingThingy.dispose();
			}
		});
		btnNewButton.setBounds(533, 397, 87, 31);
		frmWhatchamacallitParkingThingy.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 22));
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\Receipt.jpg"));
		lblNewLabel_1.setBounds(10, 11, 664, 439);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Time In");
		lblNewLabel_2.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lblNewLabel_2.setBounds(250, 119, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblNewLabel_2);
		
		
	}
}
