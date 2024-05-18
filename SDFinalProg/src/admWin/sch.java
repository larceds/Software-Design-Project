package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import strWin.LogWindow;
import regWin.regSch;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class sch {

<<<<<<< HEAD
	public JFrame frame;
	private JTable table;
=======
	JFrame frame;
>>>>>>> f7c1f12 (sql functions for admin and student)
	private JTable table_1;
	private JTextField txtSearchBar;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sch window = new sch();
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
	public sch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 53, 53));
		frame.getContentPane().setLayout(null);
		
		txtSearchBar = new JTextField();
		txtSearchBar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				DefaultTableModel m= (DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> trs= new TableRowSorter<> ( m); 
				trs.setRowFilter(RowFilter.regexFilter(txtSearchBar.getText()));
				table.setRowSorter(trs);
				table.addRowSelectionInterval(0, 0);
			}
		});
		txtSearchBar.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearchBar.setText("Search...");
		txtSearchBar.setBounds(62, 144, 125, 23);
		frame.getContentPane().add(txtSearchBar);
		txtSearchBar.setColumns(10);
		
		JButton btnNewButton_4_2_1 = new JButton("Students");
		btnNewButton_4_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4_2_1.setBackground(new Color(131, 7, 11));
		btnNewButton_4_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				std win = new std();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_4_2_1.setBounds(452, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_4_2_1);
		
		JButton btnNewButton_4_2 = new JButton("Account");
		btnNewButton_4_2.setForeground(new Color(255, 255, 255));
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4_2.setBackground(new Color(131, 7, 11));
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				acc win = new acc();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_4_2.setBounds(366, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_4_1 = new JButton("LOG OUT");
		btnNewButton_4_1.setBackground(new Color(131, 7, 11));
		btnNewButton_4_1.setForeground(new Color(255, 255, 255));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win = new strWin.LogWindow();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4_1.setBounds(862, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_2 = new JButton("Profile");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(131, 7, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				adminWinMain win = new adminWinMain();
				win.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(23, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Grade");
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1.setBackground(new Color(131, 7, 11));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win = new gr();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_2_1.setBounds(108, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Schedule");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(new Color(131, 7, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win = new sch();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(194, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Course");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBackground(new Color(131, 7, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				crs win = new crs();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(281, 78, 89, 24);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Professors");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(131, 7, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				prof win= new prof();
				win.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(538, 78, 89, 24);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel_3 = new JLabel("BUTTON BG");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_3.setBounds(0, 72, 975, 36);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Manage Schedule");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(131, 7, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				regWin.regSch win = new regWin.regSch();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(752, 144, 132, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setText("Welcome, null null null");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(33, 113, 389, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("logo");
		lblNewLabel.setBounds(0, 0, 975, 73);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 975, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3_1 = new JLabel("BUTTON BG");
		lblNewLabel_3_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_3_1.setBounds(0, 535, 975, 36);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("bg");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBackground(new Color(131, 7, 11));
		lblNewLabel_1.setBounds(0, 61, 975, 499);
		new JLabel("New label");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 190, 885, 334);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Time In", "Time Out", "Subject", "Professor", "Course/Section"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setRowSelectionAllowed(false);
		table.setEnabled(false);
		
		try {
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "sevin", "septin");
			Statement st= c.createStatement();
			ResultSet rs = st.executeQuery( "Select * From student");
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			
			int col= rsmd.getColumnCount();
			String[] colName = new String[col];
			for (int i=0;i<col;i++) {
				colName[i]=rsmd.getColumnClassName(i+1);
			}
			
			DefaultTableModel m= (DefaultTableModel) table.getModel();
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
		
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_1.setBounds(0, 72, 975, 499);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
		
	}
}
