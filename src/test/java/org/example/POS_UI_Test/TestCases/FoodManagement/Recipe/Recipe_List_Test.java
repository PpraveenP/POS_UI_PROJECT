package org.example.POS_UI_Test.TestCases.FoodManagement.Recipe;

import org.example.POS_UI_Test.PageObject.FoodManagement.Recipe.Recipe_List_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Recipe_List_Test extends BaseClass {
    @Test()
    public void Validating_Recipe_List()
    {
        Recipe_List_Objects rl=new Recipe_List_Objects(driver);
        rl.ClickOnButton("Food Management");
        rl.ClickOnButton("Recipe List");
    }
    @Test()
    public void Validating_Recipe_List_Search_Text_Box()
    {
        Recipe_List_Objects rl=new Recipe_List_Objects(driver);
        rl.ClickOnButton("Food Management");
        rl.ClickOnButton("Recipe List");
        rl.ClickOnButtons("Search");
    }
    @Test()
    public void Validating_Recipe_List_Recipe_Button()
    {
        Recipe_List_Objects rl=new Recipe_List_Objects(driver);
        rl.ClickOnButton("Food Management");
        rl.ClickOnButton("Recipe List");
        rl.ClickOnRecipe();
    }
    @Test()
    public void Validating_Recipe_List_PDF_Button()
    {
        Recipe_List_Objects rl=new Recipe_List_Objects(driver);
        rl.ClickOnButton("Food Management");
        rl.ClickOnButton("Recipe List");
        rl.ClickOnButtons("PDF");
    }
    @Test()
    public void Validating_Recipe_List_Excel_Button()
    {
        Recipe_List_Objects rl=new Recipe_List_Objects(driver);
        rl.ClickOnButton("Food Management");
        rl.ClickOnButton("Recipe List");
        rl.ClickOnButtons("Excel");
    }
    @Test()
    public void Validating_Recipe_List_Edit_button()
    {
        Recipe_List_Objects rl=new Recipe_List_Objects(driver);
        rl.ClickOnButton("Food Management");
        rl.ClickOnButton("Recipe List");
        rl.ClickOnEdit();
    }
    @Test()
    public void Validating_Recipe_List_delete_button() throws InterruptedException {
        Recipe_List_Objects rl=new Recipe_List_Objects(driver);
        rl.ClickOnButton("Food Management");
        rl.ClickOnButton("Recipe List");
        List<WebElement> list = driver.findElements(By.xpath("(//div[@class='justify-all-center MuiBox-root css-1veuti'])"));
        for (WebElement l:list) {
            Thread.sleep(1000);
            rl.ClickOnDelete();
            Thread.sleep(1000);
            rl.ClickOnDeleteYes();
        }
    }

}
