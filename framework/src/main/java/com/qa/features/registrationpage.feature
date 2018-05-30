Feature: Registration Page 

@Smoke
Scenario: user enters valid details in the registration form to register 

	Given user opens browser 
	And user validates homepage title
	And user clicks registration link
	And user validates registration page title
	And user fills form
#	And close the browser
	