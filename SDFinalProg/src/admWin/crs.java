package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class crs {

	JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTextField txtSearchBar;
	private JTextField txtSearchBar_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crs window = new crs();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public crs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Profile");
		btnNewButton_2.setBackground(new Color(131, 7, 11));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				adminWinMain win= new adminWinMain();
				win.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(35, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Grade");
		btnNewButton_3.setBackground(new Color(131, 7, 11));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win= new gr();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(120, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Schedule");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(131, 7, 11));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton_4.setBounds(205, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Courses");
		btnNewButton_5.setBackground(new Color(131, 7, 11));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				crs win= new crs();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton_5.setBounds(291, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Account");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6.setBackground(new Color(131, 7, 11));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				acc win= new acc();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton_6.setBounds(378, 70, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.setBackground(new Color(131, 7, 11));
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStudents.setForeground(new Color(255, 255, 255));
		btnStudents.setBounds(465, 70, 89, 23);
		frame.getContentPane().add(btnStudents);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(50, 128, 886, 394);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(249, 172, 174));
		tabbedPane.addTab("View Courses", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 50, 807, 300);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Course Name", "Units", "Subjects"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		scrollPane.setViewportView(table);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 0, 0);
		panel_4.add(tabbedPane_1);
		
		JButton btnNewButton_1 = new JButton("Manage Courses");
		btnNewButton_1.setBackground(new Color(131, 7, 11));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(639, 17, 141, 22);
		panel_4.add(btnNewButton_1);
		
		txtSearchBar = new JTextField();
		txtSearchBar.setText(" Search Bar...");
		txtSearchBar.setBounds(27, 11, 135, 27);
		panel_4.add(txtSearchBar);
		txtSearchBar.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(249, 172, 174));
		tabbedPane.addTab("View Subjects", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(34, 49, 769, 304);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setToolTipText("");
		table_1.getTableHeader().setReorderingAllowed(false);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Subject Name", "Subject Code", "#Units", "Pre-Requisites"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_7 = new JButton("Manage Subjects");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_7.setBackground(new Color(131, 7, 11));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(654, 15, 132, 23);
		panel_2.add(btnNewButton_7);
		
		txtSearchBar_1 = new JTextField();
		txtSearchBar_1.setText("Search Bar... ");
		txtSearchBar_1.setBounds(34, 11, 129, 27);
		panel_2.add(txtSearchBar_1);
		txtSearchBar_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Computer Engineering"}));
		comboBox.setBounds(173, 15, 132, 22);
		panel_2.add(comboBox);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBackground(new Color(131, 7, 11));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win= new strWin.LogWindow();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(832, 70, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_8 = new JButton("Professors");
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8.setBackground(new Color(131, 7, 11));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				prof win = new prof();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(552, 70, 99, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setText("Welcome, null null null");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(32, 104, 389, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel_6.setBounds(0, 0, 975, 66);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_7.setBounds(0, 59, 975, 45);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_8.setBounds(0, 533, 1000, 38);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_9.setBounds(-15, 87, 1000, 447);
		frame.getContentPane().add(lblNewLabel_9);
		
		
		
		
	}
}
