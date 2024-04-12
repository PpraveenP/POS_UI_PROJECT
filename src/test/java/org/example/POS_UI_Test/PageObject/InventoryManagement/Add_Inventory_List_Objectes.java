package org.example.POS_UI_Test.PageObject.InventoryManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Inventory_List_Objectes {
    WebDriver ldriver;
    WebElement[] bt;
    public Add_Inventory_List_Objectes(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
        bt=new WebElement[]{InventoryManagement,InventoryList};

    }
    @FindBy(xpath = "//p[normalize-space()=\"Inventory Management\"]")
    WebElement InventoryManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Inventory List\"]")
    WebElement InventoryList;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement Search;
    @FindBy(xpath = "(//*[name()='path'])[11]")
    WebElement Edit;
    public void ClickOnEdit()
    {
        Edit.click();
    }
    @FindBy(xpath = "(//*[name()='path'])[12]")
    WebElement delete;
    public void ClickonDelete()
    {
        delete.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"Daily\"]")
    WebElement Daily;
    @FindBy(xpath = "//button[normalize-space()=\"Monthly\"]")
    WebElement Monthly;
    @FindBy(xpath = "//button[normalize-space()=\"Yearly\"]")
    WebElement Yearly;
    @FindBy(xpath = "(//button[@type='button'])[10]")
    WebElement dateFilter;

    @FindBy(xpath = "(//button[@type='button'])[11]")
    WebElement DateCancel;

    @FindBy(xpath = "//button[normalize-space()=\"PDF\"]")
    WebElement PDF;
    @FindBy(xpath = "//button[normalize-space()=\"Excel\"]")
    WebElement Excel;
    @FindBy(xpath = "//a[normalize-space()=\"+ Inventory\"]")
    WebElement Inventory;
    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;
    public void ClickOnSubmit()
    {
        Submit.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"Yes\"]")
    WebElement DeleteYES;
    public void ClickOnDeleteYES()
    {
        DeleteYES.click();
    }
    @FindBy(xpath = "")
    WebElement dd;

    public void ClickOnTheButton(String name)
    {
        for (WebElement b:bt)
        {
            if (b.getText().equals(name))
            {
                b.click();
            }
        }
    }

    public void ClickOnButtons(String name)
    {
        WebElement[] bts=new WebElement[]{Search,Edit,delete,Daily,Monthly,Yearly,dateFilter,PDF,Excel,Inventory};
        for (WebElement b:bts)
        {
            if (b.getText().equals(name))
            {
                b.click();
            }
        }
    }



}
