import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Component;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;
import java.awt.SystemColor;
public class FrameLogin extends JFrame {
	 private Image logoimg = new ImageIcon(FrameLogin.class.getResource("icons/Science-University-icon.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	 private Image passimg = new ImageIcon(FrameLogin.class.getResource("icons/eye(1).png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		
    public static JPanel LoginBtn;
	public static JTextField txtUsername;
	public static JPasswordField txtPassword;
	private JLabel lbllogin = new JLabel("LOG IN");
	public static JLabel lblLoginMessage;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setBounds(100, 100, 647, 442);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		contentPane.setForeground(new Color(222, 184, 135));
		contentPane.setBackground(new Color(222, 184, 135));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(213, 185, 209, 37);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			if(txtUsername.getText().equals("Username")) {
				txtUsername.setText("");
			}
			else {
				txtUsername.selectAll();
			}
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(txtUsername.getText().equals(""))
				txtUsername.setText("Username");
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsername.setBounds(10, 11, 168, 21);
		txtUsername.setText("Username");
		txtUsername.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
			 
		
		//Login Button  
	    LoginBtn = new JPanel();			   
		LoginBtn.setBorder(new EmptyBorder(0, 0, 0, 0));
		LoginBtn.addMouseListener(new MouseAdapter() {
			  @Override
			public void mouseClicked(MouseEvent e) {
				 //Log in//
				   //Principal login
					if((txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin"))) 
					{
					    //lblLoginMessage.setText("");
						JOptionPane.showMessageDialog(null, "Συνδεθήκατε με επιτυχία.");
					    dispose();
						FrameDashboard hframe = new FrameDashboard();
					    hframe.setVisible(true);
					}   
					 //Teachers login
					 if((txtUsername.getText().equals("DFord") && txtPassword.getText().equals("08775CB1-BC10-E88D-CBBF-479FD042EA91")) ||
					 (txtUsername.getText().equals("KGutierrez") && txtPassword.getText().equals("8567A28D-18DB-5D99-B5E7-0E316ACAAE62")) ||
					 (txtUsername.getText().equals("CSnider") && txtPassword.getText().equals("8069C0E8-9C53-9C6C-0A12-F7847066A7FE")) ||
					 (txtUsername.getText().equals("JLove") && txtPassword.getText().equals("1C5A3995-6F8C-911F-CE22-DD4BDFEF2326")) ||
					 (txtUsername.getText().equals("SClarke") && txtPassword.getText().equals("C2947B98-78F7-2401-6EDF-474D5302BF59")) ||
					 (txtUsername.getText().equals("NWolfe") && txtPassword.getText().equals("4E5F3D19-599F-E9C8-96C6-4D4F05805EA0"))
							 ){
						//lblLoginMessage.setText("");
						JOptionPane.showMessageDialog(null, "Συνδεθήκατε με επιτυχία.");
						dispose();
						FramedashTeach sframe = new FramedashTeach();
						sframe.setVisible(true);
					}
					
					//Students login						   
					 if((txtUsername.getText().equals("FFrank") && txtPassword.getText().equals("D939EEE0-EAD7-9491-382B-A733598C58F2")) ||
							(txtUsername.getText().equals("NYates") && txtPassword.getText().equals("48412F45-1B7B-A693-B657-C30B2FF6EFA4")) ||
							txtUsername.getText().equals("TFlynn") && txtPassword.getText().equals("3D551E02-401D-91EA-FC4C-656D4A66D25D") ||
					 (txtUsername.getText().equals("UKim") && txtPassword.getText().equals("37AA462F-B10A-2E5B-1624-B14E73CDE017")) ||
					 (txtUsername.getText().equals("HLove") && txtPassword.getText().equals("AD0E4F2C-C328-B6FF-8BEA-67BC6BF73921")) ||
					 (txtUsername.getText().equals("SMcclure") && txtPassword.getText().equals("FCDBE713-07A4-CEB3-74FF-A5DF48E9B0AE")) ||
					 (txtUsername.getText().equals("KGuerrero") && txtPassword.getText().equals("23F054FD-6BB7-208D-1C82-39E2DEB29E03")) ||
					 (txtUsername.getText().equals("LJenkins") && txtPassword.getText().equals("A3E1F706-C7A6-E14C-4D3D-3403BA97C128")) ||
					 (txtUsername.getText().equals("SKnowles") && txtPassword.getText().equals("5687399A-5475-A987-B1F9-4C59DBC5B610")) ||
					 (txtUsername.getText().equals("KGlass") && txtPassword.getText().equals("3D7218A6-082D-516F-ADFF-BC6AB7D26606")) ||
					 (txtUsername.getText().equals("SMay") && txtPassword.getText().equals("97D0BF0C-3EEB-8E01-0EA4-8796172C6C99")) ||
					 (txtUsername.getText().equals("SBernard") && txtPassword.getText().equals("5490FCA1-0AB3-BDBF-EA70-623B3E114EB2")) ||
					 (txtUsername.getText().equals("RTownsend") && txtPassword.getText().equals("678F91F7-9AD4-B5E3-C99D-8F5488DAC7D1")) ||
					 (txtUsername.getText().equals("DHayden") && txtPassword.getText().equals("82D11351-7D07-94D7-FC82-DAD354D82A7F")) ||
					 (txtUsername.getText().equals("DBush") && txtPassword.getText().equals("6B8DDC75-B074-51E7-9D6C-9F018CE5AA79")) ||
					 (txtUsername.getText().equals("AHayden") && txtPassword.getText().equals("47A5DF7B-7ECF-06DA-BA92-4BE2FFAFECFE")) ||
					 (txtUsername.getText().equals("NDudley") && txtPassword.getText().equals("193E266C-BD27-A1FF-E328-FCFE30AD19CC")) ||
					 (txtUsername.getText().equals("LSandoval") && txtPassword.getText().equals("AF81AC9D-8181-03BE-5C38-2811581DC611")) ||
					 (txtUsername.getText().equals("RBowen") && txtPassword.getText().equals("CF79FF18-A269-34E5-9842-A4F6F9A8D6D5")) ||
					 (txtUsername.getText().equals("RHawkins") && txtPassword.getText().equals("2A7ADF86-7560-4483-15E4-825128029B5E")) ||
					 (txtUsername.getText().equals("BVasquez") && txtPassword.getText().equals("34D58821-4F56-D1CC-CA0D-21960E4B2B99")) ||
					 (txtUsername.getText().equals("LCarson") && txtPassword.getText().equals("2EDEFE38-229B-D583-2048-C3D154E25B9B")) ||
					 (txtUsername.getText().equals("CJoseph") && txtPassword.getText().equals("08BCA546-744C-C78C-3339-EB96890A8C2A")) ||
					 (txtUsername.getText().equals("IPuckett") && txtPassword.getText().equals("8CC31BD6-47EE-E0E7-7AB9-9C977247762B")) ||
					 (txtUsername.getText().equals("HGallagher") && txtPassword.getText().equals("C95AA855-C985-11B6-7318-F418B965D1CB")) ||
					 (txtUsername.getText().equals("LPhillips") && txtPassword.getText().equals("A978B6F0-1D7C-C35A-CA6B-98069684376E")) ||
					 (txtUsername.getText().equals("USears") && txtPassword.getText().equals("A5EA844C-59C2-35B0-A57D-79ACAFF3118A")) ||
					 (txtUsername.getText().equals("LFrederick") && txtPassword.getText().equals("5F2FBCF6-D12F-540D-DC9D-323CB5096C45")) ||
					 (txtUsername.getText().equals("KGallagher") && txtPassword.getText().equals("FA00C5A6-A4E1-89A6-A818-B4C8FA39DDCE")) ||
					 (txtUsername.getText().equals("BFitzgerald") && txtPassword.getText().equals("2F262C7E-33FD-A009-F42F-F3D8A191FC8F")) ||
					 (txtUsername.getText().equals("AMullins") && txtPassword.getText().equals("2B99A377-50B4-CB9E-C435-EEE6E1CC882B")) ||
					 (txtUsername.getText().equals("JRandall") && txtPassword.getText().equals("FBC6C004-3B34-FFFF-5BFE-F4167CB69875")) ||
					 (txtUsername.getText().equals("OHurst") && txtPassword.getText().equals("90A9EB77-40D9-82AE-89B9-3538117B054E")) ||
					 (txtUsername.getText().equals("BRiddle") && txtPassword.getText().equals("9EAB44C5-BDA0-F56E-FEA2-0158BAC75DDA")) ||
					 (txtUsername.getText().equals("BDoyle") && txtPassword.getText().equals("F4FCDF5D-FA09-280B-F87E-85C57C01837E")) ||
					 (txtUsername.getText().equals("KMoses") && txtPassword.getText().equals("89C46007-0F0F-0B00-0BF8-3BAD94E2F1F0")) ||
					 (txtUsername.getText().equals("IGuerrero") && txtPassword.getText().equals("4C29908E-5A43-C70C-3F8D-CDD417EAFF7B")) ||
					 (txtUsername.getText().equals("GMccoy") && txtPassword.getText().equals("4CA8E772-26FC-0A0B-C3CB-416B94F401FB")) ||
					 (txtUsername.getText().equals("SJohnston") && txtPassword.getText().equals("869677B3-A6D2-BE2D-D69F-26AAA053A647")) ||
					 (txtUsername.getText().equals("KPotts") && txtPassword.getText().equals("0BC1DF78-DF77-1A82-1B00-2D36E2FEFD3D")) ||
					 (txtUsername.getText().equals("BMckee") && txtPassword.getText().equals("560004E1-ABA2-3F58-9D9C-C8E6E4464935")) ||
					 (txtUsername.getText().equals("XHampton") && txtPassword.getText().equals("E59FD417-C325-246C-5E61-D6B94C26E47F")) ||
					 (txtUsername.getText().equals("MSnyder") && txtPassword.getText().equals("7C987B81-C79A-3A05-8D08-ACAA949DFA69")) ||
					 (txtUsername.getText().equals("OWoodard") && txtPassword.getText().equals("E58805F2-BB74-27FD-EB58-E8CF46651939")) ||
					 (txtUsername.getText().equals("RGreen") && txtPassword.getText().equals("DD49FA67-C45A-145D-CD6A-34C8A6FDFB93")) ||
					 (txtUsername.getText().equals("LJoseph") && txtPassword.getText().equals("6F26DAA5-2B3B-8BE1-2EAF-928DA8F70C20")) ||
					 (txtUsername.getText().equals("IDonaldson") && txtPassword.getText().equals("4D0591E3-1717-055C-0A7C-187C423C9AE5")) ||
					 (txtUsername.getText().equals("TWiggins") && txtPassword.getText().equals("AEBF3B20-E775-B19E-5B86-AE7C4B49839D")) ||
					 (txtUsername.getText().equals("DGrimes") && txtPassword.getText().equals("FF524200-BE81-B846-4F94-3A3A739F4173")) ||
					 (txtUsername.getText().equals("LNoel") && txtPassword.getText().equals("C0ECE52D-B5E1-2975-6F86-0AAAF97D2D0B")) ||
					 (txtUsername.getText().equals("CWilkerson") && txtPassword.getText().equals("F49E9867-4CF4-B3DB-CCF8-F2889901663A")) ||
					 (txtUsername.getText().equals("MBuchanan") && txtPassword.getText().equals("E41CD884-C2E4-3641-36EF-EF7D044E0D1F")) ||
					 (txtUsername.getText().equals("TBrady") && txtPassword.getText().equals("53303503-80A4-A674-ADB2-B1F88C8D30E8")) ||
					 (txtUsername.getText().equals("AHart") && txtPassword.getText().equals("2AB4CB4F-F3E9-E69B-91E9-0FB510CB212D")) ||
					 (txtUsername.getText().equals("MGomez") && txtPassword.getText().equals("117B87FD-74C5-6ECB-82AD-A142B4C8E21B")) ||
					 (txtUsername.getText().equals("DBurke") && txtPassword.getText().equals("C430EE82-7B13-BDCB-6663-4D9AD70287C4")) ||
					 (txtUsername.getText().equals("JKelley") && txtPassword.getText().equals("7331CF06-4967-3449-B6AE-880C0DE79801")) ||
					 (txtUsername.getText().equals("JRobinson") && txtPassword.getText().equals("7D1B2521-7595-EFBC-4DDD-4CB7370BFA33")) ||
					 (txtUsername.getText().equals("BMcintyre") && txtPassword.getText().equals("EF43D558-EE43-CB8C-FAFC-B86B393FD9BD")) ||
					 (txtUsername.getText().equals("ATillman") && txtPassword.getText().equals("7030E5BF-BE77-2367-3B96-FED4079F17E8")) ||
					 (txtUsername.getText().equals("JAustin") && txtPassword.getText().equals("F6DD62BC-7E86-6D7D-37E4-8EB8BB68C608")) ||
					 (txtUsername.getText().equals("BColeman") && txtPassword.getText().equals("5FE693D5-6C84-DF5C-BC1A-A08328F4CF11")) ||
					 (txtUsername.getText().equals("SBaker") && txtPassword.getText().equals("EBDC585B-021C-6263-72BC-29458AA01F09")) ||
					 (txtUsername.getText().equals("ELowe") && txtPassword.getText().equals("40FAA5C7-D68F-5AF8-C332-24354B31CC0A")) ||
					 (txtUsername.getText().equals("NVang") && txtPassword.getText().equals("FC72F738-B78F-DF63-6649-8D85D28812A4")) ||
					 (txtUsername.getText().equals("LBush") && txtPassword.getText().equals("31F99A36-E070-3ED7-953C-21838847E25C")) ||
					 (txtUsername.getText().equals("WMiranda") && txtPassword.getText().equals("90E4B157-F12C-027E-C1C4-510E575B2783")) ||
					 (txtUsername.getText().equals("EFinley") && txtPassword.getText().equals("AAED62C3-3E23-27EF-B12E-350A52A9FD40")) ||
					 (txtUsername.getText().equals("CPotts") && txtPassword.getText().equals("CD453A6B-2FE0-73E1-570A-7A6CBBB2ED29")) ||
					 (txtUsername.getText().equals("SWhitehead") && txtPassword.getText().equals("F3361E11-7DA6-1DBD-A999-1326916215ED")) ||
					 (txtUsername.getText().equals("Channing") && txtPassword.getText().equals("8F7807B9-624D-D222-741D-454B374F9241")) ||
					 (txtUsername.getText().equals("Driscoll") && txtPassword.getText().equals("1B166B9B-5EFF-9B2C-6C74-3EB16FF885DB")) ||
					 (txtUsername.getText().equals("Ross") && txtPassword.getText().equals("BE77CC40-20F5-1456-4534-675AFB4A2E85")) ||
					 (txtUsername.getText().equals("Thor") && txtPassword.getText().equals("D5E55DB7-FAF5-A31A-B37A-5893925870BB")) ||
					 (txtUsername.getText().equals("Sean") && txtPassword.getText().equals("C943C65A-E832-274D-BF0C-C982A4387CE9")) ||
					 (txtUsername.getText().equals("Branden") && txtPassword.getText().equals("D0449DAE-F409-7A7A-E4C5-C115DA8FDD27")) ||
					 (txtUsername.getText().equals("Stacey") && txtPassword.getText().equals("17F193A7-D4E8-82DA-DC23-9BAD194215EA")) ||
					 (txtUsername.getText().equals("Rebecca") && txtPassword.getText().equals("C085FAB0-26B1-48BF-1CF9-FDB7A7B2208B")) ||
					 (txtUsername.getText().equals("Deirdre") && txtPassword.getText().equals("599EB1B4-0314-1F25-2384-8784CB1E6A9D")) ||
					 (txtUsername.getText().equals("Fulton") && txtPassword.getText().equals("198201B3-0689-FAD5-90FF-302E518A9884")) ||
					 (txtUsername.getText().equals("GAdams") && txtPassword.getText().equals("573C4F99-459C-67AD-CFD1-CE70B8E573DD")) ||
					 (txtUsername.getText().equals("KDuffy") && txtPassword.getText().equals("22FD1D9D-4CA8-E845-ED30-CA52C366A4A1")) ||
					 (txtUsername.getText().equals("HOdom") && txtPassword.getText().equals("B9C8E1F4-AB38-C1AB-0651-3C3228A67294")) ||
					 (txtUsername.getText().equals("JParker") && txtPassword.getText().equals("305E71A9-F3EF-0F49-AB0E-000B68972D51")) ||
					 (txtUsername.getText().equals("KAustin") && txtPassword.getText().equals("EC681CF3-C26B-598B-633B-C84533582DC6")) ||
					 (txtUsername.getText().equals("AAnderson") && txtPassword.getText().equals("4492E24A-B8A7-1B31-BAAE-EEF57AB5E4D0")) ||
					 (txtUsername.getText().equals("TClay") && txtPassword.getText().equals("4AC91A61-C311-CD81-8D1F-F5A8A311F54B")) ||
					 (txtUsername.getText().equals("HPugh") && txtPassword.getText().equals("BB035880-3BA0-E666-6852-0773F64C2421")) ||
					 (txtUsername.getText().equals("MBurnett") && txtPassword.getText().equals("3F9CC463-37E1-CE4D-4CBF-B9CC432ED0FE")) ||
					 (txtUsername.getText().equals("LGuthrie") && txtPassword.getText().equals("B12E53EA-F6AD-05CF-5883-0D398E3B2B6D")) ||
					 (txtUsername.getText().equals("KFoster") && txtPassword.getText().equals("A52A5342-4E0D-5829-83D6-0C43A57D0C49")) ||
					 (txtUsername.getText().equals("BEdwards") && txtPassword.getText().equals("DEC3E946-897E-D4F9-FF71-94794722671E")) ||
					 (txtUsername.getText().equals("NHardy") && txtPassword.getText().equals("608EED69-C009-506F-E962-25D4A78C461D")) ||
					 (txtUsername.getText().equals("VLawson") && txtPassword.getText().equals("B76B7E4D-F0BA-093A-0AE5-EEEBF8B5A471")) ||
					 (txtUsername.getText().equals("SRoberts") && txtPassword.getText().equals("464881D3-7796-6865-35C2-2BB785096068")) ||
					 (txtUsername.getText().equals("AChristensen") && txtPassword.getText().equals("D877254E-35E0-52F7-410A-987266E151CB")) ||
					 (txtUsername.getText().equals("GJames") && txtPassword.getText().equals("8A8FAC9D-7444-1D21-AF9E-1531C7B3EB78")) ||
					 (txtUsername.getText().equals("CFaulkner") && txtPassword.getText().equals("1DBD33D8-527B-6CFD-674D-16A800BAFB9D")) ||
					 (txtUsername.getText().equals("MBlankenship") && txtPassword.getText().equals("45FCEE01-9A7F-9CE6-296E-2CAB33E46B3D")) ||					
					 (txtUsername.getText().equals("DEstrada") && txtPassword.getText().equals("A0653861-9A55-29B3-6DC2-FB5B48DC4162"))) 
					 
					 {
						//lblLoginMessage.setText("");
						JOptionPane.showMessageDialog(null, "Συνδεθήκατε με επιτυχία.");
						dispose();
						Framedashstudents gframe = new Framedashstudents();
						gframe.setVisible(true);
					}										 
					 //If user does not type in one of the fields
					  if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username")|| 
								txtPassword.getText().equals("") || txtPassword.getText().equals("Password"))
					 {			
								JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε όλα τα απαραίτητα πεδία.");
							    }
					//If user inputs incorrect
					  else{
						JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε τα σωστά στοιχεία.");
					}
			   }			
		@Override
			public void mouseEntered(MouseEvent e) {
				LoginBtn.setBackground(new Color(139, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				LoginBtn.setBackground(new Color(165, 42, 42));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				LoginBtn.setBackground(new Color(128, 0, 0));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				LoginBtn.setBackground(new Color(139, 0, 0));
			}
		});
		LoginBtn.setForeground(new Color(165, 42, 42));
		LoginBtn.setBackground(new Color(165, 42, 42));
		LoginBtn.setBounds(252, 305, 123, 37);
		contentPane.add(LoginBtn);
		LoginBtn.setLayout(null);
		
	
		
		lbllogin.setForeground(new Color(255, 255, 255));
		lbllogin.setFont(new Font("Arial", Font.BOLD, 14));
		lbllogin.setBounds(35, 11, 66, 14);
		LoginBtn.add(lbllogin);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(222, 184, 135)));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(213, 233, 209, 37);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(0, 0, 209, 37);
		panel_3.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		
		JLabel lblLoginMessage = new JLabel("");
		lblLoginMessage.setDisplayedMnemonic('•');
		lblLoginMessage.setBounds(10, 11, 199, 20);
		panel_1.add(lblLoginMessage);		
		lblLoginMessage.setBackground(new Color(255, 255, 255));
		lblLoginMessage.setForeground(new Color(139, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 14));
		
		txtPassword = new JPasswordField();
		//txtPassword.setEchoChar('•');
		txtPassword.setBounds(10, 11, 172, 20);
		panel_3.add(txtPassword);
		txtPassword.addFocusListener(new FocusAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('•');
					txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
				}
			}
			
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
			if(txtPassword.getText().equals("")) {
				txtPassword.setText("Password");
				txtPassword.setEchoChar((char)0);
			}
			}
		});
		
		txtPassword.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		txtPassword.setText("Password");
		
		
		
		JLabel logo = new JLabel("");
		logo.setBounds(265, 51, 110, 109);
		contentPane.add(logo);
		logo.setIcon(new ImageIcon(logoimg));
		
		JLabel Exit = new JLabel("X");
		Exit.setForeground(new Color(230, 230, 250));
		Exit.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Exit.setBounds(628, 0, 42, 25);
		contentPane.add(Exit);
		setLocationRelativeTo(null);
		
		JPanel chck = new JPanel();
		chck.setBorder(new EmptyBorder(0, 0, 0, 0));
		chck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			chck.setBackground(Color.GRAY);
			txtPassword.setEchoChar((char)0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			chck.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
			chck.setBackground(SystemColor.scrollbar);
			}
		});
		chck.setBackground(SystemColor.scrollbar);
		chck.setBounds(432, 237, 70, 30);
		contentPane.add(chck);
		chck.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(7, 6, 42, 19);
		chck.add(lblNewLabel);
		
		
		
		JLabel lblgetpass = new JLabel("");
		lblgetpass.setBounds(40, 6, 42, 18);
		chck.add(lblgetpass);
		lblgetpass.setIcon(new ImageIcon(passimg));
		
		
		Exit.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να κλείσετε την εφαρμογή?", "Κλείσιμο", JOptionPane.YES_NO_OPTION) == 0) {
		    		FrameLogin.this.dispose(); 
		    	 }
		}
		     @Override
		     public void mouseEntered(MouseEvent arg0) {
		    	 Exit.setForeground(Color.RED);
		     }
		     
		     @Override
		     public void mouseExited(MouseEvent arg0) {
		    	 Exit.setForeground(Color.WHITE);
		     }
	});
		
	}

}
