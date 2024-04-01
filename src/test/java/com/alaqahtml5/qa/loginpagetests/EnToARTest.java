package com.alaqahtml5.qa.loginpagetests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.LoginPage;

public class EnToARTest extends TestUtilities {
	@Test(priority = 1)
	public void switchingToEnAR() {
		/**
		 * softAssert When an assertion fails, don't throw an exception but record the
		 * failure. Calling {@code
		 * assertAll()} will cause an exception to be thrown if at least one assertion
		 * failed.
		 */
		SoftAssert softAssert = new SoftAssert();

		/* Object of loginPage call and calling to there methods */
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();
		loginPage.clickToARSwitchButton();
		String aRText = loginPage.getARText();

		/*
		 * Logs a message with parameters at the {@link Level#INFO INFO} level.
		 *
		 * @param message the message to log; the format depends on the message factory.
		 */
		log.info("word is " + aRText);

		/* hard Assert */
		// Assert.assertTrue(aRText.contains("مرحبًا بعودتك1"), "Message doesn't contain
		// expected text.");

		softAssert.assertTrue(aRText.contains("مرحبًا بعودتك"), " Arabic Expected message is not there ");

		/* check line no 16 */
		softAssert.assertAll();

		loginPage.clicktoENSwitchButton();
	}
}
//LahiruH 15_02_2024

/* Verify the language change functionality is available and working properly */
