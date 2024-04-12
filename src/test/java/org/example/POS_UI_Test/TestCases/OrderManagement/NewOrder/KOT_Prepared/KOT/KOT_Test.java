package org.example.POS_UI_Test.TestCases.OrderManagement.NewOrder.KOT_Prepared.KOT;

import org.example.POS_UI_Test.PageObject.OrderManagement.KOT.KOT_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class KOT_Test extends BaseClass {
    @Test()
    public void Validating_KOT_Prepared_Process() throws InterruptedException {
        KOT_Objects kot=new KOT_Objects(driver);
        kot.ClickOnButton("Order Management");
        kot.ClickOnButton("KOT");
        Thread.sleep(3000);
        kot.ClickOnPrepated();
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Thread.sleep(2000);
        Validation("Order Prepared Successfully!!",message,driver);
    }
    @Test()
    public void Validating_KOT_Prepare_Process_For_All_Order() throws InterruptedException {
        KOT_Objects kot=new KOT_Objects(driver);
        kot.ClickOnButton("Order Management");
        kot.ClickOnButton("KOT");
        List<WebElement> list = driver.findElements(By.xpath("(//button[@type='button'][normalize-space()='Prepared'])"));
        for (WebElement l:list)
        {
            Thread.sleep(2000);
            kot.ClickOnPrepated();
//            String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
//            Thread.sleep(3000);
//            Validation("Order Prepared Successfully!!",message,driver);
        }
    }
}
