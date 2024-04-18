package org.example.POS_UI_Test.TestCases.RoleManagement.UserRoleAccess;

import org.example.POS_UI_Test.PageObject.RoleManagement.UserRoleAccess.User_Role_Access_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class User_Role_Access_Test extends BaseClass {
    @Test()
    public void Validating_User_Role_Access() throws InterruptedException {
        User_Role_Access_Objects ur=new User_Role_Access_Objects(driver);
        ur.ClickonButton("Role Permission");
        ur.ClickonButton("User Role Access");
        ur.ClickonSelectUsername();
        int size = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li")).size();
        System.out.println(size);
//        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size+"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size+"]")).click();

        for (int i=1; i<=9; i++)
        {
            driver.findElement(By.xpath("(//input[@aria-label='Checkbox demo'])["+i+"]")).click();
        }
        ur.clickOnSubmit();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        System.out.println(message);
        Validation("Role Permissions Assigned Successfully !",message,driver);
//        Validation("Role permissions have already been assigned. To update roles, please navigate to Update Role Access.",message,driver);

    }
}

