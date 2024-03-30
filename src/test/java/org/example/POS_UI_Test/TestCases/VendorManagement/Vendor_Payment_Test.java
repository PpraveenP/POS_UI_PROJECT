package org.example.POS_UI_Test.TestCases.VendorManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.VendorManagement.Vendor_Payment_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Vendor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
        ad.setBankName(fk.name().lastName()+"Bank");
        ad.setBranch(fk.name().lastName());
        ad.setAccountNo(fk.number().digits(12));
        ad.setIfscCode("SYNB0"+fk.number().digits(6));
        ad.setUpiId(fk.name().username()+"23@ybl");
        ad.setTotal(fk.number().digits(4));

        String currentDate = new SimpleDateFormat("mm-dd-yyyy").format(new Date());
        System.out.println(currentDate);
        ad.setDueDate(currentDate);


        vp.ClickOnButtons("Vendor Management");
        vp.ClickOnButtons("Vendor Payment");

//        System.out.println(driver.findElement(By.xpath("//span[normalize-space()=\"Vendor Payment\"]")).getText());
//        vp.EnterTheText("vendorName",ad.getVendorName());

//        Select dropdown = new Select(driver.findElement(By.id(":rb:")));
//        List<WebElement> options = dropdown.getOptions();
//        dropdown.selectByIndex(2);

//        for (int i=2; i<=4; i++)
//        {
//            driver.findElement(By.xpath("//div[@id=\"mui-component-select-vendorName\"]")).click();
//            driver.findElement(By.xpath("//div[@id=\"menu-vendorName\"]//li["+i+"]")).click();
//        }

//        driver.findElement(By.xpath("//div[@id=\"mui-component-select-vendorName\"]")).click();
//        driver.findElement(By.xpath("//div[@id=\"menu-vendorName\"]//li[3]")).click();

        vp.ClickOnDropDown("mui-component-select-vendorName");
        driver.findElement(By.xpath("//li[normalize-space()=\"harish\"]")).click();
        vp.EnterTheText("dueDate",ad.getDueDate());
        vp.EnterTheText("bankName",ad.getBankName());
        vp.EnterTheText("branch",ad.getBranch());
        vp.EnterTheText("accountNo",ad.getAccountNo());
        vp.EnterTheText("ifscCode",ad.getIfscCode());
        vp.EnterTheText("upiId",ad.getUpiId());
        vp.EnterTheText("total",ad.getTotal());

        vp.ClickOnSubmit();
        Thread.sleep(2000);

    }
}