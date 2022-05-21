package com.zohocrm3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm3.utility.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailser;
	
	@RequestMapping("/compose")
	public String composeEmail(@RequestParam("emailId") String email,ModelMap model) {
    model.addAttribute("email",email);
	return "compose_email";
	
}
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to")String to,@RequestParam("subject")String subject,@RequestParam("body")String body) {
		emailser.sendSimpleMessage(to, subject,body);
		return "compose_email";
	}
	
}