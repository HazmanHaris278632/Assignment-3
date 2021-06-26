

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

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtSalary;
	private JButton btnDelete;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 10, 970, 579);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 255, 0));
		panel_1.setBounds(20, 23, 916, 67);
		panel.add(panel_1);
		
		JLabel lblEmployeeSystem = new JLabel("EMPLOYEE SYSTEM");
		lblEmployeeSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeSystem.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblEmployeeSystem.setBounds(10, 10, 1068, 47);
		panel_1.add(lblEmployeeSystem);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(new Color(255, 255, 0));
		panel_1_1.setBounds(20, 100, 365, 311);
		panel.add(panel_1_1);
		
		JLabel lblID = new JLabel("ID NUMBER");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblID.setBounds(28, 31, 135, 13);
		panel_1_1.add(lblID);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(28, 75, 135, 13);
		panel_1_1.add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAge.setBounds(28, 125, 135, 13);
		panel_1_1.add(lblAge);
		
		JLabel lblPosition = new JLabel("POSITION");
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPosition.setBounds(28, 185, 135, 13);
		panel_1_1.add(lblPosition);
		
		JLabel lblSalary = new JLabel("SALARY (RM)");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSalary.setBounds(28, 244, 135, 13);
		panel_1_1.add(lblSalary);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtID.setBounds(193, 30, 150, 19);
		panel_1_1.add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBounds(193, 75, 150, 19);
		panel_1_1.add(txtName);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAge.setColumns(10);
		txtAge.setBounds(193, 124, 150, 19);
		panel_1_1.add(txtAge);
		
		txtSalary = new JTextField();
		txtSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSalary.setColumns(10);
		txtSalary.setBounds(193, 243, 150, 19);
		panel_1_1.add(txtSalary);
		
		JComboBox PositionBox = new JComboBox();
		PositionBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PositionBox.setModel(new DefaultComboBoxModel(new String[] {"Position", "Event Manager", "Assisstant Manager", "Logistic Manager", "Marketing Coordinator", "Game Day Staff"}));
		PositionBox.setBounds(193, 183, 150, 21);
		panel_1_1.add(PositionBox);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1_2.setBackground(new Color(255, 255, 0));
		panel_1_2.setBounds(20, 440, 916, 115);
		panel.add(panel_1_2);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBackground(new Color(128, 0, 128));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						txtID.getText(),
						txtName.getText(),
						txtAge.getText(),
						PositionBox.getSelectedItem(),
						txtSalary.getText(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Data Update confirmed", "Employee Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBounds(34, 26, 136, 68);
		btnAdd.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_2.add(btnAdd);
		
		btnDelete = new JButton("DELETE");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(new Color(128, 0, 128));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(225, 26, 136, 68);
		btnDelete.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_2.add(btnDelete);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(new Color(128, 0, 128));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					txtID.setText("");
					txtName.setText("");
					txtAge.setText("");
					PositionBox.setSelectedItem("");
					txtSalary.setText("");

					
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(406, 26, 136, 68);
		btnReset.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_2.add(btnReset);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setBackground(new Color(128, 0, 128));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBounds(583, 26, 136, 68);
		btnPrint.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_2.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(Color.WHITE);
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
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(756, 26, 136, 68);
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_2.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(405, 100, 531, 311);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 511, 153);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID NUMBER", "NAME", "AGE", "POSITION", "SALARY (RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					File file = new File("C:\\Users\\user\\Desktop\\Semester 2\\Programming 2\\Assigment 3 Text File\\Employee.txt");
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
		btnUpload.setBounds(197, 215, 136, 68);
		panel_2.add(btnUpload);
	}
}
