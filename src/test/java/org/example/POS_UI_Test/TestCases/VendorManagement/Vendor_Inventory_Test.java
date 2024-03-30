package org.example.POS_UI_Test.TestCases.VendorManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.VendorManagement.Vendor_Inventory_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Inventory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Vendor_Inventory_Test extends BaseClass {

    @Test
    public void Validating_Vendor_Inventory_Form()
    {
        Add_Inventory ao=new Add_Inventory();
        Faker fk=new Faker();
        ao.setInventoryCode(fk.code().isbnGroup());
        ao.setQuantity(fk.number().digits(2));
        ao.setPrice(fk.number().digits(2));
        ao.setDiscount(fk.number().digits(1)+"1");

        Vendor_Inventory_Objects vi=new Vendor_Inventory_Objects(driver);
        vi.ClickOnButtton("Vendor Management");
        vi.ClickOnButtton("Vendor Inventory");

        vi.EnterTheText("inventoryCode",ao.getInventoryCode());
        vi.EnterTheText("quantity",ao.getQuantity());
        vi.EnterTheText("price",ao.getPrice());
        vi.EnterTheText("discount",ao.getDiscount());






//        vi.ClickDropDown("Select unit","Kg");
//        driver.findElement(By.xpath("//li[normalize-space()=\"Select Vendor\"]")).click();
//
//        List<WebElement> vendorNames = driver.findElements(By.xpath("//li[normalize-space()=\"Select Vendor\"]"));
//        for (WebElement v:vendorNames)
//        {
//            System.out.println(v.getAttribute("id"));
//        }

//         WebElement ul_element = driver.findElement(By.xpath("//ul[@id=\":r6:\"]"));
//
//        List<WebElement> li_elements = ul_element.findElements(By.id("menu-vendorName"));
//        for (WebElement li:li_elements)
//        {
//            System.out.println(li.getText());
//        }

//
//        List<WebElement> list1 = driver.findElements(By.xpath(""));
//        int count= list1.size();
//        int t=10;
//
//        for (int j=0;j<=5;j++) {
//
//            for (int i = 0; i <= 2; i++) {
//                list1.get(fk.number().randomDigit()).click();
//
//            }
//
//        }


    }
}
