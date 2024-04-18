package org.example.POS_UI_Test.PageObject.FoodManagement.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Food_List_Objects {
    WebDriver ldriver;
    public Food_List_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Food Management\"]")
    WebElement FoodManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Food List\"]")
    WebElement FoodList;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement Search;
    @FindBy(xpath = "(//div[@role='combobox'])[1]")
    WebElement SubCategory;
    public void ClickOnSubCategory()
    {
        SubCategory.click();
    }
    @FindBy(xpath = "(//div[@role='combobox'])[2]")
    WebElement category;
    public void ClickOncategory()
    {
        category.click();
    }
    @FindBy(xpath = "//span[normalize-space()=\"+\"]")
    WebElement Menue;
    public void ClickOnMenue()
    {
        Menue.click();
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
    WebElement Submit;
    public void ClickOnSubmit()
    {
        Submit.click();
    }
    @FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/div[1]//*[name()=\"svg\"]")
    WebElement Delete;
    public void ClickOnDelete()
    {
        Delete.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"Yes\"]")
    WebElement DeleteYes;
    public void ClickOnDeleteYes()
    {
        DeleteYes.click();
    }
    public void ClickOnButton(String name)
    {
        WebElement[] bt=new WebElement[]{FoodManagement,FoodList};
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
        WebElement[] bt=new WebElement[]{PDF,Excel,Search};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }
    }


}
