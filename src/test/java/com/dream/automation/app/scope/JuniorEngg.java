package com.dream.automation.app.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JuniorEngg {

	@Autowired
	private SalalyAmount salary;

	public SalalyAmount getSalary() {
		return salary;
	}

	public void setAmount(int amount) {
		this.salary.setAmount(amount);
	}
}
