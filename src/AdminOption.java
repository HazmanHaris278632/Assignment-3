import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class AdminOption extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminOption frame = new AdminOption();
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
	public AdminOption() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 10, 549, 711);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEmployee = new JButton("EMPLOYEE");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee em = new Employee();
				em.main(null);
			}
		});
		btnEmployee.setForeground(Color.WHITE);
		btnEmployee.setBackground(new Color(128, 0, 128));
		btnEmployee.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnEmployee.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEmployee.setBounds(194, 176, 177, 66);
		panel.add(btnEmployee);
		
		JButton btnFeeandPrice = new JButton("FEE & PRICE");
		btnFeeandPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeandPrice fp = new FeeandPrice();
				fp.main(null);
			}
		});
		btnFeeandPrice.setForeground(Color.WHITE);
		btnFeeandPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFeeandPrice.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnFeeandPrice.setBackground(new Color(128, 0, 128));
		btnFeeandPrice.setBounds(194, 379, 177, 66);
		panel.add(btnFeeandPrice);
		
		JButton btnFinancial = new JButton("FINANCIAL");
		btnFinancial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Financial fn = new Financial();
				fn.main(null);
			}
		});
		btnFinancial.setForeground(Color.WHITE);
		btnFinancial.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFinancial.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnFinancial.setBackground(new Color(128, 0, 128));
		btnFinancial.setBounds(194, 586, 177, 66);
		panel.add(btnFinancial);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\employee_icon_2-removebg-preview 22.png"));
		lblNewLabel.setBounds(194, 89, 177, 66);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\png-transparent-price-tag-computer-icons-music-price-icon-blue-text-logo-removebg-preview 1.png"));
		lblNewLabel_1.setBounds(194, 281, 177, 66);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\fn_icon-removebg-preview 2.png"));
		lblNewLabel_1_1.setBounds(194, 465, 177, 111);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblOption = new JLabel("ADMIN OPTION");
		lblOption.setHorizontalAlignment(SwingConstants.CENTER);
		lblOption.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblOption.setBounds(10, 10, 529, 66);
		panel.add(lblOption);
	}
}
