package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class RegistrationPage extends TestBase {

	@FindBy(xpath = "//title[contains(text(),'Registration | Demoqa')]")
	WebElement registrationPageTitle;

	@FindBy(id = "name_3_firstname")
	WebElement txtbx_FirstName;

	@FindBy(id = "name_3_lastname")
	WebElement txtbx_LastName;

	@FindBy(xpath = "//input[@type='radio'][@value='single']")
	WebElement chkbx_MaritalStatus;

	@FindBy(xpath = "//input[@type='checkbox'][@value='dance']")
	WebElement chkbx_Hobby;

	@FindBy(id = "dropdown_7")
	WebElement select_Country;

	@FindBy(id = "mm_date_8")
	WebElement select_BirthMonth;

	@FindBy(id = "dd_date_8")
	WebElement select_BirthDay;

	@FindBy(id = "yy_date_8")
	WebElement select_BirthYear;

	@FindBy(id = "phone_9")
	WebElement txtbx_PhoneNumber;

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "email_1")
	WebElement email;

	@FindBy(id = "password_2")
	WebElement password;

	@FindBy(id = "confirm_password_password_2")
	WebElement confirmPassword;

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateRegistrationPageTitle() {
		return driver.getTitle();
	}

	public void inputFirstName(String firstName) {
		txtbx_FirstName.sendKeys(firstName);
	}

	public void inputLastName(String lastName) {
		txtbx_LastName.sendKeys(lastName);
	}

	public void tickMaritalStatus(String MaritalStatus) {
		chkbx_MaritalStatus.click();
	}

		public void tickHobby(String Hobby) {
		chkbx_Hobby.click();
	}
		
		public void selectCountry() {
			select_Country.click();
		}
		
}
