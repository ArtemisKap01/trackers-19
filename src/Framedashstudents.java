import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;


public class Framedashstudents extends JFrame {

	private Image wlimg = new ImageIcon(Framedashstudents.class.getResource("icons/friends.png")).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
	private Image qzimage = new ImageIcon(Framedashstudents.class.getResource("icons/quiz.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image hlpimage = new ImageIcon(Framedashstudents.class.getResource("icons/information.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image soimage = new ImageIcon(Framedashstudents.class.getResource("icons/logout.png")).getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image hmimage = new ImageIcon(Framedashstudents.class.getResource("icons/house.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	
	
	private JPanel contentPane;

	private Homestudents Homepan;
	private quizstudents stunquiz;
	private helpstudents stunhelp;
	private Homestudents hmpane;
	private helpstudents stunhel;
	private quizstudents stunqui;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Framedashstudents frame = new Framedashstudents();
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
	public Framedashstudents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 515);
		contentPane = new JPanel();
		setUndecorated(true);
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setForeground(new Color(222, 184, 135));
		contentPane.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		hmpane = new Homestudents();
		stunqui = new quizstudents();
		stunhel = new helpstudents();
		
		
		JPanel hmpanel = new JPanel();	
		hmpanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		hmpanel.setBackground(new Color(128, 0, 0));
		hmpanel.setBounds(0, 0, 251, 515);
		contentPane.add(hmpanel);
		hmpanel.setLayout(null);
		
		JPanel stunquiz = new JPanel();
		stunquiz.addMouseListener(new PanelButtonMouseAdapter(stunquiz) { 
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(stunqui);				
			}
		});
			 
		stunquiz.addMouseListener(new PanelButtonMouseAdapter(stunquiz));
		stunquiz.setBorder(new EmptyBorder(0, 0, 0, 0));
		stunquiz.setBackground(new Color(178, 34, 34));
		stunquiz.setBounds(0, 276, 251, 65);
		hmpanel.add(stunquiz);
		stunquiz.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ερωτηματολόγιο");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(104, 11, 137, 43);
		stunquiz.add(lblNewLabel_1);
		
		JLabel stuqzicon = new JLabel("");
		stuqzicon.setBounds(35, 11, 40, 43);
		stunquiz.add(stuqzicon);
		stuqzicon.setIcon(new ImageIcon(qzimage));
		
		JPanel stunhelp = new JPanel();
		stunhelp.addMouseListener(new PanelButtonMouseAdapter(stunhelp) { 
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(stunhel);				
			}
		});
		stunhelp.addMouseListener(new PanelButtonMouseAdapter(stunhelp));
		stunhelp.setBorder(new EmptyBorder(0, 0, 0, 0));
		stunhelp.setBackground(new Color(178, 34, 34));
		stunhelp.setBounds(0, 340, 251, 65);
		hmpanel.add(stunhelp);
		stunhelp.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Οδηγίες χρήσης");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(103, 11, 124, 43);
		stunhelp.add(lblNewLabel_2);
		
		JLabel stuhlpicon = new JLabel("");
		stuhlpicon.setBounds(32, 11, 47, 43);
		stunhelp.add(stuhlpicon);
		stuhlpicon.setIcon(new ImageIcon(hlpimage));
		
		JLabel welicon = new JLabel("");
		welicon.setHorizontalAlignment(SwingConstants.CENTER);
		welicon.setBounds(0, 21, 251, 162);
		hmpanel.add(welicon);
		welicon.setIcon(new ImageIcon(wlimg));
		
		JPanel stunso = new JPanel();
		stunso.addMouseListener(new PanelButtonMouseAdapter(stunso){ 
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να αποσυνδεθείτε?") == 0) {
				menuClicked(stunso);
				FramLogin frameLogin = new FramLogin();
				frameLogin.setVisible(true);
				Framedashstudents.this.dispose();
				}
				
			}
		});
		stunso.setBorder(new EmptyBorder(0, 0, 0, 0));
		stunso.setBackground(new Color(178, 34, 34));
		stunso.setBounds(0, 404, 251, 65);
		hmpanel.add(stunso);
		stunso.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Έξοδος/Sign out");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(102, 10, 139, 36);
		stunso.add(lblNewLabel_3);
		
		JLabel stsoicon = new JLabel("");
		stsoicon.setBounds(38, 10, 41, 43);
		stunso.add(stsoicon);
		stsoicon.setIcon(new ImageIcon(soimage));
		
		JPanel Homepan = new JPanel();
		Homepan.addMouseListener(new PanelButtonMouseAdapter(Homepan){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(hmpane);				
			}
		});
		Homepan.setBorder(new EmptyBorder(0, 0, 0, 0));
		Homepan.setBackground(new Color(178, 34, 34));
		Homepan.setBounds(0, 215, 251, 65);
		hmpanel.add(Homepan);
		Homepan.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Home");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(107, 18, 116, 43);
		Homepan.add(lblNewLabel_4);
		
		JLabel hmico = new JLabel("");
		hmico.setBounds(30, 11, 48, 50);
		Homepan.add(hmico);
		hmico.setIcon(new ImageIcon(hmimage));
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblX.setBounds(811, -11, 19, 46);
		contentPane.add(lblX);
		
		JPanel conpanel = new JPanel();
		conpanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		conpanel.setBounds(261, 23, 559, 481);
		contentPane.add(conpanel);
		conpanel.setLayout(null);
		
		conpanel.add(hmpane);
		conpanel.add(stunqui);
		conpanel.add(stunhel);
		
		menuClicked(hmpane);
		
		lblX.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να κλείσετε την εφαρμογή?", "Κλείσιμο", JOptionPane.YES_NO_OPTION) == 0) {
		    		Framedashstudents.this.dispose(); 
		    	 }
		}
		     @Override
		     public void mouseEntered(MouseEvent arg0) {
		    	 lblX.setForeground(Color.RED);
		     }
		     @Override
		     public void mouseExited(MouseEvent arg0) {
		    	 lblX.setForeground(Color.WHITE);
		     }
	});
	}
	public void menuClicked(JPanel panel) {
		hmpane.setVisible(false);
		stunqui.setVisible(false);
		stunhel.setVisible(false);
		
		panel.setVisible(true);
	}
	
    private class PanelButtonMouseAdapter extends MouseAdapter {
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
    		panel.setBackground(new Color(128, 0 ,0));
    	}
    	@Override
    	public void mouseReleased(MouseEvent e) {
    		panel.setBackground(new Color(205, 92, 92));
    	}
    }
}
