package com.alaqahtml5.qa.loginpagetests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.LoginPage;

public class NegativeLogInTests extends TestUtilities {

	@Test
	@Parameters({ "username", "password", "expectedMessage" })
	public void logInTest(String username, String password, String expectedErrorMessage) {
		log.info("Starting logIn test");

		// open main page
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();

		// Verifications
		// New page url is expected
		Assert.assertEquals(loginPage.getCurrentUrl(), loginPage.getPageUrl(),
				"not matching" + loginPage.getCurrentUrl() + "with" + loginPage.getPageUrl());

		loginPage.logIn(username, password);

		// wait for error message
		loginPage.waitForErrorMessage();
		String message = loginPage.getErrorMessageText();

		log.info("validation message : " + message);

		// Verification
		Assert.assertTrue(message.contains(expectedErrorMessage), "Message doesn't contain expected text.");

		// execute log in
		// SecureAreaPage secureAreaPage = loginPage.logIn("tomsmith",
		// "SuperSecretPassword!");

		// Verifications
		// New page url is expected
		// Assert.assertEquals(secureAreaPage.getCurrentUrl(),
		// secureAreaPage.getPageUrl());

		// log out button is visible
		// Assert.assertTrue(secureAreaPage.isLogOutButtonVisible(), "LogOut Button is
		// not visible.");

		// Successful log in message

		/*
		 * String expectedSuccessMessage = "You logged into a secure area!"; String
		 * actualSuccessMessage = loginPage.getSuccessMessageText();
		 * Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
		 * "actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
		 * + expectedSuccessMessage + "\nactualSuccessMessage: " +
		 * actualSuccessMessage);
		 */

	}
}