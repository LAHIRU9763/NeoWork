package com.alaqahtml5.qa.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;



public class VATRegistrationNumberPage extends BasePageObject {

	private String pageUrl = "https://anbcapital.com.sa/documents/182269/1264160/VAT_Registration_Certificate.PDF/";
	public VATRegistrationNumberPage(WebDriver driver, Logger log) {
		super(driver, log);
	}


	/** Get URL variable from PageObject */
	public String getPageUrl() {
		return pageUrl;
	}

}
