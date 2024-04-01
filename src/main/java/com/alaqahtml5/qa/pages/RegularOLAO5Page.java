package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegularOLAO5Page extends BasePageObject {

	private By tAndCBtn = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.overflow-hidden.float-left.full-width.font-l div.layout-container.full-width.pad-32-b:nth-child(2) div.layout-col-12.pad-12-r:nth-child(1) div.layout-container.full-width.full-height.border-all.pad-20-lr.pad-16-tb.app-back-color.l-border-radius div.layout-container.margin-auto.v-middle.full-height div.layout-col div.layout-container.margin-auto.v-middle.h-middle.img-circle.pad-8-all.highlight-back-color-3 > i.layout-col.icon-download.font-m-l.dark-bg-fore-color");

	private By cDBtn = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.overflow-hidden.float-left.full-width.font-l div.layout-container.full-width.pad-32-b:nth-child(2) div.layout-col-12.pad-12-l:nth-child(2) div.layout-container.full-width.full-height.border-all.pad-20-lr.pad-16-tb.app-back-color.l-border-radius div.layout-container.margin-auto.v-middle.full-height div.layout-col div.layout-container.margin-auto.v-middle.h-middle.img-circle.pad-8-all.highlight-back-color-3 > i.layout-col.icon-download.font-m-l.dark-bg-fore-color");
	private By cBox1 = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/input[1]");
	private By cBox2 = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/input[1]");
	private By conBtn = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/button[1]/div[1]/div[1]");

	public RegularOLAO5Page(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void downLoadPdf1() {
		waitForVisibilityOf(tAndCBtn, Duration.ofSeconds(100));
		click(tAndCBtn);

	}

	public void downLoadPdf2() {
		waitForVisibilityOf(cDBtn, Duration.ofSeconds(100));
		click(cDBtn);

	}
	public void checkOnCBox1() {
		waitForVisibilityOf(cBox1, Duration.ofSeconds(100));
		click(cBox1);

	}
	public void checkOnCBox2() {
		waitForVisibilityOf(cBox2, Duration.ofSeconds(100));
		click(cBox2);

	}

	public void clickCon() {
		waitForVisibilityOf(conBtn, Duration.ofSeconds(100));
		click(conBtn);

	}

}
