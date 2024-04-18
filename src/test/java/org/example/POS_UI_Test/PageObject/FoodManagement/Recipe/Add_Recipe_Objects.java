package org.example.POS_UI_Test.PageObject.FoodManagement.Recipe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Recipe_Objects {

    WebDriver ldriver;
    public Add_Recipe_Objects(WebDriver rdriver)

    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Food Management\"]")
    WebElement FoodManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Add Recipe\"]")
    WebElement AddRecipe;
    @FindBy(xpath = "//div[@id=\"mui-component-select-productName\"]")
    WebElement selectproductName;
    @FindBy(xpath = "//div[@id=\"mui-component-select-ingredientName\"]")
    WebElement selectingredientName;
    @FindBy(xpath = "//input[@name=\"quantity\"]")
    WebElement quantity;
    public void EnterTheQuatity(String value)
    {
       quantity.sendKeys(value);
    }
    @FindBy(xpath = "//div[@id=\"mui-component-select-unit\"]")
    WebElement selectunit;
    public void ClickOnSelectUnit()
    {
        selectunit.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;
    public void ClickOnSubmit()
    {
        Submit.click();
    }
    @FindBy(xpath = "//span[normalize-space()=\"+ More\"]")
    WebElement More;
    @FindBy(xpath = "")
    WebElement dd;
    public void ClickOnDropdowns(String name)
    {
          WebElement[] tb=new WebElement[]{selectproductName,selectingredientName,selectunit};
          for (WebElement t:tb)
          {
              if (t.getAttribute("id").contains(name))
              {
                  t.click();
              }
          }

    }

    public void ClickOnButtons(String name)
    {
          WebElement[] tb=new WebElement[]{FoodManagement,AddRecipe};
        for (WebElement t:tb)
        {
            if (t.getText().contains(name))
            {
                t.click();
            }
        }

    }
}
