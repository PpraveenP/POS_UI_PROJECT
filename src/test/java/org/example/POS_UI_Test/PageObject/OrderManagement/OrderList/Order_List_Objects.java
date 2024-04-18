package org.example.POS_UI_Test.PageObject.OrderManagement.OrderList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_List_Objects {
    WebDriver ldriver;
    public Order_List_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Order Management\"]")
    WebElement OrderManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Orders List\"]")
    WebElement OrdersList;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement Search;
    @FindBy(xpath = "//button[normalize-space()=\"Daily\"]")
    WebElement Daily;
    @FindBy(xpath = "//button[normalize-space()=\"Monthly\"]")
    WebElement Monthly;
    @FindBy(xpath = "//button[normalize-space()=\"Yearly\"]")
    WebElement Yearly;
    @FindBy(xpath = "//a[normalize-space()=\"New Order\"]")
    WebElement NewOrder;
    @FindBy(xpath = "(//div[@class='MuiBox-root css-1tau86s'])[1]")
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
    @FindBy(xpath = "//button[normalize-space()=\"PDF\"]")
    WebElement PDF;
    @FindBy(xpath = "//button[normalize-space()=\"Excel\"]")
    WebElement Excel;

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
        WebElement[] bt=new WebElement[]{OrderManagement,OrdersList};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }
    }
    public void ClickOnButtons(String name) {
        WebElement[] bt = new WebElement[]{PDF, Excel, Search,Daily,Monthly,Yearly,NewOrder};
        for (WebElement b : bt) {
            if (b.getText().contains(name)) {
                b.click();
            }
        }


    }
}
