package org.example.POS_UI_Test.TestCases.FoodManagement.Menu;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.FoodManagement.Menu.Add_Menu_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Inventory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class Add_Menu_Test extends BaseClass {

    @Test()
    public static void Validating_Add_Menu_Form() throws FileNotFoundException, InterruptedException {
        Add_Inventory ai=new Add_Inventory();
        Faker fk=new Faker();
        ai.setFoodName(fk.food().dish());
        ai.setFoodCode(fk.number().digits(2));
        ai.setPrice(fk.number().digits(2)+9);
        ai.setDescription("yammy............");
        ai.setImage(fk.name().lastName());


        Add_Menu_Objects am=new Add_Menu_Objects(driver);
        am.ClickOnButtons("Food Management");
        am.ClickOnButtons("Add Menu");

        am.EnterTheText("foodName",ai.getFoodName());
        am.EnterTheText("foodCode",ai.getFoodCode());
        am.EnterTheText("price",ai.getPrice());
        am.EnterTheText("description",ai.getDescription());
        File f = new File(".//Images/foodimage3.png");
        String imagePath = f.getAbsolutePath();
        am.EnterTheText("image", imagePath);
        am.ClickOnDropdown("select-category");
        driver.findElement(By.xpath("//li[normalize-space()=\"Veg\"]")).click();
        am.ClickOnDropdown("select-subCategory");
        driver.findElement(By.xpath("//li[normalize-space()=\"Veg\"]")).click();

        am.ClickOnSubmitButton();
        Thread.sleep(2000);

        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
//        System.out.println(message);
        Validation("Form Submit Successfull !",message,driver);

    }
    @Test
    public static void Validating_Upload_Food_List() throws FileNotFoundException, InterruptedException {

        Add_Menu_Objects am=new Add_Menu_Objects(driver);
        am.ClickOnButtons("Food Management");
        am.ClickOnButtons("Add Menu");

        File f=new File(".//TestData/FoodList (1).xlsx");
        String fi = f.getAbsolutePath();
        am.ClickOnChosefile(fi);
        Thread.sleep(2000);
        am.ClickonUpload();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
//        System.out.println(message);
        Validation("Excel File added Successfully",message,driver);

    }
    public static void Validating_Add_Menu_Forms() throws FileNotFoundException, InterruptedException {
        Add_Inventory ai=new Add_Inventory();
        Faker fk=new Faker();
        ai.setFoodName(fk.food().dish());
        ai.setFoodCode(fk.number().digits(2));
        ai.setPrice(fk.number().digits(2)+9);
        ai.setDescription("yammy............");
        ai.setImage(fk.name().lastName());


        Add_Menu_Objects am=new Add_Menu_Objects(driver);
        am.ClickOnButtons("Food Management");
        am.ClickOnButtons("Add Menu");

        am.EnterTheText("foodName",ai.getFoodName());
        am.EnterTheText("foodCode",ai.getFoodCode());
        am.EnterTheText("price",ai.getPrice());
        am.EnterTheText("description",ai.getDescription());
        File f = new File(".//Images/foodimage3.png");
        String imagePath = f.getAbsolutePath();
        am.EnterTheText("image", imagePath);
        am.ClickOnDropdown("select-category");
        driver.findElement(By.xpath("//li[normalize-space()=\"Veg\"]")).click();
        am.ClickOnDropdown("select-subCategory");
        driver.findElement(By.xpath("//li[normalize-space()=\"Veg\"]")).click();

        am.ClickOnSubmitButton();
//        Thread.sleep(2000);
//
//        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
////        System.out.println(message);
//        Validation("Form Submit Successfull !",message,driver);

    }

}
