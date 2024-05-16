package profWin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class gr {

    JFrame frame;
    private JTable tblGr;

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
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(131, 7, 11));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(33, 490, 109, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 164, 876, 313);
		frame.getContentPane().add(scrollPane);
		
		tblGr = new JTable();
		tblGr.setRowSelectionAllowed(false);
		tblGr.setCellSelectionEnabled(true);
		tblGr.setFillsViewportHeight(true);
		tblGr.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(tblGr);
		tblGr.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
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
		        btnNewButton.setBounds(213, 78, 75, 24);
		        frame.getContentPane().add(btnNewButton);
		        btnNewButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		            	frame.dispose();
		                openGradesWindow();
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
		        		pf win= new pf();
		        		win.setVisible(true);
		        	}
		        });
		        btnNewButton_1.setForeground(new Color(255, 255, 255));
		        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		        btnNewButton_1.setBackground(new Color(131, 7, 11));
		        
		        JButton btnSchedule = new JButton("Schedule");
		        btnSchedule.setBounds(119, 78, 98, 24);
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
		        btnNewButton_3.setBackground(new Color(131, 7, 11));
		        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		        btnNewButton_3.setForeground(new Color(255, 255, 255));
		        btnNewButton_3.setBounds(865, 79, 89, 23);
		        frame.getContentPane().add(btnNewButton_3);
		        
		        JLabel lblNewLabel_1 = new JLabel("New label");
		        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		        lblNewLabel_1.setBounds(0, 70, 975, 41);
		        frame.getContentPane().add(lblNewLabel_1);
		        
		        JComboBox comboBox = new JComboBox();
		        comboBox.setForeground(new Color(255, 255, 255));
		        comboBox.setBackground(new Color(131, 7, 11));
		        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Subject"}));
		        comboBox.setBounds(33, 131, 89, 22);
		        frame.getContentPane().add(comboBox);
		        
		        JComboBox comboBox_1 = new JComboBox();
		        comboBox_1.setForeground(new Color(255, 255, 255));
		        comboBox_1.setBackground(new Color(131, 7, 11));
		        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Course/Section"}));
		        comboBox_1.setBounds(128, 131, 126, 22);
		        frame.getContentPane().add(comboBox_1);
		        
		        JLabel lblNewLabel_4 = new JLabel();
		        lblNewLabel_4.setText("Welcome, null null null");
		        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		        lblNewLabel_4.setBounds(30, 113, 389, 14);
		        frame.getContentPane().add(lblNewLabel_4);
		        
		        JLabel lblNewLabel_3 = new JLabel("New label");
		        lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		        lblNewLabel_3.setBounds(-10, 104, 985, 424);
		        frame.getContentPane().add(lblNewLabel_3);
		        
		        

        // Other buttons and components omitted for brevity
    }

    /**
     * Open the grades window.
     */
		    private void openGradesWindow() {
			    	frame = new JFrame("Grades - 1st Semester");
			        frame.setSize(600, 400);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
			        String[] columnNames = {"Subject", "Prelim", "Midterm", "Finals", "Average"};
			        Object[][] data = {
			            {"Numerical Method", 85, 78, 90, null},
			            {"FEC Lecture", 80, 75, 85, null},	
			            {"Art App", 88, 82, 87, null},
			            {"Software Design Lecture", 75, 70, 80, null},
			            {"Survival Technique", 90, 85, 95, null},
			            {"FEC Lab", 85, 80, 88, null},
			            {"Ethics", 92, 88, 95, null},
			            {"Rizal", 78, 75, 85, null},
			            {"Software Design Lab", 80, 76, 82, null}
			        };
	
			        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
			            @Override
			            public Class<?> getColumnClass(int columnIndex) {
			                return columnIndex == 0 ? String.class : Integer.class;
			            }
	
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false;
			            }
			        };
	
			        JTable table = new JTable(model);
	
			        // Calculate average for each row and add to the table
			        for (int row = 0; row < model.getRowCount(); row++) {
			            int sum = 0;
			            for (int col = 1; col < 4; col++) {
			                sum += (int) model.getValueAt(row, col);
			            }
			            double average = sum / 3.0;
			            model.setValueAt(String.format("%.2f", average), row, 4);
			        }
	
			        JScrollPane scrollPane = new JScrollPane(table);
			        frame.getContentPane().add(scrollPane);
			        frame.setVisible(true);
			    }
			}