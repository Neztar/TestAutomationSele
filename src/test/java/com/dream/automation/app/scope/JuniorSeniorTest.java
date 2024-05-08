package com.dream.automation.app.scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dream.automation.app.SpringBaseTestNGTest;

public class JuniorSeniorTest extends SpringBaseTestNGTest {

	@Autowired
	private JuniorEngg junior;
	@Autowired
	private SeniorEngg senior;

	@Test
	public void scopeTest() {
		this.junior.setAmount(100);
		System.out.println("Junior : " + this.junior.getSalary().getAmount());

		this.senior.setAmount(200);
		System.out.println("Senior : " + this.senior.getSalary().getAmount());
		System.out.println("Junior : " + this.junior.getSalary().getAmount());
	}
}
