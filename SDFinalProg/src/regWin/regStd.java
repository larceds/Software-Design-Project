package regWin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.TextField;

public class regStd {
	Connection c = null;
	Statement st = null;
	ResultSet rs = null;
	ArrayList<String> namef = new ArrayList();
	ArrayList<String> namem = new ArrayList();
	ArrayList<String> namel = new ArrayList();
	int yr;
	int temp;
	int section;
	
	String sex;

    public JFrame frame;
    private JTextField lname;
    private JTextField fname;
    private JTextField mname;
    private JTextField bday;
    private JTextField age;
    private JTextField bplace;
    private JTextField lrn;
    private JTextField email;
    private JTextField res;
    private JTextField cp;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    regStd window = new regStd();
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
    public regStd() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 983, 712);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 206, 209));
        panel.setBounds(0, 0, 977, 680);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "Personal Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_1.setBackground(new Color(255, 206, 209));
        panel_1.setBounds(20, 60, 940, 590);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblApplicationFor = new JLabel("Application For:");
        lblApplicationFor.setBounds(20, 30, 150, 30);
        panel_1.add(lblApplicationFor);

        JComboBox<String> app = new JComboBox<>(new String[] {"----Select Application----"});
        app.addItem("Masteral");
        app.addItem("Senior High");
        app.addItem("Bachelors Degree");
        app.setBounds(180, 30, 200, 30);
        panel_1.add(app);

        JLabel lblClassification = new JLabel("Classification:");
        lblClassification.setBounds(20, 70, 150, 30);
        panel_1.add(lblClassification);

        JComboBox<String> classi = new JComboBox<>(new String[] {"----Select Classification----"});
        classi.addItem("Old");
        classi.addItem("Transeferee");
        classi.addItem("New");
        classi.setBounds(180, 70, 200, 30);
        panel_1.add(classi);

        JLabel lblCourse = new JLabel("Course/Program:");
        lblCourse.setBounds(20, 110, 150, 30);
        panel_1.add(lblCourse);

        JComboBox<String> course = new JComboBox<>(new String[] {"----Select Course----"});
        course.addItem("TCPE - BACHELOR OF SCIENCE IN COMPUTER ENGINEERING");
        course.setBounds(180, 110, 400, 30);
        panel_1.add(course);

        JLabel lblLevel = new JLabel("Level:");
        lblLevel.setBounds(20, 150, 150, 30);
        panel_1.add(lblLevel);

        JComboBox<String> lvl = new JComboBox<>(new String[] {"----Select Year----"});
        lvl.addItem("First Year");
        lvl.addItem("Second Year");
        lvl.addItem("Third Year");
        lvl.addItem("Fourth Year");
        lvl.setBounds(180, 150, 200, 30);
        panel_1.add(lvl);

        JLabel lblSchoolYear = new JLabel("School Year:");
        lblSchoolYear.setBounds(20, 190, 150, 30);
        panel_1.add(lblSchoolYear);

        JComboBox<String> sy = new JComboBox<>(new String[] {"----Select School Year----"});
        sy.addItem("2024 - 2025");
        sy.addItem("2025 - 2026");
        sy.setBounds(180, 190, 200, 30);
        panel_1.add(sy);

        JLabel lblTerm = new JLabel("Term:");
        lblTerm.setBounds(20, 230, 150, 30);
        panel_1.add(lblTerm);

        JComboBox<String> term = new JComboBox<>(new String[] {"----Select Semester----"});
        term.addItem("First Sem");
        term.addItem("Second Sem");
        term.setBounds(180, 230, 200, 30);
        panel_1.add(term);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 270, 150, 30);
        panel_1.add(lblName);

        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setBounds(180, 250, 150, 30);
        panel_1.add(lblLastName);

        JLabel lblFirstName = new JLabel("First Name");
        lblFirstName.setBounds(380, 250, 150, 30);
        panel_1.add(lblFirstName);

        JLabel lblMiddleName = new JLabel("Middle Name");
        lblMiddleName.setBounds(580, 250, 150, 30);
        panel_1.add(lblMiddleName);

        lname = new JTextField();
        lname.setBounds(180, 270, 150, 30);
        panel_1.add(lname);

        fname = new JTextField();
        fname.setBounds(380, 270, 150, 30);
        panel_1.add(fname);

        mname = new JTextField();
        mname.setBounds(580, 270, 150, 30);
        panel_1.add(mname);

        JLabel lblGender = new JLabel("Gender:");
        lblGender.setBounds(20, 310, 150, 30);
        panel_1.add(lblGender);

        JRadioButton buttonm = new JRadioButton("Male");
        buttonm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sex = "m";
				
			}
        	
        });
        buttonm.setBounds(180, 310, 100, 30);
        panel_1.add(buttonm);

        JRadioButton buttonfe = new JRadioButton("Female");
        buttonfe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sex = "f";
				
			}
        	
        });
        buttonfe.setBounds(280, 310, 100, 30);
        panel_1.add(buttonfe);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(buttonm);
        genderGroup.add(buttonfe);

        JLabel lblBirthDate = new JLabel("Birth Date:");
        lblBirthDate.setBounds(20, 350, 150, 30);
        panel_1.add(lblBirthDate);

        bday = new JTextField("mm/dd/yyy");
        bday.setBounds(180, 350, 150, 30);
        panel_1.add(bday);

        JLabel lblAge = new JLabel("Age:");
        lblAge.setBounds(380, 350, 50, 30);
        panel_1.add(lblAge);

        age = new JTextField();
        age.setBounds(420, 350, 50, 30);
        panel_1.add(age);

        JLabel lblBirthPlace = new JLabel("Birth Place:");
        lblBirthPlace.setBounds(480, 350, 100, 30);
        panel_1.add(lblBirthPlace);

        bplace = new JTextField();
        bplace.setBounds(580, 350, 150, 30);
        panel_1.add(bplace);

        JLabel lblReligion = new JLabel("Religion:");
        lblReligion.setBounds(20, 390, 150, 30);
        panel_1.add(lblReligion);

        JComboBox<String> reli = new JComboBox<>(new String[] {"----Select Religion----"});
        reli.addItem("Catholic");
        reli.addItem("Christian");
        reli.addItem("Iglesia ni Cristo");
        reli.setBounds(180, 390, 200, 30);
        panel_1.add(reli);

        JLabel lblCivilStatus = new JLabel("Civil Status:");
        lblCivilStatus.setBounds(20, 430, 150, 30);
        panel_1.add(lblCivilStatus);

        JComboBox<String> cs = new JComboBox<>(new String[] {"----Select Status----"});
        cs.addItem("Single");
        cs.addItem("Married");
        cs.setBounds(180, 430, 200, 30);
        panel_1.add(cs);

        JLabel lblCellphone = new JLabel("Cellphone Number:");
        lblCellphone.setBounds(20, 470, 150, 30);
        panel_1.add(lblCellphone);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 510, 150, 30);
        panel_1.add(lblEmail);

        email = new JTextField();
        email.setBounds(180, 510, 200, 30);
        panel_1.add(email);

        JLabel lblResidence = new JLabel("Residence Number:");
        lblResidence.setBounds(400, 510, 150, 30);
        panel_1.add(lblResidence);

        res = new JTextField();
        res.setBounds(580, 511, 150, 30);
        panel_1.add(res);

        JLabel lblLrn = new JLabel("LRN:");
        lblLrn.setBounds(400, 470, 150, 30);
        panel_1.add(lblLrn);

        lrn = new JTextField();
        lrn.setBounds(580, 470, 150, 30);
        panel_1.add(lrn);
        
        JLabel num = new JLabel("");
        num.setEnabled(false);
        num.setBounds(20, 559, 273, 13);
        panel_1.add(num);
        
        JButton enrollbut = new JButton("Enroll");
        enrollbut.addActionListener(new ActionListener() {
        	int number;
        	public void actionPerformed(ActionEvent e) {
        		
        		num.setEnabled(true);
        		
        		//ResultSetMetaData rsmd;
        		int cc = 0;
				try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
					st = c.createStatement();
					rs = st.executeQuery("select * from users");
					while(rs.next()) {
						namel.add(rs.getString("lname"));
						namef.add(rs.getString("fname"));
						namem.add(rs.getString("mname"));
						cc++;
					}
					
					
					if(sy.getSelectedIndex()== 1) {
	        			if(lvl.getSelectedIndex()== 1) {
	        				 number = 24100000 + cc;
	        			}else if(lvl.getSelectedIndex() ==2) {
	        				 number = 24200000 + cc;
	        			}else if(lvl.getSelectedIndex() == 3) {
	        				 number = 24300000 + cc;
	        			}else {
	        				 number = 24400000 + cc;
	        			}
	        		}else if(sy.getSelectedIndex()== 2){
	        			if(lvl.getSelectedIndex()== 1) {
	        				number = 25100000 + cc;
	        			}else if(lvl.getSelectedIndex() ==2) {
	        				number = 25200000 + cc;
	        			}else if(lvl.getSelectedIndex() == 3) {
	        				number = 25300000 + cc;
	        			}else {
	        				number = 25400000 + cc;
	        			}
	        		}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
        		
        		String ln = lname.getText();
        		String fn = fname.getText();
        		String mn = mname.getText();
        		int age1 = Integer.parseInt(age.getText());
        		String bp = bplace.getText();
        		String r = (String)reli.getSelectedItem().toString();
        		String civil = (String)cs.getSelectedItem().toString();
        		long num = Long.parseLong(cp.getText());
        		String em = email.getText();
        		long lr = Long.parseLong(lrn.getText());
        		long rsa = Long.parseLong(res.getText());
        		String ap = (String)app.getSelectedItem().toString();
        		String cl = (String)classi.getSelectedItem().toString();
        		String cr = (String)course.getSelectedItem().toString();
        		String lv = (String)lvl.getSelectedItem().toString();
        		String s = (String)sy.getSelectedItem().toString();
        		String t = (String)term.getSelectedItem().toString();
        		String bd = bday.getText();
        		
        		
        		if(lv.equalsIgnoreCase("first year")) {
        			yr = 1;
        		}else if(lv.equalsIgnoreCase("second year")){
        			yr = 2;
        		}else if(lv.equalsIgnoreCase("third year")) {
        			yr = 3;
        		}else {
        			yr = 4;
        		}
        		
        		try {
					rs = st.executeQuery("select st_level from users where st_level = 'third year'");
					while(rs.next()) {
						temp++;
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
        		
        		if(temp <= 30) {
					section = 1;
				}else if(temp <= 60) {
					section = 2;
				}else if(temp <= 90) {
					section = 3;
				}else {
					section = 4;
				}

        		System.out.println(temp+"\nTCPE "+yr+" - "+section);
        		if(namel.contains(ln) && namef.contains(fn) && namem.contains(mn)) {
        			JOptionPane.showMessageDialog(null, "Account has already been registered");
        		}else {
        			String reg = "insert into users "
    						+"(lname,fname,mname,gender,age,bp,religion,cs,email,lrn,res_num,app,class,course,st_level,sy,term,user_type,cp,bday,id_num,pw,s,un)"
    						+" values ('"+ln+"','"+fn+"','"+mn+"','"+sex+"',"+age1+",'"+bp+"','"+r
    						+"','"+civil+"','"+em+"',"+lr+","+rsa+",'"+ap
    						+"','"+cl+"','"+cr+"','"+lv+"','"+s+"','"+ t
    						+"','student',"+num+",'"+bd+"',"+number+",'"+ln+"','TCPE "+String.valueOf(yr)+" - "+String.valueOf(section)+"',"+30+")";
        			String str = "create table "+ln+"_gr (subject varchar(50), prelim int, midterm int, finals int, overall int)";
        			String str1 = "create table "+ln+"_sch (subcode varchar(15), des varchar(50), un int, sch varchar(50))";
            		try {
            			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
            			 st = c.createStatement();
            			System.out.println("ok");
            			
            			rs = st.executeQuery("select * from users");
            			System.out.println("ok1");
            			st.executeUpdate(reg);
            			st.executeUpdate(str);
            			st.executeUpdate(str1);
            			System.out.println("ok2");
            			
            			
            		
            			JOptionPane.showMessageDialog(null, "Account has been successfully registered\n This is your id number : "+number+"\n This is your password : "+ln);
            		}catch (Exception e1) {
            			System.out.println("1");

            		}
            		
        		}
        		
        		
        	}
        });
        enrollbut.setBounds(780, 550, 150, 30);
        panel_1.add(enrollbut);
        
        JButton backbut = new JButton("Back");
        backbut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        backbut.setBounds(780, 10, 150, 30);
        panel_1.add(backbut);
        
        cp = new JTextField();
        cp.setBounds(180, 470, 200, 30);
        panel_1.add(cp);
        
       

        JLabel lblWelcome = new JLabel("Welcome, Student");
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblWelcome.setBounds(20, 10, 940, 30);
        panel.add(lblWelcome);
    }
}
