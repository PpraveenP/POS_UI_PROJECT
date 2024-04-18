package org.example.POS_UI_Test.PageObject.FoodManagement.Addon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Addons_List_Objects {
    WebDriver ldriver;
    public Add_Addons_List_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Food Management\"]")
    WebElement FoodManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Add-On List\"]")
    WebElement AddOnList;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement Search;
    @FindBy(xpath = "//span[normalize-space()=\"+\"]")
    WebElement Addons;
    public void ClcickOnAddons()
    {
        Addons.click();
    }

    @FindBy(xpath = "//button[normalize-space()=\"PDF\"]")
    WebElement PDF;
    @FindBy(xpath = "//button[normalize-space()=\"Excel\"]")
    WebElement Excel;
    @FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/a[1]//*[name()=\"svg\"]")
    WebElement Edit;
    public void ClickOnEdit()
    {
        Edit.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Update;
    public void ClickOnUpdate()
    {
        Update.click();
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/main[1]/main[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/div[1]/*[name()='svg'][1]")
    WebElement Delete;
    public void ClcickOnDelete()
    {
        Delete.click();
    }
    @FindBy(xpath = "/html[1]/body[1]/div[11]/div[3]/div[1]/div[2]/button[1]")
    WebElement DeleteYes;
    public void ClickOnDeleteYes()
    {
        DeleteYes.click();
    }

    public void ClickOnButton(String name)
    {
        WebElement[] bt=new WebElement[]{FoodManagement,AddOnList};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }

    }
    public void ClickOnButtons(String name)
    {
        WebElement[] bt=new WebElement[]{Search,PDF,Excel};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }

    }

}
