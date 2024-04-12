package org.example.POS_UI_Test.PageObject.OrderManagement.KOT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KOT_Objects {
    WebDriver ldriver;
    public  KOT_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Order Management\"]")
    WebElement OrderManagement;
    @FindBy(xpath = "//span[normalize-space()=\"KOT\"]")
    WebElement KOT;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Prepared'])[1]")
    WebElement Prepared;
    public void ClickOnPrepated()
    {
        Prepared.click();
    }
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='View Order'])[1]")
    WebElement ViewOrder;
    public void ClickOnViewOrder()
    {
        ViewOrder.click();
    }

    public void ClickOnButton(String name)
    {
        WebElement[] bt=new WebElement[]{OrderManagement,KOT};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
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
//    @FindBy(xpath = "")
//    WebElement dd;
//    @FindBy(xpath = "")
//    WebElement dd;


}
