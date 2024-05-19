package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.HashMap;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.RowFilter;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class crs {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;

	public JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTextField txtSearchBar;
	private JTextField txtSearchBar_1;
	HashSet<String> cr = new HashSet();
	HashSet<String> un = new HashSet();
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
		
		JButton btnStudents = new JButton("Students");
		btnStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				std st = new std();
				st.frame.setVisible(true);
			}
		});
		btnStudents.setBackground(new Color(131, 7, 11));
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStudents.setForeground(new Color(255, 255, 255));
		btnStudents.setBounds(380, 70, 89, 23);
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
		
		DefaultTableModel tbl = new DefaultTableModel();
		
		table = new JTable(tbl);
		table.setRowSelectionAllowed(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"TCPE - BACHELOR OF SCIENCE IN COMPUTER ENGINEERING","30"}
			},
			new String[] {
				"Course Name", "Units"
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
		//table.getColumnModel().getColumn(2).setResizable(false);
		
		
		/*
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			 st= c.createStatement();
			 rs = st.executeQuery( "Select course , un From users");
			 while(rs.next()) {
				 cr.add(rs.getString("course"));
				 un.add(rs.getString("un"));
			 }
			int size = cr.size();
			while(size != 0) {
				int temp = 0;
				tbl.insertRow(0, new Object[] {cr.toArray(),un.toArray()});
				size--;
				temp++;
			}
			 
			 
			System.out.println("success");
		}catch(Exception e){
			System.out.print("error");
			e.printStackTrace();
		}
		*/
		scrollPane.setViewportView(table);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 0, 0);
		panel_4.add(tabbedPane_1);
		
		txtSearchBar = new JTextField();
		txtSearchBar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				DefaultTableModel m= (DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> trs= new TableRowSorter<> ( m); 
				trs.setRowFilter(RowFilter.regexFilter(txtSearchBar.getText()));
				table.setRowSorter(trs);
			}
		});
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
		DefaultTableModel n=null;
		
		table_1 = new JTable(n);
		table_1.setToolTipText("");
		table_1.getTableHeader().setReorderingAllowed(false);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Subject Name", "Subject Code", "#Units"
			}
		));
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table_1.setRowSelectionAllowed(false);
		table_1.setEnabled(false);
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			 st= c.createStatement();
			 rs = st.executeQuery( "Select * From sub");
			
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			
			int col= rsmd.getColumnCount();
		String[] colName = new String[col];
			for (int i=0;i<col;i++) {
		colName[i]=rsmd.getColumnClassName(i+1);
			}
			
			DefaultTableModel m= (DefaultTableModel) table_1.getModel();
			while(rs.next()) {
				Object[] rowData = new Object[col];
		        for (int i = 0; i < col; i++) {
		            rowData[i] = rs.getObject(i+1);
			}
		       m.addRow(rowData);}
			 
			 
			System.out.println("success");
		}catch(Exception e){
			System.out.print("error");
			e.printStackTrace();
		}
		
		
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_7 = new JButton("Manage Subjects");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_7.setBackground(new Color(131, 7, 11));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				regWin.regSub win = new regWin.regSub();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(654, 15, 132, 23);
		panel_2.add(btnNewButton_7);
		
		txtSearchBar_1 = new JTextField();
		txtSearchBar_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				DefaultTableModel m= (DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> trs= new TableRowSorter<> ( m); 
				trs.setRowFilter(RowFilter.regexFilter(txtSearchBar_1.getText()));
				table.setRowSorter(trs);
			}
		});
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
		btnNewButton_8.setBounds(471, 70, 99, 23);
		frame.getContentPane().add(btnNewButton_8);
		
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
