import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AdminTe extends JFrame {
	 Connection conn= null;
		ResultSet rr= null;
		PreparedStatement pst= null;
		
private void Update_table()  {
		
		try {			
	   String sql ="select ifnull(Id,0) as id, ifnull(AMKA,' ') as amka, ifnull(Username,' ') as username, "
	    		+ "ifnull(FirstName, ' ') as firstname, " 
	    		+ "ifnull(LastName, ' ') as lastname, ifnull(Email, ' ') as email, " 
	    		+ "ifnull(Birthdate, '1900-01-01') as birthdate, ifnull(Address, ' ') as address, " 
	    		+ "ifnull(PhoneNumber, ' ') as phonenumber "
	    		+ "from Students";
	          pst= conn.prepareStatement(sql);
        rr=pst.executeQuery();
        //table1.
      //  table1.setModel(DbUtils.resultSetToTableModel(rr));
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
}
	
	private JPanel contentPane;
	private JComboBox username_comboBox = new JComboBox();
	private JComboBox AMKA_comboBox = new JComboBox();
	private JComboBox password_comboBox;
	private JComboBox firstName_comboBox = new JComboBox();
	private JComboBox lastName_comboBox = new JComboBox();
	private JComboBox email_comboBox = new JComboBox();
	private JComboBox address_comboBox = new JComboBox();
	private JComboBox phonenumber_comboBox = new JComboBox();
	private JComboBox iD_comboBox = new JComboBox();
	private JComboBox birthdate_comboBox = new JComboBox();
	private JComboBox schoolClassID_comboBox = new JComboBox();
	private int sid1;
	private JTextField sid = new JTextField(10);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminTe frame = new AdminTe();
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
	public AdminTe() {
		conn= InitializeDb.connectToDb();
		//Update_table();
		FCombo();
		FCombo1();
		FCombo2();
		FCombo3();
		FCombo4();
		FCombo5();
		FCombo6();
		FCombo7();
		FCombo8();
		FCombo9();
		FCombo10();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 661);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image wrimg = new ImageIcon(adminmenu.class.getResource("icons/web-development.png")).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		Image refimg = new ImageIcon(adminmenu.class.getResource("icons/reload.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		    
		
		    JLabel lblNewLabel = new JLabel("Εισαγωγή  Δεδομένων");
		    lblNewLabel.setForeground(new Color(72, 61, 139));
		    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		    lblNewLabel.setBounds(97, 21, 410, 65);
		    getContentPane().add(lblNewLabel);
		    
		    JLabel IDlbl = new JLabel("ID:");
		    IDlbl.setHorizontalAlignment(SwingConstants.CENTER);
		    IDlbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    IDlbl.setBounds(10, 159, 43, 14);
		    getContentPane().add(IDlbl);
		    
		    JLabel AMKAlbl = new JLabel("AMKA:");
		    AMKAlbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    AMKAlbl.setBounds(10, 206, 47, 14);
		    getContentPane().add(AMKAlbl);
		    
		    JLabel Usernamelbl = new JLabel("Username:");
		    Usernamelbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    Usernamelbl.setBounds(10, 247, 77, 14);
		    getContentPane().add(Usernamelbl);
		    
		    JLabel Passwordlbl = new JLabel("Password:");
		    Passwordlbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    Passwordlbl.setBounds(10, 289, 77, 14);
		    getContentPane().add(Passwordlbl);
		    
		    JLabel Namelbl = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1:");
		    Namelbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    Namelbl.setBounds(12, 331, 53, 15);
		    getContentPane().add(Namelbl);
		    
		    JLabel LastNamelbl = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		    LastNamelbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    LastNamelbl.setBounds(12, 375, 69, 15);
		    getContentPane().add(LastNamelbl);
		    
		    JLabel Emaillbl = new JLabel("Email:");
		    Emaillbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    Emaillbl.setBounds(12, 418, 43, 14);
		    getContentPane().add(Emaillbl);
		    
		    JLabel DateOfBirthlbl = new JLabel("\u0397\u03BC\u03B5\u03C1. \u0393\u03B5\u03BD. :");
		    DateOfBirthlbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    DateOfBirthlbl.setBounds(12, 463, 88, 15);
		    getContentPane().add(DateOfBirthlbl);
		    
		    JLabel Addresslbl = new JLabel("\u0394\u03B9\u03AD\u03C5\u03B8\u03C5\u03BD\u03C3\u03B7:");
		    Addresslbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    Addresslbl.setBounds(12, 504, 82, 15);
		    getContentPane().add(Addresslbl);
		    
		    JLabel PhoneNumberlbl = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		    PhoneNumberlbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		    PhoneNumberlbl.setBounds(12, 540, 87, 26);
		    getContentPane().add(PhoneNumberlbl);
           
           JLabel lblwr = new JLabel("");
           lblwr.setIcon(new ImageIcon(wrimg));
		    
		    JButton btnAdd = new JButton("Search");
		    btnAdd.addMouseListener(new MouseAdapter() {
		    	@Override
		    	public void mouseClicked(MouseEvent e) {
		    	
		    	   JOptionPane.showMessageDialog(null, sid1);
		    	
		    		   FCombo2();
		    		   FCombo3();
		    		  /* try {
			    		   String sql = ("select Id, amka, Username, FirstName, LastName, Address, Email, Phonenumber, Birthdate, SchoolClassID from Students where id= 2");  
			    	   
			    		pst= conn.prepareStatement(sql);
			    	   
			    		rr=pst.executeQuery();
			    	
		    		   }
			    	   
			    	   catch(Exception evtt) {
			    		   JOptionPane.showMessageDialog(null, evtt);
			    	   }
		    	}*/
		    	}
		    	
	    		 
		    		  // FCombo4();
		    		   
		    		/*try {
		    		   String sql = ("select Id, amka, Username, FirstName, LastName, Address, Email, Phonenumber, Birthdate, SchoolClassID from Students where id= 1");  
		    	   
		    		pst= conn.prepareStatement(sql);
		    	        rr=pst.executeQuery();
		    	}
		    	   }
		    	   catch(Exception evtt) {
		    		   JOptionPane.showMessageDialog(null, evtt);
		    	   }
		    	*/
		    	
		    });
			
		    btnAdd.setBounds(357, 110, 95, 30);
		    contentPane.add(btnAdd);
		    
		    iD_comboBox.setBounds(119, 152, 198, 32);
		    contentPane.add(iD_comboBox);
		    
		    AMKA_comboBox.setBounds(119, 195, 198, 32);
		    contentPane.add(AMKA_comboBox);
		    
		    username_comboBox.setBounds(119, 236, 198, 32);
		    contentPane.add(username_comboBox);
		    
		    password_comboBox = new JComboBox();
		    password_comboBox.setBounds(119, 279, 198, 32);
		    contentPane.add(password_comboBox);
		    
		    firstName_comboBox.setBounds(119, 322, 198, 32);
		    contentPane.add(firstName_comboBox);
		    
		    lastName_comboBox.setBounds(119, 365, 198, 32);
		    contentPane.add(lastName_comboBox);
		    
		    email_comboBox.setBounds(119, 408, 198, 32);
		    contentPane.add(email_comboBox);
		    
		    birthdate_comboBox.setBounds(119, 451, 198, 32);
		    contentPane.add(birthdate_comboBox);
		    
		    address_comboBox.setBounds(119, 494, 198, 32);
		    contentPane.add(address_comboBox);
		    
		    phonenumber_comboBox.setBounds(119, 537, 198, 32);
		    contentPane.add(phonenumber_comboBox);
		    
		    schoolClassID_comboBox.setBounds(119, 580, 198, 32);
		    contentPane.add(schoolClassID_comboBox);
		    
		    JLabel lblSchoolclassid = new JLabel("SchoolClassID:");
		    lblSchoolclassid.setFont(new Font("Tahoma", Font.BOLD, 14));
		    lblSchoolclassid.setBounds(10, 587, 103, 15);
		    contentPane.add(lblSchoolclassid);
		    
		    JLabel lblNewLabel_1 = new JLabel("Select student ID");
		    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		    lblNewLabel_1.setBounds(35, 105, 125, 26);
		    contentPane.add(lblNewLabel_1);
		    
		   // sid1 = Integer.parseInt(sid.getText());
		    sid.setBounds(170, 110, 175, 26);
		    contentPane.add(sid);
		    sid.setColumns(10);
		    
	}
	
	//public int sid =0;
		//pst= conn.prepareStatement(sql);
		//rr= pst.executeQuery();
		
		/*
		while(rr.next()) {
			String Id= rr.getString("Id");
			//IDtext.addItem(Id);
		}
	}*/
	//catch(Exception e) {
		//JOptionPane.showMessageDialog(null, e);
	//}

	/*private void ShowData() {
		//DefaultTableModel models = (DefaultTableModel)table1.getModel()	;
	    String [] cols = {"Id", "AMKA", "Username", "Password", "FirstName", "LastName", "Address", "Email", "PhoneNumber", "Birthdate", "SchoolclassId"};	
	    String [][] data = {{"1", "7103622917", "FFrank", "D939EEE0-EAD7-9491-382B-A733598C58F2", "Fredericka", "Frank", "Ap #634-400 Lobortis Road", "P.O. Box 729, 7618 Ipsum Av.", "nunc.In.at@magnaSuspendisse.net", "0707/0303/2010201020102010", "4"}};
	}*/
	
	private void FCombo() {
		try {
			String sql= "select Username from Teachers";
			pst= conn.prepareStatement(sql);
			rr= pst.executeQuery();
		
			while(rr.next()) {
				String Username= rr.getString("Username");
				username_comboBox.addItem(Username);
			}}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		
	}
			private void FCombo1() {
				try {
					String sql= "select FirstName from Teachers";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					
					while(rr.next()) {
					    String FirstName= rr.getString("FirstName");
					    firstName_comboBox.addItem(FirstName);
					    
					}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
			private void FCombo2() {
				try {
					String sql= "select Id  from Teachers ";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					while(rr.next()) {
					    int Id= rr.getInt("Id");
					    iD_comboBox.addItem(Id);
					    
					}
					
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}	
}
			private void FCombo3() {
				try {
					String sql= "select AMKA  from Teachers";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					
					while(rr.next()) {
					    String AMKA= rr.getString("AMKA");
					    AMKA_comboBox.addItem(AMKA);
					    
					}
				}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			private void FCombo4() {
				try {
					String sql= "select LastName  from Teachers";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					
					while(rr.next()) {
					    String LastName= rr.getString("LastName");
					    lastName_comboBox.addItem(LastName);
					    
					}
				}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			
			private void FCombo5() {
				try {
					String sql= "select Address  from Teachers";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					
					while(rr.next()) {
					    String Address= rr.getString("Address");
					    address_comboBox.addItem(Address);
					    
					}
				}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			
			private void FCombo6() {
				try {
					String sql= "select Email  from Teachers";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					
					while(rr.next()) {
					    String Email= rr.getString("Email");
					    email_comboBox.addItem(Email);
					    
					}
				}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			

			private void FCombo7() {
				try {
					String sql= "select Birthdate  from Teachers";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					
					while(rr.next()) {
					    Date Birthdate= rr.getDate("Birthdate");
					    birthdate_comboBox.addItem(Birthdate);
					    
					}
				}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			

			private void FCombo8() {
				try {
					String sql= "select SchoolClassID  from Teachers";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					
					while(rr.next()) {
					    int SchoolClassID= rr.getInt("SchoolClassID");
					    schoolClassID_comboBox.addItem(SchoolClassID);
					    
					}
				}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			
			private void FCombo9() {
				try {
					String sql= "select Phonenumber  from Teachers";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					
					while(rr.next()) {
					    int Phonenumber= rr.getInt("Phonenumber");
					    phonenumber_comboBox.addItem(Phonenumber);
					    
					}
				}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}

			private void FCombo10() {
				try {
					String sql= "select *  from Teachers";
					pst= conn.prepareStatement(sql);
					rr= pst.executeQuery();
					
					while(rr.next()) {
					    String password= rr.getString("password");
					    password_comboBox.addItem(password);
					    
					}
				}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			
			private void TextF() {
				try {
				String sql= "select Id from Teachers";
				pst= conn.prepareStatement(sql);
				rr= pst.executeQuery();
				
				while (rr.next()) {
				
					
				}
				}
				catch(Exception e){
				JOptionPane.showMessageDialog(null, e);	
				}
				}

}
