import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Advertisement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertisement frame = new Advertisement();
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
	public Advertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 10, 537, 477);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdvertisement = new JLabel("ADVERTISEMENT");
		lblAdvertisement.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdvertisement.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAdvertisement.setBounds(10, 10, 517, 78);
		panel.add(lblAdvertisement);
		
		JLabel lblAdsDescription = new JLabel("<html>The BIGGEST futsal tournament in Jitra is here again. <br/>What you waiting for, don't waste your time, register before its too late.<br/><br/>Registration fee only RM100.00. <br/>Winning prize worth RM2000 awaits you WINNERS!");
		lblAdsDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdsDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdsDescription.setBounds(45, 98, 456, 263);
		panel.add(lblAdsDescription);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 215, 0));
		panel_1.setBounds(10, 94, 517, 267);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
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
		btnExit.setBounds(393, 416, 134, 51);
		panel.add(btnExit);
	}

}
