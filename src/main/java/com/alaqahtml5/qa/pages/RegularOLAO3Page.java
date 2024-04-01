package com.alaqahtml5.qa.pages;

import java.time.Duration;
import java.util.Random;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegularOLAO3Page extends BasePageObject {

	private By anbCANTBox = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]");

	private By ninIqaNumberBox = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/input[1]");

	private By continueBtn = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.pad-l-b.full-width div.layout-container.full-width div.layout-container.full-width.pad-18-t div.layout-col.h-right.pad-30-t > button.cursor-pointer.dark-bg-fore-color.dark-blue-back-color.pad-15-tb.rounded-32.border-none.pad-10-lr");

	public RegularOLAO3Page(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public long sendAnbCurrentAccountNumber(long low, long high) {

		Random r = new Random();

		long result = r.nextInt() + low;
		System.out.println(result);
		type(Long.toString(result), anbCANTBox);
		return result;

	}

	public long sendNicIqatAccountNumber(long low, long high) {

		Random r = new Random();

		long result = r.nextInt() + low;
		System.out.println("nextInt checke    :   " + result);
		type(Long.toString(result), ninIqaNumberBox);
		return result;

	}

	public void clickConBtn() {
		waitForVisibilityOf(continueBtn, Duration.ofSeconds(100));
		click(continueBtn);

	}

}
