package com.dream.automation.app.condition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnExpression("${car.speed} < 70")
@Qualifier("civic")
public class Civic implements Car {
	@Override
	public void run() {
		System.out.println("I'm civic. Speed is 60 mph");
	}
}
