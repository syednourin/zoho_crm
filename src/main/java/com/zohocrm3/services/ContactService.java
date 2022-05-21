package com.zohocrm3.services;

import java.util.List;

import com.zohocrm3.entities.Contact;


public interface ContactService {
	public void savecontact(Contact contact);

	public List<Contact> findAllContacts();

	 public Contact getContact(int id);

}
