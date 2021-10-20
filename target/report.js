$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/log.feature");
formatter.feature({
  "name": "To validate login functionalty in a facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate login functionality with valid Username and Invalid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter into facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.wser_enter_into_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Vusername and INpassword",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enter_Vusername_and_INpassword()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.Login.user_enter_Vusername_and_INpassword(Login.java:23)\r\n\tat ✽.user enter Vusername and INpassword(file:src/test/resources/FeatureFile/log.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be in error page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_should_be_in_error_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality with valid Username and valid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter into facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.wser_enter_into_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Vusername and Vpassword",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enter_Vusername_and_Vpassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be in error page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_should_be_in_error_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});