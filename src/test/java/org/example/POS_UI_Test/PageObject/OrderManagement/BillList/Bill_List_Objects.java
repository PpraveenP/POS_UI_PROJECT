package org.example.POS_UI_Test.PageObject.OrderManagement.BillList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bill_List_Objects {
    WebDriver ldriver;
    public Bill_List_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Order Management\"]")
    WebElement OrderManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Bill List\"]")
    WebElement BillList;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement Search;
    @FindBy(xpath = "//button[normalize-space()=\"Daily\"]")
    WebElement Daily;
    @FindBy(xpath = "//button[normalize-space()=\"Monthly\"]")
    WebElement Monthly;
    @FindBy(xpath = "//button[normalize-space()=\"Yearly\"]")
    WebElement Yearly;
    @FindBy(xpath = "(//*[name()='path'])[10]")
    WebElement Filter;
    public void ClickOnFilter()
    {
        Filter.click();
    }
    @FindBy(xpath = "(//div[@class='MuiBox-root css-sr7dh0'])[2]")
    WebElement Cancel;
    public void ClickOnCancel()
    {
        Cancel.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"PDF\"]")
    WebElement PDF;
    @FindBy(xpath = "//button[normalize-space()=\"Excel\"]")
    WebElement Excel;
    @FindBy(xpath = "(//*[name()='path'])[12]")
    WebElement Print;
    public void ClickOnPrint()
    {
        Print.click();
    }
    @FindBy(xpath = "(//input[@id='outlined-basic'])[1]")
    WebElement From;
    public void ClickOnFrom()
    {
        From.click();
    }
    @FindBy(xpath = "(//input[@id='outlined-basic'])[2]")
    WebElement To;
    public void ClickOnTo()
    {
        To.click();
    }

    public void ClickOnButton(String name)
    {
        WebElement[] bt=new WebElement[]{OrderManagement,BillList};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }
    }
    public void ClickOnButtons(String name) {
        WebElement[] bt = new WebElement[]{PDF, Excel, Search,Daily,Monthly,Yearly,};
        for (WebElement b : bt) {
            if (b.getText().contains(name)) {
                b.click();
            }
        }


    }
}
