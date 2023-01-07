package com.eficens.user.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eficens.user.main.emailservice.EmalService;
import com.eficens.user.main.model.EmailInfo;

@RestController
public class EmailController {
	
	@Autowired
	EmalService emailService;
	
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestBody EmailInfo emailInfo) {
		String response = "";
		try {
			response = emailService.sendEmail(emailInfo);
		} catch (Exception e) {
			response = "Failed to Send to Email "+emailInfo.getToEmailId();
		}
		return response;
	}

}
