package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegularOLAO6Page extends BasePageObject {

	private By cOBDropDown = By.xpath(
			"//body/div[@id='ember-app-root']/div[@id='ember352']/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]");

	private By dropDownSA = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.ember-view div.modal-popup-frame.modal-popup-symbol-search.popup-animation div.dropdown-menu-height.dropdown-mode-full.container-back-color.border-all.rounded-8.shadow.kyc-dropdown-filter-width-mobile div.y-scroll.full-width div.layout-container.full-width.cursor-pointer.dropdown-option.line-height-x-l:nth-child(1) div.layout-col-24.ellipsis > div.ellipsis");
	private By nODTextBox = By.id("nod");
	private By doeTextBox = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
	private By positionTextBox = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.margin-auto div.full-width.full-height.layout-container.app-back-color.flex.justify-center div.border-none.oao-parent-container.online-acc-opening.pad-25-lr.app-back-color.y-scroll div.nano.has-scrollbar div.widget-container-new.full-height-without-header.full-width.nano-content.border-none div.layout-container.full-width:nth-child(2) div.layout-row div.layout-col-24.v-top.overflow-visible div.layout-container.full-width.deviated-layout.pad-m-r.pad-m-b:nth-child(3) > div.layout-container.full-width.pad-m-b.font-l.h-left:nth-child(2)");
	private By positionTextBoxSelection = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
//Financial Information

	private By aNWTextBox = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)");
	private By aNWTextBoxSelection = By
			.cssSelector("div[class='y-scroll full-width'] div:nth-child(1) div:nth-child(1) div:nth-child(1)");
	private By haveYouWorkedTextBox = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)");
	private By haveYouWorkedeSelection = By
			.cssSelector("div[class='layout-container full-width cursor-pointer dropdown-option line-height-x-l ']");
	private By practicalExperienceTextBox = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)");

	private By practicalExperienceTextBoxselection = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)");

	private By mIRMTextBox = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)");
	private By mIRMTextBoxselection = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/label[1]/div[1]/input[1]");

	private By mIRMTextBoxSave = By.xpath("//button[contains(text(),'Save')]");

	private By sOWTextBox = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.margin-auto div.full-width.full-height.layout-container.app-back-color.flex.justify-center div.border-none.oao-parent-container.online-acc-opening.pad-25-lr.app-back-color.y-scroll div.nano.has-scrollbar div.widget-container-new.full-height-without-header.full-width.nano-content.border-none div.layout-container.full-width:nth-child(2) div.layout-row:nth-child(2) div.layout-col-24.v-top.overflow-visible div.layout-container.full-width.pad-m-b.pad-l-l:nth-child(2) div.layout-col-12.dropdown.overflow-visible:nth-child(2) > button.layout-inline.btn.btn-dropdown.btn-default.full-width.ellipsis.h-left.fore-color.dropdown-solid-back-color.search-query");

	private By sOWTextBoxSelection = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/label[1]/div[1]/input[1]");

	private By sOWTextBoxSave = By.xpath("//button[contains(text(),'Save')]");

	private By aIRMTextBox = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.margin-auto div.full-width.full-height.layout-container.app-back-color.flex.justify-center div.border-none.oao-parent-container.online-acc-opening.pad-25-lr.app-back-color.y-scroll div.nano.has-scrollbar div.widget-container-new.full-height-without-header.full-width.nano-content.border-none div.layout-container.full-width:nth-child(2) div.layout-row:nth-child(2) div.layout-col-24.v-top.overflow-visible div.layout-container.full-width.pad-m-b.pad-l-l:nth-child(4) div.layout-col-12.dropdown.overflow-visible:nth-child(2) > button.layout-inline.btn.btn-dropdown.btn-default.full-width.ellipsis.h-left.fore-color.dropdown-solid-back-color.search-query");

	private By aIRMTextBoxSelection = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/label[1]/div[1]/input[1]");

	private By aIRMTextBoxSave = By.xpath("//button[contains(text(),'Save')]");

	private By anyBusinessActivityOutsideKTextBox = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.margin-auto div.full-width.full-height.layout-container.app-back-color.flex.justify-center div.border-none.oao-parent-container.online-acc-opening.pad-25-lr.app-back-color.y-scroll div.nano.has-scrollbar div.widget-container-new.full-height-without-header.full-width.nano-content.border-none div.layout-container.full-width:nth-child(3) div.layout-row:nth-child(2) div.layout-col-24.v-top.overflow-visible div.layout-container.full-width:nth-child(1) div.layout-container.full-width.pad-m-b div.layout-container.full-width.pad-m-b.font-l.h-left:nth-child(2) div:nth-child(1) div.ember-view div.dropdown.btn-animation > button.btn.btn-dropdown.fore-color.dropdown-solid-back-color.search-query.line-height-l");

	private By anyBusinessActivityOutsideKTextBoxSelection = By
			.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]");

	private By cAddress3YTextBox = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.margin-auto div.full-width.full-height.layout-container.app-back-color.flex.justify-center div.border-none.oao-parent-container.online-acc-opening.pad-25-lr.app-back-color.y-scroll div.nano.has-scrollbar div.widget-container-new.full-height-without-header.full-width.nano-content.border-none div.layout-container.full-width:nth-child(3) div.layout-row:nth-child(2) div.layout-col-24.v-top.overflow-visible div.layout-container.full-width:nth-child(10) div.layout-container.full-width.pad-m-b div.layout-container.full-width.pad-m-b.font-l.h-left:nth-child(2) div:nth-child(1) div.ember-view div.dropdown.btn-animation > button.btn.btn-dropdown.fore-color.dropdown-solid-back-color.search-query.line-height-l");

	private By cAddress3YTextBoxSelection = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.ember-view div.modal-popup-frame.modal-popup-symbol-search.popup-animation div.dropdown-menu-height.dropdown-mode-full.container-back-color.border-all.rounded-8.shadow.kyc-dropdown-filter-width-mobile div.y-scroll.full-width div.layout-container.full-width.cursor-pointer.dropdown-option.line-height-x-l:nth-child(2) div.layout-col-24.ellipsis > div.ellipsis");

	// Investment Information

	private By iKAExpTextBox = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)");

	private By iKAExpTextBoxSelection = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");

	private By rATextBox = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2)");

	private By rATextBoxSelection = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");

	private By gIOTextBox = By.cssSelector(".layout-container.full-width.pad-m-b.dropdown.overflow-visible");
	private By gIOTextBoxSelection = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/label[1]/div[1]/input[1]");

	private By gIOTextBoxSave = By.xpath("//button[contains(text(),'Save')]");

	private By cashOutTextBox = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.margin-auto div.full-width.full-height.layout-container.app-back-color.flex.justify-center div.border-none.oao-parent-container.online-acc-opening.pad-25-lr.app-back-color.y-scroll div.nano.has-scrollbar div.widget-container-new.full-height-without-header.full-width.nano-content.border-none div.layout-container.full-width:nth-child(2) div.layout-row:nth-child(2) div.layout-col-24.v-top.overflow-visible div.layout-container.full-width:nth-child(1) div.layout-container.full-width.pad-m-b div.layout-container.full-width.pad-m-b.font-l.h-left:nth-child(2) div:nth-child(1) div.ember-view div.dropdown.btn-animation > button.btn.btn-dropdown.fore-color.dropdown-solid-back-color.search-query.line-height-l");

	private By cashOutTextBoxSelection = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.ember-view div.modal-popup-frame.modal-popup-symbol-search.popup-animation div.dropdown-menu-height.dropdown-mode-full.container-back-color.border-all.rounded-8.shadow.kyc-dropdown-filter-width-mobile div.y-scroll.full-width > div.layout-container.full-width.cursor-pointer.dropdown-option.line-height-x-l:nth-child(1)");

	// Additional Information

	private By professionalCertificatesTextBox = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[4]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");

	private By lonTpInvestTextBox = By.cssSelector("#loanInvRatio");

	private By marginTrasTextBox = By.cssSelector("#marginTrans");

	// Client Investment Portfolio Profile

	private By cIPTextBox = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[9]/div[1]/div[3]/input[1]");

	private By yIPTextBox = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[9]/div[1]/div[5]/input[1]");

	// FATCA Form Details

	private By tRBox = By.xpath(
			"//body/div[@id='ember-app-root']/div[@id='ember352']/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]");

	private By tRBoxSelection = By
			.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]");

	private By immigrantVisatextBox = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]");

	private By immigrantVisatextBoxSelection = By
			.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]");

	private By uSPersonTextBox = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]");

	private By uSPersonTextBoxSelection = By
			.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]");
	private By clickCreateBtn = By.cssSelector(
			"body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.margin-auto div.full-width.full-height.layout-container.app-back-color.flex.justify-center div.border-none.oao-parent-container.online-acc-opening.pad-25-lr.app-back-color.y-scroll div.nano.has-scrollbar div.widget-container-new.full-height-without-header.full-width.nano-content.border-none div.layout-container.full-width.pad-m-tb:nth-child(9) div.layout-container.full-width div.layout-col.h-right:nth-child(2) > button.cursor-pointer.dark-bg-fore-color.dark-blue-back-color.pad-15-tb.rounded-32.border-none\r\n");

	public RegularOLAO6Page(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void selectCOB() {
		waitForVisibilityOf(cOBDropDown, Duration.ofSeconds(100));
		click(cOBDropDown);
		click(dropDownSA);

	}

	public void typeNOD() {
		waitForVisibilityOf(nODTextBox, Duration.ofSeconds(100));
		type("2", nODTextBox);

	}

	public void typeDOE() {
		waitForVisibilityOf(doeTextBox, Duration.ofSeconds(100));
		scrollToBottom(doeTextBox);
		type("10-05-2023", doeTextBox);

	}

	public void selectPosition() {
		waitForVisibilityOf(positionTextBox, Duration.ofSeconds(100));
		scrollToBottom(positionTextBox);
		click(positionTextBox);
		click(positionTextBoxSelection);

	}

	public void selectANWTextBox() {
		waitForVisibilityOf(aNWTextBox, Duration.ofSeconds(100));
		scrollToBottom(aNWTextBox);
		click(aNWTextBox);
		click(aNWTextBoxSelection);

	}

	public void selectHaveYouWorkedTextBox() {
		waitForVisibilityOf(haveYouWorkedTextBox, Duration.ofSeconds(100));
		scrollToBottom(haveYouWorkedTextBox);
		click(haveYouWorkedTextBox);
		click(haveYouWorkedeSelection);

	}

	public void selectPracticalExperienceTextBox() {
		waitForVisibilityOf(practicalExperienceTextBox, Duration.ofSeconds(100));
		scrollToBottom(practicalExperienceTextBox);
		click(practicalExperienceTextBox);
		click(practicalExperienceTextBoxselection);

	}

	public void selectMIRMTextBox() {
		waitForVisibilityOf(mIRMTextBox, Duration.ofSeconds(100));
		scrollToBottom(mIRMTextBox);
		click(mIRMTextBox);
		click(mIRMTextBoxselection);
		click(mIRMTextBoxSave);

	}

	public void selectSOWTextBox() {
		waitForVisibilityOf(sOWTextBox, Duration.ofSeconds(100));
		scrollToBottom(sOWTextBox);
		click(sOWTextBox);
		click(sOWTextBoxSelection);
		click(sOWTextBoxSave);

	}

	public void selectaIRMTextBox() {
		waitForVisibilityOf(aIRMTextBox, Duration.ofSeconds(100));
		scrollToBottom(aIRMTextBox);
		click(aIRMTextBox);
		click(aIRMTextBoxSelection);
		click(aIRMTextBoxSave);

	}

	public void selectAnyBusinessActivityOutsideKTextBox() {
		waitForVisibilityOf(anyBusinessActivityOutsideKTextBox, Duration.ofSeconds(100));
		scrollToBottom(anyBusinessActivityOutsideKTextBox);
		click(anyBusinessActivityOutsideKTextBox);
		click(anyBusinessActivityOutsideKTextBoxSelection);

	}

	public void selectcAddress3YTextBox() {
		waitForVisibilityOf(cAddress3YTextBox, Duration.ofSeconds(100));
		scrollToBottom(cAddress3YTextBox);
		click(cAddress3YTextBox);
		click(cAddress3YTextBoxSelection);

	}

	public void selectIKAExpTextBox() {
		waitForVisibilityOf(iKAExpTextBox, Duration.ofSeconds(100));
		scrollToBottom(iKAExpTextBox);
		click(iKAExpTextBox);
		click(iKAExpTextBoxSelection);

	}

	public void selectRATextBox() {
		waitForVisibilityOf(rATextBox, Duration.ofSeconds(100));
		scrollToBottom(rATextBox);
		click(rATextBox);
		click(rATextBoxSelection);

	}

	public void selectGIOTextBox() {
		waitForVisibilityOf(gIOTextBox, Duration.ofSeconds(100));
		scrollToBottom(gIOTextBox);
		click(gIOTextBox);
		click(gIOTextBoxSelection);
		click(gIOTextBoxSave);

	}

	public void selectCashOutTextBox() {
		waitForVisibilityOf(cashOutTextBox, Duration.ofSeconds(100));
		scrollToBottom(cashOutTextBox);
		click(cashOutTextBox);
		click(cashOutTextBoxSelection);

	}

	public void typeToProfessionalCertificatesTextBox() {
		waitForVisibilityOf(professionalCertificatesTextBox, Duration.ofSeconds(100));
		scrollToBottom(professionalCertificatesTextBox);
		type("CPA", professionalCertificatesTextBox);

	}

	public void typeloanTOInvestTextBox() {
		waitForVisibilityOf(lonTpInvestTextBox, Duration.ofSeconds(100));
		scrollToBottom(lonTpInvestTextBox);
		type("2", lonTpInvestTextBox);

	}

	public void typeMarginTrasTextBox() {
		waitForVisibilityOf(marginTrasTextBox, Duration.ofSeconds(100));
		scrollToBottom(marginTrasTextBox);
		type("25222", marginTrasTextBox);

	}

	public void typeToIPP1_2() {
		waitForVisibilityOf(cIPTextBox, Duration.ofSeconds(100));
		scrollToBottom(cIPTextBox);
		type("105", cIPTextBox);
		type("105", yIPTextBox);

	}

	public void selectTRTextBox() {
		waitForVisibilityOf(tRBox, Duration.ofSeconds(100));
		scrollToBottom(tRBox);
		click(tRBox);
		click(tRBoxSelection);

	}

	public void selectImmigrantVisatextBox() {
		waitForVisibilityOf(immigrantVisatextBox, Duration.ofSeconds(100));
		scrollToBottom(immigrantVisatextBox);
		click(immigrantVisatextBox);
		click(immigrantVisatextBoxSelection);

	}

	public void selectUsPersonSelection() {
		waitForVisibilityOf(uSPersonTextBox, Duration.ofSeconds(100));
		scrollToBottom(uSPersonTextBox);
		click(uSPersonTextBox);
		click(uSPersonTextBoxSelection);

	}

	public void clickCreate() {
		waitForVisibilityOf(clickCreateBtn, Duration.ofSeconds(100));
		scrollToBottom(clickCreateBtn);
		click(clickCreateBtn);
		// click(uSPersonTextBoxSelection);

	}
	

	/** Perform scroll to the bottom */
//	public void scrollToBottom() {
//		By conBtn = By.cssSelector("body.overflow-hidden.theme2:nth-child(2) div.visibility-hidden.ember-application:nth-child(2) div.ember-view:nth-child(8) div.full-screen-container:nth-child(7) div.col-xs-12.full-height.online-acc-opening.z-index-100 div.layout-container.full-height.full-width.app-back-color div.layout-col-14.container-fade-back-color.full-height div.layout-container.margin-auto:nth-child(2) div.layout-container.full-width.margin-auto.full-height div.layout-container.full-width.full-height div.layout-container.margin-auto div.full-width.full-height.layout-container.app-back-color.flex.justify-center div.border-none.oao-parent-container.online-acc-opening.pad-25-lr.app-back-color.y-scroll div.nano.has-scrollbar div.widget-container-new.full-height-without-header.full-width.nano-content.border-none div.layout-container.full-width.pad-m-tb:nth-child(9) div.layout-container.full-width div.layout-col.h-right:nth-child(2) button.cursor-pointer.dark-bg-fore-color.dark-blue-back-color.pad-15-tb.rounded-32.border-none div.layout-container.full-height.margin-auto.pad-3-t > div.layout-col.pad-3-b.pad-10-r:nth-child(1)");
//
//		WebElement Element = driver.findElement(conBtn);
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", Element);
//		//jsExecutor.executeScript("window.scrollBy(0, -190);");
//	}

}
