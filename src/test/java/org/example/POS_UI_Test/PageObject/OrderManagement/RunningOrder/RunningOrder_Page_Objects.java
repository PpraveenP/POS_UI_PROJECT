package org.example.POS_UI_Test.PageObject.OrderManagement.RunningOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RunningOrder_Page_Objects {

    WebDriver ldriver;
    WebElement[] bt;
    public RunningOrder_Page_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
        bt=new WebElement[]{OrderManagement,PendingOrder};

    }
    @FindBy(xpath = "//p[normalize-space()='Order Management']")
    WebElement OrderManagement;
    @FindBy(xpath = "//span[normalize-space()='Pending Order']")
    WebElement PendingOrder;
    @FindBy(xpath = "//button[normalize-space()='Running Order']")
    WebElement RunningOrder;
    @FindBy(xpath = "//button[normalize-space()='CASH']")
    WebElement CASH;
    @FindBy(xpath = "//button[normalize-space()='CARD']")
    WebElement CARD;
    @FindBy(xpath = "//button[normalize-space()='UPI']")
    WebElement UPI;
    @FindBy(xpath = "//div[@class='MuiBox-root css-zdpt2t']//button[@type='button']//*[name()='svg']")
    WebElement PrintButton;
    public void ClickOnButton(String name)
    {
        for (WebElement b:bt)
        {
            if(b.getText().contains(name))
            {
                b.click();
            }
        }
    }
    public void ClickOnButtons(String name)
    {
        if (name.equals("CASH"))
        {
            CASH.click();
        }
        if (name.equals("CARD"))
        {
            CARD.click();
        }
        if (name.equals(""))
        {
            UPI.click();
        }
        if (name.equals("PrintButton"))
        {
            PrintButton.click();
        }
    }

}
