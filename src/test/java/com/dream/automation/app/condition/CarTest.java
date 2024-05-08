package com.dream.automation.app.condition;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dream.automation.app.SpringBaseTestNGTest;

public class CarTest extends SpringBaseTestNGTest {
	@Qualifier("accord")
	@Autowired
	private Car car;

	@Test
	public void carTest() {
		this.car.run();
	}
}
