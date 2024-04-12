package org.example.POS_UI_Test.TestCases.Store_Login;

import org.example.POS_UI_Test.PageObject.Store_Login.Store_Login_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.POS_UI_Test.TestCases.FoodManagement.Add_Menu_Test;
import org.example.POS_UI_Test.TestCases.ProfileSetting.POS_Setting.POS_Setting_Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.AbstractList;
import java.util.ArrayList;

public class Add_Menu_For_All_Store extends BaseClass {
    public ArrayList<String> username;
    public AbstractList<String> GetAllDataOfStore() throws InterruptedException {
        Thread.sleep(3000);
        Logout_Method();
        TechLogin();
        Store_Login_Objects so=new Store_Login_Objects(driver);
        so.ClickOnButton("Store Management");
        so.ClickOnButton("Store List");

        username = new ArrayList<>();

        int k=1;
        int l=10;
        int j=2;
        for (int i=0;i<200;i++)
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
            k++;
        }
        Logout_Method();

        return username;
    }
    @Test(priority = 2)
    public void AddMenu_Form_For_All_Store() throws InterruptedException {
        AbstractList<String> username= (GetAllDataOfStore());
        for (int i=195;i<username.size();i++)
        {
            try {
                LoginMethod(String.valueOf(username.get(i)), "Praveen@123");
                Thread.sleep(2000);
                POS_Setting_Test.Validating_POS_Setting_Form();
                Thread.sleep(2000);
//                    for (int j=0;j<1;j++)
//                    {
                driver.navigate().refresh();
                Add_Menu_Test.Validating_Add_Menu_Form();
                driver.navigate().refresh();
//                    }
                Logout_Method();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
