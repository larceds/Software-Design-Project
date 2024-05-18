package admWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import strWin.LogWindow;
import java.awt.Color;
import java.awt.Font;

public class gr {
	String cs = null;
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;
	ArrayList<String> subj = new ArrayList();
	HashSet<String> crse = new HashSet();
	JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gr window = new gr();
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
	public gr() {
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
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.setBackground(new Color(131, 7, 11));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				adminWinMain win= new adminWinMain();
				win.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(35, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Grade");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(131, 7, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win= new gr();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(121, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.setBackground(new Color(131, 7, 11));
		btnSchedule.setForeground(new Color(255, 255, 255));
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
				
			}
		});
		btnSchedule.setBounds(207, 69, 89, 23);
		frame.getContentPane().add(btnSchedule);
		
		JButton btnNewButton_3 = new JButton("Courses");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(new Color(131, 7, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				crs win= new crs();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(292, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Students");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setBackground(new Color(131, 7, 11));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				std win = new std();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(381, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
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
		btnNewButton_7.setBounds(469, 69, 102, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("Logout");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6.setBackground(new Color(131, 7, 11));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win = new strWin.LogWindow();
				win.frame.setVisible(true);
				
			}
		});
		btnNewButton_6.setBounds(861, 69, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 193, 859, 273);
		frame.getContentPane().add(scrollPane);
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			 st= c.createStatement();
			rs=st.executeQuery("select s from users where user_type = 'student'");
			while(rs.next()) {
				crse.add(rs.getString("s"));
			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		
		
		JComboBox crs = new JComboBox(crse.toArray());
		crs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		//crs.setModel(new DefaultComboBoxModel());
		crs.setBounds(315, 126, 97, 23);
		frame.getContentPane().add(crs);
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			 st= c.createStatement();
			rs=st.executeQuery("select sub_name from sub");
			while(rs.next()) {
				subj.add(rs.getString("sub_name"));
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		JComboBox sub = new JComboBox(subj.toArray());
		
		//sub.setModel(new DefaultComboBoxModel());
		sub.setBounds(69, 126, 201, 23);
		frame.getContentPane().add(sub);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.getTableHeader().setReorderingAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				/*
				{Boolean.FALSE, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				*/
			},
			new String[] {
				 "Student ID", "Prelim", "Midterm", "Finals"
			}
		) {
			/*
			Class[] columnTypes = new Class[] {
				Boolean.class, Object.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			*/
			boolean[] columnEditables = new boolean[] {
				true, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		//table.getColumnModel().getColumn(4).setResizable(false);
		
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==sub) {
					cs = sub.getSelectedItem().toString();
					System.out.println(cs);
				}
			}
		});
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			 st= c.createStatement();
			 rs = st.executeQuery( "select st_id, prelims, midterms , finals from tempgrd where sub ='"+cs+"'" );
			
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
		JButton btnNewButton = new JButton("Approve");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(131, 7, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(10, 477, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		/*
		JCheckBox chckbxNewCheckBox = new JCheckBox("Select All ");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		chckbxNewCheckBox.setBounds(69, 167, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		*/
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 975, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_1.setBounds(0, 59, 975, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_1_1.setBounds(0, 530, 975, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_2.setBounds(-22, 92, 1007, 440);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
		
		
		
	}
}
