package stdWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.*;
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
import strWin.LogWindow;

public class sch {
	static Connection c = null;
	static Statement st = null;
	static ResultSet rs = null;
	public static LogWindow log = new LogWindow();

	JFrame frame;
	private JTable table;

	public static void main(String[] args) {
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
		    st = c.createStatement();
		    rs = st.executeQuery("SELECT * FROM sch");
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

	public sch() {
		initialize();
	}
	private void initialize() {
		System.out.println(log.sect);
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 991, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Grades");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gr win= new gr();
				win.setVisible(true);
			}
		});
		/*
		DefaultTableModel m = new DefaultTableModel();
		m.addColumn("Subject Code");
		m.addColumn("Description");
		m.addColumn("Units");
		m.addColumn("Time in");
		m.addColumn("Time out");
		*/
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 170, 907, 334);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		btnNewButton.setBounds(101, 82, 74, 24);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					 "Subject", "Prof", "Time in", "Time out"
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
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		//table.getColumnModel().getColumn(4).setResizable(false);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				stdWinMain win= new stdWinMain();
				win.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(33, 82, 74, 24);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sch win= new sch();
				win.frame.setVisible(true);
			}
		});
		btnSchedule.setBounds(169, 82, 97, 24);
		btnSchedule.setForeground(new Color(255, 255, 255));
		btnSchedule.setBackground(new Color(128, 0, 0));
		btnSchedule.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().add(btnSchedule);
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				strWin.LogWindow win= new strWin.LogWindow();
				win.frame.setVisible(true);
			}
		});
		btnLogout.setBounds(814, 85, 122, 24);
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(128, 0, 0));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome, ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(33, 120, 74, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JList list = new JList();
		list.setBackground(Color.BLACK);
		list.setBounds(165, 339, 156, -89);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_2 = new JLabel("Sem:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(232, 147, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("School Year:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(33, 147, 88, 13);
		frame.getContentPane().add(lblNewLabel_3);

		
		/*
		try {
		    
		    Statement st = c.createStatement();
		    ResultSet rs = st.executeQuery("SELECT * FROM sch");
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

		    System.out.println("success");
		} catch (Exception e) {
		    System.out.println("error");
		    e.printStackTrace();
		}
		*/
		
		JComboBox schoolYear = new JComboBox();
		schoolYear.setFont(new Font("Tahoma", Font.BOLD, 10));
		schoolYear.setModel(new DefaultComboBoxModel(new String[] { "2024 - 2025", "2025 - 2026"}));
		schoolYear.setBounds(112, 144, 110, 21);
		frame.getContentPane().add(schoolYear);
		
		JComboBox semester = new JComboBox();
		semester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sy = schoolYear.getSelectedItem().toString();
				String sem = semester.getSelectedItem().toString();
				
				try {
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_finals","root","10272001");
				    Statement st = c.createStatement();
				    ResultSet rs = st.executeQuery("SELECT sub, prof, tin, tout FROM sch where sec = '"+log.sect+"' && sy = '"+sy+"' && term = '"+sem+"'");
				    ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
				    
				    int cols = rsmd.getColumnCount();
				    String[] colName = new String[cols];
				    for (int i = 0; i < cols; i++) {
				        colName[i] = rsmd.getColumnName(i + 1);
				    }
				    
				    DefaultTableModel model = (DefaultTableModel) table.getModel();
				    model.setRowCount(0);
				    while (rs.next()) {
				        Object[] rowData = new Object[cols];
				        for (int i = 0; i < cols; i++) {
				            rowData[i] = rs.getObject(i + 1);
				        }
				        model.addRow(rowData); 
				    }

				    System.out.println("success");
				} catch (Exception e2) {
				    System.out.println("error");
				    e2.printStackTrace();
				}
			}
		});
		/*
		semester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) semester.getSelectedItem();
				String selectedOption1 = (String) schoolYear.getSelectedItem();
				
				if(selectedOption.equals("First")) {
					if(selectedOption1.equals("2022 - 2023")) {
						try {
			                
			                Statement st = c.createStatement();
			                ResultSet rs = st.executeQuery("SELECT * FROM sch");
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
			                tblData.setModel(model);

			                scrollPane.setViewportView(tblData);
			                
			                System.out.println("success");
			            } catch (Exception a) {
			                System.out.println("error");
			                a.printStackTrace();
			            }
						try {
						    
						    Statement st = c.createStatement();
						    ResultSet rs = st.executeQuery("SELECT * FROM schedule.timetable");
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

						    System.out.println("success");
						} catch (Exception a1) {
						    System.out.println("error");
						    a1.printStackTrace();
						}
						
					
					} else if(selectedOption1.equals("2023 - 2024")) {
						try {
			                
			                Statement st = c.createStatement();
			                ResultSet rs = st.executeQuery("SELECT * FROM schedule.schedule_2");
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
			                tblData.setModel(model);

			                scrollPane.setViewportView(tblData);
			                
			                System.out.println("success");
			            } catch (Exception b) {
			                System.out.println("error");
			                b.printStackTrace();
			            }
						try {
						    
						    Statement st = c.createStatement();
						    ResultSet rs = st.executeQuery("SELECT * FROM schedule.timetable_2");
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

						    System.out.println("success");
						} catch (Exception b1) {
						    System.out.println("error");
						    b1.printStackTrace();
						}
					} else if(selectedOption.equals("2024 - 2025")) {
						try {
			                
			                Statement st = c.createStatement();
			                ResultSet rs = st.executeQuery("SELECT * FROM schedule.schedule_3");
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
			                tblData.setModel(model);

			                scrollPane.setViewportView(tblData);

			                System.out.println("success");
			            } catch (Exception c) {
			                System.out.println("error");
			                c.printStackTrace();
			            }
						try {
						    
						    Statement st = c.createStatement();
						    ResultSet rs = st.executeQuery("SELECT * FROM schedule.timetable_3");
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

						 	    System.out.println("success");
						} catch (Exception c1) {
						    System.out.println("error");
						    c1.printStackTrace();
						}
					
					} 
					 
				} else if(selectedOption.equals("Second")) {
					if(selectedOption1.equals("2022 - 2023")) {
						try {
			                
			                Statement st = c.createStatement();
			                ResultSet rs = st.executeQuery("SELECT * FROM schedule.schedule_4");
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
			                tblData.setModel(model);

			                scrollPane.setViewportView(tblData);
							
			                System.out.println("success");
			            } catch (Exception d) {
			                System.out.println("error");
			                d.printStackTrace();
			            }
						try {
						    
						    Statement st = c.createStatement();
						    ResultSet rs = st.executeQuery("SELECT * FROM schedule.timetable_4");
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

						   
						    System.out.println("success");
						} catch (Exception d1) {
						    System.out.println("error");
						    d1.printStackTrace();
						}
						
					} else if(selectedOption1.equals("2023 - 2024")) {
						try {
			                
			                Statement st = c.createStatement();
			                ResultSet rs = st.executeQuery("SELECT * FROM schedule.schedule_5");
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
			                tblData.setModel(model);

			                scrollPane.setViewportView(tblData);

			                System.out.println("success");
			            } catch (Exception f) {
			                System.out.println("error");
			                f.printStackTrace();
			            }
						try {
						    
						    Statement st = c.createStatement();
						    ResultSet rs = st.executeQuery("SELECT * FROM schedule.timetable_5");
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

					
						    System.out.println("success");
						} catch (Exception f1) {
						    System.out.println("error");
						    f1.printStackTrace();
						}
					} else if(selectedOption1.equals("2024 - 2025")) {
						try {
			               
			                Statement st = c.createStatement();
			                ResultSet rs = st.executeQuery("SELECT * FROM schedule.schedule_6" + "SELECT * FROM schedule.timetable_6");
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
			                tblData.setModel(model);

			                scrollPane.setViewportView(tblData);

			                System.out.println("success");
			            } catch (Exception g) {
			                System.out.println("error");
			                g.printStackTrace();
			            }
						try {
						    
						    Statement st = c.createStatement();
						    ResultSet rs = st.executeQuery("SELECT * FROM schedule.timetable_6");
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

						   
						    System.out.println("success");
						} catch (Exception g1) {
						    System.out.println("error");
						    g1.printStackTrace();
						}
					}
					
				} else if(selectedOption.equals("Summer")) {
					try {
					    
					    Statement st = c.createStatement();
					    ResultSet rs = st.executeQuery("SELECT * FROM schedule_6");
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
					    tblData.setModel(model); 

					    scrollPane.setViewportView(tblData);

					    System.out.println("success");
					} catch (Exception d) {
					    System.out.println("error");
					    d.printStackTrace();
					}
				}
				
			}
		});
		*/
		semester.setModel(new DefaultComboBoxModel(new String[] {"First", "Second", "Summer"}));
		semester.setFont(new Font("Tahoma", Font.BOLD, 11));
		semester.setBounds(267, 144, 88, 21);
		frame.getContentPane().add(semester);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/logo.png")));
		lblNewLabel.setBounds(0, 0, 1137, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_5_1.setBounds(0, 523, 975, 57);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/bg.jpg")));
		lblNewLabel_4.setBounds(0, 116, 1147, 453);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/bg2.png")));
		lblNewLabel_5.setBounds(0, 66, 975, 57);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		
		
	}
}