package com.statcraft.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	static Logger logger;

	@RequestMapping("/home")
	public String home() {
		logger = Logger.getLogger(getClass());
		logger.error("error happed");
		System.out.println("hi");
		return "Logger using...";
	}

	@GetMapping("/test")
	public String test() {
		logger.info("hello test");
		return "Logger using...";
	}

}
