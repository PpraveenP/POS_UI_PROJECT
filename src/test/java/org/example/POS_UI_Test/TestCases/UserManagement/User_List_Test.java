package org.example.POS_UI_Test.TestCases.UserManagement;

import org.example.POS_UI_Test.PageObject.UserManagement.User_List_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class User_List_Test extends BaseClass {
    @Test()
    public void Validating_USer_List()
    {
        User_List_Objects ul=new User_List_Objects(driver);
        ul.ClickOnButton("User Management");
        ul.ClickOnButton("Users List");
    }
    @Test()
    public void Validating_USer_List_AddUser_Link()
    {
        User_List_Objects ul=new User_List_Objects(driver);
        ul.ClickOnButton("User Management");
        ul.ClickOnButton("Users List");
        ul.ClickOnAddUser();
    }
    @Test()
    public void Validating_USer_List_PDF_Link()
    {
        User_List_Objects ul=new User_List_Objects(driver);
        ul.ClickOnButton("User Management");
        ul.ClickOnButton("Users List");
        ul.ClickOnButtons("PDF");
    }
    @Test()
    public void Validating_USer_List_Excel_Link()
    {
        User_List_Objects ul=new User_List_Objects(driver);
        ul.ClickOnButton("User Management");
        ul.ClickOnButton("Users List");
        ul.ClickOnButtons("Excel");
    }
    @Test()

    public void Validating_USer_List_Update_Link() throws InterruptedException {
        User_List_Objects ul=new User_List_Objects(driver);
        ul.ClickOnButton("User Management");
        ul.ClickOnButton("Users List");
        ul.ClickOnEdit();
        Thread.sleep(1000);
        ul.ClickOnUpdate();
        Thread.sleep(1000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Form updated successfully!",message,driver);
    }
    @Test()
    public void Validating_USer_List_Delete_Link() throws InterruptedException {
        User_List_Objects ul=new User_List_Objects(driver);
        ul.ClickOnButton("User Management");
        ul.ClickOnButton("Users List");
        ul.ClickOnDelete();
        Thread.sleep(1000);
        ul.ClickOnDeleteYes();
        Thread.sleep(1000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("User Deleted successfully.. !",message,driver);
    }
    @Test()
    public void Validating_USer_List_Search_TextBox()
    {
        User_List_Objects ul=new User_List_Objects(driver);
        ul.ClickOnButton("User Management");
        ul.ClickOnButton("Users List");
        ul.ClickOnButtons("Search");
    }

}
