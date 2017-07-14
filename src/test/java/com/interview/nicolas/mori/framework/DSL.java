package com.interview.nicolas.mori.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This Class is an abstract class, and created for make the interaction with the class ParentPage.
 */
public abstract class DSL {
	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * this method make click in a locator
	 * 
	 * @param locator
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
	}

	/**
	 * this method verify if a locator is correctly deployed
	 * 
	 * @param locator
	 * @return boolean
	 */
	public boolean isCorrectlyDeployed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * this method is going to send keys to a locator
	 * 
	 * @param locator,
	 *            string to send
	 */
	public void sendKeysToLocator(By locator, String stringToSend) {
		driver.findElement(locator).sendKeys(stringToSend);
	}

	/**
	 * this method wait until a element appear
	 * 
	 * @param locator
	 */
	public void waitForAnExplicitElement(By locator) {
		@SuppressWarnings("unused")
		WebElement myDynamicElement = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	// ############### MOBILE SECTIONS ######################

}
