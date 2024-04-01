package com.alaqahtml5.qa.loginpagetests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.LandingAreaPage;
import com.alaqahtml5.qa.pages.LoginPage;

public class AppTitleVerificationTest extends TestUtilities {

	@Test(priority = 1)
	@Parameters({ "username", "password" })
	public void apptitleVerification(String username, String password) {

		SoftAssert softAssert = new SoftAssert();
		log.info("Starting logIn test");

		// open main page
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();

		// Verifications
		// New page url is expected
		Assert.assertEquals(loginPage.getCurrentUrl(), loginPage.getPageUrl(),
				"not matching" + loginPage.getCurrentUrl() + "with" + loginPage.getPageUrl());

		// execute log in
		loginPage.logIn(username, password);

		// calling Landing page
		LandingAreaPage landingAriaPAge = new LandingAreaPage(driver, log);

		// click information Okay Button on landing page
		landingAriaPAge.clickLoginInformationOkay();

		// verify of DFNLOGO is displaying
		softAssert.assertTrue(landingAriaPAge.isDfnLogoButtonVisible(), "LogOut Button is not visible.");

		sleep(4000);

		landingAriaPAge.setGlobalSearchVal();

		// verify of logout button is displaying
		softAssert.assertTrue(landingAriaPAge.checkSymbolInDropdown(), "checkSymbolInDropdown is not visible.");

		//softAssert.assertAll();

	}
}
//LahiruH 15_02_2024
