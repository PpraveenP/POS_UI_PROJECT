package org.example.POS_UI_Test.PageObject.TechnicianDashboard.StoreManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Free_Trial_Access_Objects {
    WebDriver ldrivrer;
    WebElement[] tb;
    WebElement[] bt;
    public Free_Trial_Access_Objects(WebDriver rdriver)
    {
        ldrivrer=rdriver;
        PageFactory.initElements(rdriver,this);
        tb=new WebElement[]{storename,username,countryCode,currency,state,pinCode,address,storeAddress,
                             contact,storeGST,email,upi,password,comfirmpassword,freeTrialType};
        bt=new WebElement[]{StoreManagement,FreeTrialAccess};
    }
    @FindBy(xpath = "//p[normalize-space()=\"Store Management\"]")
    WebElement StoreManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Free Trial Access\"]")
    WebElement FreeTrialAccess;
    @FindBy(xpath = "//input[@name=\"storename\"]")
    WebElement storename;
    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement username;
    @FindBy(xpath = "//div[@id=\"select-country\"]")
    WebElement selectcountry;
    public void clickOnSelectCountry()
    {
        selectcountry.click();
    }
    @FindBy(xpath = "//input[@name=\"countryCode\"]")
    WebElement countryCode;
    @FindBy(xpath = "//input[@name=\"currency\"]")
    WebElement currency;
    @FindBy(xpath = "//input[@name=\"state\"]")
    WebElement state;
    @FindBy(xpath = "//input[@name=\"pinCode\"]")
    WebElement pinCode;
    @FindBy(xpath = "//input[@name=\"address\"]")
    WebElement address;
    @FindBy(xpath = "//input[@name=\"storeAddress\"]")
    WebElement storeAddress;
    @FindBy(xpath = "//input[@name=\"contact\"]")
    WebElement contact;
    @FindBy(xpath = "//input[@name=\"storeGST\"]")
    WebElement storeGST;
    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//input[@name=\"upi\"]")
    WebElement upi;
    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//input[@name=\"comfirmpassword\"]")
    WebElement comfirmpassword;
    @FindBy(xpath = "//input[@name=\"freeTrialType\"]")
    WebElement freeTrialType;
    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;
    public void ClickOnSubmit()
    {
        Submit.click();
    }

    public void EnterTheTest(String name,String value)
    {
        for (WebElement t:tb)
        {
            if (t.getAttribute("name").equals(name))
            {
                t.sendKeys(value);
            }
        }
    }
    public void ClickOnButton(String name)
    {
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }
    }



}
