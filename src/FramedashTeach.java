import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FramedashTeach extends JFrame {
	private Image logoimg = new ImageIcon(FramedashTeach.class.getResource("icons/friends.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
	private Image HomeIcon = new ImageIcon(FramedashTeach.class.getResource("icons/house.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image QuizIcon = new ImageIcon(FramedashTeach.class.getResource("icons/quiz.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image HelpIcon = new ImageIcon(FramedashTeach.class.getResource("icons/information.png")).getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image SignOutIcon = new ImageIcon(FramedashTeach.class.getResource("icons/logout.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private quizteachers quiz;
    private hometeachers home;
    private helpteachers help;
	
    @SuppressWarnings("unused")
	private Container Panel_Home;
    @SuppressWarnings("unused")
	private Component hometeachers;
    @SuppressWarnings("unused")
	private Component Panel_Help;
	private JPanel contentPanel = new JPanel();
    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramedashTeach frame = new FramedashTeach();
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
	public FramedashTeach() {				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setBounds(100, 100, 920, 510);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		contentPane.setForeground(new Color(204, 0, 0));
		contentPane.setBackground(new Color(222, 184, 135));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPanel.setLayout(null);
	    help = new helpteachers();
	    help.setBounds(0, 0, 646, 476);
	    
		JPanel HM_panel = new JPanel();
		HM_panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		HM_panel.setBackground(new Color(139, 0, 0));;
		HM_panel.setBounds(0, 0, 243, 510);
		contentPane.add(HM_panel);
		HM_panel.setLayout(null);
		
		JLabel Headline = new JLabel("\u039C\u0395\u039D\u039F\u03A5 \u039A\u0391\u0398\u0397\u0393\u0397\u03A4\u03A9\u039D");
		Headline.setBounds(16, 24, 152, 21);
		Headline.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		HM_panel.add(Headline);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setBounds(20, 58, 152, 130);
		lblIconLogo.setIcon(new ImageIcon(logoimg));
		HM_panel.add(lblIconLogo);
		
		JPanel panel_Home = new JPanel();
		panel_Home.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_Home.addMouseListener(new PanelButtonMouseAdapter(panel_Home) {		
        @Override 
        public void mouseClicked(MouseEvent e) {
        	menuClicked(home);
        }
	});
		panel_Home.setForeground(new Color(222, 184, 135));
		panel_Home.setBackground(new Color(178, 34, 34));
		panel_Home.setBounds(0, 232, 243, 62);
		HM_panel.add(panel_Home);
		panel_Home.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setBounds(70, 21, 76, 15);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 19));
		panel_Home.add(lblNewLabel);
		
		JLabel lblHomeIcon = new JLabel("");
		lblHomeIcon.setBounds(22, 2, 46, 49);
		lblHomeIcon.setIcon(new ImageIcon(HomeIcon));
		panel_Home.add(lblHomeIcon);
		
		JPanel panel_Quiz = new JPanel();
		panel_Quiz.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_Quiz.addMouseListener(new PanelButtonMouseAdapter(panel_Quiz) {
        @Override 
        public void mouseClicked(MouseEvent e) {
        	menuClicked(quiz);
        }
	});
		panel_Quiz.setForeground(new Color(222, 184, 135));
		panel_Quiz.setBackground(new Color(178, 34, 34));
		panel_Quiz.setBounds(0, 294, 243, 62);
		HM_panel.add(panel_Quiz);
		panel_Quiz.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03C1\u03C9\u03C4\u03B7\u03BC\u03B1\u03C4\u03BF\u03BB\u03CC\u03B3\u03B9\u03BF");
		lblNewLabel_1.setBounds(70, 5, 134, 20);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		panel_Quiz.add(lblNewLabel_1);
		
		JLabel lblQuizIcon = new JLabel("");
		lblQuizIcon.setBounds(24, 2, 40, 42);
		lblQuizIcon.setIcon(new ImageIcon(QuizIcon));
		panel_Quiz.add(lblQuizIcon);
		
		JPanel panel_SignOut = new JPanel();
		panel_SignOut.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_SignOut.addMouseListener(new PanelButtonMouseAdapter(panel_SignOut){
		@Override
	        public void mouseClicked(MouseEvent e) {
			 if(JOptionPane.showConfirmDialog(null, "Είστε σίγουτοι πως θέλετε να αποσυνδεθείτε?") == 0) {
					menuClicked(panel_SignOut);	
					FramedashTeach.this.dispose();
	        }
		}
		});
		
			
		panel_SignOut.setForeground(new Color(222, 184, 135));
		panel_SignOut.setBackground(new Color(178, 34, 34));
		panel_SignOut.setBounds(0, 409, 243, 62);
		HM_panel.add(panel_SignOut);
		panel_SignOut.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("SIGN OUT");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_3.setBounds(70, 22, 107, 14);
		panel_SignOut.add(lblNewLabel_3);
		
		JLabel lblSignOut = new JLabel("");
		lblSignOut.setBounds(24, 10, 43, 41);
		lblSignOut.setIcon(new ImageIcon(SignOutIcon));
		panel_SignOut.add(lblSignOut);
		
		JPanel panel_help = new JPanel();
		panel_help.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_help.addMouseListener(new PanelButtonMouseAdapter(panel_help){
        @Override 
        public void mouseClicked(MouseEvent e) {
        	menuClicked(help);
        }
	});
		panel_help.setForeground(new Color(222, 184, 135));
		panel_help.setBackground(new Color(178, 34, 34));
		panel_help.setBounds(0, 354, 243, 62);
		HM_panel.add(panel_help);
		panel_help.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u039F\u03B4\u03B7\u03B3\u03AF\u03B5\u03C2 \u03C7\u03C1\u03AE\u03C3\u03B5\u03C9\u03C2");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_2.setBounds(69, 7, 141, 31);
		panel_help.add(lblNewLabel_2);
		
		JLabel lblHelpIcon = new JLabel("");
		lblHelpIcon.setBounds(24, 1, 38, 38);
		lblHelpIcon.setIcon(new ImageIcon(HelpIcon));
		panel_help.add(lblHelpIcon);
		
	
		JLabel XLbl = new JLabel("X");
		XLbl.setForeground(new Color(255, 255, 255));
		XLbl.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		XLbl.setBounds(900, 0, 20, 25);
		contentPane.add(XLbl);
		
		
			
		XLbl.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent e) {
		    	 if(JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να κλείσεται την εφάρμογη?", "Κλείσιμο", JOptionPane.YES_NO_OPTION) == 0) {
		    		FramedashTeach.this.dispose(); 
		    	 }
		}
		     @Override
		     public void mouseEntered(MouseEvent e) {
		    	 XLbl.setForeground(Color.RED);
		     }
		     
		     @Override
		     public void mouseExited(MouseEvent e) {
		    	 XLbl.setForeground(Color.WHITE);
		     }
	});
		contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPanel.setBounds(264, 23, 646, 476);
		contentPane.add(contentPanel);
		contentPanel.add(help);
		home = new hometeachers();
		home.setBounds(123, 49, 646, 475);
		contentPanel.add(home);
		menuClicked(home);
		quiz = new quizteachers();		
		quiz.setBounds(0, 0, 646, 475);
		
		contentPanel.add(quiz);

    
	}
	public void menuClicked(JPanel panel) {
    	home.setVisible(false);	
    	quiz.setVisible(false);
    	help.setVisible(false);	
    	
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
            public void mouseReleased(MouseEvent e)	{
				panel.setBackground(new Color(205, 92, 92));
				
		    }
	
	
		   	}
}
