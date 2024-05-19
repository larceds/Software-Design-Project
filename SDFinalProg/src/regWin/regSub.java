package regWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class regSub {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;

	public JFrame frame;
	private JTextField sub;
	private JTextField subc;
	private JTextField un;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regSub window = new regSub();
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
	public regSub() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 518, 276);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Subject Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(33, 62, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		sub = new JTextField();
		sub.setBounds(33, 77, 300, 20);
		frame.getContentPane().add(sub);
		sub.setColumns(10);
		
		subc = new JTextField();
		subc.setBounds(370, 77, 86, 20);
		frame.getContentPane().add(subc);
		subc.setColumns(10);
		
		un = new JTextField();
		un.setBounds(370, 135, 86, 20);
		frame.getContentPane().add(un);
		un.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Subject Code");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(370, 62, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Units");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(370, 111, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton back = new JButton("Back");
		back.setBackground(new Color(128, 0, 0));
		back.setForeground(new Color(255, 255, 255));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				admWin.crs win = new admWin.crs();
				win.frame.setVisible(true);
			}
		});
		back.setBounds(245, 186, 175, 21);
		frame.getContentPane().add(back);
		
		JButton save = new JButton("Save Subject");
		save.setForeground(new Color(255, 255, 255));
		save.setBackground(new Color(128, 0, 0));
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = sub.getText();
				String sc = subc.getText();
				int u = Integer.parseInt(un.getText());
				
				try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
					st = c.createStatement();
	   			 	System.out.println("ok");
					rs = st.executeQuery("select * from sub");
					
					String str = "insert into sub "
							+" (sub_name,sub_code,units) "
							+ "values ('"+s+"','"+sc+"',"+u+")";
					
					st.executeUpdate(str);
					JOptionPane.showMessageDialog(null, "Successfully Added a new subject");
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
				
			}
		});
		save.setBounds(33, 185, 170, 23);
		frame.getContentPane().add(save);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_4.setBounds(0, 0, 502, 237);
		frame.getContentPane().add(lblNewLabel_4);
		
		
	}
}
