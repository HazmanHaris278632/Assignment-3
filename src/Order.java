import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Order extends JFrame {

	private JPanel contentPane;
	private JTextField txtFee;
	private String pFee, p100Plus, pMilo;
	private JTable table;
	private String h, h1, h2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeandPrice frame = new FeeandPrice();
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
	public Order(String p, String p1, String p2) {
		this.pFee = p;
		this.p100Plus = p1;
		this.pMilo = p2;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 10, 674, 611);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(32, 10, 618, 88);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION FEE & ORDER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 10, 598, 68);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1_1_1.setBackground(Color.YELLOW);
		panel_1_1_1.setBounds(204, 120, 446, 372);
		panel.add(panel_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 426, 352);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"FEE", "100 PLUS", "PRICE", "MILO", "PRICE ", "TOTAL"
			}
		));
		scrollPane.setViewportView(table);
		
		JRadioButton rbtn100Plus = new JRadioButton("100 PLUS");
		rbtn100Plus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rbtn100Plus.setBounds(37, 253, 144, 29);
		panel.add(rbtn100Plus);
		
		JRadioButton rbtnMilo = new JRadioButton("MILO");
		rbtnMilo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rbtnMilo.setBounds(37, 310, 144, 29);
		panel.add(rbtnMilo);
		
		JLabel lblRegistrationFee = new JLabel("Registration Fee");
		lblRegistrationFee.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistrationFee.setBounds(37, 147, 144, 29);
		panel.add(lblRegistrationFee);
		
		txtFee = new JTextField();
		txtFee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFee.setHorizontalAlignment(SwingConstants.CENTER);
		txtFee.setText("100");
		txtFee.setBounds(32, 192, 149, 29);
		panel.add(txtFee);
		txtFee.setColumns(10);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.setBounds(32, 430, 130, 68);
		panel.add(btnOrder);
		btnOrder.setForeground(Color.WHITE);
		btnOrder.setBackground(new Color(128, 0, 128));
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOrder.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Membership Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnExit.setBackground(new Color(128, 0, 128));
		btnExit.setBounds(520, 520, 130, 68);
		panel.add(btnExit);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
					File file = new File("C:\\Users\\user\\Desktop\\Semester 2\\Programming 2\\Assigment 3 Text File\\Order.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "              ");
							}
						bw.write("\n________________________________________________________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpload.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnUpload.setBackground(new Color(128, 0, 128));
		btnUpload.setBounds(356, 520, 130, 68);
		panel.add(btnUpload);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerRegistration pr = new PlayerRegistration();
				pr.main(null);
			}
		});
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNext.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnNext.setBackground(new Color(128, 0, 128));
		btnNext.setBounds(204, 520, 130, 68);
		panel.add(btnNext);
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String plus = "";
				String priceP = "";
				
				double price100Plus = Double.parseDouble(p100Plus);
				
				
				if(rbtn100Plus.isSelected()) {
					plus = rbtn100Plus.getText();
					priceP = Double.toString(price100Plus);
				}
				
				String milo = "";
				String priceM = "";
				
				double priceMilo = Double.parseDouble(pMilo);
				
				
				if(rbtnMilo.isSelected()) {
					milo = rbtnMilo.getText();
					priceM = Double.toString(priceMilo);
				}
				
				double totalPrice = Double.parseDouble(priceP) + Double.parseDouble(priceM) + 100;
				String totalPriceStr = Double.toString(totalPrice);
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						txtFee.getText(),
						plus,
						priceP,
						milo,
						priceM,
						totalPriceStr,
		});
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Customer order updated confirmed", "Sum with us management system",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
	}
}
