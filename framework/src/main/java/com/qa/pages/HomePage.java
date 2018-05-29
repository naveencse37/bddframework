package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.pages.RegistrationPage;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	
	 //Page Factory - OR:
	
	@FindBy(xpath = "//title[contains(text(),'Demoqa | Just another WordPress site')]")
	WebElement title;
	
	@FindBy(id = "menu-registration")
	WebElement registrationLink;

	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
		public RegistrationPage validateRegistrationPage() {
			registrationLink.click();
			return new RegistrationPage();
			
		}
}
