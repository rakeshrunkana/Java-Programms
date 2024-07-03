package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.UserDTO;
import com.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	
	
	public String authenticateUser(String userName,String password) {
		System.out.println("In service");
		UserDTO userDTO=new UserDTO(userName,password);
		boolean isValidUser = loginRepository.validateLogin(userDTO);
		String response=isValidUser?"home":"error";
		System.out.println("response is "+response);
		return response;
		
	}

}
