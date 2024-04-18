package org.example.POS_UI_Test.TestCases.FoodManagement.Addon;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.FoodManagement.Addon.Add_Addons_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Inventory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Add_Addons_Test extends BaseClass {
    @Test
            public void Validating_Add_Addons_Form() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
//        System.out.println(message);
        Validation("Form Submit Successfull !",message,driver);
    }

}
