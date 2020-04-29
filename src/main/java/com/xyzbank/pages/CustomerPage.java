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
public class CustomerPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());

    //search customer
    @FindBy(id = "userSelect")
    WebElement _yourName;

    @FindBy(id = "userSelect")
    WebElement _searchCustomer;
    //delet
    @FindBy(xpath = "//td[contains(text(),'Delete Customer')]")
    WebElement _deleteBtn;



    //seacrch by name
    public void searchCustomerByName(String firstName){
        Reporter.addStepLog("enter customer name"+_searchCustomer+"to filed "+_searchCustomer.toString()+"<br>");
        sendTextToElement(_searchCustomer, firstName);
        log.info("enter customer name"+_searchCustomer+"to filed "+_searchCustomer.toString());
    }



}
