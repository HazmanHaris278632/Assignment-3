import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 10, 1031, 585);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("ADMIN USERNAME");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsername.setBounds(485, 106, 264, 58);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(495, 237, 254, 58);
		panel.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsername.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtUsername.setBounds(495, 176, 260, 51);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtPassword.setColumns(10);
		txtPassword.setBounds(495, 305, 254, 51);
		panel.add(txtPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if (password.contains("hazman2020") && username.contains("hazman")){
					txtPassword.setText(null);
					txtUsername.setText(null);
					
					AdminOption ao = new AdminOption();
					ao.main(null);
					
		}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}			
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(128, 0, 128));
		btnLogin.setBounds(563, 373, 124, 51);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnReset.setBackground(new Color(128, 0, 128));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(897, 463, 124, 51);
		panel.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			private JFrame frmLoginSystem;

			public void actionPerformed(ActionEvent e) {
				

				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,  "Confirm if you want to exit", "Login Systems",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnExit.setBackground(new Color(128, 0, 128));
		btnExit.setBounds(897, 524, 124, 51);
		panel.add(btnExit);
		
		JButton btnCustomer = new JButton("CUSTOMER");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PlayerRegistration register = new PlayerRegistration();
				register.main(null);
			}
		});
		btnCustomer.setForeground(Color.WHITE);
		btnCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCustomer.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnCustomer.setBackground(new Color(128, 0, 128));
		btnCustomer.setBounds(563, 496, 124, 51);
		panel.add(btnCustomer);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\harimau malaya edit 2.jpg"));
		lblNewLabel.setBounds(10, 10, 328, 565);
		panel.add(lblNewLabel);
		
		JLabel lblCustomer = new JLabel("CUSTOMER? CLICK HERE");
		lblCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCustomer.setBounds(495, 434, 254, 58);
		panel.add(lblCustomer);
		
		JLabel lblLoginSystem = new JLabel("LOGIN SYSTEM");
		lblLoginSystem.setBounds(475, 31, 404, 66);
		panel.add(lblLoginSystem);
		lblLoginSystem.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\jalur gemilang edit 2.png"));
		lblLoginSystem.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLoginSystem.setHorizontalAlignment(SwingConstants.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(843, 10, 101, 22);
		panel.add(menuBar);
		
		JMenu mnInfo = new JMenu("INFO");
		menuBar.add(mnInfo);
		
		JMenuItem mntmAds = new JMenuItem("Competition Advertisement");
		mntmAds.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Advertisement ads = new Advertisement();
			ads.main(null);
			
		}
		});
		mnInfo.add(mntmAds);
		
		JMenuItem mntmCompBackground = new JMenuItem("Company Background");
		mntmCompBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground cb = new CompanyBackground();
				cb.main(null);
				
			}
			});
		mnInfo.add(mntmCompBackground);
	}
}
