import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

   
public class quizpanel extends JPanel {
	private JButton button;
	JRadioButton btn1a, btn1b, btn2a, btn2b, btn3a, btn3b, btn4a, btn4b, btn5a, btn5b, btn6a, btn6b, btn7a, btn7b, btn8a, btn8b, btn9a, btn9b, btn10a, btn10b, btncon1, btncon2;
	ButtonGroup bg, bg2, bg3, bg4, bg5 ,bg6, bg7, bg8, bg9, bg10, bgcon;
	  //Strings for Jbuttons//
	   String ap101[] = {"Ναι"};
       String ap102[] = {"Όχι"};
       String ap201[] = {"Ναι"};
       String ap202[] = {"Όχι"};
       String ap301[] = {"Ναι"};
       String ap302[] = {"Όχι"};
       String ap401[] = {"Ναι"};
       String ap402[] = {"Όχι"};
       String ap501[] = {"Ναι"};
       String ap502[] = {"Όχι"};
       String ap601[] = {"Ναι"};
       String ap602[] = {"Όχι"};
       String ap701[] = {"Ναι"};
       String ap702[] = {"Όχι"};
       String ap801[] = {"Ναι"};
       String ap802[] = {"Όχι"};
       String ap901[] = {"Ναι"};
       String ap902[] = {"Όχι"};
       String ap1001[] = {"Ναι"};
       String ap1002[] = {"Όχι"};
       String apcon1[] = {"Ναι"}; 
       String apcon2[] = {"Όχι"}; 
       
