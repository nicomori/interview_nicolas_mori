package com.interview.nicolas.mori.steps;

import com.interview.nicolas.mori.framework.ParentScenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps extends ParentScenario {

	@Given("I start the browser")
	public void accessToTheBrowser() {
		System.out.println("Starting the browser");
		startBrowser();
	}

	@And("I access to this url \"(.*)?\"")
	public void a111(String url) {
		System.out.println("Accessint to the url: " + url);
		navigateTo(url);
	}

}