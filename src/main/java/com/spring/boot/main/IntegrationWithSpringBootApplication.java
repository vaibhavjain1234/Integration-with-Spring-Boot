package com.spring.boot.main;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationWithSpringBootApplication {

	private static Logger logger=LoggerFactory.getLogger(IntegrationWithSpringBootApplication.class);
	public static void main(String[] args) {
		logger.info("mail method executing..............");
		SpringApplication.run(IntegrationWithSpringBootApplication.class, args);
	}
	@PostConstruct
	public void init()
	{
		logger.info("Application started...");
	}

}
