package com.alaqahtml5.qa.pages;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistationPage extends BasePageObject {

	private By letsGetYOuLable = By.xpath("//div[@class='layout-inline title-texts font-6x-l']");
	private By loginLink = By.xpath("//span[@class='link-color cursor-pointer'][normalize-space()='Login']");

	/*
	 * A constructor in Java is a special method that is used to initialize objects.
	 * The constructor is called when an object of a class is created. It can be
	 * used to set initial values for object attributes: constructor name must match
	 * the class name, and it cannot have a return type (like void).
	 *
	 * Also note that the constructor is called when the object is created.
	 *
	 * All classes have constructors by default: if you do not create a class
	 * constructor yourself, Java creates one for you. However, then you are not
	 * able to set initial values for object attributes.
	 */
	public RegistationPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/* getting label name of letsGetYOuLable */
	public String letsGetYOuLableLable() {
		waitForVisibilityOf(letsGetYOuLable, Duration.ofSeconds(10));
		return find(letsGetYOuLable).getText();

	}

	/* click on loginLink button */

	public void clickLoginLink() {
		waitForVisibilityOf(loginLink, Duration.ofSeconds(10));
		click(loginLink);

	}

}
