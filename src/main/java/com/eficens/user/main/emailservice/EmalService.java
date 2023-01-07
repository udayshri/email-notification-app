package com.eficens.user.main.emailservice;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.springframework.stereotype.Service;

import com.eficens.user.main.model.EmailInfo;

@Service
public class EmalService {
	
	public String sendEmail(final EmailInfo emailInfo) throws AddressException, MessagingException, IOException {
		String message = "Message Sent Successfully to "+emailInfo.getToEmailId();
		Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", emailInfo.getHost());
		   props.put("mail.smtp.port", "587");
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		         return new PasswordAuthentication(emailInfo.getUserName(), emailInfo.getPassword());
		      }
		   });
		   Message msg = new MimeMessage(session);
		   msg.setFrom(new InternetAddress("student@sendmailsanta.com", false));

		   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailInfo.getToEmailId()));
		   msg.setSubject("You Received Message From "+emailInfo.getFromName());
		   msg.setSentDate(new Date());

		   MimeBodyPart messageBodyPart = new MimeBodyPart();
		   messageBodyPart.setContent(emailInfo.getEmailBody(), "text/html; charset=UTF-8");

		   Multipart multipart = new MimeMultipart();
		   multipart.addBodyPart(messageBodyPart);
		   msg.setContent(multipart);
		   Transport.send(msg);
		   
		return message;
	}

}
