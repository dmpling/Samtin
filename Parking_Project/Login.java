package Parking_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Login {

	private JFrame FrLogin;
	private JTextField txtUser;
	private JPasswordField PassField;
	
	String user = "Admin";
	String pass = "123";
	int count = 3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.FrLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FrLogin = new JFrame();
		FrLogin.getContentPane().setBackground(Color.DARK_GRAY);
		FrLogin.setForeground(Color.WHITE);
		FrLogin.setBackground(new Color(0, 0, 0));
		FrLogin.setTitle("Whatchamacallit Parking Space Thingy");
		FrLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\imageedit_12_4357411660.png"));
		FrLogin.setBounds(100, 100, 700, 500);
		FrLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrLogin.getContentPane().setLayout(null);
		
		JLabel lblUser = new JLabel("User Name:");
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Roboto", Font.BOLD, 18));
		lblUser.setBounds(91, 108, 125, 23);
		FrLogin.getContentPane().add(lblUser);
		
		txtUser = new JTextField();
		txtUser.setForeground(Color.WHITE);
		txtUser.setBackground(new Color(0, 128, 128));
		txtUser.setFont(new Font("Roboto", Font.BOLD, 19));
		txtUser.setBounds(63, 131, 153, 31);
		FrLogin.getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setForeground(Color.WHITE);
		lblPass.setFont(new Font("Roboto", Font.BOLD, 18));
		lblPass.setBounds(91, 185, 125, 31);
		FrLogin.getContentPane().add(lblPass);
		
		PassField = new JPasswordField();
		PassField.setForeground(Color.WHITE);
		PassField.setBackground(new Color(0, 128, 128));
		PassField.setFont(new Font("Roboto", Font.BOLD, 19));
		PassField.setBounds(63, 213, 153, 33);
		FrLogin.getContentPane().add(PassField);
		
		JLabel l4 = new JLabel("");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		l4.setForeground(Color.WHITE);
		l4.setBounds(63, 257, 208, 38);
		FrLogin.getContentPane().add(l4);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("Roboto", Font.BOLD, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String User = txtUser.getText();
				String Pass = new String (PassField.getPassword());
						
				if(count !=0) {
					
					if (User.equals(user) && Pass.equals(pass)) {
						
						count = 3;
						
						FrLogin.dispose();
						new Main_Menu();
						
						
					}
					
					else if (User.equals("") && Pass.equals("")) {
						
						count = 3;
						
						l4.setText("Enter Username or Password");
					}
					
					else {
						count --;
						l4.setText("Invalid Username or Password");
						
						if (count == 0) {
							
							JOptionPane.showMessageDialog(null,  "You Run Out of Tries", "Error!!!", JOptionPane.ERROR_MESSAGE);
							JOptionPane.showMessageDialog(null,  "Log-In Screen is Now Locked", "Error!!!", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				
				else {
					
					txtUser.setText(null);
					txtUser.setEditable(false);
					PassField.setText(null);
					PassField.setEditable(false);
					l4.setText("Contact an Administrator.");
					JOptionPane.showMessageDialog(null,  "Log-In Screen is Now Locked", "Error!!!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(50, 342, 76, 48);
		FrLogin.getContentPane().add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setFont(new Font("Roboto", Font.BOLD, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrLogin.dispose();
				
			}
		});
		btnCancel.setBounds(165, 342, 76, 48);
		FrLogin.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Juramer\\Mods\\BSIT 2\\2nd Sem\\Object Oriented Programming\\EEclipse\\OOP_BSIT_2\\src\\Parking_Project\\Pictures\\Login.gif"));
		lblNewLabel.setBounds(258, 22, 404, 417);
		FrLogin.getContentPane().add(lblNewLabel);
		
		
	}
}
