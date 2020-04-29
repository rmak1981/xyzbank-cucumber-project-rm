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
public class BankManagerPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(BankManagerPage.class.getName());

//    By addCustomerTab = By.xpath("//button[contains(text(),'Add Customer')]");
//    By openAccountTab = By.cssSelector("body.ng-scope:nth-child(2) div.ng-scope:nth-child(3) div.container-fluid.ng-scope div.ng-scope div.border.box.padT20.ng-scope div.center > button.btn.btn-lg.tab:nth-child(2)");
//    By customersTab = By.xpath("//button[3]");

    //add customer
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement _addCustomerTab;
    //open account
    @FindBy(css = "body.ng-scope:nth-child(2) div.ng-scope:nth-child(3) div.container-fluid.ng-scope div.ng-scope div.border.box.padT20.ng-scope div.center > button.btn.btn-lg.tab:nth-child(2)")
    WebElement _openAccountTab;
    //customers tab
    @FindBy(xpath = "//button[3]")
    WebElement _customersTab;

    public void clickOnAddCustomerTab() throws InterruptedException {
        Reporter.addStepLog("click in add customer tab" + _addCustomerTab.toString() + "<br>");
        clickOnElement(_addCustomerTab);
        Thread.sleep(5000);
        log.info("click in add customer tab" + _addCustomerTab.toString());
    }

    public void clickOnOpenAccountTab() {
        Reporter.addStepLog("click on open account tab"+_openAccountTab.toString()+"<br>");
        clickOnElement(_openAccountTab);
        log.info("click on open account tab"+_openAccountTab.toString());
    }


}
