package org.example.POS_UI_Test.TestCases.OrderManagement.PendingOrder;


import org.example.POS_UI_Test.PageObject.OrderManagement.RunningOrder.RunningOrder_Page_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class RunningOrder_Page_Test extends BaseClass {
    @Test()
    public void Validating_Running_Order_Page()
    {
        RunningOrder_Page_Objects ro=new RunningOrder_Page_Objects(driver);
        ro.ClickOnButton("Order Management");
        ro.ClickOnButton("Pending Order");
        List<WebElement> orders = driver.findElements(By.xpath("(//button[@type='button'][normalize-space()='View Order'])"));
        int i=10;
        for (WebElement or:orders)
        {
            driver.findElement(By.xpath("(//button[@type='button'])["+i+"]")).click();
            ro.ClickOnButtons("CASH");
            ro.ClickOnButtons("PrintButton");
            driver.navigate().refresh();
        }
    }
}

