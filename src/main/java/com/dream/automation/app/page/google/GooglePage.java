package com.dream.automation.app.page.google;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.dream.automation.app.annotation.Page;
import com.dream.automation.app.page.PageBase;

@Page
public class GooglePage extends PageBase {

	@Autowired
	private SearchComponent searchComponent;

	@Autowired
	private SearchResult searchResult;

	@Value("${application.url}")
	private String url;

	public void goTo() {
		this.webdriver.get(url);
	}

	@Override
	public boolean isAt() {
		return this.searchComponent.isAt();
	}

	public SearchComponent getSearchComponent() {
		return searchComponent;
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}
}
