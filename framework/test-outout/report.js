$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/niksa/eclipse-workspace/framework/src/main/java/com/qa/features/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "User is one homepage",
  "description": "",
  "id": "user-is-one-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User is one homepage and can able to see all menu items",
  "description": "",
  "id": "user-is-one-homepage;user-is-one-homepage-and-can-able-to-see-all-menu-items",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user validates homepage title",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 12032056311,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_validates_homepage_title()"
});
formatter.result({
  "duration": 8356976,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 653069467,
  "status": "passed"
});
});