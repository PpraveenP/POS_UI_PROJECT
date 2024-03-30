package org.example.POS_UI_Test.PageObject.Dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Object {

    WebDriver ldriver;

    public Dashboard_Object(WebDriver redriver)
    {
        ldriver=redriver;
        PageFactory.initElements(redriver,this);
    }

    @FindBy(xpath = "//p[normalize-space()=\"Dashboard\"]")
    WebElement DashboardButton;

    @FindBy(xpath = "//span[normalize-space()=\"Today's Income\"]")
    WebElement Todayincome;
    @FindBy(xpath = "//img[@alt=\"Most Selling Food Icon\"]")
    WebElement MostSellingFood;
    @FindBy(xpath = "//span[normalize-space()=\"New Order\"]")
    WebElement NewOrder;
    @FindBy(xpath = "//span[normalize-space()=\"Pending Order\"]")
            WebElement PendingOrder;

    @FindBy(xpath = "//span[normalize-space()=\"Order List\"]")
    WebElement OrderList;

    @FindBy(xpath = "//span[normalize-space()=\"Add Food\"]")
            WebElement AddFood;

    @FindBy(xpath = "//span[normalize-space()=\"Bill Report\"]")
    WebElement BillReport;

    @FindBy(xpath = "//span[normalize-space()=\"Add User\"]")
            WebElement AddUser;

    @FindBy(xpath = "//span[normalize-space()=\"Add Inventory\"]")
    WebElement AddInventory;

    @FindBy(xpath = "//span[normalize-space()=\"Profile Setting\"]")
            WebElement ProfileSetting;

    public void DashboardSubOptionClick(String name)
    {
        if (name.contains("Dashboard"))
        {
            DashboardButton.click();
        }
        else if (name.contains("TodayIncome"))
        {
            Todayincome.click();
        }
        else if (name.contains("NewOrder"))
        {
            NewOrder.click();
        }
        else if (name.contains("PendingOrder"))
        {
            PendingOrder.click();
        }
        else if (name.contains("OrderList"))
        {
            OrderList.click();
        }
        else if (name.contains("AddFood"))
        {
            AddFood.click();
        }
        else if (name.contains("BillReport"))
        {
            BillReport.click();
        }
        else if (name.contains("AddUser"))
        {
            AddUser.click();
        }
        else if (name.contains("AddInventory"))
        {
            AddInventory.click();
        }
        else if (name.contains("ProfileSetting"))
        {
            ProfileSetting.click();
        }
        else if (name.contains("MostSellingFood"))
        {
            MostSellingFood.click();
        }
    }

}
