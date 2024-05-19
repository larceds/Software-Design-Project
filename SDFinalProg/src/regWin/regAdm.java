package regWin;
import java.awt.EventQueue;
import admWin.adminWinMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class regAdm {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;

	ArrayList<String> namef = new ArrayList();
	ArrayList<String> namem = new ArrayList();
	ArrayList<String> namel = new ArrayList();
	
	public JFrame frame;
	private JTextField lname;
	private JTextField deg;
	private JTextField no;
	private JTextField email;
	private JTextField spe;
	private JTextField na;
	private JTextField mname;
	private JTextField fname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regAdm window = new regAdm();
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
	public regAdm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 930, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 916, 515);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ln = lname.getText();
				String fn = fname.getText();
				String mn = mname.getText();
				String d = deg.getText();
				String sp = spe.getText();
				long num = Long.parseLong(no.getText());
				String asso = na.getText();
				String em = email.getText();
				
				int cc = 0;
				try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
					st = c.createStatement();
       			 	System.out.println("ok");
					rs = st.executeQuery("select * from users");
					while(rs.next()) {
	    				namel.add(rs.getString("lname"));
						namef.add(rs.getString("fname"));
						namem.add(rs.getString("mname"));
	    				cc++;
	    			}
				} catch (SQLException e1) {
	
					e1.printStackTrace(); 
				}
				
				
				if(namel.contains(ln) && namef.contains(fn) && namem.contains(mn)) {
        			JOptionPane.showMessageDialog(null, "Account has already been registered");
        		}else {
				
				try {
        			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
        			 st = c.createStatement();
        			System.out.println("ok");
        			rs = st.executeQuery("select * from users");
        			
        			
    				//int temp = 10000 + cc;
    				int number = 24510000 + cc;
        			
        			String reg = "insert into users"
    						+ "(lname,fname,mname,email,cp,pw,deg,spe,na,user_type,id_num)"
    						+ " values ('"+ln+"','"+fn+"','"+mn+"','"+em+"',"+num+",'"+ln+"','"+d+"','"+sp+"','"+asso+"','admin',"+number+")";
    				
        			st.executeUpdate(reg);
        			JOptionPane.showMessageDialog(null, "Account has been successfully registered\n This is your id number : "+number+"\n This is your password : "+ln);
        			
        			
        		}catch (Exception e1) {
        			System.out.println("1");

        		}
			}
			}
		});
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminWinMain admin = new adminWinMain();
				frame.dispose();
				admin.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(778, 81, 89, 23);
		panel.add(btnNewButton_1);
		
		na = new JTextField();
		na.setBounds(451, 295, 210, 20);
		panel.add(na);
		na.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nature of Association");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(441, 270, 136, 14);
		panel.add(lblNewLabel_8);
		
		spe = new JTextField();
		spe.setBounds(220, 239, 444, 20);
		panel.add(spe);
		spe.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Area of Specialization ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(220, 214, 143, 14);
		panel.add(lblNewLabel_6);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(217, 355, 444, 20);
		panel.add(email);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Email Address:");
		lblNewLabel_4_1_3.setForeground(Color.WHITE);
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_3.setBounds(220, 325, 129, 20);
		panel.add(lblNewLabel_4_1_3);
		btnNewButton.setBounds(397, 413, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("PROFESSOR REGISTRATION FORM");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(302, 84, 286, 14);
		panel.add(lblNewLabel_5);
		
		no = new JTextField();
		no.setColumns(10);
		no.setBounds(220, 295, 185, 20);
		panel.add(no);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Contact NO:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(220, 262, 96, 30);
		panel.add(lblNewLabel_4_1_1);
		
		deg = new JTextField();
		deg.setColumns(10);
		deg.setBounds(220, 189, 185, 20);
		
		panel.add(deg);
		
		mname = new JTextField("Middlename");
		mname.setColumns(10);
		mname.setBounds(518, 143, 143, 20);
		panel.add(mname);
		
		fname = new JTextField("Firstname");
		fname.setColumns(10);
		fname.setBounds(368, 143, 150, 20);
		panel.add(fname);
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Degree:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setBounds(210, 160, 195, 30);
		panel.add(lblNewLabel_4_1);
		
		lname = new JTextField("Lastname");
		lname.setBounds(220, 143, 150, 20);
		panel.add(lname);
		lname.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Full Name:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(210, 116, 61, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg3.jpg")));
		lblNewLabel_3.setBounds(188, 104, 530, 345);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 916, 73);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_2.setBounds(-174, 460, 1238, 86);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_1.setBounds(0, -92, 946, 607);
		panel.add(lblNewLabel_1);
		
		
		
		
		
	}
}
