

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class PlayerRegistration extends JFrame {
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtTeamName;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTable table;
	private JTextField txtAge;
	private String h, h1, h2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerRegistration frame = new PlayerRegistration();
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
	public PlayerRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1309, 763);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.BLACK));
		panel.setBounds(0, 0, 1285, 726);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.BLACK));
		panel_1_1.setBackground(Color.YELLOW);
		panel_1_1.setBounds(35, 149, 310, 390);
		panel.add(panel_1_1);
		
		JLabel nameLabel = new JLabel("NAME");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		nameLabel.setBounds(24, 81, 108, 16);
		panel_1_1.add(nameLabel);
		
		txtTeamName = new JTextField();
		txtTeamName.setBounds(142, 20, 147, 19);
		panel_1_1.add(txtTeamName);
		txtTeamName.setColumns(10);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAge.setBounds(24, 156, 108, 16);
		panel_1_1.add(lblAge);
		
		txtName = new JTextField();
		txtName.setBounds(142, 82, 147, 19);
		panel_1_1.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblPhone = new JLabel("HP NO.");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setForeground(Color.BLACK);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhone.setBounds(24, 237, 96, 16);
		panel_1_1.add(lblPhone);
		
		JLabel subjectLabel = new JLabel("CATEGORY");
		subjectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subjectLabel.setForeground(Color.BLACK);
		subjectLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		subjectLabel.setBounds(24, 313, 108, 16);
		panel_1_1.add(subjectLabel);
		
		JLabel lblTeamName = new JLabel("TEAM NAME");
		lblTeamName.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamName.setForeground(Color.BLACK);
		lblTeamName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTeamName.setBounds(24, 20, 108, 29);
		panel_1_1.add(lblTeamName);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(142, 234, 147, 19);
		panel_1_1.add(txtPhone);
		txtPhone.setColumns(10);
		
		JComboBox Categorycombobox = new JComboBox();
		Categorycombobox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Categorycombobox.setModel(new DefaultComboBoxModel(new String[] {"Select Category", "Male", "Female"}));
		Categorycombobox.setBounds(142, 311, 147, 21);
		panel_1_1.add(Categorycombobox);
		
		txtAge = new JTextField();
		txtAge.setBounds(142, 157, 147, 19);
		panel_1_1.add(txtAge);
		txtAge.setColumns(10);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.BLACK));
		panel_1_2.setBackground(Color.YELLOW);
		panel_1_2.setBounds(0, 0, 9, 20);
		panel_1_1.add(panel_1_2);
		
		JLabel lblPlayerRegistration_1 = new JLabel("PLAYER REGISTRATION");
		lblPlayerRegistration_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerRegistration_1.setForeground(Color.BLACK);
		lblPlayerRegistration_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblPlayerRegistration_1.setBounds(10, 10, 1203, 72);
		panel_1_2.add(lblPlayerRegistration_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.BLACK));
		panel_1_1_2.setBackground(Color.YELLOW);
		panel_1_1_2.setBounds(35, 549, 1223, 153);
		panel.add(panel_1_1_2);
		
		JButton addButton = new JButton("ADD RECORD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						txtTeamName.getText(),
						txtName.getText(),
						txtAge.getText(),
						txtPhone.getText(),
						Categorycombobox.getSelectedItem(),
						
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		addButton.setForeground(Color.WHITE);
		addButton.setBackground(new Color(128, 0, 128));
		addButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		addButton.setBounds(25, 37, 135, 82);
		addButton.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1_2.add(addButton);
		
		JButton resetButton = new JButton("RESET");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTeamName.setText("");
				txtName.setText("");
				txtAge.setText("");
				txtPhone.setText("");
				Categorycombobox.setSelectedItem("Make a selection");
				

				
			}
		});
		resetButton.setForeground(Color.WHITE);
		resetButton.setBackground(new Color(128, 0, 128));
		resetButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		resetButton.setBounds(259, 36, 135, 82);
		resetButton.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1_2.add(resetButton);
		
		JButton deleteButton = new JButton("DELETE");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		deleteButton.setForeground(Color.WHITE);
		deleteButton.setBackground(new Color(128, 0, 128));
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		deleteButton.setBounds(792, 36, 135, 82);
		deleteButton.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1_2.add(deleteButton);
		
		JButton exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Membership Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		exitButton.setForeground(Color.WHITE);
		exitButton.setBackground(new Color(128, 0, 128));
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		exitButton.setBounds(1054, 36, 135, 82);
		exitButton.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1_2.add(exitButton);
		
		JButton uploadButton = new JButton("UPLOAD");
		uploadButton.setBounds(518, 34, 135, 84);
		panel_1_1_2.add(uploadButton);
		uploadButton.setForeground(Color.WHITE);
		uploadButton.setBackground(new Color(128, 0, 128));
		uploadButton.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\user\\Desktop\\Semester 2\\Programming 2\\Assigment 3 Text File\\Player Registration.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "    ");
						}
					bw.write("\n________________________________________________\n");
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
		uploadButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		uploadButton.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setForeground(Color.BLACK);
		panel_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.BLACK));
		panel_1_1_1.setBackground(Color.YELLOW);
		panel_1_1_1.setBounds(355, 149, 897, 390);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 877, 370);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"TEAM NAME", "NAME", "AGE", "HP NO.", "CATEGORY"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 255, 0));
		panel_1.setBounds(35, 23, 1217, 83);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPlayerRegistration = new JLabel("PLAYER REGISTRATION");
		lblPlayerRegistration.setBounds(10, 10, 1197, 63);
		panel_1.add(lblPlayerRegistration);
		lblPlayerRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerRegistration.setFont(new Font("Tahoma", Font.BOLD, 30));
	}
}

