package com.dream.automation.app.page.google;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dream.automation.app.annotation.PageFragment;
import com.dream.automation.app.page.PageBase;

@PageFragment
public class SearchResult extends PageBase {

	@FindBy(css = "div.kb0PBd")
	private List<WebElement> results;

	public int getCount() {
		return this.results.size();
	}

	@Override
	public boolean isAt() {
		return this.webDriverWait.until(d -> !this.results.isEmpty());
	}

}
