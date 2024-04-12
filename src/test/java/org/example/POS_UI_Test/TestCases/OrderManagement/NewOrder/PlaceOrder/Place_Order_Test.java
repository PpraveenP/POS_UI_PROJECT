package org.example.POS_UI_Test.TestCases.OrderManagement.NewOrder.PlaceOrder;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.OrderManagement.NewOrder.PlaceOrder.Place_Order_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Place_Order_Test extends BaseClass {
    public Place_Order_Objects po;

    public void PlaceOrderProcess() {
        po = new Place_Order_Objects(driver);
        po.ClickOnButton("Order Management");
        po.ClickOnButton("New Order");

        List<WebElement> list = driver.findElements(By.xpath("(//div[@class='MuiCardContent-root css-15ar81u'])"));
//        for (WebElement l:list)
//        {
//            l.click();
//        }
        Faker fk = new Faker();
        for (int i = 0; i < fk.number().randomDigit() + 1; i++) {
            list.get(i).click();
        }
    }
//    @Test()
//    public void Validating_Place_Order_Process_Through_DineIn() throws InterruptedException {
//        for (int i = 0; i <1; i++) {
//            PlaceOrderProcess();
//            po.ClickOnDinein();
//            po.ClickOnselectTable();
////            po.selectTableNo();
//          int size=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li")).size();
//          System.out.println(size);
//          driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size+"]")).click();
//            po.ClickOnPlaceOrder();
//            Thread.sleep(2000);
//            String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
//            Thread.sleep(2000);
//            Validation("Order placed successfully!",message,driver);
//        }
//    }

    @Test()


    public void Validating_Place_Order_Process_Through_TakeAway() throws InterruptedException {
        for (int i = 0; i <1; i++) {
            PlaceOrderProcess();
            po.ClickOnTakeAway();
            po.ClickOnPlaceOrder();

            Thread.sleep(2000);
            String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
            Thread.sleep(2000);
            Validation("Order placed successfully!",message,driver);
        }
    }
    @Test()
    public void Validating_Place_Order_Process_Through_Delivery() throws InterruptedException {
        for (int i = 0; i <1; i++) {
            PlaceOrderProcess();
            po.ClickOnDelivery();
            po.ClickOnPlaceOrder();

            Thread.sleep(2000);
            String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
            Thread.sleep(2000);
            Validation("Order placed successfully!",message,driver);
        }
    }
}
