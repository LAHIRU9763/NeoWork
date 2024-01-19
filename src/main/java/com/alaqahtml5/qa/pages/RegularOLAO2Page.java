package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegularOLAO2Page extends BasePageObject {

//	private By disagree = By.cssSelector(
//			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.container-back-color div.layout-col-1:nth-child(1) div.layout-container.full-width.full-height div.layout-row:nth-child(2) div.layout-col-1 div.layout-container.full-width div.layout-col-1 div.layout-container.margin-auto div.layout-container.full-width:nth-child(4) div.layout-container.full-width.pad-15-b:nth-child(3) div.layout-col-12.h-middle.pad-s-r:nth-child(1) > button.layout-container.full-width.cursor-pointer.dark-bg-fore-color.dark-blue-back-color.pad-15-tb.rounded-32.border-none.pad-10-lr.olao-disable-btn.font-700");
	private By olaoAgreemnetCkBox = By.name("cc");
//	private By okPopUp = By.cssSelector(
//			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div:nth-child(2) div.ember-view:nth-child(12) div.message-box-frame.pad-12-tb.pad-18-lr.message-box-width div.message-box-button-area.full-width > div.full-width.rounded-32.pad-18-tb.cursor-pointer.mgn-10-tb.dark-bg-fore-color.dark-blue-back-color.font-700");
	private By agreeBtn = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.container-back-color div.layout-col-1:nth-child(1) div.layout-container.full-width.full-height div.layout-row:nth-child(2) div.layout-col-1 div.layout-container.full-width div.layout-col-1 div.layout-container.margin-auto div.layout-container.full-width:nth-child(4) div.layout-container.full-width.pad-15-b:nth-child(3) div.layout-col-12.h-middle.pad-s-l:nth-child(2) > button.layout-container.full-width.cursor-pointer.dark-bg-fore-color.dark-blue-back-color.pad-15-tb.rounded-32.border-none.pad-10-lr.font-700");

	public RegularOLAO2Page(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void olaoAgreemnetCheckBox() {

		System.out.println("OLAO2");
		waitForVisibilityOf(olaoAgreemnetCkBox, Duration.ofSeconds(100));

		// click(disagree);
		// click(okPopUp);

		click(olaoAgreemnetCkBox);
	}

	public void clickAgree() {

		click(agreeBtn);

	}

}
