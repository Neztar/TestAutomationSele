package com.dream.automation.app.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.dream.automation.app.annotation.LazyConfigulation;

import io.github.bonigarcia.wdm.WebDriverManager;

@LazyConfigulation
@Profile("!remote")
public class WebdriverConfig {

	@Bean
	@ConditionalOnProperty(name = "browser", havingValue = "firefox")
	public WebDriver firefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}

	@Bean
	@Scope("browserscope")
	@ConditionalOnMissingBean
	public WebDriver chromeDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
}
