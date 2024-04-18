package org.example.POS_UI_Test.TestCases.Store_Login;

import org.example.POS_UI_Test.PageObject.Store_Login.Store_Login_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Store_Login_Test extends BaseClass {


    public ArrayList<String> username;
    @Test(priority = 1)
    public void ValidatingStoreLogin() throws InterruptedException {
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
        for (int i=0;i<110;i++)
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
            if(i>=100) {
//                System.out.println(username.get(i));
            }
            k++;
        }
        Thread.sleep(1000);
        Logout_Method();

        for (int i=105;i<username.size();i++)
        {
            try {
                Thread.sleep(1000);
                LoginMethod(String.valueOf(username.get(i)), "Praveen@123");
                Thread.sleep(2000);
                Logout_Method();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Thread.sleep(3000);
        loginMethod();
        Thread.sleep(3000);

    }

}