	/**
	 * Create the panel.
	 */
	public quizpanel() {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(new Color(222, 184, 135));
	setBounds(0, 0, 639, 475);
	setLayout(null);
	 Image qzimg = new ImageIcon(quizpanel.class.getResource("icons/student.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	 Image qzimg2 = new ImageIcon(quizpanel.class.getResource("icons/student(1).png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	 		
	//ButtonGroup Initializations//
     bg = new ButtonGroup();
     bg2 = new ButtonGroup();
     bg3 = new ButtonGroup();
     bg4 = new ButtonGroup();
     bg5 = new ButtonGroup();
     bg6 = new ButtonGroup();
     bg7 = new ButtonGroup();
     bg8 = new ButtonGroup();
     bg9 = new ButtonGroup();
     bg10 = new ButtonGroup();
     bgcon = new ButtonGroup();
     
     //JRadioButton Initializations//
  btn1a = new JRadioButton(ap101[0]);
  btn1a.setBounds(89, 175, 60, 23);
  add(btn1a);
  btn1a.setBackground(new Color(222, 184, 135)); 
  bg.add(btn1a);  
  btn1b = new JRadioButton(ap102[0]);
  btn1b.setBounds(152, 175, 54, 23);
  add(btn1b);
  btn1b.setBackground(new Color(222, 184, 134));
  bg.add(btn1b);       
  btn2a = new JRadioButton(ap201[0]);
  btn2a.setBounds(89, 221, 60, 23);
  add(btn2a);
  btn2a.setBackground(new Color(222, 184, 135));
  bg2.add(btn2a);        
  btn2b = new JRadioButton(ap202[0]);
  btn2b.setBounds(152, 221, 54, 23);
  add(btn2b);
  btn2b.setBackground(new Color(222, 184, 135));
  bg2.add(btn2b);       
  btn3a = new JRadioButton(ap301[0]);
  btn3a.setBounds(89, 271, 60, 29);
  add(btn3a);
  btn3a.setBackground(new Color(222, 184, 135));
  bg3.add(btn3a);        
  btn3b = new JRadioButton(ap302[0]);
  btn3b.setBounds(152, 271, 54, 28);
  add(btn3b);
  btn3b.setBackground(new Color(222, 184, 135));
 bg3.add(btn3b);        
  btn4a = new JRadioButton(ap401[0]);
  btn4a.setBounds(89, 350, 60, 23);
  add(btn4a);
  btn4a.setBackground(new Color(222, 184, 135));
  bg4.add(btn4a);        
  btn4b = new JRadioButton(ap402[0]);
  btn4b.setBounds(152, 350, 54, 23);
  add(btn4b);
  btn4b.setBackground(new Color(222, 184, 135));
  bg4.add(btn4b);       
  btn5a = new JRadioButton(ap501[0]);
  btn5a.setBounds(89, 398, 60, 21);
  add(btn5a);
  btn5a.setBackground(new Color(222, 184, 135));
  bg5.add(btn5a);    
  btn5b = new JRadioButton(ap502[0]);
  btn5b.setBounds(152, 398, 60, 21);
  add(btn5b);
  btn5b.setBackground(new Color(222, 184, 135));
  bg5.add(btn5b);   
  btn6a = new JRadioButton(ap601[0]);
  btn6a.setBounds(370, 183, 60, 21);
  add(btn6a);
  btn6a.setBackground(new Color(222, 184, 135));    
  bg6.add(btn6a);    
  btn6b = new JRadioButton(ap602[0]);   
  btn6b.setBounds(446, 183, 60, 21);
  add(btn6b);
  btn6b.setBackground(new Color(222, 184, 135));
  bg6.add(btn6b);    
  btn7a = new JRadioButton(ap701[0]);
  btn7a.setBounds(370, 234, 60, 21);
  add(btn7a);
  btn7a.setBackground(new Color(222, 184, 135));
  bg7.add(btn7a);   
  btn7b = new JRadioButton(ap702[0]);
  btn7b.setBounds(446, 234, 60, 21);
  add(btn7b);
  btn7b.setBackground(new Color(222, 184, 135));
  bg7.add(btn7b);    
  btn8a = new JRadioButton(ap801[0]);
  btn8a.setBounds(370, 289, 60, 21);
  add(btn8a);
  btn8a.setBackground(new Color(222, 184, 135));
  bg8.add(btn8a);   
  btn8b = new JRadioButton(ap802[0]);
  btn8b.setBounds(446, 289, 60, 21);
  add(btn8b);
  btn8b.setBackground(new Color(222, 184, 135));
  bg8.add(btn8b);   
  btn9a = new JRadioButton(ap901[0]);
  btn9a.setBounds(370, 338, 60, 21);
  add(btn9a);
  btn9a.setBackground(new Color(222, 184, 135));
  bg9.add(btn9a);    
  btn9b = new JRadioButton(ap902[0]);
  btn9b.setBounds(446, 338, 60, 21);
  add(btn9b);
  btn9b.setBackground(new Color(222, 184, 135));
  bg9.add(btn9b);    
  btn10a = new JRadioButton(ap1001[0]);
  btn10a.setBounds(370, 393, 60, 21);
  add(btn10a);
  btn10a.setBackground(new Color(222, 184, 135));
  bg10.add(btn10a);  
  btn10b = new JRadioButton(ap1002[0]);
  btn10b.setBounds(446, 393, 60, 21);
  add(btn10b);
  btn10b.setBackground(new Color(222, 184, 135));
  bg10.add(btn10b);    
  btncon1 = new JRadioButton(apcon1[0]);
  btncon1.setBounds(298, 113, 54, 28);
  add(btncon1);
  btncon1.setBackground(new Color(222, 184, 135));
  bgcon.add(btncon1);    
  btncon2 = new JRadioButton(apcon2[0]);
  btncon2.setBounds(370, 113, 54, 28);
  add(btncon2);
  btncon2.setBackground(new Color(222, 184, 135));
  bgcon.add(btncon2);
   
//Button Initialization//
  button = new JButton("Υποβολή");
  button.addMouseListener(new MouseAdapter() {
  	@Override
  	public void mouseClicked(MouseEvent e) {
  		//Positive//
  		if((btncon1.isSelected()) && (btn1a.isSelected())  && (btn2a.isSelected()) && (btn3a.isSelected()) && (btn4a.isSelected()) && (btn5a.isSelected())&& (btn6a.isSelected())&& (btn7a.isSelected())&& (btn8a.isSelected())&& (btn9a.isSelected())&& (btn10a.isSelected())) {
		      JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή!", JOptionPane.OK_OPTION);
  		}
		    if((btncon1.isSelected()) && (btn1a.isSelected()) && (btn2a.isSelected()) && (btn3a.isSelected()) && (btn4a.isSelected())) {
		      JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή!", JOptionPane.OK_OPTION);
		      }
		  //If one of the first four are picked, the teacher is required to go into quarantine for 14 days and test for Covid-19// 
		    if (btn1a.isSelected() && btn2b.isSelected() && btn3b.isSelected() && btn4b.isSelected()) {
			   JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή!", JOptionPane.OK_OPTION);
		   }
		    if(btn2a.isSelected() && btn1b.isSelected() && btn3b.isSelected() && btn4b.isSelected()) {
		    	JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή!", JOptionPane.OK_OPTION);
		    }
		    if (btn3a.isSelected() && btn1b.isSelected() && btn2b.isSelected() && btn4b.isSelected()) {
		    	JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή!", JOptionPane.OK_OPTION);
		    }
		    if(  btn1b.isSelected() && btn2b.isSelected() && btn3b.isSelected() && btn4a.isSelected()) {
		    	JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή!", JOptionPane.OK_OPTION);
		    }
		    //Additional Options//
		    if (btn1a.isSelected() && btn2a.isSelected() && btn3a.isSelected()  && btn5a.isSelected() && btn6a.isSelected() && btn7a.isSelected() && btn4b.isSelected()) {
		    	 JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή! Ύποπτο κρούσμα.", JOptionPane.OK_OPTION);
		    }
		    if (btn1a.isSelected() && btn2a.isSelected() && btn4a.isSelected() && btn5a.isSelected() && btn6a.isSelected() && btn7a.isSelected() && btn3b.isSelected()) {
		    	 JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή! Ύποπτο κρούσμα.", JOptionPane.OK_OPTION);
		    }
		    if (btn1a.isSelected()  && btn3a.isSelected() && btn4a.isSelected() && btn5a.isSelected() && btn6a.isSelected() && btn7a.isSelected() && btn2b.isSelected()) {
		    	 JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή! Ύποπτο κρούσμα.", JOptionPane.OK_OPTION);
		    }
		    if ( btn2a.isSelected() && btn3a.isSelected() && btn4a.isSelected() && btn5a.isSelected() && btn6a.isSelected() && btn7a.isSelected() && btn1b.isSelected()) {
		    	 JOptionPane.showMessageDialog(null, "Καραντίνα για 14 ημέρες και τεστ COVID-19", "Προσοχή! Ύποπτο κρούσμα.", JOptionPane.OK_OPTION);
		    }
		    //Negative//
  	    if((btncon2.isSelected()) && (btn1b.isSelected()) && (btn2b.isSelected()) && (btn3b.isSelected())&& (btn4b.isSelected())&& (btn5b.isSelected())&& (btn6b.isSelected())&& (btn7b.isSelected())&& (btn8b.isSelected())&& (btn9b.isSelected())&& (btn10b.isSelected())) {
  		 JOptionPane.showMessageDialog(null, "Παρακολουθήστε την κατάσταση της υγεία σας, σε περίπτωση εμφάνισης κάποιων συμπτωμάτων", "Ενημέρωση", JOptionPane.OK_OPTION);;
  	}
  	    if(btn1b.isSelected() && btn2b.isSelected() && btn3b.isSelected() && btn4b.isSelected() && btn5b.isSelected() && btn6b.isSelected() && btn7b.isSelected() && btn8a.isSelected() && btn9a.isSelected() && btn10a.isSelected()) {
  	    	 JOptionPane.showMessageDialog(null, "Παρακολουθήστε την κατάσταση της υγεία σας, σε περίπτωση εμφάνισης άλλων συμπτωμάτων. Οι απαντήσεις που υποβάλατε, δεν αποτελούν απόδειξη θετικού κρούσματος.", "Ενημέρωση", JOptionPane.OK_OPTION);;
  	    }
  	}
  });
  button.setBounds(225, 430, 91, 34);
  add(button);
  
	 JLabel quizmenulbl = new JLabel("Ερωτηματολόγιο");
	quizmenulbl.setForeground(new Color(46, 139, 87));
	quizmenulbl.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
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
	
	JLabel lblNewLabel = new JLabel("Δηλώστε αν έχετε ενα ή παραπάνω από τα παρακάτω συμπτώματα:");
    lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    lblNewLabel.setBounds(20, 67, 482, 28);
    add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("Απαντάτε με ναι ή όχι στην ερώτηση για το καθένα απο αυτά.");
    lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    lblNewLabel_1.setBounds(20, 83, 461, 34);
    add(lblNewLabel_1);
    
    JLabel ques1 = new JLabel("1. Bήχα");
    ques1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques1.setBounds(24, 164, 78, 14);
    add(ques1);
    
    JLabel ques2 = new JLabel("2. Πυρετό");
    ques2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques2.setBounds(24, 202, 78, 14);
    add(ques2);
    
    JLabel ques3 = new JLabel("3. Δύσπνοια");
    ques3.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques3.setBounds(24, 244, 99, 34);
    add(ques3);
    
    JLabel ques4 = new JLabel("4. Αιφνίδια εκδήλωση  ");
    ques4.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques4.setBounds(24, 301, 232, 21);
    add(ques4);
    
    JLabel ques5 = new JLabel("5. Διάρροια");
    ques5.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques5.setBounds(24, 374, 78, 21);
    add(ques5);
    
    JLabel ques6 = new JLabel("6. Εμετό");
    ques6.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques6.setBounds(298, 168, 85, 14);
    add(ques6);
    
    JLabel ques7 = new JLabel("7. Μυαλγίες");
    ques7.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques7.setBounds(298, 213, 85, 14);
    add(ques7);
    
    JLabel ques8 = new JLabel("8. Καταβολή");
    ques8.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques8.setBounds(298, 268, 85, 14);
    add(ques8);
    
    JLabel ques9 = new JLabel("9. Ρίγος");
    ques9.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques9.setBounds(308, 320, 85, 14);
    add(ques9);
    
    JLabel ques10 = new JLabel("10. Κεφαλαλγία");
    ques10.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques10.setBounds(308, 370, 123, 14);
    add(ques10);
    
    JLabel ques41 = new JLabel("ανοσμίας, αγευσίας");
    ques41.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques41.setBounds(34, 317, 142, 14);
    add(ques41);
    
    JLabel ques42 = new JLabel("ή δυσγευσίας");
    ques42.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques42.setBounds(34, 329, 142, 14);
    add(ques42);
    
    JLabel ques = new JLabel("Η επαφή με κρούσμα ήταν στενή; ");
    ques.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    ques.setBounds(22, 114, 243, 24);
    add(ques);
    
    JLabel inf = new JLabel("Πότε ορίζεται η στενή επαφή, βλέπετε τις οδηγίες χρήσης.");
    inf.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
    inf.setBounds(24, 136, 461, 23);
    add(inf);
    
	}

}
