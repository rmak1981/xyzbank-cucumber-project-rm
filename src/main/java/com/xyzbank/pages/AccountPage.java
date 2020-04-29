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
public class AccountPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());


    //clicking on log in
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement _logOutBtn;
    //transaction click on
    @FindBy(xpath = "//body[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//button[1]")
    WebElement _transactionTab;
    //deposit
    @FindBy(xpath = "//body[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//button[2]")
    WebElement _depositTab;
    //withdrow
    @FindBy(xpath = "//button[3]")
    WebElement _withdrawlTab;
    //amount
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amount;
    //diposit withdrow btn
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _depositWithdrawBtn;
    //error msg
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _errorMessage;
    //deposit
    @FindBy(xpath = "//button[1][contains(text(),'Deposit')]")
    WebElement _depositBtn;


    //clicking on deposit
    public void clickOnDepositTab(){
        Reporter.addStepLog("click on deposit"+_depositTab.toString()+"<br>");
        clickOnElement(_depositTab);
        log.info("click on deposit"+_depositTab.toString());
    }

    // enter ammount to deposit
    public void enterAmount(int amount){
        Reporter.addStepLog("enter amount :"+_amount+"to the filed"+_amount.toString()+"<br>");
        sendTextToElement(this._amount, String.valueOf(amount));
        log.info("enter amount :"+_amount+"to the filed"+_amount.toString());
    }
    // clicking deposit withdown btn
    public void clickOnDepositWithdrawButton(){
        Reporter.addStepLog("click on deposit withdrow btn"+_depositWithdrawBtn.toString()+"<br>");
        clickOnElement(_depositWithdrawBtn);
        log.info("click on deposit withdrow btn"+_depositWithdrawBtn.toString());
    }


    public void clickOnDepositBtn(){
        Reporter.addStepLog("click on deposit BTn"+_depositBtn.toString());
        clickOnElement(_depositBtn);
        log.info("click on deposit BTn"+_depositBtn.toString());
    }


}
