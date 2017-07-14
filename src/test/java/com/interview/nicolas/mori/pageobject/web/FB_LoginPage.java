package com.interview.nicolas.mori.pageobject.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.interview.nicolas.mori.framework.ParentPage;

public class FB_LoginPage extends ParentPage {

	public FB_LoginPage(WebDriver driver) {
		super(driver);
	}

	By LOGO_FB = By.xpath("//i[contains(@class,'fb_logo')]");
	By TEXTFIELD_EMAIL = By.xpath("//input[@id='email']");
	By TEXTFIELD_PASSWORD = By.xpath("//input[@id='pass']");
	By BUTTON_LOGIN = By.xpath("//button[@id='loginbutton']");

	/**
	 * this method return true in case if the logo is correctly displayed.
	 * 
	 * @return boolean
	 */
	public boolean verifyTheCorrectDisplayed() {
		System.out.println("Starting to verify if the Logo is correctly displayed");
		return isCorrectlyDeployed(LOGO_FB);
	}

	/**
	 * this method make a success login into the app FB.
	 * 
	 * @param String
	 *            email
	 * @param String
	 *            password
	 */
	public void doSuccessLogin(String email, String pass) {
		waitForAnExplicitElement(TEXTFIELD_EMAIL);
		System.out.println("Starting to do a success login");
		sendKeysToLocator(TEXTFIELD_EMAIL, email);
		sendKeysToLocator(TEXTFIELD_PASSWORD, pass);
		click(BUTTON_LOGIN);
	}

}
