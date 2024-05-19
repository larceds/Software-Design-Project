package profWin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class gr {
	Connection c;
	Statement st;
	ResultSet rs;
	HashSet<String> subb = new HashSet();
	ArrayList<Integer> std = new ArrayList();
    JFrame frame;
    int row;
    private JTable tblGr;
    private JTextField p;
    private JTextField m;
    private JTextField f;
    private JTextField o;

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
        frame.getContentPane().setEnabled(false);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setBounds(100, 100, 991, 610);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(-10, -8, 1192, 84);
        lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
        frame.getContentPane().add(lblNewLabel);
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(1102, 97, 98, 24);
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(204, 4, 34));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-389, 524, 1633, 49);
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		frame.getContentPane().add(lblNewLabel_2);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/logo.png"));
		lblNewLabel.setIcon(img);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 286, 876, 191);
		frame.getContentPane().add(scrollPane);
		
		tblGr = new JTable();
		tblGr.setRowSelectionAllowed(false);
		tblGr.setCellSelectionEnabled(true);
		tblGr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				row = tblGr.getSelectedRow();
				
			}
		});
		tblGr.setFillsViewportHeight(true);
		tblGr.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(tblGr);
		tblGr.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"Student ID", "Prelims", "Midterms", "Finals", "Overall"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblGr.getColumnModel().getColumn(0).setResizable(false);
		tblGr.getColumnModel().getColumn(1).setResizable(false);
		tblGr.getColumnModel().getColumn(2).setResizable(false);
		tblGr.getColumnModel().getColumn(3).setResizable(false);
		tblGr.getColumnModel().getColumn(4).setResizable(false);
		
		        JButton btnNewButton = new JButton("Grades");
		        btnNewButton.setBounds(254, 78, 75, 24);
		        frame.getContentPane().add(btnNewButton);
		        btnNewButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		            	frame.dispose();
		                gr win = new gr();
		                win.frame.setVisible(true);
		            }
		        });
		        btnNewButton.setForeground(new Color(255, 255, 255));
		        btnNewButton.setBackground(new Color(131, 7, 11));
		        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		        
		        JButton btnNewButton_1 = new JButton("Profile");
		        btnNewButton_1.setBounds(33, 78, 89, 24);
		        frame.getContentPane().add(btnNewButton_1);
		        btnNewButton_1.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		frame.dispose();
		        		profWinMain win= new profWinMain();
		        		win.setVisible(true);
		        	}
		        });
		        btnNewButton_1.setForeground(new Color(255, 255, 255));
		        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		        btnNewButton_1.setBackground(new Color(131, 7, 11));
		        
		        JButton btnSchedule = new JButton("Schedule");
		        btnSchedule.setBounds(119, 78, 135, 24);
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
		        btnSchedule.setFont(new Font("Tahoma", Font.BOLD, 11));
		        
		        JButton btnNewButton_3 = new JButton("Logout");
		        btnNewButton_3.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		frame.dispose();
		        		strWin.LogWindow win = new strWin.LogWindow();
		        		win.frame.setVisible(true);
		        	}
		        });
		        btnNewButton_3.setBackground(new Color(131, 7, 11));
		        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		        btnNewButton_3.setForeground(new Color(255, 255, 255));
		        btnNewButton_3.setBounds(865, 79, 89, 23);
		        frame.getContentPane().add(btnNewButton_3);
		        
		        JLabel lblNewLabel_1 = new JLabel("New label");
		        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		        lblNewLabel_1.setBounds(0, 70, 975, 41);
		        frame.getContentPane().add(lblNewLabel_1);
		        
		        try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
					st=c.createStatement();
					rs = st.executeQuery("select sub_name from sub");
					while(rs.next()) {
						subb.add(rs.getString("sub_name"));
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		        
		        JComboBox sub = new JComboBox(subb.toArray());
		        sub.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		if(e.getSource()==sub) {
		        			try {
								 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
								 st= c.createStatement();
								 rs = st.executeQuery( "select st_id, prelims, midterms , finals , overall from tempgrd where sub ='"+sub.getSelectedItem().toString()+"'" );
								 ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
								 
								 int cc = rsmd.getColumnCount();
								 String[] clm = new String[cc];
								 for(int i = 0; i<cc; i++) {
									 clm[i] = rsmd.getColumnClassName(i+1);
								 }
								 
								 DefaultTableModel d = (DefaultTableModel) tblGr.getModel();
								 d.setRowCount(0);
								 while(rs.next()) {
									 Object[] rowData = new Object[cc];
								        for (int i = 0; i < cc; i++) {
								            rowData[i] = rs.getObject(i+1);
								}
								       d.addRow(rowData);} 
								 
								 
										 
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							
		        			 
		        		}
		        	}
		        });
		        sub.setForeground(new Color(255, 255, 255));
		        sub.setBackground(new Color(131, 7, 11));
		        //sub.setModel(new DefaultComboBoxModel(new String[] {"Subject"}));
		        sub.setBounds(43, 254, 250, 22);
		        frame.getContentPane().add(sub);
		        
		        JComboBox comboBox_1 = new JComboBox();
		        comboBox_1.setForeground(new Color(255, 255, 255));
		        comboBox_1.setBackground(new Color(131, 7, 11));
		        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"TCPE"}));
		        comboBox_1.setBounds(303, 254, 98, 22);
		        frame.getContentPane().add(comboBox_1);
		        
		        p = new JTextField();
		        p.setBounds(142, 150, 96, 19);
		        frame.getContentPane().add(p);
		        p.setColumns(10);
		        
		        m = new JTextField();
		        m.setBounds(236, 150, 96, 19);
		        frame.getContentPane().add(m);
		        m.setColumns(10);
		        
		        f = new JTextField();
		        f.setBounds(330, 150, 96, 19);
		        frame.getContentPane().add(f);
		        f.setColumns(10);
		        
		        o = new JTextField();
		        o.setBounds(425, 150, 96, 19);
		        frame.getContentPane().add(o);
		        o.setColumns(10);
		        
		        JLabel lblNewLabel_4 = new JLabel("Student ID");
		        lblNewLabel_4.setBounds(43, 131, 79, 13);
		        frame.getContentPane().add(lblNewLabel_4);
		        
		        JLabel lblNewLabel_4_1 = new JLabel("Prelims");
		        lblNewLabel_4_1.setBounds(141, 131, 45, 13);
		        frame.getContentPane().add(lblNewLabel_4_1);
		        
		        JLabel lblNewLabel_4_2 = new JLabel("Midterms");
		        lblNewLabel_4_2.setBounds(236, 131, 84, 13);
		        frame.getContentPane().add(lblNewLabel_4_2);
		        
		        JLabel lblNewLabel_4_3 = new JLabel("Finals");
		        lblNewLabel_4_3.setBounds(330, 131, 45, 13);
		        frame.getContentPane().add(lblNewLabel_4_3);
		        
		        JLabel lblNewLabel_4_4 = new JLabel("Overall");
		        lblNewLabel_4_4.setBounds(430, 131, 45, 13);
		        frame.getContentPane().add(lblNewLabel_4_4);
		        
		        try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
					st=c.createStatement();
					rs = st.executeQuery("select id_num from users where user_type = 'student' ");
					//String str = "insert into tempgrd";
					while(rs.next()) {
						std.add(rs.getInt("id_num"));
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		        
		        JComboBox comboBox = new JComboBox(std.toArray());
		        comboBox.setBounds(43, 149, 99, 21);
		        frame.getContentPane().add(comboBox);
		        
		        JButton btnNewButton_4 = new JButton("Submit");
		        btnNewButton_4.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		try {
							c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
							st=c.createStatement();
							rs = st.executeQuery("select * from tempgrd");
							int tot = (Integer.parseInt(p.getText()) +Integer.parseInt(m.getText())+Integer.parseInt(f.getText()))/3;
							String str = "insert into tempgrd (st_id,prelims,midterms,finals,sub,overall) values ("+comboBox.getSelectedItem()+","+Integer.parseInt(p.getText())+""
									+ ","+Integer.parseInt(m.getText())+","+Integer.parseInt(f.getText())+",'"+sub.getSelectedItem().toString()+"',"+tot+")";
							st.executeUpdate(str);
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
		        	}
		        });
		        btnNewButton_4.setBounds(550, 149, 85, 21);
		        frame.getContentPane().add(btnNewButton_4);
		          
		        JLabel lblNewLabel_3 = new JLabel("New label");
		        lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		        lblNewLabel_3.setBounds(-10, 104, 985, 424);
		        frame.getContentPane().add(lblNewLabel_3);
		     
			    }
			}