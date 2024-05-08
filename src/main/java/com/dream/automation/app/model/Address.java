package com.dream.automation.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("${address.street}")
	private String street;

//	public Address() {
//		super();
//		this.street = "123 street tester main st";
//	}

	public String getStreet() {
		return street;
	}
}
