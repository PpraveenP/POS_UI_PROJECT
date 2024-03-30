package org.example.POS_UI_Test.PageObject.ProfileSetting.PaymentSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_New_Payment_Objects {
    WebDriver ldriver;
    WebElement[] tb;
    WebElement[] bt;
    public Add_New_Payment_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
       tb=new WebElement[]{bankName,branchName,accountNo,ifscCode,upiId};
       bt=new WebElement[]{ProfileSettings,PaymentSettings};
    }
    @FindBy(xpath = "//p[normalize-space()=\"Profile Settings\"]")
    WebElement ProfileSettings;
    @FindBy(xpath = "//span[normalize-space()=\"Payment Settings\"]")
    WebElement PaymentSettings;
    @FindBy(xpath = "//input[@name=\"bankName\"]")
    WebElement bankName;
    @FindBy(xpath = "//input[@name=\"branchName\"]")
    WebElement branchName;
    @FindBy(xpath = "//input[@name=\"accountNo\"]")
    WebElement accountNo;
    @FindBy(xpath = "//input[@name=\"ifscCode\"]")
    WebElement ifscCode;
    @FindBy(xpath = "//input[@name=\"upiId\"]")
    WebElement upiId;
    @FindBy(xpath = "//button[normalize-space()=\"Add Payment Details\"]")
    WebElement AddPaymentDetails;
    public void ClickOnAddPaymentDetails()
    {
        AddPaymentDetails.click();
    }
    @FindBy(xpath = "dd")
    WebElement tt;

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
    public void EnterTheText(String name,String value)
    {
        for (WebElement t:tb)
        {
            if (t.getAttribute("name").equals(name))
            {
                t.sendKeys(value);
            }
        }
    }

}
