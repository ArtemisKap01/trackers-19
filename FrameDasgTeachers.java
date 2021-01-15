import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class FrameDasgTeachers extends JFrame {
  
	private Image logoimg = new ImageIcon(FrameDasgTeachers.class.getResource("icons/friends.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
	private Image HomeIcon = new ImageIcon(FrameDasgTeachers.class.getResource("icons/house.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image QuizIcon = new ImageIcon(FrameDasgTeachers.class.getResource("icons/quiz.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image HelpIcon = new ImageIcon(FrameDasgTeachers.class.getResource("icons/information.png")).getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
	private Image SignOutIcon = new ImageIcon(FrameDasgTeachers.class.getResource("icons/logout.png")).getImage().getScaledInstance(29, 29, Image.SCALE_SMOOTH);
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDasgTeachers frame = new FrameDasgTeachers();
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
	public FrameDasgTeachers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 420);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(204, 0, 0));
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new LineBorder(new Color(139, 0, 0), 2));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JPanel HM_panel = new JPanel();
		HM_panel.setBackground(new Color(139, 0, 0));;
		HM_panel.setBounds(0, 0, 167, 420);
		contentPane.add(HM_panel);
		HM_panel.setLayout(null);
		
		JLabel Headline = new JLabel("\u039C\u0395\u039D\u039F\u03A5 \u039A\u0391\u0398\u0397\u0393\u0397\u03A4\u03A9\u039D");
		Headline.setBounds(5, 24, 152, 21);
		Headline.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		HM_panel.add(Headline);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setBounds(5, 55, 152, 130);
		lblIconLogo.setIcon(new ImageIcon(logoimg));
		HM_panel.add(lblIconLogo);
		
		JPanel panel_Home = new JPanel();
		panel_Home.addMouseListener(new PanelButtonMouseAdapter(panel_Home));
		panel_Home.setForeground(new Color(222, 184, 135));
		panel_Home.setBackground(new Color(178, 34, 34));
		panel_Home.setBounds(0, 206, 167, 32);
		HM_panel.add(panel_Home);
		panel_Home.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setBounds(70, 5, 76, 15);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_Home.add(lblNewLabel);
		
		JLabel lblHomeIcon = new JLabel("");
		lblHomeIcon.setBounds(26, 0, 30, 31);
		lblHomeIcon.setIcon(new ImageIcon(HomeIcon));
		panel_Home.add(lblHomeIcon);
		
		JPanel panel_Quiz = new JPanel();
		panel_Quiz.addMouseListener(new PanelButtonMouseAdapter(panel_Quiz));
		panel_Quiz.setForeground(new Color(222, 184, 135));
		panel_Quiz.setBackground(new Color(178, 34, 34));
		panel_Quiz.setBounds(0, 238, 167, 32);
		HM_panel.add(panel_Quiz);
		panel_Quiz.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("QUIZ");
		lblNewLabel_1.setBounds(70, 5, 68, 20);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_Quiz.add(lblNewLabel_1);
		
		JLabel lblQuizIcon = new JLabel("");
		lblQuizIcon.setBounds(30, 0, 30, 31);
		lblQuizIcon.setIcon(new ImageIcon(QuizIcon));
		panel_Quiz.add(lblQuizIcon);
		
		JPanel panel_SignOut = new JPanel();
		panel_SignOut.addMouseListener(new PanelButtonMouseAdapter(panel_SignOut));
		panel_SignOut.setForeground(new Color(222, 184, 135));
		panel_SignOut.setBackground(new Color(178, 34, 34));
		panel_SignOut.setBounds(0, 300, 167, 32);
		HM_panel.add(panel_SignOut);
		panel_SignOut.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("SIGN OUT");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setBounds(70, 5, 107, 14);
		panel_SignOut.add(lblNewLabel_3);
		
		JLabel lblSignOut = new JLabel("");
		lblSignOut.setBounds(30, 0, 30, 31);
		lblSignOut.setIcon(new ImageIcon(SignOutIcon));
		panel_SignOut.add(lblSignOut);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new PanelButtonMouseAdapter(panel_1));
		panel_1.setForeground(new Color(222, 184, 135));
		panel_1.setBackground(new Color(178, 34, 34));
		panel_1.setBounds(0, 269, 167, 31);
		HM_panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("HELP");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setBounds(68, 7, 46, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblHelpIcon = new JLabel("");
		lblHelpIcon.setBounds(28, 0, 30, 30);
		lblHelpIcon.setIcon(new ImageIcon(HelpIcon));
		panel_1.add(lblHelpIcon);
		
	
		JLabel XLbl = new JLabel("X");
		XLbl.setForeground(new Color(255, 255, 255));
		XLbl.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		XLbl.setBounds(505, 0, 20, 25);
		contentPane.add(XLbl);
		
		XLbl.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να κλείσεται την εφάρμογη?", "Κλείσιμο", JOptionPane.YES_NO_OPTION) == 0) {
		    		FrameDasgTeachers.this.dispose(); 
		    	 }
		}
		     @Override
		     public void mouseEntered(MouseEvent arg0) {
		    	 XLbl.setForeground(Color.RED);
		     }
		     
		     @Override
		     public void mouseExited(MouseEvent arg0) {
		    	 XLbl.setForeground(Color.WHITE);
		     }
	});

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