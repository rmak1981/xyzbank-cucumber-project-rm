package com.xyzbank.pages;

import com.cucumber.listener.Reporter;
import com.xyzbank.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
Ravi's Creation
 */
public class CustomerLoginPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());


    // your name
    @FindBy(id = "userSelect")
    WebElement _yourName;
    //log in
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _loginBtn;
    // your name label
    @FindBy(xpath = "//div[@class='form-group']//label")
    WebElement _yourNameLabel;


    public void clickOnLoginButton(){
        Reporter.addStepLog("click on login btn"+_loginBtn.toString()+"<br>");
        clickOnElement(_loginBtn);
        log.info("click on login btn"+_loginBtn.toString());
    }

    }


