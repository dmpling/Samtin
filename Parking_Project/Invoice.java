package Parking_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Invoice {

	public JFrame frmWhatchamacallitParkingThingy;
	public JTextField itxtDuration;
	public JTextField txtSubTotal;
	public JTextField txtTax;
	public JTextField txtTotal;
	public JTextField txtPayment;
	public JTextField textTimeIn;
	public JTextField textTimeOut;
	
	Double pay, total, change, rchange;
	String sChange;
	private JLabel lblNewLabel_2;

	//public double iduration, subTotal, Tax, Total, Payment;
	//public String ssubTotal, sTax, sTotal;
	
	
	public Invoice() {
		frmWhatchamacallitParkingThingy = new JFrame();
		frmWhatchamacallitParkingThingy.getContentPane().setBackground(Color.DARK_GRAY);
		frmWhatchamacallitParkingThingy.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\imageedit_12_4357411660.png"));
		frmWhatchamacallitParkingThingy.setForeground(Color.WHITE);
		frmWhatchamacallitParkingThingy.setBackground(Color.BLACK);
		frmWhatchamacallitParkingThingy.setTitle("Whatchamacallit Parking Space Thingy");
		frmWhatchamacallitParkingThingy.setBounds(100, 100, 700, 500);
		frmWhatchamacallitParkingThingy.setVisible(true);
		frmWhatchamacallitParkingThingy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWhatchamacallitParkingThingy.getContentPane().setLayout(null);
		

		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setForeground(Color.WHITE);
		lblDuration.setFont(new Font("Roboto", Font.BOLD, 12));
		lblDuration.setBounds(421, 133, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblDuration);
		
		JLabel lblAmount = new JLabel("Sub Total");
		lblAmount.setForeground(Color.WHITE);
		lblAmount.setFont(new Font("Roboto", Font.BOLD, 12));
		lblAmount.setBounds(421, 176, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblAmount);
		
		JLabel lblTax = new JLabel("Tax 8%");
		lblTax.setForeground(Color.WHITE);
		lblTax.setFont(new Font("Roboto", Font.BOLD, 12));
		lblTax.setBounds(477, 235, 87, 28);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblTax);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Roboto", Font.BOLD, 12));
		lblTotal.setBounds(477, 274, 87, 28);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblTotal);
		
		JLabel lblPayme = new JLabel("Payment");
		lblPayme.setForeground(Color.WHITE);
		lblPayme.setFont(new Font("Roboto", Font.BOLD, 12));
		lblPayme.setBounds(477, 314, 87, 14);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblPayme);
		
		itxtDuration = new JTextField();
		itxtDuration.setEditable(false);
		itxtDuration.setBounds(488, 127, 108, 28);
		frmWhatchamacallitParkingThingy.getContentPane().add(itxtDuration);
		itxtDuration.setColumns(10);
		

		
		txtSubTotal = new JTextField();
		txtSubTotal.setEditable(false);
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(488, 170, 108, 28);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtSubTotal);
		
		txtTax = new JTextField();
		txtTax.setEditable(false);
		txtTax.setColumns(10);
		txtTax.setBounds(553, 235, 108, 28);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtTax);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);
		txtTotal.setBounds(553, 269, 108, 28);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtTotal);
		
		txtPayment = new JTextField();
		txtPayment.setColumns(10);
		txtPayment.setBounds(553, 308, 108, 28);
		frmWhatchamacallitParkingThingy.getContentPane().add(txtPayment);
		
		textTimeIn = new JTextField();
		textTimeIn.setEditable(false);
		textTimeIn.setBounds(488, 47, 108, 28);
		frmWhatchamacallitParkingThingy.getContentPane().add(textTimeIn);
		textTimeIn.setColumns(10);
		
		textTimeOut = new JTextField();
		textTimeOut.setEditable(false);
		textTimeOut.setBounds(488, 84, 108, 28);
		frmWhatchamacallitParkingThingy.getContentPane().add(textTimeOut);
		textTimeOut.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Time In");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel.setBounds(421, 53, 46, 22);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Time Out");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1.setBounds(421, 86, 87, 26);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Okay");
		btnNewButton.setFont(new Font("Roboto", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Receipt rcpt = new Receipt();
				
				rcpt.txtIn.setText(textTimeIn.getText());
				rcpt.txtOut.setText(textTimeOut.getText());
				rcpt.txtDuration.setText(itxtDuration.getText());
				rcpt.txtSubTotal.setText(txtSubTotal.getText());
				rcpt.txtTax.setText(txtTax.getText());
				rcpt.txtTotal.setText(txtTotal.getText());
				rcpt.txtPayment.setText(txtPayment.getText());
				
				pay = Double.parseDouble(txtPayment.getText());
				total = Double.parseDouble(txtTotal.getText());
				change = pay - total;
				rchange = Math.round(change*100.0)/100.0;
				sChange = Double.toString(rchange);
				rcpt.txtChange.setText(sChange);
			}
		});
		btnNewButton.setBounds(517, 368, 87, 37);
		frmWhatchamacallitParkingThingy.getContentPane().add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\Invoice.gif"));
		lblNewLabel_2.setBounds(24, 24, 387, 415);
		frmWhatchamacallitParkingThingy.getContentPane().add(lblNewLabel_2);
		

		
		
		//subTotal = iduration*3.00;
		//Tax = subTotal*0.08;
		//Total = subTotal + Tax;
		
		//ssubTotal = Double.toString(subTotal);
		//sTax = Double.toString(Tax);
		//sTotal = Double.toString(Total);
		
		//txtSubTotal.setText(ssubTotal);
		//txtTax.setText(sTax); 
		//txtTotal.setText(sTotal);
		
		//System.out.println(ssubTotal + sTax +Total);
		//sduration = itxtDuration.getText();
		//iduration = Double.parseDouble(sduration);
		


		
	}
}
