package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\niksa\\eclipse-workspace\\framework\\src\\main\\java\\com\\qa\\features\\homepage.feature", 
		glue = {"com\\qa\\stepdefinitions" }, 
		format = { "pretty", "html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },
		dryRun=false,
		monochrome = true)
		//tags= {"@order, @login" }
				

public class TestRunner {

}


