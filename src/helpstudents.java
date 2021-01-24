import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

public class helpstudents extends JPanel {
	Image hlpimag = new ImageIcon(helpstudents.class.getResource("icons/problem.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private JTextArea txtTest;
	private static JScrollPane scroll;
	
	
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
    lblNewLabel.setBounds(65, 21, 339, 55);
    add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("");
    lblNewLabel_1.setBounds(10, -2, 70, 83);
    add(lblNewLabel_1);
    lblNewLabel_1.setIcon(new ImageIcon(hlpimag));
   
//create & add textArea
    txtTest = new JTextArea();
    txtTest.setEditable(false);
    txtTest.setTabSize(10);
    txtTest.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
    txtTest.setRows(30);
    txtTest.setText("Γεια σας! Εδώ θα βρείτε πληροφορίες για τον τρόπο λειτουργίας της πλατφόρμας."
+"Σκοπός αυτού του προγράμματος είναι η έγκαιρη ιχνηλάτηση πιθανού κρούσματος , η"
+"διαχείριση και αυτόματη ειδοποίηση των επαφών σας."
+"Οι κωδικοί και τα username για το login των μαθητών και των δασκάλων θα" 
+"δημιουργούνται και θα δίνονται από τον διευθυντή στην αρχή της σχολικής χρονιάς."
+"Καλείστε να απαντήσετε σε όλες τις ερωτήσεις που θα βρείτε στην ενότητα "
+"'Ερωτηματολόγιο'."
+"Oι ερωτήσεις σχετίζονται με την κατάσταση υγείας σας τη δεδομένη στιγμή που απαντάτε."
+"Βασική προϋπόθεση είναι οι απαντήσεις σας να είναι ειλικρινείς και ακριβείς."
+"Περιπτώσεις που θα σας εμφανιστεί μήνυμα να παραμείνετε σε καραντίνα και θα"
+"ειδοποιηθούν οι επαφές σας είναι :"
+"1. Αν η απάντηση σας σε κάποια από τις 7 πρώτες ερωτήσεις ήταν θετική."
+""
+"2. Αν η απάντηση σας σε όλα τα ερωτήματα ήταν θετική."
+""
+"Στενή επαφή ορίζεται όταν οι μαθητές που ανήκουν στο ίδιο τμήμα με μαθητή που είναι"
 +"επιβεβαιωμένο κρούσμα COVID-19 και συνυπήρξαν μαζί του στη σχολική τάξη κατά το" 
+"48ωρο πριν την έναρξη των συμπτωμάτων του (ή έως και 10 ημέρες μετά από αυτήν)." 
+"Οι μαθητές που στο τμήμα τους δίδαξε συστηματικά εκπαιδευτικός που είναι" 
+"επιβεβαιωμένο κρούσμα COVID-19 κατά το 48ωρο πριν την έναρξη των συμπτωμάτων"
 +"του (ή έως και 10 ημέρες μετά από αυτήν).[«δίδαξε συστηματικά»: δίδαξε τουλάχιστον 2"
 +"διδακτικές ώρες μέσα στο διάστημα του 48ωρου πριν την έναρξη των συμπτωμάτων (ή" 
+"έως και 10 ημέρες μετά από αυτήν)].Άτομο (μαθητής ή ενήλικας) που είχε επαφή" 
+"πρόσωπο-με-πρόσωπο με επιβεβαιωμένο κρούσμα COVID-19 κατά το 48ωρο πριν την" 
+"έναρξη των συμπτωμάτων του (ή έως και 10 ημέρες μετά από αυτήν) σε απόσταση < 1.5"
+"μέτρο, για χρονικό διάστημα ≥ 15 λεπτά και χωρίς σωστή χρήση μάσκας εκ μέρους"
+"ενός από τους δυο (ή εκ μέρους και των δύο). Άτομο που είχε άμεση σωματική επαφή με"
 +"επιβεβαιωμένο κρούσμα COVID-19 (με ή χωρίς συμπτώματα) κατά την περίοδο"
+"μεταδοτικότητας. Άτομο που είχε επαφή με αναπνευστικές ή άλλες σωματικές εκκρίσεις" 
+"επιβεβαιωμένου κρούσματος COVID-19 (με ή χωρίς συμπτώματα) κατά την περίοδο" 
+"μεταδοτικότητας χωρίς να έχουν ληφθεί τα απαραίτητα μέτρα προφύλαξης.Στενή επαφή"
+"επιβεβαιωμένου κρούσματος (μαθητή ή μέλους του προσωπικού) που χρησιμοποιεί" 
+"σχολικό λεωφορείο: (α) εάν το κρούσμα έκανε σωστή χρήση μάσκας στις διαδρομές που"
+"μετείχε και έγιναν κατά τις 48 ώρες πριν την έναρξη των συμπτωμάτων (ή έως και 10" 
+"ημέρες μετά από αυτήν), στενή επαφή –υπό τυπικές συνθήκες– θεωρείται κάθε άτομο"
+"που σε κάποια διαδρομή εντός αυτού του χρονικού διαστήματος καθόταν σε διπλανή"
+"θέση ή στην αντίστοιχη θέση της μπροστινής ή πίσω σειράς από τη θέση του" 
+"επιβεβαιωμένου κρούσματος, (β) εάν το κρούσμα δεν έκανε σωστή χρήση μάσκας στις" 
+"διαδρομές που μετείχε και έγιναν κατά τις 48 ώρες πριν την έναρξη των συμπτωμάτων"
+"(ή έως και 10 ημέρες μετά από αυτήν), θα πρέπει να γίνει ειδική εκτίμηση κινδύνου για να"
 +"οριστούν οι στενές επαφές.");
    txtTest.setCaretPosition(0);
    txtTest.setBackground(new Color(222, 184, 135));
    txtTest.setBounds(21, 79, 530, 427);
	add(txtTest);
// create & add scrollPane
	scroll = new JScrollPane(txtTest);
	scroll.setLocation(new Point(0, 0));
	scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
	scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scroll.setBounds(10, 84, 535, 398); 	
	JScrollBar verticalScrollBar = scroll.getVerticalScrollBar();
    JScrollBar horizontalScrollBar = scroll.getHorizontalScrollBar();
    verticalScrollBar.setValue(0);
    horizontalScrollBar.setValue(0);
	add(scroll);}
  

		
		
	/*αυτά θα διαγραφούν πιο μετά, απλώς τα κρατάω προς το παρόν				
txtTest.setText(Γεια σας!
 Εδώ θα βρείτε πληροφορίες για τον τρόπο λειτουργίας της πλατφόρμας.
Σκοπός αυτού του προγράμματος είναι η έγκαιρη ιχνηλάτηση πιθανού κρούσματος , η  διαχείριση και αυτόματη ειδοποίηση των επαφών σας.
Οι κωδικοί και τα username για το login των μαθητών και των δασκάλων θα δημιουργούνται και θα δίνονται από τον διευθυντή στην αρχή της σχολικής χρονιάς.
Καλείστε να απαντήσετε σε όλες τις ερωτήσεις που θα βρείτε στην ενότητα Ερωτηματολόγιο.
Oι ερωτήσεις σχετίζονται με την κατάσταση υγείας σας τη δεδομένη στιγμή που απαντάτε.
Βασική προϋπόθεση είναι οι απαντήσεις σας να είναι ειλικρινείς και ακριβείς.
Περιπτώσεις που θα σας εμφανιστεί μήνυμα να παραμείνετε σε καραντίνα και θα ειδοποιηθούν οι επαφές σας είναι 
1. Αν η απάντηση σας σε κάποια από τις 7 πρώτες ερωτήσεις ήταν θετική.
2. Αν η απάντηση σας σε όλα τα ερωτήματα ήταν θετική. 
Στενή επαφή ορίζεται όταν οι μαθητές που ανήκουν στο ίδιο τμήμα με μαθητή που είναι επιβεβαιωμένο κρούσμα COVID-19 και συνυπήρξαν μαζί του στη σχολική τάξη κατά το 48ωρο πριν την έναρξη των συμπτωμάτων του (ή έως και 10 ημέρες μετά από αυτήν). Οι μαθητές που στο τμήμα τους δίδαξε συστηματικά εκπαιδευτικός που είναι επιβεβαιωμένο κρούσμα COVID-19 κατά το 48ωρο πριν την έναρξη των συμπτωμάτων του (ή έως και 10 ημέρες μετά από αυτήν).[«δίδαξε συστηματικά»: δίδαξε τουλάχιστον 2 διδακτικές ώρες μέσα στο διάστημα του 48ωρου πριν την έναρξη των συμπτωμάτων (ή έως και 10 ημέρες μετά από αυτήν)].Άτομο (μαθητής ή ενήλικας) που είχε επαφή πρόσωπο-με-πρόσωπο με επιβεβαιωμένο κρούσμα COVID-19 κατά το 48ωρο πριν την έναρξη των συμπτωμάτων του (ή έως και 10 ημέρες μετά από αυτήν) σε απόσταση < 1.5 μέτρο, για χρονικό διάστημα ≥ 15 λεπτά και χωρίς σωστή χρήση μάσκας εκ μέρους ενός από τους δυο (ή εκ μέρους και των δύο). Άτομο που είχε άμεση σωματική επαφή με επιβεβαιωμένο κρούσμα COVID-19 (με ή χωρίς συμπτώματα) κατά την περίοδο μεταδοτικότητας. Άτομο που είχε επαφή με αναπνευστικές ή άλλες σωματικές εκκρίσεις επιβεβαιωμένου κρούσματος COVID-19 (με ή χωρίς συμπτώματα) κατά την περίοδο μεταδοτικότητας χωρίς να έχουν ληφθεί τα απαραίτητα μέτρα προφύλαξης.Στενή επαφή επιβεβαιωμένου κρούσματος (μαθητή ή μέλους του προσωπικού) που χρησιμοποιεί σχολικό λεωφορείο: (α) εάν το κρούσμα έκανε σωστή χρήση μάσκας στις διαδρομές που μετείχε και έγιναν κατά τις 48 ώρες πριν την έναρξη των συμπτωμάτων (ή έως και 10 ημέρες μετά από αυτήν), στενή επαφή –υπό τυπικές συνθήκες– θεωρείται κάθε άτομο που σε κάποια διαδρομή εντός αυτού του χρονικού διαστήματος καθόταν σε διπλανή θέση ή στην αντίστοιχη θέση της μπροστινής ή πίσω σειράς από τη θέση του επιβεβαιωμένου κρούσματος, (β) εάν το κρούσμα δεν έκανε σωστή χρήση μάσκας στις διαδρομές που μετείχε και έγιναν κατά τις 48 ώρες πριν την έναρξη των συμπτωμάτων (ή έως και 10 ημέρες μετά από αυτήν), θα πρέπει να γίνει ειδική εκτίμηση κινδύνου για να οριστούν οι στενές επαφές.");
*/
    
	}

}
