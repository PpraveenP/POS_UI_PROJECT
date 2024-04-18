package org.example.POS_UI_Test.TestCases.FoodManagement.Addon;

import org.example.POS_UI_Test.PageObject.FoodManagement.Addon.Add_Addons_List_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Add_Addons_List_Test extends BaseClass {

    @Test()
    public void Validating_Addons_List()
    {
        Add_Addons_List_Objects  al=new Add_Addons_List_Objects(driver);
        al.ClickOnButton("Food Management");
        al.ClickOnButton("Add-On List");
    }
    @Test()
    public void Validating_Addons_List_SearchText_Box()
    {
        Add_Addons_List_Objects  al=new Add_Addons_List_Objects(driver);
        al.ClickOnButton("Food Management");
        al.ClickOnButton("Add-On List");
        al.ClickOnButtons("Search");
    }
    @Test()
    public void Validating_Addons_List_PDF_Button()
    {
        Add_Addons_List_Objects  al=new Add_Addons_List_Objects(driver);
        al.ClickOnButton("Food Management");
        al.ClickOnButton("Add-On List");
        al.ClickOnButtons("PDF");
    }
    @Test()
    public void Validating_Addons_List_Excel_Button()
    {
        Add_Addons_List_Objects  al=new Add_Addons_List_Objects(driver);
        al.ClickOnButton("Food Management");
        al.ClickOnButton("Add-On List");
        al.ClickOnButtons("Excel");
    }
    @Test()
    public void Validating_Addons_List_Addons_Button()
    {
        Add_Addons_List_Objects  al=new Add_Addons_List_Objects(driver);
        al.ClickOnButton("Food Management");
        al.ClickOnButton("Add-On List");
        al.ClcickOnAddons();
    }   @Test()
    public void Validating_Addons_List_Edit_Button() throws InterruptedException {
        Add_Addons_List_Objects  al=new Add_Addons_List_Objects(driver);
        al.ClickOnButton("Food Management");
        al.ClickOnButton("Add-On List");
        al.ClickOnEdit();
        al.ClickOnUpdate();
        Thread.sleep(1000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Form Update Successfull !",message,driver);
    }
    @Test()
    public void Validating_Addons_List_Delete_Button() throws InterruptedException {
        Add_Addons_List_Objects  al=new Add_Addons_List_Objects(driver);
        al.ClickOnButton("Food Management");
        al.ClickOnButton("Add-On List");
        Thread.sleep(2000);
        al.ClcickOnDelete();
        al.ClickOnDeleteYes();
        Thread.sleep(1000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Addon Delete successfully.. !",message,driver);
    }
}
