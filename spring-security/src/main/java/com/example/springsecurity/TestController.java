package com.example.springsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping("/")
	public String name() {
		return ("<h1>Wecome</h1>");
	}

	@RequestMapping("/user")
	public String user() {
		return ("<h1>Wecome user</h1>");
	}

	@RequestMapping("/admin")
	public String admin() {
		return ("<h1>Wecome admin</h1>");
	}
	 
}
