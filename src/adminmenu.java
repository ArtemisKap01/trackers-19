import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.EmptyBorder;

public class adminmenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public adminmenu() {
			setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(new Color(222, 184, 135));
		setForeground(new Color(222, 184, 135));
    setBounds(0, 0, 631, 452);
    setLayout(null);
    setVisible(true);
   
	Image wrimg = new ImageIcon(adminmenu.class.getResource("icons/web-development.png")).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    
	 
    JLabel lblNewLabel = new JLabel("Εισαγωγή  Δεδομένων");
    lblNewLabel.setForeground(new Color(72, 61, 139));
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
    lblNewLabel.setBounds(96, 44, 410, 65);
    add(lblNewLabel);
    
    JLabel lblwr = new JLabel("");
    lblwr.setBounds(10, 24, 95, 98);
    add(lblwr);
    lblwr.setIcon(new ImageIcon(wrimg));
    
    JButton Studentbtn = new JButton("\u039C\u03B1\u03B8\u03B7\u03C4\u03AD\u03C2");
    Studentbtn.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    	AdminSt sframe= new AdminSt();
    	sframe.setVisible(true);
    	}
    });
    Studentbtn.setBounds(139, 219, 95, 31);
    add(Studentbtn);
    
    JButton Teacherbtn = new JButton("\u0394\u03AC\u03C3\u03BA\u03B1\u03BB\u03BF\u03B9");
    Teacherbtn.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		AdminTe tframe= new AdminTe();
        	tframe.setVisible(true);
    	}
    });
    Teacherbtn.setBounds(139, 334, 95, 31);
    add(Teacherbtn);
    
    JLabel lblNewLabel_1 = new JLabel("\u0393\u03B9\u03B1 \u03BD\u03B1 \u03B4\u03B9\u03B1\u03B2\u03AC\u03C3\u03B5\u03C4\u03B5 \u03AE \u03BD\u03B1 \u03B5\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03AC\u03C3\u03B5\u03C4\u03B5 \u03C3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u03BC\u03B1\u03B8\u03B7\u03C4\u03CE\u03BD \u03C0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \u03B5\u03B4\u03CE:");
    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblNewLabel_1.setBounds(29, 178, 432, 41);
    add(lblNewLabel_1);
    
    JLabel lblNewLabel_2 = new JLabel("\u0395\u03B4\u03CE \u03BC\u03C0\u03BF\u03C1\u03B5\u03AF\u03C4\u03B5 \u03BD\u03B1 \u03C0\u03C1\u03BF\u03C3\u03B8\u03AD\u03C3\u03B5\u03C4\u03B5 \u03AE/\u03BA\u03B1\u03B9 \u03BD\u03B1 \u03B4\u03B9\u03B1\u03B3\u03C1\u03AC\u03C8\u03B5\u03C4\u03B5 \u03BC\u03B1\u03B8\u03B7\u03C4\u03AD\u03C2.");
    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblNewLabel_2.setBounds(29, 159, 432, 41);
    add(lblNewLabel_2);
    
  
  
	}

}
