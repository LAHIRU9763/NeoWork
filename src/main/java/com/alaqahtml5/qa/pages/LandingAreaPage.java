package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingAreaPage extends BasePageObject {

	private By LoginPopUp = By.xpath("//div[contains(text(),'Okay')]");
	private By dfnLogo = By.id("appTitle");
	private By message = By.id("flash-messages");
	private By logOutBtn = By.cssSelector(".icon-power");
	private By anbLogo = By.cssSelector(".left-nav-logo");

	public LandingAreaPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Verification if logOutButton is visible on the page */
	public boolean isDfnLogoButtonVisible() {
		click(dfnLogo);
		log.info("logout button is visibale");
		return find(dfnLogo).isDisplayed();

	}

	/** Return text from success message */
	public String getSuccessMessageText() {
		return find(message).getText();
	}

	/*
	 * waiting for DFNlogo to visibale
	 */ public void waitForDfnLogo() {
		waitForVisibilityOf(dfnLogo, Duration.ofSeconds(10));
		click(dfnLogo);
	}

	/*
	 * click on logout button
	 */ public void clickLogoutBtn() {
		click(logOutBtn);
		log.info("Log Out Button is button clicked");
	}

	/*
	 * Click on Last Login Okay Button
	 */
	public void clickLastLoginOkay() {
		click(LoginPopUp);
		log.info("Last Login Okay Button is button clicked");
	}

	/*
	 * Verification of ANB logo
	 */
	public void verifyDFNLogo() {
		waitForVisibilityOf(anbLogo, Duration.ofSeconds(10));
		log.info("Anb logo verified and pass");
	}
}