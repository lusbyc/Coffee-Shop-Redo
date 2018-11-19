package com.CoffeeShopTwo.CoffeeShopTwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class Customer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer customerid;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String birthdate;
	
	
	public Customer() {
		}


	public Customer(Integer customerid, String firstname, String lastname, String email, String phone,
			String birthdate) {
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.birthdate = birthdate;
	}


	public Customer(String firstname, String lastname, String email, String phone, String birthdate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.birthdate = birthdate;
	}


	public Integer getCustomerid() {
		return customerid;
	}


	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", phone=" + phone + ", birthdate=" + birthdate + "]";
	}
	
	
	
	
	
}
