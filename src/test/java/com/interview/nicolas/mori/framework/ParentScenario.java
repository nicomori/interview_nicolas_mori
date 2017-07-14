package com.interview.nicolas.mori.framework;

import org.openqa.selenium.WebDriver;

import com.interview.nicolas.mori.pageobject.web.FB_LoginPage;
import com.interview.nicolas.mori.pageobject.web.HomePageWeb;
import com.interview.nicolas.mori.util.SelectorBrowser;

/**
 * This Class is created for make a helper for all the pages, and all the parts of the a native app,
 * or for execute all the drivers. And for create all the objects of pages, or objects created in
 * all the pages.
 * 
 */

public class ParentScenario {

	private static WebDriver driver;

	protected static HomePageWeb homePageWeb;
	protected static FB_LoginPage fB_LoginPage;

	/**
	 * this method create the object driver for Android.
	 * 
	 * @param uuid
	 *            of the device to use.
	 */
	public void startBrowser() {
		System.out.println("Starting driver for Browser Chrome");
		driver = SelectorBrowser.createDriverWithoutCapabilities("chrome", driver);

		homePageWeb = new HomePageWeb(driver);
		fB_LoginPage = new FB_LoginPage(driver);

	}

	protected void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void closeDriver() {
		driver.quit();
	}

}
