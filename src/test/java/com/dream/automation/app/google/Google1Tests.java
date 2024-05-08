package com.dream.automation.app.google;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;

import com.dream.automation.app.SpringBaseTestNGTest;
import com.dream.automation.app.page.google.GooglePage;
import com.dream.automation.app.util.ScreenShotUtil;

public class Google1Tests extends SpringBaseTestNGTest {

	@Autowired
	private GooglePage googlePage;

	@Lazy
	@Autowired
	private ScreenShotUtil screenShotUtil;

	@Test
	public void googleTest() throws IOException {
		this.googlePage.goTo();
		Assert.assertTrue(this.googlePage.isAt());

		this.googlePage.getSearchComponent().search("hello world ");
		Assert.assertTrue(this.googlePage.getSearchResult().isAt());
		Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 0);

		this.screenShotUtil.takeScreenShot();
	}
}
