package org.example.POS_UI_Test.TestCases.VendorManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.VendorManagement.Vendor_Payment_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Vendor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Vendor_Payment_Test extends BaseClass {

    @Test()
    public void Validating_the_VendorPayment_Form() throws InterruptedException {
        Add_Vendor ad=new Add_Vendor();
        Vendor_Payment_Objects vp=new Vendor_Payment_Objects(driver);
        Faker fk=new Faker();
        ad.setVendorName(fk.name().firstName());
        ad.setBankName(fk.name().firstName()+"Bank");
        ad.setBranch(fk.address().cityName());
        ad.setAccountNo(fk.number().digits(12));
        ad.setIfscCode("SYNB0"+fk.number().digits(6));
        ad.setUpiId(fk.name().username()+"23@ybl");
        ad.setTotal(fk.number().digits(4));

        String date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        ad.setDueDate(date);


        vp.ClickOnButtons("Vendor Management");
        vp.ClickOnButtons("Vendor Payment");


        vp.ClickOnDropDown("mui-component-select-vendorName");
//        driver.findElement(By.xpath("//li[normalize-space()=\"harish\"]")).click();
        Thread.sleep(2000);
        int size = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li")).size();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li["+size+"]")).click();
        vp.EnterTheText("dueDate",ad.getDueDate());
        vp.EnterTheText("bankName",ad.getBankName());
        vp.EnterTheText("branch",ad.getBranch());
        vp.EnterTheText("accountNo",ad.getAccountNo());
        vp.EnterTheText("ifscCode",ad.getIfscCode());
        vp.EnterTheText("upiId",ad.getUpiId());
        vp.EnterTheText("total",ad.getTotal());

        vp.ClickOnSubmit();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        System.out.println(message);
        Validation("Form Submit Successfull !",message,driver);

    }
}