package org.example.POS_UI_Test.PageObject.FoodManagement.Recipe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recipe_List_Objects {
    WebDriver ldriver;
    public Recipe_List_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Food Management\"]")
    WebElement FoodManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Recipe List\"]")
    WebElement RecipeList;
    @FindBy(xpath = "//input[contains(@placeholder,\"Search\")]")
    WebElement Search;
    @FindBy(xpath = "//span[normalize-space()=\"+\"]")
    WebElement Recipe;
    public void ClickOnRecipe()
    {
        Recipe.click();
    }

    @FindBy(xpath = "//button[normalize-space()=\"PDF\"]")
    WebElement PDF;
    @FindBy(xpath = "//button[normalize-space()=\"Excel\"]")
    WebElement Excel;
    @FindBy(xpath = "(//*[name()='path'])[9]")
    WebElement Edit;
    public void ClickOnEdit()
    {
        Edit.click();
    }
    @FindBy(xpath = "(//*[name()='path'])[10]")
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
        WebElement[] bt=new WebElement[]{FoodManagement,RecipeList};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }
    }
    public void ClickOnButtons(String name) {
        WebElement[] bt = new WebElement[]{PDF, Excel, Search};
        for (WebElement b : bt) {
            if (b.getText().contains(name)) {
                b.click();
            }
        }


    }
}
