package org.example.POS_UI_Test.PageObject.OrderManagement.NewOrder.PlaceOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Place_Order_Objects {
    WebDriver ldriver;
    WebElement[] bt ;
    public Place_Order_Objects(WebDriver rdriver)
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
    public void ClickOnTakeAway()
    {
        TAKEAWAY.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"DELIVERY\"]")
    WebElement DELIVERY;
    public void ClickOnDelivery()
    {
        DELIVERY.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"DINE IN\"]")
    WebElement DINEIN;
    public void ClickOnDinein()
    {
        DINEIN.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"Place Order\"]")
    WebElement PlaceOrder;


    public void ClickOnPlaceOrder()
    {
        PlaceOrder.click();
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
//    @FindBy(xpath = "")
//    WebElement dd;
//    @FindBy(xpath = "")
//    WebElement dd;
//    @FindBy(xpath = "")
//    WebElement dd;
//    @FindBy(xpath = "")
//    WebElement dd;
//}
