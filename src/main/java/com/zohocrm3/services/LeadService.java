package com.zohocrm3.services;

import java.util.List;

import com.zohocrm3.entities.Lead;

public interface LeadService {
	public void savelead(Lead lead);

	public List<Lead> findAllLeads();

	 public Lead getLead(int id);

	public void deleteLead(int id);

}
