package regWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import java.awt.event.MouseEvent;
import admWin.sch;

public class regSch {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;
	
	ArrayList<String> subj = new ArrayList();
	ArrayList<String> proff = new ArrayList();
	ArrayList<Integer> in = new ArrayList();
	ArrayList<Integer> out = new ArrayList();
	ArrayList<String> sbj = new ArrayList();
	ArrayList<String> prf = new ArrayList();
	HashSet<String> section = new HashSet();
	ArrayList<String> sn = new ArrayList();

	public JFrame frame;
	//private JTable sch;
	private JTextField tin;
	private JTextField tout;
	public JTable del;
	private JTable schedTBL;
	private JTextField schTIN;
	private JTextField schTOUT;
	private JTextField schSUB;
	private JTextField schPRF;
	private JTable schd;
	int row;
	int i;
	private JTextField editSEC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regSch window = new regSch();
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
	public regSch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1197, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(78, 131, 1017, 557);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("Add schedule", null, panel, null);
		panel.setLayout(null);
		
		JButton done = new JButton("Done");
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch sched = new sch();
				sched.frame.setVisible(true);
			
			}
		});
		done.setBounds(799, 473, 115, 30);
		panel.add(done);
		
		tin = new JTextField();
		tin.setBounds(111, 74, 70, 20);
		panel.add(tin);
		tin.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Time in");
		lblNewLabel_2.setBounds(111, 55, 70, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Subject");
		lblNewJgoodiesLabel.setBounds(304, 55, 92, 14);
		panel.add(lblNewJgoodiesLabel);
		
		tout = new JTextField();
		tout.setColumns(10);
		tout.setBounds(201, 74, 70, 20);
		panel.add(tout);
		
		JLabel lblNewLabel_2_1 = new JLabel("Time out");
		lblNewLabel_2_1.setBounds(201, 55, 70, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Profesor");
		lblNewLabel_2_2.setBounds(510, 55, 70, 14);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Schedule Registration");
		lblNewJgoodiesLabel_1.setFont(new Font("Constantia", Font.BOLD, 24));
		lblNewJgoodiesLabel_1.setBounds(354, 11, 276, 33);
		panel.add(lblNewJgoodiesLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("Schedule");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(67, 121, 102, 14);
		panel.add(lblNewLabel_6);
		
		int count = 0;
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
			st = c.createStatement();
			System.out.println("ok");
			rs = st.executeQuery("select * from sub");
			while(rs.next()) {
				subj.add(rs.getString("sub_name"));
				
			}
			rs = st.executeQuery("select lname from users where user_type = 'professor'");
			while(rs.next()) {
				proff.add(rs.getString("lname"));
			}
			
			rs = st.executeQuery("select * from sch");
			while(rs.next()) {
				in.add(rs.getInt("tin"));
				out.add(rs.getInt("tout"));
				sbj.add(rs.getString("sub"));
				prf.add(rs.getString("prof"));
				sn.add(rs.getString("sec"));
				count++;
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		JComboBox<String> sub = new JComboBox(subj.toArray());
		sub.setBounds(304, 73, 191, 21);
		panel.add(sub);
		
		JComboBox prof = new JComboBox(proff.toArray());
		prof.setBounds(507, 73, 191, 21);
		panel.add(prof);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("Delete", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		
		DefaultTableModel m = new DefaultTableModel();
		
		m.addColumn("Time in");
		m.addColumn("Time out");
		m.addColumn("Subject");
		m.addColumn("Professor");
		m.addColumn("Section");
		
		int ii = 0;
		try {
			rs = st.executeQuery("select * from sch");
			while(rs.next()) {
				
				m.insertRow(ii,new Object[] {in.get(ii),out.get(ii),sbj.get(ii),prf.get(ii),sn.get(ii)});
				ii++;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		scrollPane_1.setBounds(67, 139, 869, 295);
		panel_1.add(scrollPane_1);
		
		
		del = new JTable(m);
		del.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				row = del.getSelectedRow();
			}
		});
		scrollPane_1.setViewportView(del);
		del.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JButton done2 = new JButton("Done");
		done2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch sched = new sch();
				sched.frame.setVisible(true);
			}
		});
		done2.setBounds(796, 466, 115, 30);
		panel_1.add(done2);
		
		try {
			rs = st.executeQuery("select s from users");
			while(rs.next()) {
				section.add(rs.getString("s"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		JComboBox sect = new JComboBox(section.toArray());
		sect.setBounds(719, 73, 102, 21);
		panel.add(sect);
		
		JButton save = new JButton("Save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tmin = Integer.parseInt(tin.getText());
				int tmout = Integer.parseInt(tout.getText());
				String s = sub.getSelectedItem().toString();
				String p = prof.getSelectedItem().toString();
				String se = sect.getSelectedItem().toString();
				
				try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
					st = c.createStatement();
					System.out.println("ok");
					rs = st.executeQuery("select * from sch");
					
					String str = "insert into sch"
							+ "(tin,tout,sub,prof,sec)"
							+ " values ("+tmin+","+tmout+",'"+s+"','"+p+"','"+se+"')";
					
					st.executeUpdate(str);
					JOptionPane.showMessageDialog(null, "Successfully Added a new schedule");
					SwingUtilities.updateComponentTreeUI(frame);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		save.setBounds(674, 473, 115, 30);
		panel.add(save);
		
		DefaultTableModel tm = new DefaultTableModel();
		
		tm.addColumn("Time in");
		tm.addColumn("Time out");
		tm.addColumn("Subject");
		tm.addColumn("Professor"); 
		tm.addColumn("Sectiom");
		
		
		try {
			rs = st.executeQuery("select * from sch");
			while(rs.next()) {
				
				tm.insertRow(i,new Object[] {in.get(i),out.get(i),sbj.get(i),prf.get(i),sn.get(i)});
				i++;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 155, 833, 280);
		panel.add(scrollPane);
		
		schd = new JTable();
		
		scrollPane.setViewportView(schd);
		schd.setModel(tm);
		
		JLabel lblNewLabel_8 = new JLabel("Section");
		lblNewLabel_8.setBounds(722, 56, 45, 13);
		panel.add(lblNewLabel_8);
		
		try {
			rs = st.executeQuery("select s from users");
			while(rs.next()) {
				section.add(rs.getString("s"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		/*
		JButton ref = new JButton("Refresh");
		ref.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					i=0;
					rs = st.executeQuery("select * from sch");
					while(rs.next()) {
						tm.removeRow(i);
						tm.insertRow(i,new Object[] {in.get(i),out.get(i),sbj.get(i),prf.get(i)});
						i++;
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		ref.setBounds(554, 476, 110, 27);
		panel.add(ref);
		*/
		
		JLabel lblNewLabel_3 = new JLabel("Select Schedule to Delete");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(67, 114, 214, 24);
		panel_1.add(lblNewLabel_3);
		
		JButton dele = new JButton("Delete");
		dele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
					st = c.createStatement();
	   			 	System.out.println("ok");
					rs = st.executeQuery("select * from sch");
					
					String str = "delete from sch where tin = "+in.get(row)+" && tout = "+out.get(row)+" && sub = '"+sbj.get(row)+"' && prof = '"+prf.get(row)+"' && sec = '"+sn.get(row)+"'";
					st.executeUpdate(str);
					 JOptionPane.showMessageDialog(null, "Successfully deleted a subject");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		dele.setBounds(796, 99, 115, 30);
		panel_1.add(dele);
		
		JLabel lblNewLabel_4 = new JLabel("Schedule Cancelation");
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 23));
		lblNewLabel_4.setBounds(365, 22, 282, 30);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("Edit", null, panel_2, null);
		panel_2.setLayout(null);
		
		DefaultTableModel sc = new DefaultTableModel();
		
		sc.addColumn("Time in");
		sc.addColumn("Time out");
		sc.addColumn("Subject");
		sc.addColumn("Professor"); 
		sc.addColumn("Section");
		
		int j =0;
		
		try {
			rs = st.executeQuery("select * from sch");
			while(rs.next()) {
				
				sc.insertRow(j,new Object[] {in.get(j),out.get(j),sbj.get(j),prf.get(j),sn.get(j)});
				j++;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		schTIN = new JTextField();
		schTIN.setColumns(10);
		schTIN.setBounds(111, 88, 70, 20);
		panel_2.add(schTIN);
		
		schTOUT = new JTextField();
		schTOUT.setColumns(10);
		schTOUT.setBounds(199, 88, 70, 20);
		panel_2.add(schTOUT);
		
		schSUB = new JTextField();
		schSUB.setColumns(10);
		schSUB.setBounds(302, 88, 169, 20);
		panel_2.add(schSUB);
		
		schPRF = new JTextField();
		schPRF.setColumns(10);
		schPRF.setBounds(499, 88, 169, 20);
		panel_2.add(schPRF);
		
		scrollPane_2.setBounds(72, 151, 869, 295);
		panel_2.add(scrollPane_2);
		schedTBL = new JTable(sc);
		
		editSEC = new JTextField();
		editSEC.setColumns(10);
		editSEC.setBounds(698, 88, 70, 20);
		panel_2.add(editSEC);
		
		schedTBL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				row = schedTBL.getSelectedRow();
				schTIN.setText(String.valueOf(in.get(row)));
				schTOUT.setText(String.valueOf(out.get(row)));
				schSUB.setText(sbj.get(row));
				schPRF.setText(prf.get(row));
				editSEC.setText(sn.get(row));
			}
		});
		scrollPane_2.setViewportView(schedTBL);
		
		schedTBL.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JLabel lblNewLabel_4_1 = new JLabel("Schedule Edit");
		lblNewLabel_4_1.setFont(new Font("Constantia", Font.BOLD, 23));
		lblNewLabel_4_1.setBounds(422, 11, 213, 30);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("Select Schedule to Edit");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(72, 126, 163, 30);
		panel_2.add(lblNewLabel_5);
		
		JButton schSAVE = new JButton("Save");
		schSAVE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					rs = st.executeQuery("select * from sch");
					String str = "update sch set tin = "+Integer.parseInt(schTIN.getText())+", tout = "+Integer.parseInt(schTOUT.getText())+", sub = '"+schSUB.getText()+"', prof = '"+schPRF.getText()+"', sec ='"+editSEC.getText()+
							"'"
							+ " where tin = "+in.get(row)+" && tout = "+out.get(row)+" && sub = '"+sbj.get(row)+"' && prof = '"+prf.get(row)+"' && sec = '"+sn.get(row)+"'";
					st.executeUpdate(str);
					 JOptionPane.showMessageDialog(null, "Successfully edited a schedule");
				} catch (SQLException e1) {
					System.out.println("lol");
					e1.printStackTrace();
				}
			}
		});
		schSAVE.setBounds(653, 469, 115, 30);
		panel_2.add(schSAVE);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("Time in");
		lblNewLabel_7.setBounds(111, 73, 46, 14);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Time out");
		lblNewLabel_7_1.setBounds(199, 73, 70, 14);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Subject ");
		lblNewLabel_7_2.setBounds(302, 73, 56, 14);
		panel_2.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Profesor ");
		lblNewLabel_7_3.setBounds(499, 73, 63, 14);
		panel_2.add(lblNewLabel_7_3);
		
		JButton done3 = new JButton("Done");
		done3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch sched = new sch();
				sched.frame.setVisible(true);
			}
			
		});
		done3.setBounds(778, 469, 115, 30);
		panel_2.add(done3);
		
		JLabel lblNewLabel_8_1 = new JLabel("Section");
		lblNewLabel_8_1.setBounds(698, 74, 45, 13);
		panel_2.add(lblNewLabel_8_1);
		
		
		
		JLabel lblNewLabel = new JLabel("banner eac");
		lblNewLabel.setBounds(0, -14, 1181, 96);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("backround");
		lblNewLabel_1.setBounds(0, 66, 1181, 707);
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		frame.getContentPane().add(lblNewLabel_1);
	}
}

