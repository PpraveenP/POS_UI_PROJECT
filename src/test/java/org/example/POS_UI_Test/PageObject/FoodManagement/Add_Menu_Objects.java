package org.example.POS_UI_Test.PageObject.FoodManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Menu_Objects {

    WebDriver ldriver;
    WebElement[] bt;
    WebElement[] tb;
    WebElement[] dd;
    public Add_Menu_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
        bt=new WebElement[]{FoodManagement,AddMenu};
        tb=new WebElement[]{foodName,foodCode,price,description,image};
        dd=new WebElement[]{category,subCategory};
    }

    @FindBy(xpath = "//p[normalize-space()=\"Food Management\"]")
    WebElement FoodManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Add Menu\"]")
    WebElement AddMenu;
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


    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;

    public void ClickOnButtons(String name)
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
        for (WebElement t:tb)
        {
            if (t.getAttribute("name").contains(name))
            {
                t.sendKeys(value);
            }
        }
    }
    public void ClickOnDropdown(String name)
    {
        for (WebElement d:dd)
        {
            if (d.getAttribute("id").contains(name))
            {
                d.click();
            }
        }
    }
    public void ClickOnSubmitButton()
    {
        Submit.click();
    }
}
