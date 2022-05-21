package com.zohocrm3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm3.entities.Billing;
import com.zohocrm3.services.BillingService;

@Controller
public class BillingController {
	@Autowired
	private BillingService billingser;
	
	@RequestMapping("/generate")
	public String generateBill(@ModelAttribute("bill")Billing bill,ModelMap model) {
		
		billingser.generateOneBill(bill);
		
		model.addAttribute("bill",bill);
		
		return "billing_result";
		
	}

}
