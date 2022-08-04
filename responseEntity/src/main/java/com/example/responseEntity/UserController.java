package com.example.responseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("method1")
	public ResponseEntity<String> meathod1() {
		System.out.println("meethod1 ");
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("Success", HttpStatus.OK);
		return responseEntity; 
	}
	
	@GetMapping("user")
	public ResponseEntity<UserDTO> user(){
		
		UserDTO user = new UserDTO();
		user.setBrotherName("app");
		user.setName("app");
		user.setLastname("badi");
		ResponseEntity<UserDTO> entity = new ResponseEntity<UserDTO>(user, HttpStatus.OK);
		return entity;
	}
}
