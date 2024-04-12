package org.example.POS_UI_Test.TestCases.VendorManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.VendorManagement.Add_Vendor_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Vendor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Add_Vendor_Test extends BaseClass {

    @Test ()
            public void Validating_Add_Vendor_form() throws InterruptedException {
        Add_Vendor_Objects vo=new Add_Vendor_Objects(driver);

        Faker fk=new Faker();
        Add_Vendor av=new Add_Vendor();
        av.setVendorName(fk.name().firstName());
        av.setVendorCode(fk.code().isbnGs1());
        av.setVendorAddress(fk.address().fullAddress());
        av.setMobileNo(fk.phoneNumber().subscriberNumber(10));
        av.setBankName(fk.address().cityName()+" Bank");
        av.setBranch(fk.address().cityName());
        av.setAccountNo(fk.number().digits(13));
        av.setIfscCode("SYNB0"+fk.number().digits(6));
        av.setUpiId(fk.name().username()+"@ybl");

//        vo.clickfuction("Vendor Management");
//        vo.clickfuction("AddVendor");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        vo.ClickOnVendorManagement();
        vo.ClickOnAddVendor();

        vo.Enter_The_Text_Fields("vendorName", av.getVendorName());
        vo.Enter_The_Text_Fields("vendorCode", av.getVendorCode());
        vo.Enter_The_Text_Fields("vendorAddress", av.getVendorAddress());
        vo.Enter_The_Text_Fields("mobileNo", av.getMobileNo());
        vo.Enter_The_Text_Fields("bankName", av.getBankName());
        vo.Enter_The_Text_Fields("branch", av.getBranch());
        vo.Enter_The_Text_Fields("accountNo", av.getAccountNo());
        vo.Enter_The_Text_Fields("ifscCode", av.getIfscCode());
        vo.Enter_The_Text_Fields("upiId", av.getUpiId());
        vo.clickfuction("Submit");
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
//        System.out.println(message);
        Validation("Form Submit Successfull !",message,driver);

    }

}
