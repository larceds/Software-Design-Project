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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 67, 1147, 59);
		panel.setBackground(new Color(149, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				pf win= new pf();
				win.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(28, 11, 69, 25);
		panel.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBackground(new Color(204, 4, 34));
		
		JButton btnNewButton = new JButton("Grades");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win= new gr();
				win.setVisible(true);
			}
		});
		btnNewButton.setBounds(96, 12, 74, 24);
		panel.add(btnNewButton);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(204, 4, 34));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
			}
		});
		btnSchedule.setBounds(169, 13, 77, 24);
		panel.add(btnSchedule);
		btnSchedule.setForeground(new Color(0, 0, 0));
		btnSchedule.setBackground(new Color(204, 4, 34));
		btnSchedule.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnNewButton_2 = new JButton("Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				acc win= new acc();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(245, 14, 82, 23);
		panel.add(btnNewButton_2);
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.setBounds(955, 14, 122, 24);
		panel.add(btnLogout);
		btnLogout.setForeground(Color.BLACK);
		btnLogout.setBackground(new Color(204, 4, 34));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Welcome, ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(33, 147, 74, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JList list = new JList();
		list.setBackground(Color.BLACK);
		list.setBounds(165, 339, 156, -89);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_2 = new JLabel("Sem:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(232, 181, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("School Year:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(33, 181, 88, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 209, 1061, 202);
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
		    tblData.setFillsViewportHeight(true);
		    tblData.setFont(new Font("Arial", Font.PLAIN, 9));
		    tblData.setModel(model); // Set model to the table

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
		comboBox.setBounds(112, 178, 110, 21);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"First", "Second", "Summer"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setBounds(267, 178, 88, 21);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, -11, 1137, 82);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 421, 1061, 142);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
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
		));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_4.setBounds(0, 119, 1147, 454);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
