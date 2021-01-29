import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class hometeachers extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public hometeachers() {
	setBackground(new Color(222, 184, 135));
    setVisible(true);
    setBounds(0, 0, 678, 499);
    setLayout(null);
    JLabel lblNewLabel = new JLabel("Καλώς Ήρθατε!");
    lblNewLabel.setForeground(new Color(128, 0, 0));
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
    lblNewLabel.setBounds(159, 33, 332, 37);
    add(lblNewLabel);
    
    JLabel hellolbl = new JLabel("");
    hellolbl.setBounds(38, 11, 99, 90);
    add(hellolbl);
    hellolbl.setIcon(new ImageIcon(hlimg));
    
    JLabel lblNewLabel_1 = new JLabel("H εφαρμογή αυτή βοηθάει στον εντοπισμό κρουσμάτων,");
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
    lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
    lblNewLabel_1.setVerticalTextPosition(SwingConstants.TOP);
    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
    lblNewLabel_1.setBounds(137, 153, 372, 19);
    add(lblNewLabel_1);
    
    JLabel lblNewLabel_2 = new JLabel("απαντώντας το  ερωτηματολόγιο που σας δίνεται. Αν έχετε");
    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
    lblNewLabel_2.setBounds(137, 169, 410, 19);
    add(lblNewLabel_2);
    
    JLabel lblNewLabel_3 = new JLabel("κάποια απορία, μπορείτε να δείτε τις οδηγίες χρήσης.");
    lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
    lblNewLabel_3.setBounds(137, 180, 378, 28);
    add(lblNewLabel_3);
    
    JLabel lblNewLabel_4 = new JLabel("");
    lblNewLabel_4.setBounds(33, 143, 104, 90);
    add(lblNewLabel_4);
    lblNewLabel_4.setIcon(new ImageIcon(hlimg1));
    
    JLabel marlbl = new JLabel("");
    marlbl.setBounds(0, 265, 678, 234);
    add(marlbl);
    marlbl.setIcon(new ImageIcon(img));
    
    JLabel lblNewLabel_5 = new JLabel("Trackers-19");
    marlbl.add(lblNewLabel_5);
    lblNewLabel_5.setForeground(new Color(139, 0, 0));
    lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 45));
    lblNewLabel_5.setBounds(201, 75, 290, 73);
	}
}
