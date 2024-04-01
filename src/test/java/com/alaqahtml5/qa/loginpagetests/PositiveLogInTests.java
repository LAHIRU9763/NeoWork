package com.alaqahtml5.qa.loginpagetests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.LandingAreaPage;
import com.alaqahtml5.qa.pages.LoginPage;

/*Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.*/
public class PositiveLogInTests extends TestUtilities {

	@Test(priority = 1)
	@Parameters({ "username", "password" })

	public void logInTest(String username, String password) {
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

		// verify of logout button is displaying
		Assert.assertTrue(landingAriaPAge.isDfnLogoButtonVisible(), "LogOut Button is not visible.");

	}
}

//lahiruH 24/01/2024