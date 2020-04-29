package com.xyzbank.pages;

import com.cucumber.listener.Reporter;
import com.xyzbank.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class HomePage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //home button link
    @FindBy(xpath = "//button[@class='btn home']")
    WebElement _homeButtonLink;
    //customer log in tab
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLoginTab;
    //bank manager lagin tab
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginTab;


    //customer log in page
    public void clickOnCustomerLoginTab() {
        Reporter.addStepLog("click on customer log in :" + _customerLoginTab.toString() + "<br>");
        clickOnElement(_customerLoginTab);
        log.info("click on customer log in :" + _customerLoginTab.toString());
    }
    //clicking on bank manager login
    public void clickOnBankManagerLoginTab() {
        Reporter.addStepLog("click on bank manager login:" + _bankManagerLoginTab.toString() + "<br>");
        // waitUntilElementToBeClickable(_bankManagerLoginTab, 10);
        clickOnElement(_bankManagerLoginTab);
        log.info("click on bank manager login:" + _bankManagerLoginTab.toString());
    }
    public void iAmOnBankManagerPage(){
        clickOnBankManagerLoginTab();

    }

}
