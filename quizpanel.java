import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class quizpanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public quizpanel() {
	setBounds(0, 0, 589, 361);
	setLayout(null);
	 Image qzimg = new ImageIcon(quizpanel.class.getResource("icons/student.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	 Image qzimg2 = new ImageIcon(quizpanel.class.getResource("icons/student(1).png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	 
	JLabel quizmenulbl = new JLabel("Ερωτηματολόγιο");
	quizmenulbl.setForeground(new Color(173, 255, 47));
	quizmenulbl.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
	quizmenulbl.setBounds(116, 22, 201, 66);
	add(quizmenulbl);
	
	JLabel lbliconqz1 = new JLabel("");
	lbliconqz1.setBounds(10, 11, 50, 77);
	add(lbliconqz1);
	lbliconqz1.setIcon(new ImageIcon(qzimg));
	
	JLabel lblimgqz2 = new JLabel("");
	lblimgqz2.setBounds(56, 14, 50, 70);
	add(lblimgqz2);
	lblimgqz2.setIcon(new ImageIcon(qzimg2));
	
	}

}
