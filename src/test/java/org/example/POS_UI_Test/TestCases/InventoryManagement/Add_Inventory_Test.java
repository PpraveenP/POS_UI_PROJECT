package org.example.POS_UI_Test.TestCases.InventoryManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.InventoryManagement.Add_Inventory_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Inventory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Add_Inventory_Test extends BaseClass {
    Add_Inventory_Objects AI;
    @Test()
    public void Validating_Add_Inventory_Form() throws InterruptedException {


        Add_Inventory ad=new Add_Inventory();
        Faker fk=new Faker();
        ad.setName(fk.food().ingredient());
        ad.setInventoryCode(fk.number().digits(2));
        ad.setPrice(fk.number().digits(3));
        ad.setQuantity(fk.number().digits(2));
        String date=new SimpleDateFormat("mm-dd-yyyy").format(new Date());
        ad.setExpiryDate(date);
        ad.setMinLevel(fk.number().digits(2)+2);

        Add_Inventory_Objects io=new Add_Inventory_Objects(driver);

        io.ClickONInventoryManagement();
        io.ClickONAddInventory();

        io.Enter_text_Fields("name",ad.getName());
        io.Enter_text_Fields("inventoryCode",ad.getInventoryCode());
        io.Enter_text_Fields("price",ad.getPrice());
        io.Enter_text_Fields("quantity",ad.getQuantity());
        io.Enter_text_Fields("minLevel",ad.getMinLevel());
        io.Enter_text_Fields("expiryDate",ad.getExpiryDate());

//        driver.findElement(By.xpath("//li[normalize-space()=\"Select Category\"]")).click();
//        List<WebElement> categoryDropdown = driver.findElements(By.xpath("//ul[@id=\":r8:\"]"));
//        for (WebElement d:categoryDropdown)
//        {
//
//            if (d.getTagName().contains("Grocery"))
//            {
//                d.click();
//            }
//        }
//
//        io.Enter_Dropdown_Fields("Material");
//        io.Enter_Dropdown_Fields("kilograms");
//        io.Enter_Dropdown_Fields("Gram");

        WebElement category = driver.findElement(By.xpath("//ul[@id=\":r1:\"]"));
        Select s=new Select(category);
        Thread.sleep(3000);
        List<WebElement> allOp = s.getOptions();
        for (int i=0;i<=allOp.size();i++)
        {
            System.out.println(allOp.get(i).getText());
        }
    }
}
