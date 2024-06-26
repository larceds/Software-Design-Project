package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class std {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;
	public JFrame frame;
	private JTable table;
	private JTextField txtStdNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					std window = new std();
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
	public std() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 45, 45));
		frame.getContentPane().setForeground(new Color(255, 0, 0));
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStd = new JLabel("STUDENTS");
		lblStd.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblStd.setHorizontalAlignment(SwingConstants.CENTER);
		lblStd.setBounds(613, 123, 147, 31);
		frame.getContentPane().add(lblStd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(393, 155, 541, 387);
		frame.getContentPane().add(scrollPane);
		
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.getTableHeader().setReorderingAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student ID", "Student Name", "Section"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		//table.getColumnModel().getColumn(3).setResizable(false);
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			 st= c.createStatement();
			 rs = st.executeQuery( "Select id_num,fname,s From users where user_type = 'student'");
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
		
		JButton btnReg = new JButton("Register Student");
		btnReg.setForeground(new Color(255, 255, 255));
		btnReg.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReg.setBackground(new Color(131, 7, 11));
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				regWin.regStd win= new regWin.regStd();
				win.frame.setVisible(true);
			}
		});
		btnReg.setBounds(95, 448, 137, 23);
		frame.getContentPane().add(btnReg);
		
		txtStdNum = new JTextField();
		txtStdNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				DefaultTableModel m= (DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> trs= new TableRowSorter<> ( m); 
				trs.setRowFilter(RowFilter.regexFilter(txtStdNum.getText()));
				table.setRowSorter(trs);
			}
		});
		txtStdNum.setBounds(95, 187, 147, 20);
		frame.getContentPane().add(txtStdNum);
		txtStdNum.setColumns(10);
		
		JLabel lblStdNum = new JLabel("Student Search");
		lblStdNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblStdNum.setBounds(95, 164, 147, 14);
		frame.getContentPane().add(lblStdNum);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setBackground(new Color(131, 7, 11));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				adminWinMain win= new adminWinMain();
				win.setVisible(true);
			}
		});
		btnNewButton.setBounds(28, 83, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Students");
		btnNewButton_1.setBackground(new Color(131, 7, 11));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				std win= new std();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(374, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Courses");
		btnNewButton_2.setBackground(new Color(131, 7, 11));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				crs win= new crs();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(290, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Schedule");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(new Color(131, 7, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(203, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(131, 7, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win= new strWin.LogWindow();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(876, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Grade");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setBackground(new Color(131, 7, 11));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win= new gr();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(116, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				acc win= new acc();
				win.frame.setVisible(true);
			}
		});
		
		JButton btnNewButton_7 = new JButton("Professors");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_7.setBackground(new Color(131, 7, 11));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				prof win= new prof();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(454, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JLabel lblLogo = new JLabel("logo");
		lblLogo.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblLogo.setBounds(0, 0, 975, 75);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel.setBounds(0, 68, 975, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_1.setBounds(-14, 101, 999, 484);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
	}
}
