package com.alaqahtml5.qa.loginpagetests;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.alaqahtml5.qa.base.CsvDataProviders;
import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.LoginPage;

public class LogInTestAll extends TestUtilities {


	@Test(priority = 1, dataProvider = "csvReader", dataProviderClass = CsvDataProviders.class)
	public void logInTestsAll(Map<String, String> testData) {

		SoftAssert softAssert = new SoftAssert();
		// Data
		String no = testData.get("no");
		String username  = testData.get("username");
		String password = testData.get("password");
		//String expectedErrorMessage = testData.get("expectedMessage");
		//String description = testData.get("description");

		log.info("Starting negativeLogInTest #" + no + " for " + username);



		// open main page
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();

		// Verifications
		// New page url is expected
		softAssert.assertEquals(loginPage.getCurrentUrl(), loginPage.getPageUrl(),
				"not matching" + loginPage.getCurrentUrl() + "with" + loginPage.getPageUrl());



		loginPage.logIn(username, password);

		// wait for error message
		loginPage.waitForErrorMessage();
		String message = loginPage.getErrorMessageText();

		log.info("validation message : " + message);

		// Verification
	//	Assert.assertTrue(message.contains(expectedErrorMessage), "Message doesn't contain expected text.");

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


//		 String expectedSuccessMessage = "You logged into a secure area!";
//		 String actualSuccessMessage = loginPage.getSuccessMessageText();
//		 Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
//		 "actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
//		 + expectedSuccessMessage + "\nactualSuccessMessage: " +
//		 actualSuccessMessage);


	}
}