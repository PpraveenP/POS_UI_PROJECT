package org.example.POS_UI_Test.TestCases.Store_Login;

import org.example.POS_UI_Test.PageObject.Store_Login.Store_Login_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.POS_UI_Test.TestCases.FoodManagement.Add_Menu_Test;
import org.example.POS_UI_Test.TestCases.ProfileSetting.POS_Setting.POS_Setting_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Store_Login_Test extends BaseClass {

    @Test()
    public void ValidatingStoreLogin() throws InterruptedException {
        Store_Login_Objects so=new Store_Login_Objects(driver);

        so.ClickOnButton("Store Management");
        so.ClickOnButton("Store List");

        ArrayList<String> username = new ArrayList<>();

            int k=1;
            int l=10;
            int j=2;
        for (int i=0;i<1200;i++)
        {
            if (i==l)
            {
                driver.findElement(By.xpath("//button[normalize-space()=\""+j+"\"]")).click();
                j++;
                k=1;
                l=l+10;
            }

            String text = driver.findElement(By.cssSelector("tbody tr:nth-child("+k+") td:nth-child(4) span:nth-child(1)")).getText();
            username.add(text);
//            System.out.println( username.get(i));
            k++;
        }

        LogoutMethod();
        for (int i=275;i<username.size();i++)
        {
            try {
                if (username.get(i).length()<=15) {
                    LoginMethod(String.valueOf(username.get(i)), "Praveen@123");
                    Thread.sleep(2000);
                    POS_Setting_Test.Validating_POS_Setting_Form();
                    Thread.sleep(2000);
                    driver.navigate().refresh();
//                    Add_Menu_Test.Validating_Add_Menu_Form();
                    LogoutMethod();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
