import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Component;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Dialog.ModalExclusionType;

public class FramLogin extends JFrame {
 
	
	
    private Image logoimg = new ImageIcon(FramLogin.class.getResource("icons/Science-University-icon.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblLoginMessage = new JLabel("");
	private JLabel lbllogin = new JLabel("LOG IN");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramLogin frame = new FramLogin();
					frame.setVisible(true);}
				 catch (Exception e) {
					e.printStackTrace();
				 }
			 }
		});
	}
	/**
	 *  Create the frame.
	 */		
	public FramLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setBounds(100, 100, 647, 442);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		contentPane.setForeground(new Color(222, 184, 135));
		contentPane.setBackground(new Color(222, 184, 135));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(213, 185, 209, 37);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			if(txtUsername.getText().equals("Username")) {
				txtUsername.setText("");
			}
			else {
				txtUsername.selectAll();
			}
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(txtUsername.getText().equals(""))
				txtUsername.setText("Username");
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsername.setBounds(10, 11, 168, 21);
		txtUsername.setText("Username");
		txtUsername.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel LoginBtn = new JPanel();
		LoginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			if(txtUsername.getText().equals("UserAdmin") && txtPassword.getText().equals("AdminPass")) {
				lblLoginMessage.setText("");
				JOptionPane.showMessageDialog(null, "Συνδεθήκατε με επιτυχία.");
			    dispose();
				FrameDashboard hframe = new FrameDashboard();
			    hframe.setVisible(true);
			   
				// if user inputs correct
			}
			else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username")|| 
			txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {			
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε όλα τα απαραίτητα πεδία.");
		}
			else if(txtUsername.getText().equals("IDA101") && txtPassword.getText().equals("IDPassA101")) {
				lblLoginMessage.setText("");
				JOptionPane.showMessageDialog(null, "Συνδεθήκατε με επιτυχία.");
				dispose();
				Framedashstudents gframe = new Framedashstudents();
				gframe.setVisible(true);
				}
			else {
				JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε τα σωστά στοιχεία.");
			}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				LoginBtn.setBackground(new Color(139, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				LoginBtn.setBackground(new Color(165, 42, 42));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				LoginBtn.setBackground(new Color(128, 0, 0));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				LoginBtn.setBackground(new Color(139, 0, 0));
			}
		});
		LoginBtn.setForeground(new Color(165, 42, 42));
		LoginBtn.setBackground(new Color(165, 42, 42));
		LoginBtn.setBounds(252, 305, 123, 37);
		contentPane.add(LoginBtn);
		LoginBtn.setLayout(null);
		
		lbllogin.setForeground(new Color(255, 255, 255));
		lbllogin.setFont(new Font("Arial", Font.BOLD, 14));
		lbllogin.setBounds(35, 11, 66, 14);
		LoginBtn.add(lbllogin);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(222, 184, 135)));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(213, 233, 209, 37);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 209, 37);
		panel_3.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		lblLoginMessage.setBounds(10, 11, 199, 20);
		panel_1.add(lblLoginMessage);
		
		lblLoginMessage.setBackground(new Color(255, 255, 255));
		lblLoginMessage.setForeground(new Color(139, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 11));
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(10, 11, 172, 20);
		panel_3.add(txtPassword);
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
				txtPassword.setEchoChar('●');
				txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(txtPassword.getText().equals("")) {
				txtPassword.setText("Password");
				txtPassword.setEchoChar((char)0);
			}
			}
		});
		txtPassword.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtPassword.setEchoChar((char)0);
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		txtPassword.setText("Password");
		
		
		
		JLabel logo = new JLabel("");
		logo.setBounds(265, 51, 110, 109);
		contentPane.add(logo);
		logo.setIcon(new ImageIcon(logoimg));
		
		JLabel Exit = new JLabel("X");
		Exit.setForeground(new Color(230, 230, 250));
		Exit.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Exit.setBounds(628, 0, 42, 25);
		contentPane.add(Exit);
		setLocationRelativeTo(null);
		Exit.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να κλείσετε την εφαρμογή?", "Κλείσιμο", JOptionPane.YES_NO_OPTION) == 0) {
		    		FramLogin.this.dispose(); 
		    	 }
		}
		     @Override
		     public void mouseEntered(MouseEvent arg0) {
		    	 Exit.setForeground(Color.RED);
		     }
		     
		     @Override
		     public void mouseExited(MouseEvent arg0) {
		    	 Exit.setForeground(Color.WHITE);
		     }
	});
		}
	}
