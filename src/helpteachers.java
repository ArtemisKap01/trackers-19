import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

public class helpteachers extends JPanel {
	private static JScrollPane scroll;
	private JTextArea txtPad = new JTextArea();


	/**
	 * Create the panel.
	 */
	public helpteachers() {
		setBackground(new Color(222, 184, 135));
        setBounds(0, 0,  639, 475);
        setVisible(true);
    	setLayout(null);

    	JLabel lblNewLabel = new JLabel("Εγχειρίδιο/Οδηγίες χρήσης");
    	lblNewLabel.setForeground(new Color(210, 105, 30));
    	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
    	lblNewLabel.setBounds(21, 15, 256, 32);
    	add(lblNewLabel);
    	  
    //create & add textArea
        txtPad = new JTextArea();
        txtPad.setEditable(false);
        txtPad.setTabSize(10);
        txtPad.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
        txtPad.setRows(30);
        txtPad.setText("Εδώ θα βρείτε πληροφορίες για τον τρόπο λειτουργίας της πλατφόρμας. \r\nΣκοπός αυτού του προγράμματος είναι η έγκαιρη ιχνηλάτηση πιθανού κρούσματος , η\r\nδιαχείριση και αυτόματη ειδοποίηση των επαφών σας.Οι κωδικοί και τα username για το\r\nlogin των μαθητών και των δασκάλων θα δημιουργούνται και θα δίνονται από \r\nτον διευθυντή στην αρχή της σχολικής χρονιάς.Καλείστε να απαντήσετε σε όλες τις \r\nερωτήσεις που θα βρείτε στην ενότητα 'Ερωτηματολόγιο'.Oι ερωτήσεις σχετίζονται με\r\n την κατάσταση υγείας σας τη δεδομένη στιγμή που απαντάτε.Βασική προϋπόθεση είναι \r\nοι απαντήσεις σας να είναι ειλικρινείς και ακριβείς.Περιπτώσεις που θα σας εμφανιστεί \r\nμήνυμα να παραμείνετε σε καραντίνα και θα ειδοποιηθούν οι επαφές σας είναι:\r\n1. Αν η απάντηση σας σε κάποια από τις 4 πρώτες ερωτήσεις ήταν θετική.\r\n\r\n2. Αν η απάντηση σας σε όλα τα ερωτήματα ήταν θετική.\r\nΣτενή επαφή ορίζεται όταν οι μαθητές που ανήκουν στο ίδιο τμήμα με μαθητή που είναι\r\nεπιβεβαιωμένο κρούσμα COVID-19 και συνυπήρξαν μαζί του στη σχολική τάξη κατά το\r\n48ωρο πριν την έναρξη των συμπτωμάτων του (ή έως και 10 ημέρες μετά από αυτήν).\r\nΟι μαθητές που στο τμήμα τους δίδαξε συστηματικά εκπαιδευτικός που είναι \r\nεπιβεβαιωμένο κρούσμα COVID-19 κατά το 48ωρο πριν την έναρξη των συμπτωμάτων \r\nτου (ή έως και 10 ημέρες μετά από αυτήν).[«δίδαξε συστηματικά»: δίδαξε τουλάχιστον 2 \r\nδιδακτικές ώρες μέσα στο διάστημα του 48ωρου πριν την έναρξη των συμπτωμάτων (ή \r\nέως και 10 ημέρες μετά από αυτήν)].Άτομο (μαθητής ή ενήλικας) που είχε επαφή \r\nπρόσωπο-με-πρόσωπο με επιβεβαιωμένο κρούσμα COVID-19 κατά το 48ωρο πριν την \r\nέναρξη των συμπτωμάτων του (ή έως και 10 ημέρες μετά από αυτήν) σε απόσταση <1.5 μέτρο, για χρονικό διάστημα ≥ 15 λεπτά και χωρίς σωστή χρήση μάσκας εκ μέρους ενός \r\nαπό τους δυο (ή εκ μέρους και των δύο). Άτομο που είχε άμεση σωματική επαφή με \r\nεπιβεβαιωμένο κρούσμα COVID-19 (με ή χωρίς συμπτώματα) κατά την περίοδο \r\nμεταδοτικότητας. Άτομο που είχε επαφή με αναπνευστικές ή άλλες σωματικές εκκρίσεις\r\nεπιβεβαιωμένου κρούσματος COVID-19 (με ή χωρίς συμπτώματα) κατά την περίοδο\r\nμεταδοτικότητας χωρίς να έχουν ληφθεί τα απαραίτητα μέτρα προφύλαξης.Στενή \r\nεπαφή επιβεβαιωμένου κρούσματος (μαθητή ή μέλους του προσωπικού) που \r\nχρησιμοποιεί σχολικό λεωφορείο: (α) εάν το κρούσμα έκανε σωστή χρήση μάσκας στις\r\nδιαδρομές που μετείχε και έγιναν κατά τις 48 ώρες πριν την έναρξη των συμπτωμάτων \r\n(ή έως και 10 ημέρες μετά από αυτήν), στενή επαφή –υπό τυπικές συνθήκες– θεωρείται \r\nκάθε άτομο που σε κάποια διαδρομή εντός αυτού του χρονικού διαστήματος καθόταν σε\r\nδιπλανή θέση ή στην αντίστοιχη θέση της μπροστινής ή πίσω σειράς από τη θέση του\r\nεπιβεβαιωμένου κρούσματος, (β) εάν το κρούσμα δεν έκανε σωστή χρήση μάσκας στις\r\nδιαδρομές που μετείχε και έγιναν κατά τις 48 ώρες πριν την έναρξη των συμπτωμάτων \r\n(ή έως και 10 ημέρες μετά από αυτήν), θα πρέπει να γίνει ειδική εκτίμηση κινδύνου για \r\nναοριστούν οι στενές επαφές.");
        txtPad.setCaretPosition(0);
        txtPad.setBackground(new Color(222, 184, 135));
        txtPad.setBounds(21, 55, 589, 427);
    	add(txtPad);
    // create & add scrollPane
    	scroll = new JScrollPane(txtPad);
    	scroll.setLocation(new Point(0, 0));
    	scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
    	scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    	scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    	scroll.setBounds(10, 54, 592, 398); 	
    	JScrollBar verticalScrollBar = scroll.getVerticalScrollBar();
        JScrollBar horizontalScrollBar = scroll.getHorizontalScrollBar();
        verticalScrollBar.setValue(0);
        horizontalScrollBar.setValue(0);
    	add(scroll);}
      
	}


