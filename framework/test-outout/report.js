$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("registrationpage.feature");
formatter.feature({
  "line": 1,
  "name": "Registration Page",
  "description": "",
  "id": "registration-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user enters valid details in the registration form to register",
  "description": "",
  "id": "registration-page;user-enters-valid-details-in-the-registration-form-to-register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user validates homepage title",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks registration link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user validates registration page title",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user fills form",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 7464853426,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_validates_homepage_title()"
});
formatter.result({
  "duration": 11808444,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.user_clicks_registration_link()"
});
formatter.result({
  "duration": 1383569896,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.user_validates_registration_page_title()"
});
formatter.result({
  "duration": 27000643,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.user_fills_form()"
});
formatter.result({
  "duration": 403520290,
  "status": "passed"
});
});