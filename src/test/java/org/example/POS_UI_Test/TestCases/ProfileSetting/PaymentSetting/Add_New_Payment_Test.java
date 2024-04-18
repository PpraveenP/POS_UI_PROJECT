package org.example.POS_UI_Test.TestCases.ProfileSetting.PaymentSetting;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.ProfileSetting.PaymentSetting.Add_New_Payment_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Vendor;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Add_New_Payment_Test extends BaseClass {

    public Add_New_Payment_Objects ap;
    public Add_Vendor PaymentDataSetup()
    {
        Add_Vendor ad=new Add_Vendor();
        Faker fk=new Faker();
        ad.setBankName(fk.name().lastName()+"Bank");
        ad.setBranch(fk.address().cityName());
        ad.setAccountNo(fk.number().digits(13));
        ad.setIfscCode("HDFC0"+fk.number().digits(6));
        ad.setUpiId(fk.name().firstName()+"@ybl");
        return ad;
    }
    public void EnterTheData(Add_Vendor ad)
    {
        ap=new Add_New_Payment_Objects(driver);

        ap.ClickOnButton("Profile Settings");
        ap.ClickOnButton("Payment Settings");

        ap.EnterTheText("bankName",ad.getBankName());
        ap.EnterTheText("branchName",ad.getBranch());
        ap.EnterTheText("accountNo",ad.getAccountNo());
        ap.EnterTheText("ifscCode",ad.getIfscCode());
        ap.EnterTheText("upiId",ad.getUpiId());


    }
    @Test()
    public void Validating_Add_New_Payment_Form() throws InterruptedException {
        Add_Vendor ad = PaymentDataSetup();
        EnterTheData(ad);
        ap.ClickOnAddPaymentDetails();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Form Submit Successfull !",message,driver);

    }
    @Test()
    public void Validating_Add_New_Payment_Edit_Button() throws InterruptedException {
        ap=new Add_New_Payment_Objects(driver);

        ap.ClickOnButton("Profile Settings");
        ap.ClickOnButton("Payment Settings");
        ap.ClickOnEdit();
        Thread.sleep(1000);
        ap.ClickOnUpdatePaymentDetails();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Form Updated Successfull !",message,driver);

    }
    @Test()
    public void Validating_Add_New_Payment_Delete_Button() throws InterruptedException {
        ap=new Add_New_Payment_Objects(driver);

        ap.ClickOnButton("Profile Settings");
        ap.ClickOnButton("Payment Settings");
        ap.ClickOnDelete();
        Thread.sleep(1000);
        ap.ClickOnDeleteYseButton();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1ey4h9j\"]")).getText();
        Validation("Payment Deleted successfully.. !",message,driver);
    }
}
