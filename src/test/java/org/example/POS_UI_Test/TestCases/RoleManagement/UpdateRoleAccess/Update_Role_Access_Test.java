package org.example.POS_UI_Test.TestCases.RoleManagement.UpdateRoleAccess;

import org.example.POS_UI_Test.PageObject.RoleManagement.UpdateRoleAccess.Update_Role_Access_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Update_Role_Access_Test extends BaseClass {
    @Test()
    public void Validating_Update_Role_Access() throws InterruptedException {

        Update_Role_Access_Objects up = new Update_Role_Access_Objects(driver);
        up.ClickonButton("Role Permission");
        up.ClickonButton("Update Role Access");
        up.ClickonSelectUsername();
        int size = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li")).size()-1;

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size+"]")).click();

        for (int i=1; i<=8; i++)
        {
            driver.findElement(By.xpath("(//input[@aria-label='Checkbox demo'])["+i+"]")).click();
        }
        up.clickOnSubmit();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        System.out.println(message);
        Validation("Role Permissions Updated Successfully!",message,driver);
    }
}
