package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftNavigationSlider extends BasePageObject {

	private By companyLogo = By.cssSelector(".left-nav-logo");
	private By notification = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-height.full-width.app-border.pos-abs:nth-child(1) div.pos-abs.full-height div.pos-rel.full-height div.layout-container.full-height.appmnu.border-right.pos-rel.z-index-100.navigator-max-width div.layout-row:nth-child(1) div.layout-col.v-top div.layout-container.margin-auto:nth-child(2) > div.layout-col.h-left.v-middle.pos-rel.pad-15-tb.pad-15-lr.cursor-pointer");
	private By home = By.cssSelector(".icon-home");
	private By search = By.cssSelector(".icon-search");
	private By orders = By.cssSelector(".icon-orders");
	private By alerts = By.cssSelector(".icon-bell");
	private By cashTrasfer = By.cssSelector(".icon-exchange");
	private By mutualFunds = By.cssSelector(".icon-exchange");
	private By margin = By.xpath("//div[@class='margin-auto layout-container icon-mutual-funds font-4x-l pad-2-l']");
	private By priceTradeStatus = By.cssSelector(".icon-connectivity");
	private By helpCenter = By.cssSelector(".layout-col > .icon-question");
	private By helpCenterClose = By.cssSelector(".cursor-pointer > .icon-fore-color");
	private By myProfile = By.cssSelector(".icon-profile");
	private By logOut = By.cssSelector(".icon-logout-2");

	public LeftNavigationSlider(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/*
	 * click on Company Logo button
	 */ public void clickCompanyLogo() {
		waitForVisibilityOf(companyLogo, Duration.ofSeconds(10));
		click(companyLogo);
		log.info("Company Logo button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickNotification() {
		waitForVisibilityOf(notification, Duration.ofSeconds(10));
		click(notification);
		log.info("Notification button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickhome() {
		waitForVisibilityOf(home, Duration.ofSeconds(10));
		click(home);
		log.info("Company Logo Button is button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickSearch() {
		waitForVisibilityOf(search, Duration.ofSeconds(10));
		click(search);
		log.info("Search button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickOrders() {
		waitForVisibilityOf(orders, Duration.ofSeconds(10));
		click(orders);
		log.info("Orders button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickAlerts() {
		waitForVisibilityOf(alerts, Duration.ofSeconds(10));
		click(alerts);
		log.info("Alerts button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickCashTrasfer() {

		waitForVisibilityOf(cashTrasfer, Duration.ofSeconds(10));
		click(cashTrasfer);
		log.info("CashTrasfer is button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickMargin() {

		waitForVisibilityOf(margin, Duration.ofSeconds(10));
		click(margin);
		log.info("margin button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickmutualFunds() {
		waitForVisibilityOf(mutualFunds, Duration.ofSeconds(10));
		click(mutualFunds);
		log.info("MutualFunds button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickpriceTradeStatus() {
		waitForVisibilityOf(priceTradeStatus, Duration.ofSeconds(10));
		click(priceTradeStatus);
		log.info("PriceTradeStatus button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickHelpCenter() {
		waitForVisibilityOf(helpCenter, Duration.ofSeconds(10));
		click(helpCenter);
		log.info("HelpCenter is button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickHelpCenterClose() {
		waitForVisibilityOf(helpCenterClose, Duration.ofSeconds(10));
		click(helpCenterClose);
		log.info("HelpCenter is button closed clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clickMyProfile() {
		waitForVisibilityOf(myProfile, Duration.ofSeconds(10));
		click(myProfile);
		log.info("MyProfile button is clicked");
	}

	/*
	 * click on Company Logo button
	 */ public void clicklogOut() {
		waitForVisibilityOf(logOut, Duration.ofSeconds(10));
		click(logOut);
		log.info("logOut button is clicked");
	}
}

//lahiruH 11_10_2023