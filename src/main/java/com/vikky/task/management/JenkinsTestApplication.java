package com.vikky.task.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsTestApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsTestApplication.class);
	
	
	@PostConstruct
	public void init() {
		logger.info("------------- Application started ------------");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
		logger.info("------------- Application started main method ------------");
	}

}
