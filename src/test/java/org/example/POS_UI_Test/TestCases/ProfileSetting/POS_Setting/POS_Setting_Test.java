package org.example.POS_UI_Test.TestCases.ProfileSetting.POS_Setting;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.ProfileSetting.POS_Setting.POS_Setting_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.POS_UI_Test.TestUtilitiese.TestListener;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class POS_Setting_Test extends BaseClass {
    static POS_Setting_Objects po;

    public static void add_category_Process(String name)
    {
        po=new POS_Setting_Objects(driver);
        po.ClickOnButton("Profile Settings");
        po.ClickOnButton("Pos Settings");
        po.EnterTheName(name);
        po.ClickOnSubmit();
//        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
////        System.out.println(message);
//        Validation("Form Submit Successfull !",message,driver);
    }
    @Test()
    public static void Validating_POS_Setting_Form()
    {
        add_category_Process("Veg");
    }
    @Test()
    public static void Validating_POS_Setting_Form_for_category() throws InterruptedException {
        Faker fk=new Faker();
        add_category_Process(fk.food().dish());
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
//        System.out.println(message);
        Validation("Form Submit Successfull !",message,driver);
    }
}
