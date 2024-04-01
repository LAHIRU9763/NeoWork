package com.alaqahtml5.qa.neowebtests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.LandingAreaPage;
import com.alaqahtml5.qa.pages.LeftNavigationSlider;
import com.alaqahtml5.qa.pages.LoginPage;

public class LeftNavigationTest extends TestUtilities {
	@Test(priority = 1)
	@Parameters({ "username", "password" })

	public void leftNavigationTest(String username, String password) {
		log.info("Starting logIn test");

		// open main page
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();

		// Verifications
		// New page url is expected
		Assert.assertEquals(loginPage.getCurrentUrl(), loginPage.getPageUrl(),
				"not matching" + loginPage.getCurrentUrl() + "with" + loginPage.getPageUrl());

		sleep(7000);
		// execute log in
		loginPage.logIn(username, password);

		// calling Landing page
		LandingAreaPage landingAriaPAge = new LandingAreaPage(driver, log);

		landingAriaPAge.clickLoginInformationOkay();

		sleep(7000);

		LeftNavigationSlider leftNavigationSlider = new LeftNavigationSlider(driver, log);
		leftNavigationSlider.clickCompanyLogo();
		leftNavigationSlider.clickNotification();
		leftNavigationSlider.clickhome();
		leftNavigationSlider.clickSearch();
		leftNavigationSlider.clickOrders();
		leftNavigationSlider.clickAlerts();
		leftNavigationSlider.clickCashTrasfer();
		leftNavigationSlider.clickMargin();
		leftNavigationSlider.clickmutualFunds();
		leftNavigationSlider.clickMyProfile();
		leftNavigationSlider.clickpriceTradeStatus();
		leftNavigationSlider.clickHelpCenter();
		leftNavigationSlider.clickHelpCenterClose();

		leftNavigationSlider.clicklogOut();

	}
}