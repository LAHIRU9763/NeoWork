package com.alaqahtml5.qa.loginpagetests;

import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.LandingAreaPage;
import com.alaqahtml5.qa.pages.LoginPage;

public class SimpleLoginTest extends TestUtilities {

	@Test(priority = 1)
	@Parameters({ "username", "password" })
	public void simpleLoginTest(Map<String, String> testData) {

		String no = testData.get("no");
		String username = testData.get("username");
		String password = testData.get("password");

		SoftAssert softAssert = new SoftAssert();

		// open main page
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();
		takeScreenshot("LoginPage opened");


		log.info("Starting negativeLogInTest #" + no + " for " + username);


		// verification whether New page URL is expected
		softAssert.assertEquals(loginPage.getCurrentUrl(), loginPage.getPageUrl(),
				"not matching" + loginPage.getCurrentUrl() + "with" + loginPage.getPageUrl());

		loginPage.logIn(username, password);

		// wait for login message
		loginPage.waitForErrorMessage();
		String message = loginPage.getErrorMessageText();

		log.info("beofre login validation message : " + message);

		takeScreenshot("Validation message");

		sleep(8000);

		// landing page information message verification
		LandingAreaPage landingpage = new LandingAreaPage(driver, log);
		String expectedInformationMessage = "Information";
		String actualSuccessMessage = landingpage.getInfiMsgText();
		softAssert.assertTrue(actualSuccessMessage.contains(expectedInformationMessage),
				"actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
						+ expectedInformationMessage + "\nactualSuccessMessage: " + actualSuccessMessage);

		takeScreenshot("Landing page");

	}

}


//lahruH 22/1/2024