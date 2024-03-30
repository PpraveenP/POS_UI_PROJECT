package org.example.POS_UI_Test.PageObject.VendorManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Vendor_Objects {

    WebDriver ldriver;
    WebElement[] vendor;
    WebElement[] buttons;
    public Add_Vendor_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
        vendor= new WebElement[]{vendorName, vendorCode, vendorAddress, mobileNo, bankName, branch, accountNo, ifscCode, upiId, Submit};
        buttons= new WebElement[]{ Submit,VendorManagement,AddVendor};
    }

    @FindBy(xpath = "//input[@name=\"vendorName\"]")
    WebElement vendorName;

    @FindBy(xpath = "//input[@name=\"vendorCode\"]")
    WebElement vendorCode;

    @FindBy(xpath = "//input[@name=\"vendorAddress\"]")
    WebElement vendorAddress;

    @FindBy(xpath = "//input[@name=\"mobileNo\"]")
    WebElement mobileNo;

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

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;

    @FindBy(xpath = "//p[normalize-space()=\"Vendor Management\"]")
    WebElement VendorManagement;

    @FindBy(xpath = "//span[normalize-space()=\"Add Vendor\"]")
    WebElement AddVendor;


    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div[1]/div/p")
    WebElement successfulMessage;
    public void Enter_The_Text_Fields(String name,String values)
    {
        for (WebElement e:vendor)
        {
            if(e.getAttribute("name").contains(name))
            {
                e.sendKeys(values);
            }
        }
    }
    public void clickfuction(String name)
    {
      for (WebElement e:buttons)
      {
          if (e.getText().contains(name))
          {
              e.click();
          }
      }
    }

    public void ClickOnAddVendor()
    {

                AddVendor.click();

    }
    public void ClickOnVendorManagement()
    {

        VendorManagement.click();

    }
    public void ClickOnSubmit()
    {

        Submit.click();

    }


    }