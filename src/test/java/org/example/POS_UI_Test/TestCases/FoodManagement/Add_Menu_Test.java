package org.example.POS_UI_Test.TestCases.FoodManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.FoodManagement.Add_Menu_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Inventory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Add_Menu_Test extends BaseClass {

    @Test()
    public static void Validating_Add_Menu_Form() throws FileNotFoundException {
        Add_Inventory ai=new Add_Inventory();
        Faker fk=new Faker();
        ai.setFoodName(fk.food().dish());
        ai.setFoodCode(fk.number().digits(2));
        ai.setPrice(fk.number().digits(2));
        ai.setDescription("yammy............");
        ai.setImage(fk.name().lastName());


        Add_Menu_Objects am=new Add_Menu_Objects(driver);
        am.ClickOnButtons("Food Management");
        am.ClickOnButtons("Add Menu");

        am.EnterTheText("foodName",ai.getFoodName());
        am.EnterTheText("foodCode",ai.getFoodCode());
        am.EnterTheText("price",ai.getPrice());
        am.EnterTheText("description",ai.getDescription());
        File f = new File(".//Images/foodimage.avif");
        String imagePath = f.getAbsolutePath();
        am.EnterTheText("image", imagePath);
        am.ClickOnDropdown("select-category");
        driver.findElement(By.xpath("//li[normalize-space()=\"Veg\"]")).click();
        am.ClickOnDropdown("select-subCategory");
        driver.findElement(By.xpath("//li[normalize-space()=\"Veg\"]")).click();

        am.ClickOnSubmitButton();

    }

}
