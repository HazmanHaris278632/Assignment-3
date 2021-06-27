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
import javax.swing.JCheckBox;

public class Order extends JFrame {

	private JPanel contentPane;
	private JTextField txtFee;
	private String pFee, p100Plus, pMilo;
	private JTable table;
	private String h, h1, h2;
	private JTextField txt100Plus;
	private JTextField txtMilo;
	private JTextField txtTotalPrice;
	String itotalPrice;
	double [] itemcost = new double [10];

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
		setBounds(100, 100, 960, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 10, 926, 611);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(32, 10, 870, 88);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION FEE & ORDER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 10, 850, 68);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1_1_1.setBackground(Color.YELLOW);
		panel_1_1_1.setBounds(325, 119, 577, 372);
		panel.add(panel_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 557, 352);
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
		btnOrder.setBounds(37, 520, 147, 68);
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
		btnExit.setBounds(755, 520, 147, 68);
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
		btnUpload.setBounds(299, 520, 149, 68);
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
		btnNext.setBounds(545, 520, 147, 68);
		panel.add(btnNext);
		
		txt100Plus = new JTextField();
		txt100Plus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt100Plus.setHorizontalAlignment(SwingConstants.CENTER);
		txt100Plus.setText("0");
		txt100Plus.setBounds(204, 253, 111, 33);
		panel.add(txt100Plus);
		txt100Plus.setColumns(10);
		
		txtMilo = new JTextField();
		txtMilo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMilo.setText("0");
		txtMilo.setHorizontalAlignment(SwingConstants.CENTER);
		txtMilo.setColumns(10);
		txtMilo.setBounds(204, 310, 111, 33);
		panel.add(txtMilo);
		

		txtTotalPrice = new JTextField();
		txtTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotalPrice.setBounds(200, 420, 115, 68);
		panel.add(txtTotalPrice);
		txtTotalPrice.setColumns(10);
		
		JCheckBox chckbx100Plus = new JCheckBox("100 PLUS");
		chckbx100Plus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbx100Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbx100Plus.isSelected())
				{
					txt100Plus.setEnabled(true);
					txt100Plus.setText("");
					txt100Plus.requestFocus();
				}
				else
				{
					txt100Plus.setEnabled(false);
					txt100Plus.setText("0");
				}
			}
		});
		chckbx100Plus.setBounds(32, 253, 149, 33);
		panel.add(chckbx100Plus);
		
		JCheckBox chckbxMilo = new JCheckBox("MILO CHOCO BAR");
		chckbxMilo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxMilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if(chckbxMilo.isSelected())
				{
					txtMilo.setEnabled(true);
					txtMilo.setText("");
					txtMilo.requestFocus();
				}
				else
				{
					txtMilo.setEnabled(false);
					txtMilo.setText("0");
				}
			}
		});
		chckbxMilo.setBounds(32, 310, 149, 33);
		panel.add(chckbxMilo);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setForeground(Color.WHITE);
		btnTotal.setBackground(new Color(128, 0, 128));
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double price100Plus = Double.parseDouble(p100Plus);
				double priceMilo = Double.parseDouble(pMilo);
				
				itemcost[0] = Double.parseDouble(txt100Plus.getText())*(price100Plus);
				itemcost[1] = Double.parseDouble(txtMilo.getText())*(priceMilo);
				
				itemcost[2] = itemcost[0]+itemcost[1]+100;
				itemcost[3] = itemcost[2];
				
				itotalPrice = String.format("RM %.2f", itemcost[3]);
				txtTotalPrice.setText(itotalPrice);
				
			}
		});
		btnTotal.setBounds(32, 420, 149, 68);
		btnTotal.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.add(btnTotal);
		
		
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						txtFee.getText(),
						chckbx100Plus.getText(),
						itemcost[0],
						chckbxMilo.getText(),
						itemcost[1],
						txtTotalPrice.getText(),
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
