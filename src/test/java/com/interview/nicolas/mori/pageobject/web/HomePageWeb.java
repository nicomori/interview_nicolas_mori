package com.interview.nicolas.mori.pageobject.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.interview.nicolas.mori.framework.ParentPage;

public class HomePageWeb extends ParentPage {

	public HomePageWeb(WebDriver driver) {
		super(driver);
	}

	By LOGO = By.xpath("//img[contains(@src,'logo.png')]");
	By BUTTON_FB_LOGIN = By.xpath("//span[contains(@class,'js-fb-login-button-standard')]");
	By BUTTON_SKIP = By.xpath("//button[@name='__SKIP__']");
	By HTML_OBJECT_RESULTS = By.xpath("//body[contains(@id,'result')]");

	/**
	 * this method return a boolean condition if the logo in the homepage is correctly displayed.
	 * 
	 * @return boolean
	 */
	public boolean verifyPageTheCorrectDisplayed() {
		System.out.println("Starting to verify if the Logo is correctly displayed");
		return isCorrectlyDeployed(LOGO);
	}

	/**
	 * this method return a boolean condition if the results in the homepage is correctly displayed.
	 * 
	 * @return boolean
	 */
	public boolean verifyResultsIsCorrectlyDisplayed() {
		if (isCorrectlyDeployed(BUTTON_SKIP)) {
			System.out.println("making click in the button skip");
			click(BUTTON_SKIP);
		}
		System.out.println("Starting to verify if the Results is correctly displayed");
		waitForAnExplicitElement(HTML_OBJECT_RESULTS);
		return isCorrectlyDeployed(HTML_OBJECT_RESULTS);
	}

	/**
	 * this method make click in the FB login button.
	 */
	public void clickInTheFBLoginButton() {
		System.out.println("making click in the login button");
		waitForAnExplicitElement(BUTTON_FB_LOGIN);
		click(BUTTON_FB_LOGIN);
	}
}
