package org.example.POS_UI_Test.TestCases.OrderManagement.NewOrder.KOT;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.OrderManagement.NewOrder.KOT.KOT_Order_Objects;
import org.example.POS_UI_Test.PageObject.OrderManagement.NewOrder.QuickBlill.Quick_Bill_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Kot_Order_Test extends BaseClass {

    KOT_Order_Objects qb;

    public void KOT_Order_ProcessWithTakeAway(String name) throws InterruptedException {
        qb=new KOT_Order_Objects(driver);
        qb.ClickOnButtton("Order Management");
        qb.ClickOnButtton("New Order");

        List<WebElement> list = driver.findElements(By.xpath("(//div[@class='MuiCardContent-root css-15ar81u'])"));
//        for (WebElement l:list)
//        {
//            l.click();
//        }
        Faker fk = new Faker();
        for (int i = 0; i < fk.number().randomDigit() + 1; i++) {
            list.get(i).click();
        }

        qb.ClickOnButtons("TAKE AWAY");
        qb.ClickOnButtons(name);
        qb.ClickOnKOTOrder();

        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[normalize-space()=\"No\"]")).click();
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Kot Submited Successfully !",message,driver);


    }

    public void KOT_Order_ProcessWithDelivery(String name) throws InterruptedException {
        qb=new KOT_Order_Objects(driver);
        qb.ClickOnButtton("Order Management");
        qb.ClickOnButtton("New Order");

        List<WebElement> list = driver.findElements(By.xpath("(//div[@class='MuiCardContent-root css-15ar81u'])"));
//        for (WebElement l:list)
//        {
//            l.click();
//        }
        Faker fk = new Faker();
        for (int i = 0; i < fk.number().randomDigit() + 1; i++) {
            list.get(i).click();
        }
        qb.ClickOnButtons("DELIVERY");
        qb.ClickOnButtons(name);
        qb.ClickOnKOTOrder();

        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[normalize-space()=\"No\"]")).click();
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Kot Submited Successfully !",message,driver);


    }
    public void KOT_Order_ProcessWithDineIn(String name) throws InterruptedException {
        qb=new KOT_Order_Objects(driver);
        qb.ClickOnButtton("Order Management");
        qb.ClickOnButtton("New Order");

        List<WebElement> list = driver.findElements(By.xpath("(//div[@class='MuiCardContent-root css-15ar81u'])"));
//        for (WebElement l:list)
//        {
//            l.click();
//        }
        Faker fk = new Faker();
        for (int i = 0; i < fk.number().randomDigit() + 1; i++) {
            list.get(i).click();
        }
        qb.ClickOnButtons("DINE IN");
//        qb.ClickOnselectTable();
        int size=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li")).size();
        System.out.println(size);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size+"]")).click();
        qb.ClickOnButtons(name);
        qb.ClickOnKOTOrder();

        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[normalize-space()=\"No\"]")).click();
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Kot Submited Successfully !",message,driver);


    }
//    @Test()
    public void Validating_KOT_Process_With_Card_DineIn_OrderType() throws InterruptedException {
        KOT_Order_ProcessWithDineIn("CARD");

    }
//    @Test()
    public void Validating_KOT_Process_With_Cash_DineIn_OrderType() throws InterruptedException {
        KOT_Order_ProcessWithDineIn("CASH");
    }
//    @Test()
    public void Validating_KOT_Process_With_UPI_DineIn_OrderType() throws InterruptedException {
        KOT_Order_ProcessWithDineIn("UPI");
    }
    @Test()
    public void Validating_KOT_Process_With_Card_Take_Away_OrderType() throws InterruptedException {
        KOT_Order_ProcessWithTakeAway("CARD");

    }
    @Test()
    public void Validating_KOTl_Process_With_Cash_TakeAway_OrderType() throws InterruptedException {
        KOT_Order_ProcessWithTakeAway("CASH");
    }
    @Test()
    public void Validating_KOT_Process_With_UPI_TakeAway_OrderType() throws InterruptedException {
        KOT_Order_ProcessWithTakeAway("UPI");
    }
    @Test()
    public void Validating_KOT_Process_With_Card_Delivery_OrderType() throws InterruptedException {
        KOT_Order_ProcessWithDelivery("CARD");

    }
    @Test()
    public void Validating_KOT_Process_With_Cash_Delivery_OrderType() throws InterruptedException {
        KOT_Order_ProcessWithDelivery("CASH");
    }
    @Test()
    public void Validating_KOT_Process_With_UPI_Delivery_OrderType() throws InterruptedException {
        KOT_Order_ProcessWithDelivery("UPI");
    }

}
