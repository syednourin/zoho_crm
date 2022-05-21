package com.zohocrm3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm3.entities.Billing;
import com.zohocrm3.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingrepo;
	
    @Override
	public void generateOneBill(Billing bill) {
    	billingrepo.save(bill);
    	
		
		
	}

}
