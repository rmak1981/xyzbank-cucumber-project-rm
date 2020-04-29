package com.xyzbank.cucumber.Stepdefs;

import com.xyzbank.pages.AddCustomerPage;
import com.xyzbank.pages.BankManagerPage;
import com.xyzbank.pages.HomePage;
import com.xyzbank.pages.OpenAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class ManagerSteps {

    @When("^I click on Bank Manager link$")
    public void iClickOnBankManagerLink() {
        new HomePage().clickOnBankManagerLoginTab();

    }

    @Then("^I click on add customer link$")
    public void iClickOnAddCustomerLink() throws InterruptedException {
        new BankManagerPage().clickOnAddCustomerTab();

    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String strFirstname)  {
        new AddCustomerPage().enterFirstName(strFirstname);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String strLastname)  {
        new AddCustomerPage().enterLastName(strLastname);

    }

    @And("^I enter Postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String strPostcode)  {
        new AddCustomerPage().enterPostcode(strPostcode);

    }

    @Then("^I click on Add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }


    @Given("^I am on bank manager log in page$")
    public void iAmOnBankManagerLogInPage() {
        new HomePage().iAmOnBankManagerPage();
    }

    @When("^I click on open account link$")
    public void iClickOnOpenAccountLink() {
        new BankManagerPage().clickOnOpenAccountTab();
    }

    @And("^I select customer name form menu$")
    public void iSelectCustomerNameFormMenu() {
        new OpenAccountPage().searchCustomerName();

    }

    @And("^I select currency from menu$")
    public void iSelectCurrencyFromMenu() {
        new OpenAccountPage().searchCurrencyName();
    }

    @Then("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

}
