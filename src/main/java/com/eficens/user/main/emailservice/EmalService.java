package com.eficens.user.main.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.eficens.user.main.model.EmailInfo;

@Service
public class EmalService {
	
	@Autowired
    private JavaMailSender emailSender;
	
	public String sendEmail(final EmailInfo emailInfo) {
		String msg = "Message Sent Successfully to "+emailInfo.getToEmailId();
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("student@sendmailsanta.com");
        message.setTo(emailInfo.getToEmailId()); 
        message.setSubject("Message From "+emailInfo.getFromName()); 
        message.setText(emailInfo.getEmailBody());
        emailSender.send(message);
		return msg;
	}

}
