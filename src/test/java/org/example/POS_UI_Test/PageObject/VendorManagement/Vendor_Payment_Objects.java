package org.example.POS_UI_Test.PageObject.VendorManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Vendor_Payment_Objects {

    WebDriver ldriver;
    WebElement[] vp;
    WebElement[] buttons;

    public Vendor_Payment_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
       vp=new WebElement[]{dueDate,bankName,branch,accountNo,ifscCode,upiId,total};
       buttons=new WebElement[]{VendorManagement,VendorPayment};
    }
    @FindBy(xpath = "//p[normalize-space()=\"Vendor Management\"]")
    WebElement VendorManagement;

    @FindBy(xpath = "//span[normalize-space()=\"Vendor Payment\"]")
    WebElement VendorPayment;

    @FindBy(xpath = "//div[@id=\"mui-component-select-vendorName\"]")
    WebElement vendorName;

    @FindBy(xpath = "//input[@name=\"dueDate\"]")
    WebElement dueDate;

    @FindBy(xpath = "//input[@name=\"bankName\"]")
    WebElement bankName;

    @FindBy(xpath = "//input[@name=\"branch\"]")
    WebElement branch;

    @FindBy(xpath = "//input[@name=\"accountNo\"]")
    WebElement accountNo;

    @FindBy(xpath = "//input[@name=\"ifscCode\"]")
    WebElement ifscCode;

    @FindBy(xpath = "//input[@name=\"upiId\"]")
    WebElement upiId;

    @FindBy(xpath = "//input[@name=\"total\"]")
    WebElement total;

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;

    public void EnterTheText(String name, String value)
    {
        for (WebElement e:vp)
        {
            if (e.getAttribute("name").contains(name))
            {
                e.sendKeys(value);
            }
        }
    }
    public void ClickOnButtons(String name)
    {
        for (WebElement b:buttons)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }
    }
    public void ClickOnDropDown(String name)
    {
        if(vendorName.getAttribute("id").contains(name))
        {

            vendorName.click();
        }
    }
//    public void Clickonthevendorname(int index)
//    {
//        Select dropdown = new Select(vendorName);
//
//// To select an option by visible text
////        dropdown.selectByVisibleText("Option Text");
//
//// To select an option by index (0-based)
//        dropdown.selectByIndex(index);
//
//// To select an option by value
////        dropdown.selectByValue("Option Value");
//    }
////    public void ClickOnVendorPayment()
////    {
////        VendorPayment.click();
////    }
    public void ClickOnSubmit()
    {
        Submit.click();
    }


}

