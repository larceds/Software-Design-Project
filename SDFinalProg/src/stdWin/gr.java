package stdWin;

import java.awt.EventQueue;
import strWin.LogWindow;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.DropMode;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class gr extends JFrame {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;
	static LogWindow log = new LogWindow();

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gr frame = new gr();
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
	public gr() {
		System.out.println(log.idn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 991, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				stdWinMain win = new stdWinMain();
				win.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setBounds(22, 76, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Grade");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				gr win= new gr();
				win.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(109, 76, 95, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Schedule");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				sch win=new sch();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(201, 76, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Log out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				strWin.LogWindow win = new strWin.LogWindow();
				win.frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(131, 7, 11));
		btnNewButton_3.setBounds(849, 76, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(22, 112, 308, 14);
		contentPane.add(lblNewLabel);
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			st = c.createStatement();
			rs = st.executeQuery("select fname from users where lname ='"+log.log+"'");
			while(rs.next()) {
				lblNewLabel.setText("Welcome "+log.log+", "+rs.getString("fname")+" ("+log.idn+")");
			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(22, 133, 920, 402);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Attention to all students");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(360, 11, 158, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\tViewing of grades online is strictly for personal use only! Students who want an official copy from the Registrar for interoffice transaction's , must make a request for the official document from the Registrar's Office.  \r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(10, 25, 867, 28);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Your GRADES posted in AIMS from the previous school years were part of the data we migrated from the old enrollment system and are still subject for checking and validation from the registrar.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_3.setBounds(48, 48, 848, 14);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 64, 886, 327);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 0, 876, 327);
		panel_1.add(scrollPane);
		
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Subject", "Prelim", "Midterm", "Finals", "Overall"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, true, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			st= c.createStatement();
			rs=st.executeQuery("select sub,prelims,midterms,finals,overall from grd where st_id = "+log.idn);
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			
			int col= rsmd.getColumnCount();
			String[] colName = new String[col];
				for (int i=0;i<col;i++) {
			colName[i]=rsmd.getColumnClassName(i+1);
				}
				
				DefaultTableModel m= (DefaultTableModel) table.getModel();
				
				m.setRowCount(0); //Resets table rows to 0 to let system add new rows
				while(rs.next()) {
					Object[] rowData = new Object[col];
			        for (int i = 0; i < col; i++) {
			            rowData[i] = rs.getObject(i+1);
				}
			       m.addRow(rowData);}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_6.setBounds(0, 65, 975, 44);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel_5.setBounds(0, 0, 987, 67);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_7.setBounds(0, 540, 975, 31);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_4.setBounds(-12, -13, 987, 573);
		contentPane.add(lblNewLabel_4);
		
		
	}
}
