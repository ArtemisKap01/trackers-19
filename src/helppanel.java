import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

public class helppanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public helppanel() {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(new Color(222, 184, 135));
	setBounds(0, 0, 620, 452);
	setLayout(null);
	
	JLabel lblNewLabel = new JLabel("����������/������� ������");
	lblNewLabel.setForeground(new Color(210, 105, 30));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
	lblNewLabel.setBounds(25, 25, 244, 32);
	add(lblNewLabel);
	}

}
