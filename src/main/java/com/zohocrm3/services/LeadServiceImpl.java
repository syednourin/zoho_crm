package com.zohocrm3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm3.entities.Lead;
import com.zohocrm3.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
    @Autowired
	private LeadRepository leadrepo;
	
	@Override
	public void savelead(Lead lead) {
		try {
			leadrepo.save(lead);
		} catch (Exception e) {
			e.printStackTrace();
		} 
			
	}

	@Override
	public List<Lead> findAllLeads() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}

	@Override
	public Lead getLead(int id) {
		Optional<Lead>findById=leadrepo.findById(id);
	    Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLead(int id) {
		leadrepo.deleteById(id);
		
	}
	

}
