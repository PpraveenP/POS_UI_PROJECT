package org.example.POS_UI_Test.TestCases.FoodManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.FoodManagement.Add_Addons_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Inventory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Add_Addons_Test extends BaseClass {
    @Test
            public void Validating_Add_Addons_Form()
    {
        Add_Inventory ai=new Add_Inventory();
        Faker fk=new Faker();
        ai.setName(fk.food().ingredient());
        ai.setFoodCode(fk.number().digits(2));
        ai.setPrice(fk.number().digits(3));
        ai.setDescription("yammii....");
        ai.setImage(fk.name().lastName());

        Add_Addons_Objects ao=new Add_Addons_Objects(driver);
        ao.ClickOnButton("Food Management");
        ao.ClickOnButton("Add Addons");

        ao.EnterTheText("foodName",ai.getName());
        ao.EnterTheText("foodCode",ai.getFoodCode());
        ao.EnterTheText("price",ai.getPrice());

        ao.ClickOnDopdown("select-category");
        driver.findElement(By.xpath("//li[normalize-space()=\"Addon\"]")).click();

        ao.ClickOnDopdown("subCategory");
        driver.findElement(By.xpath("//li[normalize-space()=\"Addon\"]")).click();

        ao.EnterTheText("description",ai.getDescription());
        ao.EnterTheText("image",ai.getImage());

        ao.ClikOnCheckbox();
        ao.ClickOnSybmit();


    }

}
