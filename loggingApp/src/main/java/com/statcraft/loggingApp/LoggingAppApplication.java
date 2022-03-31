package com.statcraft.loggingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingAppApplication.class, args);
		System.out.println("main started....");
	}

}
