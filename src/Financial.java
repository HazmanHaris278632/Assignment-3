

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.JTextComponent;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Financial extends JFrame {

	private JPanel contentPane;
	private JTextField txtWeek1;
	private JTextField txtWeek2;
	private JTextField txtWeek3;
	private JTextField txtWeek4;
	private JTextField txtCost;
	private JTextField txtTotal;
	protected JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Financial frame = new Financial();
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
	public Financial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 1145, 849);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 10, 1111, 804);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(23, 20, 1061, 75);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFinancial = new JLabel("FINANCIAL");
		lblFinancial.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinancial.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblFinancial.setBounds(10, 10, 1041, 55);
		panel_1.add(lblFinancial);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.YELLOW);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(23, 105, 369, 675);
		panel.add(panel_1_1);
		
		JLabel lblIncome = new JLabel("INCOME (RM)");
		lblIncome.setHorizontalAlignment(SwingConstants.CENTER);
		lblIncome.setForeground(Color.WHITE);
		lblIncome.setBackground(Color.BLACK);
		lblIncome.setOpaque(true);
		lblIncome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIncome.setBounds(34, 26, 310, 32);
		panel_1_1.add(lblIncome);
		
		JLabel lblWeek1 = new JLabel("WEEK 1");
		lblWeek1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeek1.setBackground(new Color(0, 128, 128));
		lblWeek1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWeek1.setBounds(34, 77, 103, 32);
		panel_1_1.add(lblWeek1);
		
		JLabel lblWeek2 = new JLabel("WEEK 2");
		lblWeek2.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeek2.setBackground(Color.RED);
		lblWeek2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWeek2.setBounds(34, 155, 103, 32);
		panel_1_1.add(lblWeek2);
		
		JLabel lblWeek3 = new JLabel("WEEK 3");
		lblWeek3.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeek3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWeek3.setBounds(34, 228, 103, 32);
		panel_1_1.add(lblWeek3);
		
		JLabel lblWeek4 = new JLabel("WEEK 4");
		lblWeek4.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeek4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWeek4.setBounds(34, 304, 103, 32);
		panel_1_1.add(lblWeek4);
		
		txtWeek1 = new JTextField();
		txtWeek1.setBackground(Color.WHITE);
		txtWeek1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtWeek1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtWeek1.setBounds(221, 83, 123, 25);
		panel_1_1.add(txtWeek1);
		txtWeek1.setColumns(10);
		
		txtWeek2 = new JTextField();
		txtWeek2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtWeek2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtWeek2.setColumns(10);
		txtWeek2.setBounds(221, 161, 123, 25);
		panel_1_1.add(txtWeek2);
		
		txtWeek3 = new JTextField();
		txtWeek3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtWeek3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtWeek3.setColumns(10);
		txtWeek3.setBounds(221, 234, 123, 25);
		panel_1_1.add(txtWeek3);
		
		txtWeek4 = new JTextField();
		txtWeek4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtWeek4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtWeek4.setColumns(10);
		txtWeek4.setBounds(221, 310, 123, 25);
		panel_1_1.add(txtWeek4);
		
		JLabel lblCost = new JLabel("TOURNAMENT COST");
		lblCost.setBounds(34, 366, 310, 32);
		panel_1_1.add(lblCost);
		lblCost.setBackground(Color.BLACK);
		lblCost.setOpaque(true);
		lblCost.setForeground(Color.WHITE);
		lblCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblCost.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		txtCost = new JTextField();
		txtCost.setBounds(34, 408, 310, 25);
		txtCost.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1.add(txtCost);
		txtCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCost.setColumns(10);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setBounds(34, 487, 310, 52);
		panel_1_1.add(btnTotal);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, num3, num4, cost, ans;
				try {
					num1 = Integer.parseInt(txtWeek1.getText());
					num2 = Integer.parseInt(txtWeek2.getText());
					num3 = Integer.parseInt(txtWeek3.getText());
					num4 = Integer.parseInt(txtWeek4.getText());
					cost = Integer.parseInt(txtCost.getText());
					
					ans = (num1 + num2 + num3 + num4) - cost;
					txtTotal.setText(Integer.toString(ans));
					}catch(Exception e) {
						
						JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnTotal.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		btnTotal.setBackground(new Color(128, 0, 128));
		btnTotal.setForeground(Color.WHITE);
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		txtTotal = new JTextField();
		txtTotal.setBounds(34, 549, 310, 54);
		txtTotal.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1.add(txtTotal);
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotal.setColumns(10);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(128, 0, 128));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtWeek1.setText("");
				txtWeek2.setText("");
				txtWeek3.setText("");
				txtWeek4.setText("");
				txtCost.setText("");
				txtTotal.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(204, 613, 140, 52);
		btnReset.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1.add(btnReset);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBackground(new Color(128, 0, 128));
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
					File file = new File("C:\\Users\\user\\Desktop\\Semester 2\\Programming 2\\Assigment 3 Text File\\Financial.txt");
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
		btnUpload.setForeground(new Color(255, 255, 255));
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnUpload.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnUpload.setBounds(655, 695, 176, 85);
		panel.add(btnUpload);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBackground(new Color(128, 0, 128));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
				txtWeek1.getText(),
				txtWeek2.getText(),
				txtWeek3.getText(),
				txtWeek4.getText(),
				txtCost.getText(),
				txtTotal.getText(),
		});
		
		if (table.getSelectedRow() == -1) {
			if (table.getRowCount() == 0) {
				JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
						JOptionPane.OK_OPTION);
			}
		}
			} 
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnAdd.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnAdd.setBounds(412, 695, 159, 85);
		panel.add(btnAdd);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(128, 0, 128));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Membership Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnExit.setBounds(914, 695, 170, 85);
		panel.add(btnExit);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1_2.setBackground(Color.YELLOW);
		panel_1_2.setBounds(406, 105, 678, 580);
		panel.add(panel_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 658, 560);
		panel_1_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"WEEK 1", "WEEK 2", "WEEK 3", "WEEK 4", "TOUR. COST", "TOTAL"
			}
		));
		scrollPane.setViewportView(table);
		
	}
}
