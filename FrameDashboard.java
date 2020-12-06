import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.border.LineBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class FrameDashboard extends JFrame {

	
	private Image logoimg = new ImageIcon(FrameDashboard.class.getResource("icons/teacher(1).png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image logoimg1 = new ImageIcon(FrameDashboard.class.getResource("icons/teacher(2).png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image logoimg2 = new ImageIcon(FrameDashboard.class.getResource("icons/folder.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image logoimg3 = new ImageIcon(FrameDashboard.class.getResource("icons/information.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image logoimg4 = new ImageIcon(FrameDashboard.class.getResource("icons/quiz.png")).getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image logoimg5 = new ImageIcon(FrameDashboard.class.getResource("icons/logout.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	
	private  adminmenu typeindatapane;
	private  quizpanel quizpane;
	private  helppanel Helppane;
	
	
	private JPanel contentPane;
	private Container Homepanel;
	private Component adminmenu;
	private Component helppanel;
	
	
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDashboard frame = new FrameDashboard();
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
	public FrameDashboard() {
		setBackground(new Color(222, 184, 135));
		setLocationRelativeTo(null);
		setForeground(new Color(222, 184, 135));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 383);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setForeground(new Color(222, 184, 135));
		contentPane.setBorder(new LineBorder(new Color(128, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		typeindatapane = new adminmenu();
		quizpane = new quizpanel();
		Helppane = new helppanel();
		
		JPanel Homepanel = new JPanel();
		Homepanel.setSize(244, 383);
		Homepanel.setLocation(0, 0);
		contentPane.add(Homepanel);
		Homepanel.setBackground(new Color(139, 0, 0));
		Homepanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		Homepanel.setForeground(new Color(139, 0, 0));
		Homepanel.setLayout(null);
		
		JLabel lblicon = new JLabel("");
		lblicon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblicon.setForeground(new Color(0, 0, 0));
		lblicon.setBackground(new Color(139, 0, 0));
		lblicon.setBounds(24, 11, 88, 88);
		Homepanel.add(lblicon);
		lblicon.setIcon(new ImageIcon(logoimg));
		
		JLabel lblicon2 = new JLabel("");
		lblicon2.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblicon2.setBounds(131, 11, 82, 88);
		Homepanel.add(lblicon2);
		lblicon2.setIcon(new ImageIcon(logoimg1));
			
		JPanel typeindatapanel = new JPanel();
		typeindatapanel.addMouseListener(new PanelButtonMouseAdapter(typeindatapanel) { 
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(typeindatapane);				
			}
		});
		
		typeindatapanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		typeindatapanel.setBackground(new Color(178, 34, 34));
		typeindatapanel.setForeground(new Color(178, 34, 34));
		typeindatapanel.setBounds(0, 127, 244, 46);
		Homepanel.add(typeindatapanel);
		typeindatapanel.setLayout(null);
		
		JLabel datatypein = new JLabel("Εισαγωγή Δεδομένων");
		datatypein.setFont(new Font("Tahoma", Font.PLAIN, 14));
		datatypein.setBounds(69, 11, 146, 24);
		typeindatapanel.add(datatypein);
		
		JLabel imgdata = new JLabel("");
		imgdata.setBounds(10, 0, 65, 50);
		imgdata.setIcon(new ImageIcon(logoimg2));
		typeindatapanel.add(imgdata);
		
		JPanel quizpanel2 = new JPanel();
		quizpanel2.addMouseListener(new PanelButtonMouseAdapter(quizpanel2) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(quizpane);
			}
		});
		quizpanel2.setBorder(new EmptyBorder(0, 0, 0, 0));
		quizpanel2.setBackground(new Color(178, 34, 34));
		quizpanel2.setBounds(0, 174, 244, 46);
		Homepanel.add(quizpanel2);
		quizpanel2.setLayout(null);
		
		JLabel quiz = new JLabel("Ερωτηματολόγιο");
		quiz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		quiz.setBounds(78, 11, 110, 22);
		quizpanel2.add(quiz);
		
		JLabel imgquiz = new JLabel("");
		imgquiz.setBounds(21, 0, 55, 44);
		imgquiz.setIcon(new ImageIcon(logoimg4));
		quizpanel2.add(imgquiz);
		
		JPanel Helppanel = new JPanel();
		Helppanel.addMouseListener(new PanelButtonMouseAdapter(Helppanel) { 
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(Helppane);
			}
		});
		Helppanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		Helppanel.setBackground(new Color(178, 34, 34));
		Helppanel.setBounds(0, 221, 244, 46);
		Homepanel.add(Helppanel);
		Helppanel.setLayout(null);
		
		JLabel help = new JLabel("Οδηγίες Χρήσεως");
		help.setFont(new Font("Tahoma", Font.PLAIN, 14));
		help.setBounds(79, 11, 112, 24);
		Helppanel.add(help);
		
		JLabel imghelp = new JLabel("");
		imghelp.setBounds(19, 11, 30, 30);
		imghelp.setIcon(new ImageIcon(logoimg3));
		Helppanel.add(imghelp);
		
		JPanel SignOutpanel = new JPanel();
		SignOutpanel.addMouseListener(new PanelButtonMouseAdapter(SignOutpanel) { 
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να αποσυνδεθείτε?") == 0) {
				menuClicked(SignOutpanel);
				FramLogin frameLogin = new FramLogin();
				frameLogin.setVisible(true);
				FrameDashboard.this.dispose();
				}
				
			}
		});
		SignOutpanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		SignOutpanel.setBackground(new Color(178, 34, 34));
		SignOutpanel.setBounds(0, 268, 244, 44);
		Homepanel.add(SignOutpanel);
		SignOutpanel.setLayout(null);
		
		JLabel SignOut = new JLabel("Έξοδος/Sign Out");
		SignOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SignOut.setBounds(79, 11, 118, 22);
		SignOutpanel.add(SignOut);
		
		JLabel imgso = new JLabel("");
		imgso.setBounds(22, 0, 51, 44);
		imgso.setIcon(new ImageIcon(logoimg5));
		SignOutpanel.add(imgso);
		
		JLabel X = new JLabel("X");
		X.setForeground(new Color(240, 248, 255));
		X.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		X.setBounds(853, 0, 26, 30);
		contentPane.add(X);
		
		X.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να κλείσετε την εφαρμογή?", "Κλείσιμο", JOptionPane.YES_NO_OPTION) == 0) {
		    		FrameDashboard.this.dispose(); 
		    	 }
		}
		     @Override
		     public void mouseEntered(MouseEvent arg0) {
		    	 X.setForeground(Color.RED);
		     }
		     @Override
		     public void mouseExited(MouseEvent arg0) {
		    	 X.setForeground(Color.WHITE);
		     }
	});
		JPanel MainContentpanel = new JPanel();
		MainContentpanel.setBounds(254, 11, 589, 361);
		contentPane.add(MainContentpanel);
		MainContentpanel.setLayout(null);
		
		MainContentpanel.add(typeindatapane);
		MainContentpanel.add(quizpane);
		MainContentpanel.add(Helppane);
		
		menuClicked(typeindatapane);
		
		
	}
	
	public void menuClicked(JPanel panel) {
		typeindatapane.setVisible(false);
		quizpane.setVisible(false);
		Helppane.setVisible(false);
		
		panel.setVisible(true);
		
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(205, 92, 92));
		}
		@Override
	    public void mouseExited(MouseEvent e) {
	    	 panel.setBackground(new Color(178, 34, 34));
	    }
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(128, 0, 0));
		}
		@Override
	    public void mouseReleased(MouseEvent e) {
	    	panel.setBackground(new Color(205, 92, 92));
	    }
	
	}
}
