package com.vikky.task.management;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsTestApplicationTests.class);
	
	
	
	@Test
	void contextLoads() {
		logger.info("--------------------- Application Testing -------------------");
		assertEquals(true, true);
	}

}
