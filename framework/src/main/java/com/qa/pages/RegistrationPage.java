package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class RegistrationPage extends TestBase {

	@FindBy(xpath = "//title[contains(text(),'Registration | Demoqa')]")
	WebElement registrationPageTitle;

	@FindBy(id = "name_3_firstname")
	WebElement txtbx_FirstName;

	@FindBy(id = "name_3_lastname")
	WebElement txtbx_LastName;

	@FindBy(xpath = "//input[@type='radio'][@value='single']")
	WebElement chkbx_MaritalStatus_Single;

	@FindBy(xpath = "//input[@type='radio'][@value='married']")
	WebElement chkbx_MaritalStatus_Married;

	@FindBy(xpath = "//input[@type='radio'][@value='divorced']")
	WebElement chkbx_MaritalStatus_Divorced;

	@FindBy(xpath = "//input[@type='checkbox'][@value='dance']")
	WebElement chkbx_Hobby_Dance;
	
	@FindBy(xpath = "//input[@type='checkbox'][@value='reading']")
	WebElement chkbx_Hobby_Reading;
	
	@FindBy(xpath = "//input[@type='checkbox'][@value='cricket ']")
	WebElement chkbx_Hobby_Cricket;

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

	@FindBy(id = "pie_submit")
	WebElement submitButton;

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

	public void tickMaritalStatusSingle() {
		chkbx_MaritalStatus_Single.click();

	}

	public void tickMaritalStatusMarried() {
		chkbx_MaritalStatus_Married.click();

	}

	public void tickMaritalStatusDivorced() {

		chkbx_MaritalStatus_Divorced.click();
	}

	public void tickHobbyDance() {
		chkbx_Hobby_Dance.click();
	}
	
	
	public void tickHobbyReading() {
		chkbx_Hobby_Reading.click();
	}
	
	public void tickHobbyCricket() {
		chkbx_Hobby_Cricket.click();
	}

		
	public void selectCountry() {
		Select selectCountry = new Select(select_Country);	
		selectCountry.selectByValue("Albania");
	}

	public void selectBirthMonth() {
		select_BirthMonth.click();
	}

	public void inputPhoneNumber(String PhoneNumber) {
		txtbx_PhoneNumber.sendKeys(PhoneNumber);
	}

	public void inputUserName(String UserName) {
		username.sendKeys(UserName);
	}

	public void inputEmail(String Email) {
		email.sendKeys(Email);
	}

	public void inputPassword(String Password) {
		password.sendKeys(Password);
	}

	public void inputConfirmPassword(String ConfirmPassword) {
		confirmPassword.sendKeys(ConfirmPassword);
	}

	
}
