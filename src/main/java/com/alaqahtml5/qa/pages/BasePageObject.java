package com.alaqahtml5.qa.pages;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
	/*
	 * protected The code is accessible in the same package and subclasses. You will
	 * learn more about subclasses and superclasses
	 */
	protected WebDriver driver;
	protected Logger log;


	public BasePageObject(WebDriver driver, Logger log) {
		this.driver = driver;
		this.log = log;
	}

	/** Open page with given URL */
	protected void openUrl(String url) { // 1
		driver.get(url);
	}

	/** Find element using given locator */
	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}

	/** Find all elements using given locator */
	protected List<WebElement> findAll(By locator) {
		return driver.findElements(locator);
	}

	/** Click on element with given locator when its visible */
	protected void click(By locator) {
		waitForVisibilityOf(locator, Duration.ofSeconds(10)); // 2
		find(locator).click();
	}

	/** Type given text into element with given locator */
	protected void type(String text, By locator) { // 2
		waitForVisibilityOf(locator);
		find(locator).sendKeys(text);
	}

	// ** Get URL of current page from browser */
	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	/** Get title of current page */
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}

	/** Get source of current page */
	public String getCurrentPageSource() {
		return driver.getPageSource();
	}

	/** Open CheckboxesPage by clicking on Checkboxes Link */
	protected void clickCheckboxesLink(By locator) {
		log.info("Clicking Checkboxes link on Welcome Page");
		find(locator).click();
	}

	/**
	 * Wait for specific ExpectedCondition for the given amount of time in seconds
	 */
	private void waitFor(ExpectedCondition<WebElement> condition, Duration timeOut) {
		timeOut = timeOut != null ? timeOut : Duration.ofSeconds(30);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(condition);
	}

	/**
	 * Wait for given number of seconds for element with given locator to be visible
	 * on the page
	 */
	protected void waitForVisibilityOf(By locator, Duration... timeOutInSeconds) {
		int attempts = 0;
		while (attempts < 2) {
			try {
				waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
						(timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
				break;
			} catch (StaleElementReferenceException e) {

			}
			attempts++;
		}
	}

//	protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) {
//		int attempts = 0;
//		while (attempts < 2) {
//			try {
//				waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
//						(timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
//				break;
//			} catch (StaleElementReferenceException e) {
//			}
//			attempts++;
//		}
//	}

	//explicitWait ------------
	protected static WebElement explicitWait(WebDriver driver, By locator, long timeout) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    return driver.findElement(locator);
	}

	/** Click on element with keybord key */
	protected void pressEnter(By locator, Keys key) {
		find(locator).sendKeys(key);
	}

	/** Wait for alert present and then switch to it */
	/*
	 * protected Alert switchToAlert() { WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(5));
	 * wait.until(ExpectedConditions.alertIsPresent()); return
	 * driver.switchTo().alert(); }
	 */

	public void switchToWindowWithTitle(String expectedTitle) {
		// Switching to new window
		String firstWindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(firstWindow)) {
				driver.switchTo().window(windowHandle);
				if (getCurrentPageTitle().equals(expectedTitle)) {
					break;
				}
			}
		}

	}

	//scrolling funtion
	protected void scrollToBottom(By locator) {


		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", find(locator));
		//jsExecutor.executeScript("window.scrollBy(0, -190);");
	}


}