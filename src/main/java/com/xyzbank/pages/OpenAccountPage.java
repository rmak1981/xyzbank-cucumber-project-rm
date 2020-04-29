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
public class OpenAccountPage extends UtilityRM {
    // initiate log4j properties
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());


    // customer name
    @FindBy(id = "userSelect")
    WebElement _customerName;
    //currecy name
    @FindBy(id = "currency")
    WebElement _currency;
    //clicking process
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _processBtn;

    //search customer name
    public void searchCustomerName() {
        Reporter.addStepLog("search customer" + _customerName.toString() + "<br>");
        clickOnElement(_customerName);
        log.info("search customer" + _customerName.toString());
    }


    //search currency name
    public void searchCurrencyName() {
        Reporter.addStepLog("search currency" + _currency.toString() + "<br>");
        clickOnElement(_currency);
        log.info("search currency" + _currency.toString());
    }


    //click on press btn
    public void clickOnProcessButton() {
        Reporter.addStepLog("click on press btn" + _processBtn.toString() + "<br>");
        clickOnElement(_processBtn);
//        Alert alert = driver.switchTo().alert();
//        Assert.assertTrue("Account created successfully", alert.getText().contains("Account created successfully "));

       // alert.accept();
        log.info("click on press btn" + _processBtn.toString());
    }
}
