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
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class FeeandPrice extends JFrame {

	private JPanel contentPane;
	private JTextField txtFee;
	private JTextField txt100Plus;
	private JTextField txtMilo;
	private JTable table;
	private String s, s1, s2;
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
	public FeeandPrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 10, 780, 683);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(10, 119, 362, 458);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblRegisterFee = new JLabel("Register Fee");
		lblRegisterFee.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegisterFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterFee.setBounds(26, 36, 96, 31);
		panel_1.add(lblRegisterFee);
		

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(Color.YELLOW);
		panel_1_1.setBounds(382, 119, 388, 465);
		panel.add(panel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 368, 445);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Register Fee", "100 Plus", "Milo Choco Bar"
			}
		));
		scrollPane.setViewportView(table);
		
		txtFee = new JTextField();
		txtFee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFee.setBounds(189, 42, 128, 19);
		panel_1.add(txtFee);
		txtFee.setColumns(10);
		
		JLabel lblPlus = new JLabel("100 PLUS ");
		lblPlus.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlus.setBounds(26, 133, 96, 31);
		panel_1.add(lblPlus);
		
		JLabel lblMiloChocoBar = new JLabel("MILO CHOCO BAR ");
		lblMiloChocoBar.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiloChocoBar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMiloChocoBar.setBounds(26, 225, 145, 31);
		panel_1.add(lblMiloChocoBar);
		
		txt100Plus = new JTextField();
		txt100Plus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt100Plus.setColumns(10);
		txt100Plus.setBounds(189, 139, 128, 19);
		panel_1.add(txt100Plus);
		
		txtMilo = new JTextField();
		txtMilo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMilo.setColumns(10);
		txtMilo.setBounds(189, 231, 128, 19);
		panel_1.add(txtMilo);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBackground(new Color(128, 0, 128));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				txtFee.getText(),
				txt100Plus.getText(),
				txtMilo.getText(),
			
				});
		
			
		if (table.getSelectedRow() == -1) {
			if (table.getRowCount() == 0) {
				JOptionPane.showMessageDialog(null, "Sales Information Update confirmed", "Thank you",
						JOptionPane.OK_OPTION);
			}
		}
		
		//How to read data in table
		
		for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
	        // null or not Integer will throw exception
	        s = String.valueOf(model.getValueAt(i, 0));
	        s1 = String.valueOf(model.getValueAt(i, 1));
	        s2 = String.valueOf(model.getValueAt(i, 2));
		}

		double totalPrice = Double.parseDouble(s) + Double.parseDouble(s2); //convert String to double
		
		//How to pass value/data from product description (admin page) into customer page
		try {
			Order fr = new Order(s, s1, s2); //open customer page using constructor with 5 arguments
			fr.setVisible(true);
		} catch (Exception ee) {
			ee.printStackTrace();
		}  
			}
			
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdd.setBounds(10, 392, 145, 56);
		btnAdd.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.add(btnAdd);
		
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
		btnExit.setBounds(634, 605, 136, 68);
		panel.add(btnExit);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
					File file = new File("C:\\Users\\user\\Desktop\\Semester 2\\Programming 2\\Assigment 3 Text File\\Fee and Price.txt");
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
		btnUpload.setBackground(new Color(128, 0, 128));
		btnUpload.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpload.setBounds(382, 605, 136, 68);
		panel.add(btnUpload);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(8, 8, 9, 8, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(10, 10, 760, 99);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblFeePrice = new JLabel("REGISTRATION FEE & PRICE");
		lblFeePrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeePrice.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFeePrice.setBounds(10, 10, 740, 79);
		panel_2.add(lblFeePrice);
		
	}
}
