package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgerPwPage extends BasePageObject {

	private By yourDetailsLable = By.xpath("//div[contains(text(),'Your Details')]");
	private By backButton = By.xpath("//a[@class='layout-col h-left font-xx-l line-height-3x-l fade-fore-color-3']");

	public ForgerPwPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/* getting label name of yourDetailsLable */
	public String getYourDetailsLable() {
		waitForVisibilityOf(yourDetailsLable, Duration.ofSeconds(10));
		return find(yourDetailsLable).getText();

	}

	/* click on back button */

	public void clickBackButton() {
		waitForVisibilityOf(backButton, Duration.ofSeconds(10));
		click(backButton);

	}



}
