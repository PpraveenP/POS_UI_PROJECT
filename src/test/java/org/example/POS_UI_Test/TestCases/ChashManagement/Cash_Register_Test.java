package org.example.POS_UI_Test.TestCases.ChashManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.CashManagement.Cash_Register_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Cash_Register_Test extends BaseClass {
    @Test()
    public void Validating_AddMoreAmount() throws InterruptedException {
        Cash_Register_Objects cr=new Cash_Register_Objects(driver);
        Faker fk=new Faker();
        cr.ClickOn_CashManagement();
        cr.ClickOn_CashRegister();
        cr.ClickOn_AddMoreAmount(200+fk.number().digits(1));
        cr.ClickOn_Add();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Balance Added Successfully!!",message,driver);
    }
    @Test()
    public void Validating_Expense_Process() throws InterruptedException {
        Cash_Register_Objects cr=new Cash_Register_Objects(driver);
        Faker fk=new Faker();
        cr.ClickOn_CashManagement();
        cr.ClickOn_CashRegister();
        cr.ClickOn_ExpenseDetail(fk.name().firstName());
        cr.ClickOn_ExpenseAmount(150+fk.number().digits(1));
        cr.ClickOn_Submit();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Form Submit Successfull !",message,driver);
    }
}
