package com.xyzbank.pages;

import com.cucumber.listener.Reporter;
import com.xyzbank.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class AddCustomerPage extends UtilityRM {
    // initiate log4j
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());


    //first name
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement _firstName;
    //last name
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement _lastName;
    //postcode
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement _postcode;
    //add customer btn
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _addCustomerBtn;




    public void enterFirstName(String strFirstname){
        String strFrstName = getRandomString(3);
        Reporter.addStepLog("enter first name"+_firstName+"to the field"+_firstName.toString()+"<br>");
        sendTextToElement(_firstName, strFrstName);
        log.info("enter first name"+_firstName+"to the field"+_firstName.toString());}

    public void enterLastName(String strLastName){
        Reporter.addStepLog("enter last name"+_lastName+"to the field"+_lastName.toString()+"<br>");
        sendTextToElement(_lastName, strLastName);
        log.info("enter last name"+_lastName+"to the field"+_lastName.toString());
    }

    public void enterPostcode(String postCode){
        Reporter.addStepLog("enter postcode"+_postcode+"to the field"+_postcode.toString()+"<br>");
        sendTextToElement(_postcode, postCode);
        log.info("enter postcode"+_postcode+"to the field"+_postcode.toString());
    }

    public void clickOnAddCustomerButton(){
        Reporter.addStepLog("click on add customer btn"+_addCustomerBtn.toString()+"<br>");
        clickOnElement(_addCustomerBtn);
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue("Customer added successfully", alert.getText().contains("Customer added successfully"));
        alert.accept();
        log.info("click on add customer btn"+_addCustomerBtn.toString());
    }
}
