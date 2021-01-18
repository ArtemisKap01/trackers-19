import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
public class Sendemail {
private String user;
private String password;
private String host = "smtp.aueb.gr";
	public void setUser(String user) {
		this.user = user;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void send(String reciepient, String subject, String text) {
		 Properties props = new Properties();  
		   props.put("mail.smtp.host",host);  
		   props.put("mail.smtp.auth", "true");  
		   props.put("mail.smtp.starttls.enable", "true");
		     
		   Session session = Session.getDefaultInstance(props,  
		    new javax.mail.Authenticator() {  
		      protected PasswordAuthentication getPasswordAuthentication() {  
		    return new PasswordAuthentication(user,password);  
		      }  
		    });  
		  
		   //Compose the message  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(reciepient));  
		     message.setSubject(subject);  
		     message.setText(text);  
		       
		    //send the message  
		     Transport.send(message);  
		  
		     System.out.println("message sent successfully");  
		   
		     } catch (MessagingException e) {e.printStackTrace();}  
		 }  
	}

