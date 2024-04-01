package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegularOLAO1Page extends BasePageObject {

	private By anbCliectBtn = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.container-back-color div.layout-col-1:nth-child(1) div.layout-container.full-width.full-height div.layout-row:nth-child(2) div.layout-col-1 div.layout-container.full-width div.layout-col-1 div.layout-container.full-width div.layout-container.full-width.margin-auto div.layout-container.full-width.oao-parent-container:nth-child(4) div.layout-container.v-top.pad-24-t.cursor-pointer.full-width:nth-child(1) > div.layout-container.full-width.pad-20-lr.pad-16-tb.sign-up-options.app-back-color.l-border-radius.border-all.sign-up-options-border-all");

	private By backButton = By.xpath(
			"//a[@class='layout-col h-left font-xx-l line-height-3x-l fade-fore-color-3']");

	private By chooseTheSignupMethodLable = By.xpath("//div[@class='layout-container fore-color font-6x-l line-height-7x-l']");



	public RegularOLAO1Page(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/* click ANB client button */
	public void clickAnbClientBtn() {
		waitForVisibilityOf(anbCliectBtn, Duration.ofSeconds(100));
		click(anbCliectBtn);
	}

	/* click back button */
	public void clickbackButton() {
		waitForVisibilityOf(backButton, Duration.ofSeconds(100));
		click(backButton);
	}

	/* get Choose The Signup Method Label method */
	public String getChooseTheSignupMethodLable() {
		waitForVisibilityOf(chooseTheSignupMethodLable, Duration.ofSeconds(100));
		return find(chooseTheSignupMethodLable).getText();

	}


}
