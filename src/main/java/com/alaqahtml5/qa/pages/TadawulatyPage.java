package com.alaqahtml5.qa.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class TadawulatyPage extends BasePageObject{

	/*
	 * There is an implicit call to super() with no arguments for all classes that
	 * have a parent - which is every user defined class in Java - so calling it
	 * explicitly is usually not required. However, you may use the call to super()
	 * with arguments if the parent's constructor takes parameters, and you wish to
	 * specify them. Moreover, if the parent's constructor takes parameters, and it
	 * has no default parameter-less constructor, you will need to call super() with
	 * argument(s).
	 */
	public TadawulatyPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

}
