import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class adminmenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public adminmenu() {
		setForeground(new Color(222, 184, 135));
    setBounds(0, 0, 589, 361);
    setLayout(null);
    setVisible(true);
    
    JLabel admenlbl = new JLabel("Παρακαλώ εισάγετε παρακάτω τα ζητούμενα στοιχεία. ");
    admenlbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
    admenlbl.setBounds(10, 45, 493, 43);
    add(admenlbl);
    
    JLabel lblNewLabel = new JLabel("Εισαγωγή  Δεδομένων");
    lblNewLabel.setForeground(new Color(72, 61, 139));
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
    lblNewLabel.setBounds(10, 21, 298, 32);
    add(lblNewLabel);
	}

}
