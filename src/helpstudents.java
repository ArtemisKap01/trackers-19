import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

public class helpstudents extends JPanel {
	Image hlpimag = new ImageIcon(helpstudents.class.getResource("icons/problem.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	
	
	/**
	 * Create the panel.
	 */
	public helpstudents() {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(new Color(222, 184, 135));
    setBounds(0, 0, 559, 481);
    setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Εγχειρίδιο/Οδηγίες χρήσης");
    lblNewLabel.setForeground(new Color(210, 105, 30));
    lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
    lblNewLabel.setBounds(65, 28, 339, 55);
    add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("");
    lblNewLabel_1.setBounds(10, 0, 70, 83);
    add(lblNewLabel_1);
    lblNewLabel_1.setIcon(new ImageIcon(hlpimag));
	}

}
