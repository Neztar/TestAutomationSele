package com.dream.automation.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;

public abstract class PageBase {

	@Autowired
	protected WebDriver webdriver;

	@Autowired
	protected WebDriverWait webDriverWait;

	@PostConstruct
	private void init() {
		PageFactory.initElements(this.webdriver, this);
	}

	public abstract boolean isAt();

}
