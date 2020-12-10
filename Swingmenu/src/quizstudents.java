import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.EmptyBorder;

public class quizstudents extends JPanel {

	Image qzimag = new ImageIcon(quizstudents.class.getResource("icons/decision.png")).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	 
	/**
	 * Create the panel.
	 */
	public quizstudents() {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(new Color(222, 184, 135));
    setBounds( 0, 0, 559, 481);
    setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Ερωτηματολόγιο");
    lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
    lblNewLabel.setForeground(new Color(127, 255, 0));
    lblNewLabel.setBounds(66, 29, 223, 51);
    add(lblNewLabel);
    
    JLabel lblico = new JLabel("");
    lblico.setBounds(10, 11, 61, 75);
    add(lblico);
    lblico.setIcon(new ImageIcon(qzimag));
	
 	}

}
