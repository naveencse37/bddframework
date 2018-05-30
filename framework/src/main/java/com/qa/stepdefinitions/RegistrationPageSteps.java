package com.qa.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.qa.pages.RegistrationPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;

public class RegistrationPageSteps extends TestBase {
	
	RegistrationPage registrationpage = new RegistrationPage();

	@Given("^user clicks registration link$")
	public void user_clicks_registration_link() throws Throwable {
	   driver.findElement(By.id("menu-registration")).click();	
	}

	@Given("^user validates registration page title$")
	public void user_validates_registration_page_title() throws Throwable {
		String title = registrationpage.validateRegistrationPageTitle();
		Assert.assertEquals("Registration | Demoqa", title);
	}

	@Given("^user fills form$")
	public void user_fills_form() throws Throwable {    
		registrationpage.inputFirstName("Test");
		registrationpage.inputLastName("Tester");
		registrationpage.tickMaritalStatusSingle();
		registrationpage.tickHobbyCricket();
		registrationpage.selectCountry();
	}


}
