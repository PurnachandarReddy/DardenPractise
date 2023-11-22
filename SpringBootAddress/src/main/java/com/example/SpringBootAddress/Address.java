package com.example.SpringBootAddress;

import org.springframework.stereotype.Component;


public class Address {
	private String state;
    private String city;
    private String country;
	private String getState() {
		return state;
	}
	private void setState(String state) {
		this.state = state;
	}
	private String getCity() {
		return city;
	}
	private void setCity(String city) {
		this.city = city;
	}
	private String getCountry() {
		return country;
	}
	private void setCountry(String country) {
		this.country = country;
	}
	public Address(String state, String city, String country) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
	}


	
    
   

}
