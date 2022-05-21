package com.zohocrm3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm3.entities.Contact;
import com.zohocrm3.entities.Lead;
import com.zohocrm3.services.ContactService;
import com.zohocrm3.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadser;
	
	@Autowired
	private ContactService contactser;
	
	@RequestMapping("/view")
	public String ViewCreateLeadPage () {
		return "create_lead";
		
	}
	@RequestMapping("/savelead")
	public String saveonelead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		leadser.savelead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
	@RequestMapping("/listallleads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadser.findAllLeads();
		model.addAttribute("leads",leads);
		return "lead_result";
	}
	@RequestMapping("getLeadById")
    public String getLeadById(@RequestParam("id")int id,ModelMap model) {
		Lead lead=leadser.getLead(id);
		model.addAttribute("lead",lead);
		return "lead_info";
    	
    }
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")int id,ModelMap model) {
		Lead lead=leadser.getLead(id);
		
		//saving the data in contacts and deleting from the leads
		Contact contact=new Contact();
		
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadsource(lead.getLeadsource());
        contact.setMobile(lead.getMobile());
        contactser.savecontact(contact);
		
        //deleting
        leadser.deleteLead(id);
        //list of all contacts
        
        List<Contact> contacts = contactser.findAllContacts();
        model.addAttribute("contacts", contacts);
		return "contact_result";
		
	}
	
}
