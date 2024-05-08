package com.dream.automation.app.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class TimeUtil {

	public Long getCurrentTimeStampMillis() {
		Instant instant = Instant.now();
		long timeStampMillis = instant.toEpochMilli();
		return timeStampMillis;
	}

	public String getCurrentDateTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		return now.format(formatter);
	}
	
	
}
