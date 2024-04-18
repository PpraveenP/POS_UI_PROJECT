package org.example.POS_UI_Test.PageObject.FoodManagement.Addon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Addons_Objects {
    WebDriver ldriver;
    WebElement[] tx;
    WebElement[] db;
    WebElement[] bt;
    public Add_Addons_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
        tx=new WebElement[]{foodName,foodCode,price,description,image};
        db=new WebElement[]{subCategory,category};
        bt=new WebElement[]{FoodManagement,AddAddons};

    }
    @FindBy(xpath = "//p[normalize-space()=\"Food Management\"]")
    WebElement FoodManagement;

    @FindBy(xpath = "//span[normalize-space()=\"Add Addons\"]")
    WebElement AddAddons;

    @FindBy(xpath = "//input[@name=\"foodName\"]")
    WebElement foodName;

    @FindBy(xpath = "//input[@name=\"foodCode\"]")
    WebElement foodCode;

    @FindBy(xpath = "//input[@name=\"price\"]")
    WebElement price;

    @FindBy(xpath = "//div[@id=\"select-category\"]")
    WebElement category;

    @FindBy(xpath = "//div[@id=\"select-subCategory\"]")
    WebElement subCategory;
    @FindBy(xpath = "//input[@name=\"description\"]")
    WebElement description;

    @FindBy(xpath = "//input[@name=\"image\"]")
    WebElement image;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    WebElement checkbox;
    public void ClikOnCheckbox()
    {
        checkbox.click();
    }

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;
    public void ClickOnSybmit()
    {
        Submit.click();
    }
    WebElement[] bts=new WebElement[]{checkbox,Submit};
    @FindBy(xpath = "dd")
    WebElement dd;

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
    public void EnterTheText(String name,String value)
    {
        for (WebElement t:tx)
        {
            if (t.getAttribute("name").contains(name))
            {
                t.sendKeys(value);
            }
        }
    }
    public void ClickOnDopdown(String name)
    {
        for (WebElement d:db)
        {
            if (d.getAttribute("id").contains(name))
            {
                d.click();
            }
        }

    }



}
