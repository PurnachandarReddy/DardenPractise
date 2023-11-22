package com.example.SpringBootAddress;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
	public Address getAddressByZipcode(@PathVariable String zipcode) {
		Address address = getLocationFromDatabaseOrApi(zipcode);
		return address;
	}

	private Address getLocationFromDatabaseOrApi(String zipcode) {
		if("5000".equals(zipcode)) {
			return new Address("MH", "Mumbai","India");
		}
		else {
			return new Address("unknown", "unknown","unknown");
		}
	}

}
