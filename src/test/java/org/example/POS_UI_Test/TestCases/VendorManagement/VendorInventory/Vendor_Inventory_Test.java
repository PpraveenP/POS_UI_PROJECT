package org.example.POS_UI_Test.TestCases.VendorManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.VendorManagement.Vendor_Inventory_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Inventory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Vendor_Inventory_Test extends BaseClass {

    @Test
    public void Validating_Vendor_Inventory_Form() throws InterruptedException {
        Add_Inventory ao=new Add_Inventory();
        Faker fk=new Faker();
        ao.setFoodName(fk.food().dish());
        ao.setInventoryCode(fk.code().isbnGroup());
        ao.setQuantity(fk.number().digits(2));
        ao.setPrice(fk.number().digits(2));
        ao.setDiscount(fk.number().digits(1)+"1");



        Vendor_Inventory_Objects vi=new Vendor_Inventory_Objects(driver);
        vi.ClickOnButtton("Vendor Management");
        vi.ClickOnButtton("Vendor Inventory");


        vi.ClickDropDown("Select Vendor");
//        driver.findElement(By.xpath("//div[@class=\"MuiBox-root css-k008qs\"]//li[1]")).click();
//        driver.findElement(By.xpath("//li[normalize-space()=\"harish\"]")).click();
        Thread.sleep(2000);
        int size = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li")).size();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size+"]")).click();
        vi.EnterTheText("itemName",ao.getFoodName());
        vi.EnterTheText("inventoryCode",ao.getInventoryCode());
        vi.EnterTheText("quantity",ao.getQuantity());

        vi.ClickDropDown("Select unit");
       vi.ClickOnKg();
        vi.EnterTheText("price",ao.getPrice());
        vi.EnterTheText("discount",ao.getDiscount());

        vi.ClickOnSubmit();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Form Submit Successfull !",message,driver);


    }
}
