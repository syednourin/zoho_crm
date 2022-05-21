package com.zohocrm3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leads")//change the name of the table
public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name",nullable=false,length=45)//use of constrains for table creation in the db
	private String firstName;
	@Column(name="last_name",nullable=false,length=45)
	private String lastName;
	@Column(name="email",nullable=false,length=125,unique=true)
	private String email;
	@Column(name="lead_source")
	private String leadsource;
	@Column(name="mobile",nullable=false,length=10,unique=true)
	private int mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLeadsource() {
		return leadsource;
	}
	public void setLeadsource(String leadsource) {
		this.leadsource = leadsource;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	

}
