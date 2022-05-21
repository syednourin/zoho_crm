package com.zohocrm3.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm3.entities.Contact;
import com.zohocrm3.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
	private ContactRepository contactrepo;
	
	@Override
	public void savecontact(Contact contact) {
		
			contactrepo.save(contact);
	
			
	}
   @Override
	public List<Contact> findAllContacts() {
		List<Contact>contact= contactrepo.findAll();
		return contact;
	}

	@Override
	public Contact getContact(int id) {
		Contact contact = contactrepo.getById(id);
		return contact;
	}
	

}
