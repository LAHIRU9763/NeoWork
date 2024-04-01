package com.alaqahtml5.qa.loginpagetests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.FAQPage;
import com.alaqahtml5.qa.pages.ForgerPwPage;
import com.alaqahtml5.qa.pages.LoginPage;
import com.alaqahtml5.qa.pages.PrivacyPolicyPage;
import com.alaqahtml5.qa.pages.RegistationPage;
import com.alaqahtml5.qa.pages.RegularOLAO1Page;
import com.alaqahtml5.qa.pages.TermsAndConditionsPage;
import com.alaqahtml5.qa.pages.VATRegistrationNumberPage;

public class AllLinksLoginPageTest extends TestUtilities {
	@Test(priority = 1)
	public void clickOnAllLinks() {
		SoftAssert softAssert = new SoftAssert();
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();

		sleep(10000);
		log.info(" waiting 7000mSEC");
		loginPage.clickForgetPwButton();

		log.info(" waiting..... 7000mSEC");

		/* forgetPwPage call Object */

		ForgerPwPage forgetPwPage = new ForgerPwPage(driver, log);
		String getYourDetalsLableVal = forgetPwPage.getYourDetailsLable();
		// forgetPwPage.getYourDetailsLable();
		softAssert.assertTrue(getYourDetalsLableVal.contains("Your Details"), " <Your Details> lable is not here");

		forgetPwPage.clickBackButton();

		loginPage.clickRegistationLink();

		/* registationPage call Object */

		RegistationPage registationPage = new RegistationPage(driver, log);
		String letsGetYOuLableLableVal = registationPage.letsGetYOuLableLable();
		softAssert.assertTrue(letsGetYOuLableLableVal.contains("Let’s get you started"),
				" <Let’s get you started> lable is not here");

		registationPage.clickLoginLink();

		loginPage.clickOpenAccount();

		/* RegularOLAO1Page call Object */

		RegularOLAO1Page regularOLAO1Page = new RegularOLAO1Page(driver, log);
		String ChooseTheSignupMethodLableVal = regularOLAO1Page.getChooseTheSignupMethodLable();
		softAssert.assertTrue(ChooseTheSignupMethodLableVal.contains("Choose the signup method."),
				" <Your Details> lable is not here");

		regularOLAO1Page.clickbackButton();
		loginPage.clickPrivacyPolicyLink();
		PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(driver, log);

		// TadawulatyPage newWindowPage = lNMyAccount.switchToNewWindowPage();

		String privacyPolicypageSource = privacyPolicyPage.getCurrentPageSource();

		// System.out.println(pageSource);

		sleep(9000);
		// Verification that new page contains expected text in source
		// softAssert.assertTrue(privacyPolicypageSource.contains("Privacy Policy -
		// anbcapital"), "New page source doesn't contain expected text");
		softAssert.assertTrue(privacyPolicypageSource.contains("anb"), "New page source doesn't contain expected text");

		// switching to previous tab

		switchToPreviousTab();

		loginPage.clickTermsConditionsLink();

		TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(driver, log);

		// TadawulatyPage newWindowPage = lNMyAccount.switchToNewWindowPage();

		String termsAndConditionspageSource = termsAndConditionsPage.getCurrentPageSource();

		// System.out.println(pageSource);
		sleep(9000);
		// Verification that new page contains expected text in source
		softAssert.assertTrue(termsAndConditionspageSource.contains("Terms"),
				"New page source doesn't contain expected text");
		switchToPreviousTab();

		loginPage.clickVATRegistrationNumberLInk();

		VATRegistrationNumberPage vATRegistrationNumberPage = new VATRegistrationNumberPage(driver, log);

		// TadawulatyPage newWindowPage = lNMyAccount.switchToNewWindowPage();

		// String vATRegistrationNumberPageSource =
		// vATRegistrationNumberPage.getCurrentPageSource();
		sleep(9000);
		// System.out.println(pageSource);

		// Verification that new page contains expected text in source
		// softAssert.assertTrue(vATRegistrationNumberPageSource.contains("anbcapital.com.sa/documents/182269/1264160/VAT_Registration_Certificate.PDF/"),
		// "New page source doesn't contain expected text");
		softAssert.assertEquals(vATRegistrationNumberPage.getCurrentUrl(), vATRegistrationNumberPage.getPageUrl(),
				" not matching " + vATRegistrationNumberPage.getCurrentUrl() + " with  "
						+ vATRegistrationNumberPage.getPageUrl());

		sleep(9000);

		switchToPreviousTab();

		loginPage.clickFAQLink();

		FAQPage fAQPage = new FAQPage(driver, log);

		// TadawulatyPage newWindowPage = lNMyAccount.switchToNewWindowPage();

		String fAQPagePageSource = fAQPage.getCurrentPageSource();
		sleep(9000);
		// System.out.println(pageSource);

		// Verification that new page contains expected text in source
		softAssert.assertTrue(fAQPagePageSource.contains("faq"), "New page source doesn't contain expected text");

		switchToPreviousTab();

		softAssert.assertAll();

	}
}
//LahiruH 22_02_2024

/* Verify the language change functionality is available and working properly */
