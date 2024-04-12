package org.example.POS_UI_Test.TestCases.InventoryManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.InventoryManagement.Add_Inventory_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Inventory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
        String date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
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
        io.Enter_Dropdown_Fields("select-category");
//        driver.findElement(By.xpath("div[id=\"menu-category\"] li:nth-child(4)")).click();
       int size= driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li")).size();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size+"]")).click();

        io.Enter_Dropdown_Fields("select-unit");
        int size1= driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li")).size();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size1+"]")).click();

        io.Enter_Dropdown_Fields("minLevelUnit");
        int size2= driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li")).size();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size2+"]")).click();

        io.ClickSubmitButton();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Form Submit successfully !",message,driver);


    }
}
