$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/1d.feature");
formatter.feature({
  "name": "To verify the login validity",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User should be in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef1.user_should_be_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the login functionality using invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should enter the username and password",
  "rows": [
    {
      "cells": [
        "Cheese",
        "Macroni"
      ]
    },
    {
      "cells": [
        "Avacado",
        "Burst"
      ]
    },
    {
      "cells": [
        "Maple",
        "Syrup"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDef1.user_should_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef1.user_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to the login attempt page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef1.user_should_navigate_to_the_login_attempt_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User should be in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef1.user_should_be_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the Create acoount functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has to click the Create new account",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef1.user_has_to_click_the_Create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should have navigated to the create account page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef1.user_should_have_navigated_to_the_create_account_page()"
});
formatter.result({
  "status": "passed"
});
});