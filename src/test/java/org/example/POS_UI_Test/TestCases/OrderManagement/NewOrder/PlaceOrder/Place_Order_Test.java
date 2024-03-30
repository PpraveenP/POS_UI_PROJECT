package org.example.POS_UI_Test.TestCases.OrderManagement.NewOrder.PlaceOrder;

import org.example.POS_UI_Test.PageObject.OrderManagement.NewOrder.PlaceOrder.Place_Order_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Place_Order_Test extends BaseClass {
    @Test()
    public void Validating_Place_Order_Process()
    {
        Place_Order_Objects po=new Place_Order_Objects(driver);
        po.ClickOnButton("Order Management");
        po.ClickOnButton("New Order");
//        List<WebElement> list = driver.findElements(By.id("root"));
        List<WebElement> list = driver.findElements(By.xpath("(//div[@class='MuiCardContent-root css-15ar81u'])"));
        for (WebElement l:list)
        {
//            System.out.println(l.getText());
            l.click();
        }
        po.ClickOnTakeAway();
        po.ClickOnPlaceOrder();
    }
}
