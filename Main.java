import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {	
	public static JTextField txtUsername;
	public static JPasswordField txtPassword;
	public static JLabel lblLoginMessage;
	public static JTextField mail;
	public static JPasswordField mpass;
	public static JLabel lblpass;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//log in//
		EventQueue.invokeLater(new Runnable() {			
			public void run() {
				try {
					FramLogin frame = new FramLogin();
					frame.setVisible(true);
					
		frame.LoginBtn.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			public void mouseClicked(MouseEvent arg0) {
				if(txtUsername.getText().equals("UserAdmin") && txtPassword.getText().equals("AdminPass")) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Συνδεθήκατε με επιτυχία.");
				    frame.dispose();
					FrameDashboard hframe = new FrameDashboard();
				    hframe.setVisible(true);
				}   
				//If user inputs correct
				//Students
				
			    if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username")|| 
				txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {			
				JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε όλα τα απαραίτητα πεδία.");
			    }
				else if((txtUsername.getText().equals("IDA1") && txtPassword.getText().equals("IDPassA1")) ||
						(txtUsername.getText().equals("IDA2") && txtPassword.getText().equals("IDPassA2"))) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Συνδεθήκατε με επιτυχία.");
					frame.dispose();
					Framedashstudents gframe = new Framedashstudents();
					gframe.setVisible(true);
				}
				// If user inputs incorrect
				 else {
					JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε τα σωστά στοιχεία.");
				}
			}
		});
		
				}
				 catch (Exception e) {
					e.printStackTrace();
				 }
			 }
		});
		 class Framedashstudents extends Main{
				
		 }
         class FrameDashboard extends Main{
        	 
         }
		class JEmail extends Main{
			
		}		
		
		String teachermail="teacher";
		String passwordteacher="pass";
		
			/*JEmail k=new JEmail();
			JTextField y = k.mail;
			JPasswordField x = k.mpass;*/
			
			//if (x.getText().equals(passwordteacher) && y.getText().equals(teachermail)) {
			//JOptionPane.showMessageDialog(null, "", "Επιβεβαίωση", JOptionPane.OK_OPTION);	
				
			//}
			//else {
				//JOptionPane.showMessageDialog(null, "", "Αποτυχία", JOptionPane.OK_OPTION);
			//}
	
	}
	//auto to kommati den to xv kanei akoma na doulepsei, mexri tin grammh 74 douleuei kanonika
	public static void mainEmail(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JEmail eframe = new JEmail();
					eframe.setVisible(true);
					JEmail.mabtn.addMouseListener(new MouseAdapter() {		
						@Override
						public void mouseClicked(MouseEvent arg1) {						             
							 if (mail.getText().equals("email") && mpass.getText().equals("pass") ) {								 
								lblpass.setText("");
								 JOptionPane.showMessageDialog(null, "Επιβεβαίωση");
					            eframe.dispose(); 
					         }
							 else {
								 JOptionPane.showMessageDialog(null, "Αποτυχία");
							 }
						}
					});   
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
