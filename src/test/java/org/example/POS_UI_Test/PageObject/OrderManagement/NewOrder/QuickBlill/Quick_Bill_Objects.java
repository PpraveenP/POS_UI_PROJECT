package org.example.POS_UI_Test.PageObject.OrderManagement.NewOrder.QuickBlill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quick_Bill_Objects {
    WebDriver ldriver;
    WebElement[] bt;
    WebElement[] btns;
    public Quick_Bill_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
        bt=new WebElement[]{OrderManagement,NewOrder};

    }
    @FindBy(xpath = "//p[normalize-space()=\"Order Management\"]")
    WebElement OrderManagement;
    @FindBy(xpath = "//span[normalize-space()=\"New Order\"]")
    WebElement NewOrder;
    @FindBy(xpath = "//button[normalize-space()=\"TAKE AWAY\"]")
    WebElement TAKEAWAY;
    @FindBy(xpath = "//button[normalize-space()=\"CASH\"]")
    WebElement CASH;
    @FindBy(xpath = "//button[normalize-space()=\"CARD\"]")
    WebElement CARD;
    @FindBy(xpath = "//button[normalize-space()=\"UPI\"]")
    WebElement UPI;
    @FindBy(xpath = "//button[normalize-space()=\"DELIVERY\"]")
    WebElement DELIVERY;

    @FindBy(xpath = "//button[normalize-space()=\"Quick Order\"]")
    WebElement QuickOrder;
    public void ClickOnQuickOrder()
    {
        QuickOrder.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"DINE IN\"]")
    WebElement DINEIN;
    @FindBy(xpath = "//div[@id=\"demo-simple-select\"]")
    WebElement selectTable;
    public void ClickOnselectTable()
    {
        selectTable.click();
    }
//    @FindBy(xpath = "//button[normalize-space()=\"No\"]")
//    WebElement No;

    public void ClickOnButtton(String name)
    {
        for (WebElement t:bt)
        {
            if (t.getText().equals(name))
            {
                t.click();
            }
        }
    }
    public void ClickOnButtons(String name)
    {
        btns =new WebElement[]{TAKEAWAY,CASH,DELIVERY,QuickOrder,CARD,UPI};
        for (WebElement t:btns)
        {
            if (t.getText().equals(name))
            {
                t.click();
            }
        }
    }


}
