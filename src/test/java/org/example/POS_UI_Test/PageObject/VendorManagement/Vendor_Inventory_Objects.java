package org.example.POS_UI_Test.PageObject.VendorManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Vendor_Inventory_Objects {

    WebDriver ldriver;
    WebElement[] tx;
    WebElement[] bt;
    WebElement[] dp;
    WebElement[] vv;

    public Vendor_Inventory_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
        tx=new WebElement[]{inventoryCode,quantity,price,discount};
        bt=new WebElement[]{VendorManagement,VendorInventory};
        dp=new WebElement[]{selectVendorName,selectItemName,selectUnit};
        vv=new WebElement[]{Kg,Gram,Pieces};
    }
    @FindBy(xpath = "//p[normalize-space()=\"Vendor Management\"]")
    WebElement VendorManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Vendor Inventory\"]")
    WebElement VendorInventory;

    @FindBy(xpath = "//input[@name=\"inventoryCode\"]")
    WebElement inventoryCode;

    @FindBy(xpath = "//input[@name=\"quantity\"]")
    WebElement quantity;

    @FindBy(xpath = "//input[@name=\"price\"]")
    WebElement price;

    @FindBy(xpath = "//input[@name=\"discount\"]")
    WebElement discount;

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;

    @FindBy(xpath = "//div[@id=\"mui-component-select-vendorName\"]")
    WebElement selectVendorName;

    @FindBy(xpath = "//div[@id=\"mui-component-select-itemName\"]")
    WebElement selectItemName;

    @FindBy(xpath = "//div[@id=\"mui-component-select-unit\"]")
    WebElement selectUnit;

    @FindBy(xpath = "//li[normalize-space()=\"Kg\"]")
    WebElement Kg;
    @FindBy(xpath = "//li[normalize-space()=\"Gram\"]")
    WebElement Gram;
    @FindBy(xpath = "//li[normalize-space()=\"Pieces\"]")
    WebElement Pieces;

//    @FindBy(xpath = "ff")
//    WebElement ff;


    public void EnterTheText(String name,String values)
    {
        for (WebElement e:tx)
        {
            if(e.getAttribute("name").contains(name))
            {
                e.sendKeys(values);
            }
        }
    }
    public void ClickOnButtton(String name)
    {
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
               b.click();
            }
        }

    }
    public void ClickDropDown(String name,String value)
    {
        for (WebElement e:dp)
        {
            if (e.getText().contains(name))
            {
                for (WebElement c:vv)
                {
                    if(e.getText().contains(name)&&c.getText().contains(value))
                    {
                        e.click();
                        c.click();
                    }
                }
            }
        }
    }
//public void ClickDropDown(String name)
//{
//    for (WebElement e:dp)
//    {
//        if (e.getText().contains(name))
//        {
//            e.click();
//            Select s=new Select(e);
//            List<WebElement> list = s.getOptions();
//                    for (int i=0;i<=list.size();i++)
//                    {
//                        list.get(list.size()-2).click();
//                    }
//        }
//    }
//}


}
