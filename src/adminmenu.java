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
    setBounds(0, 0, 620, 452);
    setLayout(null);
    setVisible(true);
    Image wrimg = new ImageIcon(adminmenu.class.getResource("icons/web-development.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	 
    
    JLabel admenlbl = new JLabel("Παρακαλώ εισάγετε παρακάτω τα ζητούμενα στοιχεία.");
    admenlbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
    admenlbl.setBounds(30, 72, 493, 43);
    add(admenlbl);
    
    JLabel lblNewLabel = new JLabel("Εισαγωγή  Δεδομένων");
    lblNewLabel.setForeground(new Color(72, 61, 139));
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
    lblNewLabel.setBounds(73, 36, 298, 32);
    add(lblNewLabel);
    
    JLabel lblwr = new JLabel("");
    lblwr.setBounds(20, 21, 57, 56);
    add(lblwr);
    lblwr.setIcon(new ImageIcon(wrimg));
	}

}
