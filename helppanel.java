import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class helppanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public helppanel() {
	setBounds(0, 0, 589, 361);
	setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Εγχειρίδιο/Οδηγίες Χρήσης");
	lblNewLabel.setForeground(new Color(210, 105, 30));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
	lblNewLabel.setBounds(25, 25, 244, 32);
	add(lblNewLabel);
	}

}
