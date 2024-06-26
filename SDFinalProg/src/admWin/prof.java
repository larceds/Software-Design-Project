package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import strWin.LogWindow;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class prof {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;

	public JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prof window = new prof();
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
	public prof() {
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
		
		JButton btnPf = new JButton("Profile");
		btnPf.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPf.setBackground(new Color(131, 7, 11));
		btnPf.setForeground(new Color(255, 255, 255));
		btnPf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				adminWinMain win = new adminWinMain();
				win.setVisible(true);
			}
		});
		btnPf.setBounds(34, 82, 89, 23);
		frame.getContentPane().add(btnPf);
		
		JButton btnGr = new JButton("Grades");
		btnGr.setBackground(new Color(131, 7, 11));
		btnGr.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGr.setForeground(new Color(255, 255, 255));
		btnGr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win = new gr();
				win.frame.setVisible(true);
			}
		});
		btnGr.setBounds(110, 82, 89, 23);
		frame.getContentPane().add(btnGr);
		
		JButton btnSch = new JButton("Schedule");
		btnSch.setForeground(new Color(255, 255, 255));
		btnSch.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSch.setBackground(new Color(131, 7, 11));
		btnSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
			}
		});
		btnSch.setBounds(197, 82, 89, 23);
		frame.getContentPane().add(btnSch);
		
		JButton btnCrs = new JButton("Courses");
		btnCrs.setForeground(new Color(255, 255, 255));
		btnCrs.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCrs.setBackground(new Color(131, 7, 11));
		btnCrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				crs win = new crs();
				win.frame.setVisible(true);
			}
		});
		btnCrs.setBounds(285, 82, 89, 23);
		frame.getContentPane().add(btnCrs);
		
		JButton btnStd = new JButton("Students");
		btnStd.setForeground(new Color(255, 255, 255));
		btnStd.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStd.setBackground(new Color(131, 7, 11));
		btnStd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				std win = new std();
				win.frame.setVisible(true);
			}
		});
		btnStd.setBounds(372, 82, 89, 23);
		frame.getContentPane().add(btnStd);
		
		JButton btnprof = new JButton("Professors");
		btnprof.setBackground(new Color(131, 7, 11));
		btnprof.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnprof.setForeground(new Color(255, 255, 255));
		btnprof.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				prof win = new prof();
				win.frame.setVisible(true);
			}
		});
		btnprof.setBounds(457, 82, 99, 23);
		frame.getContentPane().add(btnprof);
		
		JButton btnlog = new JButton("Logout");
		btnlog.setForeground(new Color(255, 255, 255));
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlog.setBackground(new Color(131, 7, 11));
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win= new strWin.LogWindow();
				win.frame.setVisible(true);
			}
		});
		btnlog.setBounds(861, 82, 89, 23);
		frame.getContentPane().add(btnlog);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 182, 862, 336);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.getTableHeader().setReorderingAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Professor Name", "Course Specialization"
			}
		));
		scrollPane.setViewportView(table);
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			 st= c.createStatement();
			 rs = st.executeQuery( "select lname,spe from users where user_type = 'professor' ");
			
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
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				DefaultTableModel m= (DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> trs= new TableRowSorter<> ( m); 
				trs.setRowFilter(RowFilter.regexFilter(textField.getText()));
				table.setRowSorter(trs);
			}
		});
		textField.setBounds(47, 151, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Register ");
		btnNewButton_1.setBackground(new Color(131, 7, 11));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				regWin.regProf win = new regWin.regProf();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(768, 140, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 975, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_1.setBounds(0, 73, 975, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_2.setBounds(0, 536, 975, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_3.setBounds(0, 116, 975, 422);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		
	}
}
