package org.example.POS_UI_Test.TestCases.ProfileSetting.TaxSetting;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.ProfileSetting.TaxSetting.Tax_Setting_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tax_Setting_Test extends BaseClass {
    public Faker fk;
    @Test()
    public void Validating_TaxSetting_Form()
    {
        Tax_Setting_Objects ts=new Tax_Setting_Objects(driver);
        fk=new Faker();
        ts.ClickOnButtons("Profile Settings");
        ts.ClickOnButtons("Tax Settings");
        ts.ClickonTax();
        ts.EnterTheText("name",fk.name().firstName());
        ts.EnterTheText("rate",1+fk.number().digits(1));
        ts.ClickonSubmit();

        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
//        System.out.println(message);
        Validation("Form Submit Successful !",message,driver);
    }
    @Test(priority = 1,dependsOnMethods = "Validating_TaxSetting_Form")
    public void Validating_TaxSetting_Update_Process() throws InterruptedException {
        Tax_Setting_Objects ts=new Tax_Setting_Objects(driver);
        ts.ClickOnButtons("Profile Settings");
        ts.ClickOnButtons("Tax Settings");
        List<WebElement> list = driver.findElements(By.xpath("//tbody/tr"));
        for (WebElement e:list)
        {
            driver.findElement(By.xpath("(//*[name()='path'])[9]")).click();
            ts.EnterTheText("name",fk.name().firstName());
            ts.EnterTheText("rate",1+fk.number().digits(1));
            ts.ClickonSubmit();
            Thread.sleep(2000);
            String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
            System.out.println(message);
            Validation("Form Submit Successful !",message,driver);
        }

    }
    @Test(priority = 2,dependsOnMethods = "Validating_TaxSetting_Form")
    public void Validating_TaxSetting_Delete_Operation()
    {
        Tax_Setting_Objects ts=new Tax_Setting_Objects(driver);
        ts.ClickOnButtons("Profile Settings");
        ts.ClickOnButtons("Tax Settings");
        List<WebElement> list = driver.findElements(By.xpath("//tbody/tr"));
        for (WebElement e:list)
        {
            driver.findElement(By.xpath("(//*[name()='path'])[10]")).click();
            driver.findElement(By.xpath("//button[normalize-space()=\"Yes\"]")).click();

            String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
//        System.out.println(message);
            Validation("Tax Data Deleted successfully.. !",message,driver);
        }
    }


}
