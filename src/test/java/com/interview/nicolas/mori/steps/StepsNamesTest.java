package com.interview.nicolas.mori.steps;

import org.testng.Assert;

import com.interview.nicolas.mori.framework.ParentScenario;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class StepsNamesTest extends ParentScenario {

	@And("I press in the button to continue with the login")
	public void stepNumber1() {
		System.out.println("Press in the button login");
		homePageWeb.clickInTheFBLoginButton();
	}

	@And("I set the username \"(.*?)\" and the password \"(.*?)\"")
	public void stepNumber2(String email, String pass) {
		System.out.println("Starting with the login process in FB");
		fB_LoginPage.doSuccessLogin(email, pass);
	}

	@Then("verify the homepage is correctly deployed without errors")
	public void stepNumber3() {
		System.out.println("Starting to verify the correct deploy of the homepage");
		Assert.assertTrue(homePageWeb.verifyPageTheCorrectDisplayed(),
				"Exist a problem at the moment to verify the correct displayed of the homepage web");
	}

	@Then("verify the FB login is correctly deployed without errors")
	public void stepNumber4() {
		System.out.println("Starting to verify the correct deploy of the FB login");
		Assert.assertTrue(fB_LoginPage.verifyTheCorrectDisplayed(),
				"Exist a problem at the moment to verify the correct displayed of the facebook login web");
	}

	@Then("verify the result is correctly deployed without errors")
	public void stepNumber5() {
		System.out.println("Starting to verify the correct deploy of the results");
		Assert.assertTrue(homePageWeb.verifyResultsIsCorrectlyDisplayed(),
				"Exist a problem at the moment to verify the correct displayed of the results in the homepage");
	}

	@After
	public void afster() {
		closeDriver();
	}
}