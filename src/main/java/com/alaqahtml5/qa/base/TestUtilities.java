package com.alaqahtml5.qa.base;

import java.util.ArrayList;

public class TestUtilities extends BaseTest{

	
	// Static sleep
	protected void sleep(long millis) {
	try {
		Thread.sleep(millis);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
}
	
	public void switchToNextTab() {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
    }
    
    public void closeAndSwitchToNextTab() {
        driver.close();
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
    }

    public void switchToPreviousTab() {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(0));
    }

    public void closeTabAndReturn() {
        driver.close();
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(0));
    }

    public void switchToPreviousTabAndClose() {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        driver.close();
    }
	
	
}