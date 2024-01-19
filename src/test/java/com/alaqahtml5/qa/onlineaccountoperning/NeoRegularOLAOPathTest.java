package com.alaqahtml5.qa.onlineaccountoperning;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.alaqahtml5.qa.base.TestUtilities;
import com.alaqahtml5.qa.pages.LoginPage;
import com.alaqahtml5.qa.pages.RegularOLAO1Page;
import com.alaqahtml5.qa.pages.RegularOLAO2Page;
import com.alaqahtml5.qa.pages.RegularOLAO3Page;
import com.alaqahtml5.qa.pages.RegularOLAO4Page;
import com.alaqahtml5.qa.pages.RegularOLAO5Page;
import com.alaqahtml5.qa.pages.RegularOLAO6Page;
import com.alaqahtml5.qa.pages.RegularOLAO7Page;

public class NeoRegularOLAOPathTest extends TestUtilities {

	@Test(priority = 1)
	public void navigateToRegulerOLAO() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();

		loginPage.waitForRegisterLink();

		Assert.assertTrue(loginPage.isonlineAccLocatorVisible(), "isonlineAccLocator Button is not visible.");

		sleep(7000);

		loginPage.clickOpenAccount();
		/*
		 * System.out.println("step1");
		 * 
		 * sleep(3000);
		 * 
		 * System.out.println("wait for 300o sec");
		 */
		RegularOLAO1Page regularOLAO1Page = new RegularOLAO1Page(driver, log);
		regularOLAO1Page.clickAnbClientBtn();

		RegularOLAO2Page regularOLAO2Page = new RegularOLAO2Page(driver, log);
		regularOLAO2Page.olaoAgreemnetCheckBox();
		regularOLAO2Page.clickAgree();

		RegularOLAO3Page regularOLAO3Page = new RegularOLAO3Page(driver, log);
		regularOLAO3Page.sendAnbCurrentAccountNumber(10000000000000000L, 99999999999999999L);
		regularOLAO3Page.sendNicIqatAccountNumber(1000000000000000L, 999999999999999999L);
		sleep(5000);
		regularOLAO3Page.clickConBtn();

		RegularOLAO4Page regularOLAO4Page = new RegularOLAO4Page(driver, log);
		regularOLAO4Page.sendPinNum1();
		regularOLAO4Page.sendPinNum2();
		regularOLAO4Page.sendPinNum3();
		regularOLAO4Page.sendPinNum4();
		regularOLAO4Page.clickCon();
		
		
		RegularOLAO5Page regularOLAO5Page = new RegularOLAO5Page(driver, log);
		regularOLAO5Page.downLoadPdf1();
		sleep(5000);
		regularOLAO5Page.downLoadPdf2();
		regularOLAO5Page.checkOnCBox1();
		regularOLAO5Page.checkOnCBox2();
		regularOLAO5Page.clickCon();

		
		
		RegularOLAO6Page regularOLAO6Page = new RegularOLAO6Page(driver, log);
		regularOLAO6Page.selectCOB();
		regularOLAO6Page.typeNOD();
		regularOLAO6Page.typeDOE();
		regularOLAO6Page.selectPosition();
		regularOLAO6Page.selectANWTextBox();
		regularOLAO6Page.selectHaveYouWorkedTextBox();
		regularOLAO6Page.selectPracticalExperienceTextBox();
		regularOLAO6Page.selectMIRMTextBox();
		regularOLAO6Page.selectSOWTextBox();
		regularOLAO6Page.selectaIRMTextBox();
		regularOLAO6Page.selectAnyBusinessActivityOutsideKTextBox();
		regularOLAO6Page.selectcAddress3YTextBox();
		regularOLAO6Page.selectIKAExpTextBox();
		regularOLAO6Page.selectRATextBox();
		regularOLAO6Page.selectGIOTextBox();
		regularOLAO6Page.selectCashOutTextBox();
		regularOLAO6Page.typeToProfessionalCertificatesTextBox();
		regularOLAO6Page.typeloanTOInvestTextBox();
		regularOLAO6Page.typeMarginTrasTextBox();
		regularOLAO6Page.typeToIPP1_2();
		regularOLAO6Page.selectTRTextBox();
		regularOLAO6Page.selectImmigrantVisatextBox();
		regularOLAO6Page.selectUsPersonSelection();
		regularOLAO6Page.clickCreate();
		//sleep(5000);
		RegularOLAO7Page regularOLAO7Page = new RegularOLAO7Page(driver, log);
		regularOLAO7Page.sendOLAOUsername(9, 99);
		regularOLAO7Page.enterPw();
		regularOLAO7Page.clickContinue();
		regularOLAO7Page.clickBackToLogin();
	
////a[@id='lnkOnlineAcc']id
//		loginPage.clickRegistaion();
//		RegularOLAO regularOLAO = new RegularOLAO(driver, log);
//		regularOLAO.sendValueToID();

	}
}
