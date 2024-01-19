package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {

	private String pageUrl = "http://neo-qa-trade-universal.directfn.net/";
	// private String pageUrl = "http://icap-qa-trade.universal.directfn.net/";
	private By usernameLocator = By.id("txtUsername");
	private By passwordLocator = By.id("txtPassword");
	private By logInButtonLocator = By.id("btnLogin");
	private By errorMessageLocator = By.id("loginMsg");
	//private By onlineAccLocator = By.id("lnkOnlineAcc");
	private By onlineAccLocator = By.linkText("Open Account");

	public LoginPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Execute log in */
	public LandingAreaPage logIn(String username, String password) {
		log.info("Executing LogIn with username [" + username + "] and password [" + password + "]");
		Duration.ofSeconds(10);
		type(username, usernameLocator);
		Duration.ofSeconds(10);
		type(password, passwordLocator);
		Duration.ofSeconds(10);
		// click(logInButtonLocator);
		pressEnter(logInButtonLocator, Keys.ENTER);
		return new LandingAreaPage(driver, log);
	}

	public void negativeLogIn(String username, String password) {
		log.info("Executing Negative LogIn with username [" + username + "] and password [" + password + "]");
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(logInButtonLocator);
	}

	/** Open WelcomePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	/** Get URL variable from PageObject */
	public String getPageUrl() {
		return pageUrl;
	}

	/** Wait for error message to be visible on the page */

	public void waitForErrorMessage() {
		waitForVisibilityOf(errorMessageLocator, Duration.ofSeconds(10));
	}

	public String getErrorMessageText() {

		return find(errorMessageLocator).getText();
	}

	/**
	 * Return text from success message
	 * 
	 * @throws InterruptedException
	 */

	// click on Registaion Button
//	public void clickRegistaion() throws InterruptedException {
//		waitForVisibilityOf(registerLink, Duration.ofSeconds(10));
//		Thread.sleep(30);
//		click(registerLink);
//
//		log.info(registerLink + "Registaion Button clicked!");
//
//	}

	/*
	 * waiting for DFNlogo to visibale
	 */ public void waitForRegisterLink() {
		waitForVisibilityOf(onlineAccLocator, Duration.ofSeconds(100));

		// click(onlineAccLocator);

	}

	/** Verification if onlineAccLocator is visible on the page */
	public boolean isonlineAccLocatorVisible() {
		// click(onlineAccLocator);
		waitForVisibilityOf(onlineAccLocator, Duration.ofSeconds(100));
		log.info("onlineAccLocator button is visibale");
		return find(onlineAccLocator).isDisplayed();

	}

	/** click onlineAccLocator on the page */
	public void clickOpenAccount() {

	//	waitForVisibilityOf(onlineAccLocator, Duration.ofSeconds(100));
	//	explicitWait(driver, onlineAccLocator, 2).click();

		click(onlineAccLocator);
		//click(logInButtonLocator);

		log.info(onlineAccLocator + "  OLAO Button clicked 2 !");
	}

}