import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;

public class Homestudents extends JPanel {
	private Image hlimg = new ImageIcon(Homestudents.class.getResource("icons/hello.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image detimg = new ImageIcon(Homestudents.class.getResource("icons/detective.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image readimg = new ImageIcon(Homestudents.class.getResource("icons/reading.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image writeimg = new ImageIcon(Homestudents.class.getResource("icons/writer.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image lapimg = new ImageIcon(Homestudents.class.getResource("icons/computer.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image happyimg = new ImageIcon(Homestudents.class.getResource("icons/happy.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image chatimg = new ImageIcon(Homestudents.class.getResource("icons/comment-white-oval-bubble.png")).getImage().getScaledInstance(250, 160, Image.SCALE_SMOOTH);
	
	/**
	 * Create the panel.
	 */
	public Homestudents() {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(new Color(222, 184, 135));
    setBounds(0, 0, 559, 481);
    setLayout(null);
    setVisible(true);
    
    JLabel lblNewLabel = new JLabel(" Καλώς Ήρθατε!");
    lblNewLabel.setForeground(new Color(30, 144, 255));
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
    lblNewLabel.setBounds(107, 41, 196, 52);
    add(lblNewLabel);
    
    JLabel hellolbl = new JLabel("");
    hellolbl.setBounds(0, 109, 90, 90);
    add(hellolbl);
    hellolbl.setIcon(new ImageIcon(hlimg));
    
    JLabel lblNewLabel_1 = new JLabel("H εφαρμογή αυτή βοηθάει στον εντοπισμό κρουσμάτων,");
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
    lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
    lblNewLabel_1.setVerticalTextPosition(SwingConstants.TOP);
    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
    lblNewLabel_1.setBounds(20, 175, 435, 28);
    add(lblNewLabel_1);
    
    JLabel lblNewLabel_2 = new JLabel("απαντώντας το  ερωτηματολόγιο που σας δίνεται. Αν έχετε");
    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
    lblNewLabel_2.setBounds(65, 186, 390, 35);
    add(lblNewLabel_2);
    
    JLabel lblNewLabel_3 = new JLabel("κάποια απορία, μπορείτε να δείτε τις οδηγίες χρήσης.");
    lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
    lblNewLabel_3.setBounds(65, 210, 378, 28);
    add(lblNewLabel_3);
    
    JLabel detectivelbl = new JLabel("");
    detectivelbl.setBounds(20, 249, 90, 95);
    add(detectivelbl);
    detectivelbl.setIcon(new ImageIcon(detimg));
    
    JLabel writerlbl = new JLabel("");
    writerlbl.setBounds(155, 318, 90, 95);
    add(writerlbl);
    writerlbl.setIcon(new ImageIcon(writeimg));
    
    JLabel readlbl = new JLabel("");
    readlbl.setBounds(314, 318, 90, 95);
    add(readlbl);
    readlbl.setIcon(new ImageIcon(readimg));
    
    JLabel laplbl = new JLabel("");
    laplbl.setBounds(424, 232, 92, 103);
    add(laplbl);
    laplbl.setIcon(new ImageIcon(lapimg));
    
    JLabel happylbl = new JLabel("");
    happylbl.setBounds(394, 41, 103, 103);
    add(happylbl);
    happylbl.setIcon(new ImageIcon(happyimg));
    
    JLabel chatlbl = new JLabel("");
    chatlbl.setBounds(77, 0, 250, 153);
    add(chatlbl);
    chatlbl.setIcon(new ImageIcon(chatimg));
	}
}
