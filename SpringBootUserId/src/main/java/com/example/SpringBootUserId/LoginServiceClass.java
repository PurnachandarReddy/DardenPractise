package com.example.SpringBootUserId;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceClass {
	
	public String getLogin(String user, String pass) {
		if(user.equals("kpcreddy") && pass.equals("kpc"))
		{
			return "Valid User..";
		}
		else
		{
			return "Invalid User";
		}
	}

}
