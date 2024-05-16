package stdWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sch {

	JFrame frame;
	private JTable tblData;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
		    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schedule", "root", "villena");
		    Statement st = c.createStatement();
		    ResultSet rs = st.executeQuery("SELECT * FROM schedule");
		    System.out.println("success");
		} catch (Exception e) {
		    System.out.println("error");
		    e.printStackTrace();
		}
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
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 1144, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome, ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(43, 110, 74, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JList list = new JList();
		list.setBackground(Color.BLACK);
		list.setBounds(165, 339, 156, -89);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_2 = new JLabel("Sem:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(240, 137, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("School Year:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(43, 137, 88, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 161, 1048, 160);
		frame.getContentPane().add(scrollPane);

		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schedule", "root", "villena");
		    Statement st = c.createStatement();
		    ResultSet rs = st.executeQuery("SELECT * FROM schedule");
		    ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
		    
		    int cols = rsmd.getColumnCount();
		    String[] colName = new String[cols];
		    for (int i = 0; i < cols; i++) {
		        colName[i] = rsmd.getColumnName(i + 1);
		    }
		    
		    DefaultTableModel model = new DefaultTableModel(colName, 0);
		    while (rs.next()) {
		        Object[] rowData = new Object[cols];
		        for (int i = 0; i < cols; i++) {
		            rowData[i] = rs.getObject(i + 1);
		        }
		        model.addRow(rowData); 
		    }

		    tblData = new JTable() {
		        @Override
		        public boolean isCellEditable(int row, int column) {
		            return false; 
		        }
		    };
		    tblData.setRowSelectionAllowed(false);
		    tblData.getTableHeader().setReorderingAllowed(false);
		    tblData.setFillsViewportHeight(true);
		    tblData.setFont(new Font("Arial", Font.PLAIN, 9));
		    tblData.setModel(new DefaultTableModel(
		    	new Object[][] {
		    		{null, null, null, null, null, null, null},
		    	},
		    	new String[] {
		    		"#", "Subject Code", "Description", "Lec", "Lab", "Units", "Schedule"
		    	}
		    ) {
		    	boolean[] columnEditables = new boolean[] {
		    		false, false, false, false, false, false, false
		    	};
		    	public boolean isCellEditable(int row, int column) {
		    		return columnEditables[column];
		    	}
		    });
		    tblData.getColumnModel().getColumn(0).setResizable(false);
		    tblData.getColumnModel().getColumn(1).setResizable(false);
		    tblData.getColumnModel().getColumn(2).setResizable(false);
		    tblData.getColumnModel().getColumn(3).setResizable(false);
		    tblData.getColumnModel().getColumn(4).setResizable(false);
		    tblData.getColumnModel().getColumn(5).setResizable(false);
		    tblData.getColumnModel().getColumn(6).setResizable(false);

		    scrollPane.setViewportView(tblData);

		    System.out.println("success");
		} catch (Exception e) {
		    System.out.println("error");
		    e.printStackTrace();
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2022 - 2023", "2023 - 2024", "2024 - 2025"}));
		comboBox.setBounds(120, 134, 110, 21);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"First", "Second", "Summer"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setBounds(279, 134, 88, 21);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, -11, 1137, 82);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(28, 339, 1048, 171);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.getTableHeader().setReorderingAllowed(false);
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		table_1.getColumnModel().getColumn(3).setResizable(false);
		table_1.getColumnModel().getColumn(4).setResizable(false);
		table_1.getColumnModel().getColumn(5).setResizable(false);
		table_1.getColumnModel().getColumn(6).setResizable(false);
		table_1.getColumnModel().getColumn(7).setResizable(false);
		
		
		
		JButton btnNewButton_2 = new JButton("Account");
		btnNewButton_2.setBackground(new Color(131, 7, 11));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(240, 75, 82, 24);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.setBounds(165, 75, 77, 24);
		frame.getContentPane().add(btnSchedule);
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
			}
		});
		btnSchedule.setForeground(new Color(255, 255, 255));
		btnSchedule.setBackground(new Color(131, 7, 11));
		btnSchedule.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnNewButton = new JButton("Grades");
		btnNewButton.setBounds(101, 75, 74, 24);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win= new gr();
				win.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(131, 7, 11));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.setBounds(33, 75, 69, 24);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				pf win= new pf();
				win.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(131, 7, 11));
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.setBounds(976, 75, 100, 24);
		frame.getContentPane().add(btnLogout);
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(131, 7, 11));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				acc win= new acc();
				win.frame.setVisible(true);
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_4.setBounds(0, 108, 1147, 424);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_5.setBackground(new Color(131, 7, 11));
		lblNewLabel_5.setBounds(0, 66, 1137, 42);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_6.setBounds(0, 521, 1137, 50);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
