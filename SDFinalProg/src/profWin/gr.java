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

public class gr {

    private JFrame frame;
    private JTable table_1;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(-10, 66, 1262, 66);
		panel.setBackground(new Color(149, 0, 0));
		frame.getContentPane().add(panel);
		        panel.setLayout(null);
		
		        JButton btnNewButton = new JButton("Grades");
		        btnNewButton.setBounds(140, 21, 75, 25);
		        panel.add(btnNewButton);
		        btnNewButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                openGradesWindow();
		            }
		        });
		        btnNewButton.setForeground(new Color(255, 255, 255));
		        btnNewButton.setBackground(new Color(204, 4, 34));
		        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		        
		        JButton btnNewButton_1 = new JButton("Profile");
		        btnNewButton_1.setBounds(44, 21, 98, 24);
		        panel.add(btnNewButton_1);
		        btnNewButton_1.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        	}
		        });
		        btnNewButton_1.setForeground(new Color(255, 255, 255));
		        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		        btnNewButton_1.setBackground(new Color(204, 4, 34));
		        
		        JButton btnSchedule = new JButton("Schedule");
		        btnSchedule.setBounds(214, 21, 98, 24);
		        panel.add(btnSchedule);
		        btnSchedule.setForeground(new Color(255, 255, 255));
		        btnSchedule.setBackground(new Color(204, 4, 34));
		        btnSchedule.setFont(new Font("Tahoma", Font.PLAIN, 14));
		        
		        JButton btnNewButton_3 = new JButton("Logout");
		        btnNewButton_3.setBounds(876, 24, 89, 23);
		        panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(33, 490, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(80, 187, 782, 290);
		frame.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		
		JMenu mnNewMenu = new JMenu("Subject");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setBounds(10, 163, 115, 26);
		frame.getContentPane().add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Course");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Course/Section");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.TRAILING);
		mnNewMenu_1.setBounds(140, 163, 148, 26);
		frame.getContentPane().add(mnNewMenu_1);

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