package com.dream.automation.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
	@Value("${salary.amount:1250}")
	private int amount;

//	public Salary() {
//		super();
//		this.amount = 1000;
//	}

	public int getAmount() {
		return amount;
	}

}
