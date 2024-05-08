package com.dream.automation.app.config;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.dream.automation.app.annotation.LazyConfigulation;

@LazyConfigulation
@Profile("remote")
public class RemoteWebdriverConfig {

	@Value("${selenium.grid.url}")
	private URL url;

	@Bean
	@ConditionalOnProperty(name = "browser", havingValue = "firefox")
	public WebDriver remoteFirefoxDriver() {
		return new RemoteWebDriver(this.url, new FirefoxOptions());
	}

	@Bean
	@ConditionalOnMissingBean
	public WebDriver remoteChromeDriver() {
		return new RemoteWebDriver(this.url, new ChromeOptions());
	}
}
