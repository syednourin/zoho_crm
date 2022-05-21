package com.zohocrm3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm3.entities.Contact;
import com.zohocrm3.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactser;
	
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
    List<Contact> contact= contactser.findAllContacts();
    model.addAttribute("contacts",contact);
    return "contact_result";
		
	}
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id")int id,ModelMap model)
	{
		Contact contact = contactser.getContact(id);
		model.addAttribute("contacts",contact);
		return "generate_bill";
	}
}
