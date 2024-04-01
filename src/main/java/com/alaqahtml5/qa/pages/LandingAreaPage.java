package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingAreaPage extends BasePageObject {

	private By informationPopUpOkay = By.xpath("//div[contains(text(),'Okay')]");
	private By dfnLogo = By.id("appTitle");
	private By message = By.id("flash-messages");
	private By logOutBtn = By.cssSelector(".margin-auto.layout-container.font-5x-l.icon-logout-2");
	private By logOutBtnCon = By.cssSelector(
			".full-width.rounded-32.pad-18-tb.cursor-pointer.mgn-10-tb.dark-bg-fore-color.dark-blue-back-color.font-700");
	private By anbLogo = By.cssSelector(".left-nav-logo");
	private By informationPopUp = By.xpath("//div[contains(text(),'Information')]");
	private By globalSymbolSearch = By.xpath("//input[@id='appGlobalSymbolSearch']");
	private By userNameLabel = By.cssSelector(".fore-color.font-700.line-height-x-l.ellipsis");
	private By buyingPowerLabel = By.cssSelector("div[class='layout-container full-width pad-m-t'] div:nth-child(3)");
	private By dropDownSymbol = By.xpath("//body/div[@id='ember-app-root']/div[@id='ember352']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]");

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
		click(logOutBtnCon);
		log.info("Log Out Button clicked");

	}

	/*
	 * Click on Last Login Okay Button
	 */
	public void clickLoginInformationOkay() {
		click(informationPopUpOkay);
		log.info("Last Login Okay Button is button clicked");
	}

	/*
	 * Verification of ANB logo
	 */
	public void verifyDFNLogo() {
		waitForVisibilityOf(anbLogo, Duration.ofSeconds(10));
		log.info("Anb logo verified and pass");
	}

	// click on information popup ok button
	public String getInfiMsgText() {

		return find(informationPopUp).getText();
	}

	// send some value to global search fun
	public void setGlobalSearchVal() {
		waitForVisibilityOf(globalSymbolSearch, Duration.ofSeconds(10));
		click(globalSymbolSearch);
		type("1010", globalSymbolSearch);
	}

	public boolean checkSymbolInDropdown() {
		waitForVisibilityOf(dropDownSymbol, Duration.ofSeconds(10));
		log.info("dropDownSymbol is visibale");
		return find(dropDownSymbol).isDisplayed();

	}
}