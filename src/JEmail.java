import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class JEmail extends JFrame {

	private JPanel contentPane;
    private JTextField mail;
    private JPasswordField mpass;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JEmail frame = new JEmail();
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
	public JEmail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new LineBorder(new Color(139, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0395\u03BA\u03C7\u03C9\u03C1\u03AF\u03C3\u03C4\u03B5 \u03C4\u03BF \u03B5\u03C0\u03B1\u03B3\u03B3\u03B5\u03BB\u03BC\u03B1\u03C4\u03B9\u03BA\u03CC \u03C3\u03B1\u03C2 mail.");
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		lblNewLabel.setBounds(9, 25, 571, 28);
		contentPane.add(lblNewLabel);
		
		JPanel Mail_Input = new JPanel();
		Mail_Input.setBorder(new LineBorder(new Color(128, 0, 0)));
		Mail_Input.setBackground(new Color(255, 255, 255));
		Mail_Input.setBounds(9, 98, 333, 41);
		contentPane.add(Mail_Input);
		Mail_Input.setLayout(null);
		
		mail = new JTextField();
		mail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(mail.getText().equals("Εκχωρήστε το μέιλ σας εδώ")) {
					mail.setText("");
				}
				else {
					mail.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(mail.getText().equals("")) {
					mail.setText("Εκχωρήστε το μέιλ σας εδώ");
			}
			}
		});
		mail.setBackground(new Color(255, 255, 255));
		mail.setLocation(10, 11);
		mail.setSize(313, 20);
		Mail_Input.add(mail);
		Mail_Input.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_1 = new JLabel("\u03A3\u03B7\u03BC\u03B5\u03AF\u03C9\u03C3\u03B7: \u03C0\u03C1\u03AD\u03C0\u03B5\u03B9 \u03BD\u03B1 \u03B5\u03AF\u03BD\u03B1\u03B9 \u03C4\u03B7\u03C2 \u03BC\u03BF\u03C1\u03C6\u03AE\u03C2 \u03CC\u03BD\u03BF\u03BC\u03B1@aueb.gr \u03B3\u03B9\u03B1 \u03BD\u03B1 \u03C5\u03C0\u03BF\u03C3\u03C4\u03B7\u03C1\u03B9\u03B6\u03B5\u03C4\u03B1\u03B9 \u03B1\u03C0\u03BF \u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE \u03BC\u03B1\u03C2");
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(9, 51, 597, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u03A3\u03C4\u03B7 \u03C3\u03C5\u03BD\u03AD\u03C7\u03B5\u03B9\u03B1 \u03B5\u03BA\u03C7\u03C9\u03C1\u03B5\u03AF\u03C3\u03C4\u03B5 \u03C4\u03BF\u03BD \u03BA\u03C9\u03B4\u03B9\u03BA\u03CC \u03C3\u03B1\u03C2.");
		lblNewLabel_2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(9, 176, 441, 28);
		contentPane.add(lblNewLabel_2);
		
		JPanel MailPass = new JPanel();
		MailPass.setBackground(new Color(255, 255, 255));
		MailPass.setBorder(new LineBorder(new Color(139, 0, 0)));
		MailPass.setBounds(9, 225, 333, 41);
		contentPane.add(MailPass);
		MailPass.setLayout(null);
		
		mpass = new JPasswordField();
		mpass.addFocusListener(new FocusAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusGained(FocusEvent e) {
				if(mpass.getText().equals("Εκχωρήστε τον κωδικό σας εδώ")) {
					mpass.setText("");
					mpass.setEchoChar('●');
			}
				else {
					mpass.selectAll();
				}
			}
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if(mpass.getText().equals("")) {
					mpass.setText("Εκχωρήστε τον κωδικό σας εδώ");
					mpass.setEchoChar((char)0);
			}
			}
		});
		mpass.setBackground(new Color(255, 255, 255));
		mpass.setBounds(10, 11, 313, 20);
		MailPass.add(mpass);
		
		JButton btnNewButton = new JButton("\u03A4\u03AD\u03BB\u03BF\u03C2");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
			if (mail.getText().equals("") && mpass.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Έχει σταλθεί μήνυμα στο μέιλ που καταχωρήσατε", "Επιβεβαίωση", JOptionPane.OK_OPTION);
				dispose();
			}
				
			}
		});
		btnNewButton.setBounds(124, 315, 94, 34);
		contentPane.add(btnNewButton);
	
	}
}
