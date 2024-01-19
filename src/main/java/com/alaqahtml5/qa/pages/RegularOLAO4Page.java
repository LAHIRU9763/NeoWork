package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegularOLAO4Page extends BasePageObject {

	private By pinBox1 = By.cssSelector("#otpPin1");

	private By pinBox2 = By.cssSelector("#otpPin2");

	private By pinBox3 = By.cssSelector("#otpPin3");

	private By pinBox4 = By.cssSelector("#otpPin4");

	private By clickCon = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.pad-l-b.full-width div.layout-container.full-width div.layout-container.full-width.pad-18-t div.layout-col.h-right.pad-30-t > button.cursor-pointer.dark-bg-fore-color.dark-blue-back-color.pad-15-tb.rounded-32.border-none.pad-10-lr");

	public RegularOLAO4Page(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void sendPinNum1() {
		waitForVisibilityOf(pinBox1, Duration.ofSeconds(100));
		type("2", pinBox1);

	}

	public void sendPinNum2() {
		waitForVisibilityOf(pinBox2, Duration.ofSeconds(100));
		type("5", pinBox2);

	}

	public void sendPinNum3() {
		waitForVisibilityOf(pinBox3, Duration.ofSeconds(100));
		type("2", pinBox3);

	}

	public void sendPinNum4() {
		waitForVisibilityOf(pinBox4, Duration.ofSeconds(100));
		type("2", pinBox4);

	}

	public void clickCon() {
		waitForVisibilityOf(clickCon, Duration.ofSeconds(100));
		click(clickCon);

	}
}
