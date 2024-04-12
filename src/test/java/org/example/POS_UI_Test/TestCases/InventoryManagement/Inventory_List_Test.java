package org.example.POS_UI_Test.TestCases.InventoryManagement;

import org.example.POS_UI_Test.PageObject.InventoryManagement.Add_Inventory_List_Objectes;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Inventory_List_Test extends BaseClass {

    Add_Inventory_List_Objectes il;
    @Test()
    public void Validating_Inventory_List()
    {
       il=new Add_Inventory_List_Objectes(driver);
        il.ClickOnTheButton("Inventory Management");
        il.ClickOnTheButton("Inventory List");
    }
    @Test()
    public void Validating_Inventory_List_UpdateButton() throws InterruptedException {
        il=new Add_Inventory_List_Objectes(driver);
        il.ClickOnTheButton("Inventory Management");
        il.ClickOnTheButton("Inventory List");

       il.ClickOnEdit();
       Thread.sleep(2000);
       il.ClickOnSubmit();
       String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
       Validation("Form updated successfully!",message,driver);

    }
    @Test()
    public void Validating_Inventory_List_PDF_Button()
    {
        il=new Add_Inventory_List_Objectes(driver);
        il.ClickOnTheButton("Inventory Management");
        il.ClickOnTheButton("Inventory List");
        il.ClickOnButtons("PDF");

    }
    @Test()
    public void Validating_Inventory_List_Excel_Button()
    {
        il=new Add_Inventory_List_Objectes(driver);
        il.ClickOnTheButton("Inventory Management");
        il.ClickOnTheButton("Inventory List");
        il.ClickOnButtons("Excel");

    }
    @Test()
    public void Validating_Inventory_List_Delete_Button() throws InterruptedException {
        il=new Add_Inventory_List_Objectes(driver);
        il.ClickOnTheButton("Inventory Management");
        il.ClickOnTheButton("Inventory List");
       Thread.sleep(2000);
       il.ClickonDelete();
       il.ClickOnDeleteYES();
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Invetory Deleted successfully.. !",message,driver);

    }
}
