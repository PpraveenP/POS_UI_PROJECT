package org.example.POS_UI_Test.PageObject.CashManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cash_Register_List_Objects {
    WebDriver ldriver;
    public Cash_Register_List_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Cash Management\"]")
    WebElement CashManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Cash Register List\"]")
    WebElement CashRegisterList;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement Search;
    @FindBy(xpath = "//button[normalize-space()=\"Daily\"]")
    WebElement Daily;
    @FindBy(xpath = "//button[normalize-space()=\"Monthly\"]")
    WebElement Monthly;
    @FindBy(xpath = "//button[normalize-space()=\"Yearly\"]")
    WebElement Yearly;
    @FindBy(xpath = "//a[normalize-space()=\"+ Cash Register\"]")
    WebElement CashRegister;
    @FindBy(xpath = "//button[normalize-space()=\"PDF\"]")
    WebElement PDF;
    @FindBy(xpath = "//button[normalize-space()=\"Excel\"]")
    WebElement Excel;
    @FindBy(xpath = "(//input[@id='outlined-basic'])[1]")
    WebElement From;
    public void ClickOnFromdate()
    {
        From.click();
    }
    @FindBy(xpath = "(//input[@id='outlined-basic'])[2]")
    WebElement To;
    public void ClickOnToDate()
    {
        To.click();
    }
    @FindBy(xpath = "(//button[@type='button'])[10]")
    WebElement Filter;
    public void ClickOnFilter()
    {
        Filter.click();
    }
    @FindBy(xpath = "(//button[@type='button'])[11]")
    WebElement Cancel;
    public void ClickOnCancel()
    {
        Cancel.click();
    }
    public void  ClickOnButton(String name)
    {
        WebElement[] bt=new WebElement[]{CashManagement,CashRegisterList};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }
    }
    public void  ClickOnButtons(String name)
    {
        WebElement[] bt=new WebElement[]{Search,Daily,Monthly,Yearly,CashRegister,PDF,Excel};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }

    }


}
