package com.dream.automation.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.dream.automation.app.model.User;

@SpringBootTest
class TestAutomationSeleApplicationTests {

	@Autowired
	private User user;

	@Value("${JAVA_HOME}")
	private String envValue;

	@Test
	void contextLoads() {
//		Address add = new Address();
//		Salary sal = new Salary();
//
//		User user = new User(add, sal);
		user.printDetails();
		System.out.println("envValue: " + envValue);
	}
}
