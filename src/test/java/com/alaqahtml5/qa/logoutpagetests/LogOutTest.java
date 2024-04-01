package com.alaqahtml5.qa.logoutpagetests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.LandingAreaPage;
import com.alaqahtml5.qa.pages.LoginPage;

public class LogOutTest extends TestUtilities {

	@Test(priority = 1)
	@Parameters({ "username", "password" })

	public void logOutFromHtml5(String username, String password) {
		SoftAssert softAssert = new SoftAssert();
		log.info("Starting logIn test");

		// open main page
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();

		// Verifications
		// New page url is expected
		softAssert.assertEquals(loginPage.getCurrentUrl(), loginPage.getPageUrl(),
				"not matching" + loginPage.getCurrentUrl() + "with" + loginPage.getPageUrl());

		// execute log in
		loginPage.logIn(username, password);
		// calling Landing page
		LandingAreaPage landingAriaPAge = new LandingAreaPage(driver, log);

		// click information Okay Button on landing page
		landingAriaPAge.clickLoginInformationOkay();
	
		 
		// verify of logout button is displaying
		softAssert.assertTrue(landingAriaPAge.isDfnLogoButtonVisible(), "LogOut Button is not visible.");

		// Click on logout Button 
		landingAriaPAge.clickLogoutBtn();
		
	

	}
}


//lahiruH 24/01/2024