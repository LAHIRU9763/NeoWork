package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {

	private String pageUrl = "http://neo-qa-trade-universal.directfn.net/";
	//private String pageUrl = "https://h-test.anbcapital.com.sa/neo/web/";
	private By usernameLocator = By.id("txtUsername");
	private By passwordLocator = By.id("txtPassword");
	private By logInButtonLocator = By.id("btnLogin");
	private By errorMessageLocator = By.id("loginMsg");
	// private By onlineAccLocator = By.id("lnkOnlineAcc");
	private By onlineAccLocator = By.linkText("Open Account");
	private By toArabic = By.xpath("//span[@id='secondaryLang']");
	private By welcomeHeader = By.xpath("//div[@id='welcomeHeader']");
	private By toEnglish = By.xpath("//span[@id='primaryLang']");
	private By forgetPwAndUn = By.cssSelector("#lnkForgotPwd"); //a[@id='lnkForgotPwd']
	private By registerLink = By.xpath("//a[@id='registerLink']");
	private By privacyPolicy = By.xpath("//a[@id='disclaimerText']");
	private By termsConditions = By.xpath("//a[@id='footerTermsAndConditions']");
	private By vATRegistrationNumber = By.xpath("//a[@id='vatRegText']");
	private By fAQ = By.xpath("//a[@id='footerFaq']");
	private String pPUrl = "http://neo-qa-trade-universal.directfn.net/privacy-policy/en";
	private String tAndCUrl = "http://neo-qa-trade-universal.directfn.net/terms-conditions/en";
	private String vRNUrl = "https://anbcapital.com.sa/documents/182269/1264160/VAT_Registration_Certificate.PDF/";
	private String fAQUrl = "http://neo-qa-trade-universal.directfn.net/faq/en";

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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(logInButtonLocator);
		// pressEnter(logInButtonLocator, Keys.ENTER);
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

		// waitForVisibilityOf(onlineAccLocator, Duration.ofSeconds(100));
		// explicitWait(driver, onlineAccLocator, 2).click();

		click(onlineAccLocator);
		// click(logInButtonLocator);

		log.info(onlineAccLocator + "  OLAO Button clicked 2 !");
	}

	// click ArabicSwitchButton
	public void clickToARSwitchButton() {
		waitForVisibilityOf(toArabic, Duration.ofSeconds(100));
		click(toArabic);
		log.info("To Arabic Switch button Clicked");

	}

	// click EnglishSwitchButton
	public void clicktoENSwitchButton() {
		waitForVisibilityOf(toEnglish, Duration.ofSeconds(100));
		click(toEnglish);
		log.info("To English Switch button Clicked");
	}

	/** Verification if logOutButton is visible on the page */
	public String getARText() {
		waitForVisibilityOf(welcomeHeader, Duration.ofSeconds(10));
		log.info("AR Switch button Value verificating....... ");
		return find(welcomeHeader).getText();
	}

	// click clickForgetPwButton
	public void clickForgetPwButton() {
		waitForVisibilityOf(forgetPwAndUn, Duration.ofSeconds(100));
		click(forgetPwAndUn);
		log.info("click on Forgrt Pw & UN Button ");

	}

	// click click registerLink
	public void clickRegistationLink() {
		waitForVisibilityOf(registerLink, Duration.ofSeconds(100));
		click(registerLink);
		log.info("click on registerLink Button ");

	}

	// click click PrivacyPolicyLink
	public void clickPrivacyPolicyLink() {
		waitForVisibilityOf(privacyPolicy, Duration.ofSeconds(100));
		click(privacyPolicy);
		log.info("click on PrivacyPolicyLink Button ");

	}

	// click click TermsConditionsLink
	public void clickTermsConditionsLink() {
		waitForVisibilityOf(termsConditions, Duration.ofSeconds(100));
		click(termsConditions);
		log.info("click on TermsConditionsLink Button ");

	}

	// click click VATRegistrationNumberLInk
		public void clickVATRegistrationNumberLInk() {
			waitForVisibilityOf(vATRegistrationNumber, Duration.ofSeconds(100));
			click(vATRegistrationNumber);
			log.info("click on VATRegistrationNumberLInk Button ");

		}

		// click click fAQ Link
		public void clickFAQLink() {
			waitForVisibilityOf(fAQ, Duration.ofSeconds(100));
			click(fAQ);
			log.info("click on fAQ Button ");

		}

		/** Get URL variable from PageObject */
		public String getPPUrl() {
			return pPUrl;
		}

		/** Get URL variable from PageObject */
		public String getTAndCUrl() {
			return tAndCUrl;
		}

		/** Get URL variable from PageObject */
		public String getVRNUrl() {
			return vRNUrl;
		}

		/** Get URL variable from PageObject */
		public String getfAQUrl() {

			return fAQUrl;
		}

		/** Find page with title "New Window" and switch to it */
		public PrivacyPolicyPage switchToPrivacyPolicy() {
			log.info("Looking for 'Edaa' page");
			switchToWindowWithTitle("New Window");
			return new PrivacyPolicyPage(driver, log);
		}

		/** Find page with title "New Window" and switch to it */
		public TermsAndConditionsPage switchToTermsAndConditionsPage() {
			log.info("Looking for 'Edaa' page");
			switchToWindowWithTitle("New Window");
			return new TermsAndConditionsPage(driver, log);
		}

		/** Find page with title "New Window" and switch to it */
		public VATRegistrationNumberPage switchToVATRegistrationNumberPage() {
			log.info("Looking for 'Edaa' page");
			switchToWindowWithTitle("New Window");
			return new VATRegistrationNumberPage(driver, log);
		}

		/** Find page with title "New Window" and switch to it */
		public FAQPage switchToFAQPage() {
			log.info("Looking for 'Edaa' page");
			switchToWindowWithTitle("New Window");
			return new FAQPage(driver, log);
		}
		

}