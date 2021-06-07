$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/TestCase1.feature");
formatter.feature({
  "name": "TestCase1",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Create account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in create account page",
  "keyword": "Given "
});
formatter.match({
  "location": "SingnUpPageTest.user_in_create_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill out all inputs",
  "keyword": "When "
});
formatter.match({
  "location": "SingnUpPageTest.user_fill_out_all_inputs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see page with his name",
  "keyword": "Then "
});
formatter.match({
  "location": "SingnUpPageTest.user_should_see_page_with_his_name()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});