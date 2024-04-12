package org.example.POS_UI_Test.PageObject.CashManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cash_Register_Objects {
    WebDriver ldriver;
    public Cash_Register_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Cash Management\"]")
    WebElement CashManagement;
    public void ClickOn_CashManagement()
    {
        CashManagement.click();
    }
    @FindBy(xpath = "//span[normalize-space()=\"Cash Register\"]")
    WebElement CashRegister;
    public void ClickOn_CashRegister()
    {
        CashRegister.click();
    }
    @FindBy(xpath = "(//input[@type='number'])[1]")
    WebElement AddMoreAmount;
    public void ClickOn_AddMoreAmount(String amount    )
    {
        AddMoreAmount.sendKeys(amount);
    }
    @FindBy(xpath = "//div[@class=\"MuiBox-root css-1kemays\"]")
    WebElement Add;
    public void ClickOn_Add()
    {
        Add.click();
    }
    @FindBy(xpath = "(//input[@type='text'])[6]")
    WebElement ExpenseDetail;
    public void ClickOn_ExpenseDetail(String name)
    {
        ExpenseDetail.sendKeys(name);
    }
    @FindBy(xpath = "(//input[@type='number'])[2]")
    WebElement ExpenseAmount;
    public void ClickOn_ExpenseAmount(String amount)
    {
        ExpenseAmount.sendKeys(amount);
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/main[1]/main[1]/div[1]/button[1]")
    WebElement Submit;
    public void ClickOn_Submit()
    {
        Submit.click();
    }
    @FindBy(xpath = "(//input[@type='text'])[8]")
    WebElement HandOverTo;
    public void ClickOn_HandOverTo(String name)
    {
        HandOverTo.sendKeys(name);
    }
    @FindBy(xpath = "(//input[@type='number'])[3]")
    WebElement HandedAmount;
    public void ClickOn_HandedAmount(String name)
    {
        HandedAmount.sendKeys(name);
    }
    @FindBy(xpath = "")
    WebElement dd;

}
