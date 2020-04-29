$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/xyzbank/resources/featurefiles/customer.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Features",
  "description": "Customer can deposit money successfully",
  "id": "customer-features",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18455990600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should log in successfully",
  "description": "",
  "id": "customer-features;user-should-log-in-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on customer link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I select customer name form drop down \"Harry Potter\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on log in button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 295678500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCustomerLink()"
});
formatter.result({
  "duration": 572597500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter",
      "offset": 39
    }
  ],
  "location": "MyStepdefs.iSelectCustomerNameFormDropDown(String)"
});
formatter.result({
  "duration": 557589400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLogInButton()"
});
formatter.result({
  "duration": 1447443400,
  "status": "passed"
});
formatter.after({
  "duration": 153700,
  "status": "passed"
});
formatter.before({
  "duration": 13240088800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User should deposit money successfully",
  "description": "",
  "id": "customer-features;user-should-deposit-money-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on customer link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I select customer name form drop down \"Harry Potter\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on deposit link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I enter amount to deposit \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on deposit button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 361000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCustomerLink()"
});
formatter.result({
  "duration": 971091900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter",
      "offset": 39
    }
  ],
  "location": "MyStepdefs.iSelectCustomerNameFormDropDown(String)"
});
formatter.result({
  "duration": 445309300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLogInButton()"
});
formatter.result({
  "duration": 185618600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnDepositLink()"
});
formatter.result({
  "duration": 341666100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 27
    }
  ],
  "location": "MyStepdefs.iEnterAmountToDeposit(int)"
});
formatter.result({
  "duration": 340780000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnDepositButton()"
});
formatter.result({
  "duration": 269919100,
  "status": "passed"
});
formatter.after({
  "duration": 41500,
  "status": "passed"
});
formatter.uri("src/test/java/com/xyzbank/resources/featurefiles/manager.feature");
formatter.feature({
  "line": 1,
  "name": "Bank manager features",
  "description": "\r\nBank manager can open account successfully",
  "id": "bank-manager-features",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10779612300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can add customer successfully",
  "description": "",
  "id": "bank-manager-features;user-can-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Bank Manager link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on add customer link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter first name \"Ram\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter last name \"Raghuvanshi\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter Postcode \"LE8 6HJ\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on Add customer button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 600700,
  "status": "passed"
});
formatter.match({
  "location": "ManagerSteps.iClickOnBankManagerLink()"
});
formatter.result({
  "duration": 1650882700,
  "status": "passed"
});
formatter.match({
  "location": "ManagerSteps.iClickOnAddCustomerLink()"
});
formatter.result({
  "duration": 5460875300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ram",
      "offset": 20
    }
  ],
  "location": "ManagerSteps.iEnterFirstName(String)"
});
formatter.result({
  "duration": 471320400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raghuvanshi",
      "offset": 19
    }
  ],
  "location": "ManagerSteps.iEnterLastName(String)"
});
formatter.result({
  "duration": 581845200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LE8 6HJ",
      "offset": 18
    }
  ],
  "location": "ManagerSteps.iEnterPostcode(String)"
});
formatter.result({
  "duration": 379042300,
  "status": "passed"
});
formatter.match({
  "location": "ManagerSteps.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 307714500,
  "status": "passed"
});
formatter.after({
  "duration": 76700,
  "status": "passed"
});
formatter.before({
  "duration": 17270534500,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User can open account successfully",
  "description": "",
  "id": "bank-manager-features;user-can-open-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am on bank manager log in page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I click on open account link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I select customer name form menu",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select currency from menu",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on process button",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagerSteps.iAmOnBankManagerLogInPage()"
});
formatter.result({
  "duration": 1536030200,
  "status": "passed"
});
formatter.match({
  "location": "ManagerSteps.iClickOnOpenAccountLink()"
});
formatter.result({
  "duration": 523780100,
  "status": "passed"
});
formatter.match({
  "location": "ManagerSteps.iSelectCustomerNameFormMenu()"
});
formatter.result({
  "duration": 1234117000,
  "status": "passed"
});
formatter.match({
  "location": "ManagerSteps.iSelectCurrencyFromMenu()"
});
formatter.result({
  "duration": 1031259100,
  "status": "passed"
});
formatter.match({
  "location": "ManagerSteps.iClickOnProcessButton()"
});
formatter.result({
  "duration": 891156000,
  "status": "passed"
});
formatter.after({
  "duration": 111600,
  "status": "passed"
});
});