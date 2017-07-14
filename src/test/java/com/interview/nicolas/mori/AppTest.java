package com.interview.nicolas.mori;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Unit test for simple App.
 */
@CucumberOptions(plugin = { "html:target/cucumber-html-reports", "json:target/cucumber-html-reports/cucumber.json",
		"junit:target/surefire-reports/cucumber-junit.xml" }, features = "src/test/resources/features", tags = "@example", glue = {
				"com.interview.nicolas.mori.steps" })
public class AppTest extends AbstractTestNGCucumberTests {
}
