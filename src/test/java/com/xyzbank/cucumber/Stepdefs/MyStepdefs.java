package com.xyzbank.cucumber.Stepdefs;

import com.cucumber.listener.Reporter;
import com.xyzbank.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class MyStepdefs {

    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog("I am on home page baseURL = http://www.way2automation.com/angularjs-protractor/banking/#/login ");
    }

    @When("^I click on customer link$")
    public void iClickOnCustomerLink() {
        new HomePage().clickOnCustomerLoginTab();

    }


    @Then("^I click on log in button$")
    public void iClickOnLogInButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }


    @When("^I click on deposit link$")
    public void iClickOnDepositLink() {
        new AccountPage().clickOnDepositTab();
    }

    @And("^I enter amount to deposit \"([^\"]*)\"$")
    public void iEnterAmountToDeposit(int a)  {
        new AccountPage().enterAmount(a);
    }

    @Then("^I click on deposit button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositBtn();
    }

    @And("^I select customer name form drop down \"([^\"]*)\"$")
    public void iSelectCustomerNameFormDropDown(String name) {
    new CustomerPage().searchCustomerByName(name);
    }
}
