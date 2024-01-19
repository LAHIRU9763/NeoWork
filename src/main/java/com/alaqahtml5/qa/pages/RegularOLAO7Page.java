package com.alaqahtml5.qa.pages;

import java.time.Duration;
import java.util.Random;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegularOLAO7Page extends BasePageObject {

	private By uNSuffixes = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
	private By pswdTextBox = By.cssSelector("#passwordId");
	private By conButton = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.overflow-hidden.float-left.full-width:nth-child(2) div.ember-view div.full-width.full-height.layout-container div.layout-row:nth-child(2) div.layout-container.full-width.pad-l-tb > button.border-none.form-btn.font-x-m.font-700.full-width.letter-space-xxl.submit-btn-disable");
	private By backToLogin = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div:nth-child(2) div.ember-view:nth-child(12) div.message-box-frame.pad-12-tb.pad-18-lr.message-box-width div.message-box-button-area.full-width > div.full-width.rounded-32.pad-18-tb.cursor-pointer.mgn-10-tb.dark-bg-fore-color.dark-blue-back-color.font-700");

	// .full-width.rounded-32.pad-18-tb.cursor-pointer.mgn-10-tb.dark-bg-fore-color.dark-blue-back-color.font-700
	// body.overflow-hidden.theme2:nth-child(2)
	// div.visibility-hidden.ember-application:nth-child(2)
	// div.ember-view:nth-child(8) div:nth-child(2) div.ember-view:nth-child(12)
	// div.message-box-frame.pad-12-tb.pad-18-lr.message-box-width
	// div.message-box-button-area.full-width >
	// div.full-width.rounded-32.pad-18-tb.cursor-pointer.mgn-10-tb.dark-bg-fore-color.dark-blue-back-color.font-700

	// class="border-none form-btn font-x-m font-700 full-width letter-space-xxl
	// submit-btn-disable"
	private By rTypePwTextBox = By.cssSelector("#retypePasswordId");

	public RegularOLAO7Page(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public long sendOLAOUsername(long low, long high) {

		Random r = new Random();

		long result = Math.abs(r.nextInt()) + low;
		System.out.println(result);
		type("LA" + Long.toString(result), uNSuffixes);
		return result;

	}

	public void enterPw() {
		waitForVisibilityOf(pswdTextBox, Duration.ofSeconds(100));
		type("Mahiru100#T", pswdTextBox);
		type("Mahiru100#T", rTypePwTextBox);

	}

	public void clickContinue() {
		waitForVisibilityOf(conButton, Duration.ofSeconds(100));
		click(conButton);
	}

	public void clickBackToLogin() {
		waitForVisibilityOf(backToLogin, Duration.ofSeconds(100));
		click(backToLogin);
	}

}
