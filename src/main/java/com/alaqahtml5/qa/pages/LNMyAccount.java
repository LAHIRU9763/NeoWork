package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LNMyAccount extends BasePageObject {

	/*
	 * private By mysubscriptions =
	 * By.xpath("//div[contains(text(),'My Subscriptions')]"); private By
	 * rightssubscription =
	 * By.xpath("//div[contains(text(),'Rights Subscription')]"); private By
	 * investmentaccounts =
	 * By.xpath("//div[contains(text(),'Investment Accounts')]"); private By
	 * bankaccounts = By.xpath("//div[contains(text(),'Bank Accounts')]"); private
	 * By updateKYC = By.xpath("//div[contains(text(),'Update KYC')]"); private By
	 * userprofile = By.xpath("//div[contains(text(),'User Profile')]"); private By
	 * singlesignon = By.xpath("//div[contains(text(),'Single Sign On')]"); private
	 * By tadawulaty = By.xpath("//div[contains(text(),'Tadawulaty')]"); private By
	 * stockstatement = By.xpath("//div[contains(text(),'Stock Statement')]");
	 * private By cashstatements =
	 * By.xpath("//div[contains(text(),'Cash Statements')]"); private By
	 * annualstatement = By.xpath("//div[contains(text(),'Annual Statement')]");
	 * private By vatinvoice = By.xpath("//div[contains(text(),'VAT Invoices')]");
	 * private By appsettings = By.xpath("//div[contains(text(),'App Settings')]");
	 * private By changepassword =
	 * By.xpath("//div[contains(text(),'Change Password')]"); private By
	 * closeyouraccount = By.xpath("//div[contains(text(),'Close your account')]");
	 */

	private By mysubscriptions = By.cssSelector(".mgn-6-b:nth-child(1) .pad-16-l");
	private By rightssubscription = By.cssSelector(".mgn-6-b:nth-child(2) .pad-16-l");
	private By investmentaccounts = By.cssSelector(".mgn-6-b:nth-child(3) .pad-16-l");
	private By bankaccounts = By.cssSelector(".mgn-6-b:nth-child(4) .pad-16-l");
	private By updateKYC = By.cssSelector(".mgn-6-b:nth-child(5) .pad-16-l");
	private By userprofile = By.cssSelector(".font-x-l:nth-child(7)");
	private By singlesignon = By.cssSelector(".layout-container:nth-child(8)");
	private By tadawulaty = By.cssSelector(".font-x-l:nth-child(9)");
	private By stockstatement = By.cssSelector(".layout-container:nth-child(10)");
	private By cashstatements = By.cssSelector(".layout-container:nth-child(11)");
	private By annualstatement = By.cssSelector(".layout-container:nth-child(12)");
	private By vatinvoice = By.cssSelector(".layout-container:nth-child(13)");
	private By appsettings = By.cssSelector(".layout-container:nth-child(14)");
	private By changepassword = By.cssSelector(".layout-container:nth-child(15)");
	private By closeyouraccount = By.cssSelector(".layout-container:nth-child(16)");

	public LNMyAccount(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void clickMysubscriptions() {
		waitForVisibilityOf(mysubscriptions, Duration.ofSeconds(10));
		click(mysubscriptions);
		log.info("Mysubscriptions Button clicked");

	}

	public void clickRightssubscription() {
		waitForVisibilityOf(rightssubscription, Duration.ofSeconds(10));
		click(rightssubscription);

	}

	public void clickInvestmentaccounts() {
		waitForVisibilityOf(investmentaccounts, Duration.ofSeconds(10));
		click(investmentaccounts);

	}

	public void clickBankaccounts() {
		waitForVisibilityOf(bankaccounts, Duration.ofSeconds(10));
		click(bankaccounts);

	}

	public void clickUpdateKYC() {
		waitForVisibilityOf(updateKYC, Duration.ofSeconds(10));
		click(updateKYC);

	}

	public void clickUserprofile() {
		waitForVisibilityOf(userprofile, Duration.ofSeconds(10));
		click(userprofile);

	}

	public void clickSinglesignon() {
		waitForVisibilityOf(singlesignon, Duration.ofSeconds(10));
		click(singlesignon);

	}

	public void clickTadawulaty() {
		waitForVisibilityOf(tadawulaty, Duration.ofSeconds(10));
		click(tadawulaty);

	}

	/** Find page with title "New Window" and switch to it */
	public TadawulatyPage switchToNewWindowPage() {
		log.info("Looking for 'Edaa' page");
		switchToWindowWithTitle("New Window");
		return new TadawulatyPage(driver, log);
	}

	public void clickStockstatement() {
		waitForVisibilityOf(stockstatement, Duration.ofSeconds(10));
		click(stockstatement);

	}

	public void clickCashstatements() {
		waitForVisibilityOf(cashstatements, Duration.ofSeconds(10));
		click(cashstatements);

	}

	public void clickAnnualstatement() {
		waitForVisibilityOf(annualstatement, Duration.ofSeconds(10));
		click(annualstatement);

	}

	public void clickVatinvoice() {
		waitForVisibilityOf(vatinvoice, Duration.ofSeconds(10));
		click(vatinvoice);

	}

	public void clickAppsettings() {
		waitForVisibilityOf(appsettings, Duration.ofSeconds(10));
		click(appsettings);

	}

	public void clickChangepassword() {
		waitForVisibilityOf(changepassword, Duration.ofSeconds(10));
		click(changepassword);

	}

	public void clickCloseyouraccount() {
		waitForVisibilityOf(closeyouraccount, Duration.ofSeconds(10));
		click(closeyouraccount);

	}
}
