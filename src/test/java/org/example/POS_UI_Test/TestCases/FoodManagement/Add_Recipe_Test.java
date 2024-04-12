package org.example.POS_UI_Test.TestCases.FoodManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.FoodManagement.Add_Recipe_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Add_Recipe_Test extends BaseClass {
    @Test()
    public void Validating_Add_Recipe_Form() throws InterruptedException {
        Add_Recipe_Objects ar=new Add_Recipe_Objects(driver);
        ar.ClickOnButtons("Food Management");
        ar.ClickOnButtons("Add Recipe");


        ar.ClickOnDropdowns("mui-component-select-productName");

//       driver.findElement(By.xpath("div[id=\"menu-productName\"] li:nth-child("+list.size()+")")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li[3]")).click();

//        WebElement list = driver.findElement(By.className("MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz"));
//        System.out.println(list.getSize());

        ar.ClickOnDropdowns("ingredientName");
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li[22]")).click();
        Faker fk=new Faker();
        ar.EnterTheQuatity(fk.number().digits(1)+1);

//        ar.ClickOnButtons("mui-component-select-unit");
        ar.ClickOnSelectUnit();
        driver.findElement(By.xpath("//li[normalize-space()=\"Kg\"]")).click();
        ar.ClickOnSubmit();

        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Recipe Added Successfull !",message,driver);


    }
}
