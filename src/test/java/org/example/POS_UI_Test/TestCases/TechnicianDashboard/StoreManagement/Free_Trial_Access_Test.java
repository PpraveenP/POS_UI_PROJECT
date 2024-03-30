package org.example.POS_UI_Test.TestCases.TechnicianDashboard.StoreManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.TechnicianDashboard.StoreManagement.Free_Trial_Access_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Store_User;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Free_Trial_Access_Test extends BaseClass {
    Store_User su;
    Faker fk;

    public Store_User StoreDataSetUp()
    {
        su=new Store_User();
        fk=new Faker();
        su.setStorename(fk.name().lastName());
        su.setUsername(fk.name().firstName());
        su.setCountryCode("91");
        su.setCurrency(fk.currency().name());
        su.setState(fk.address().state());
//        su.setPinCode(fk.address().zipCode());
        su.setPinCode(fk.number().digits(5));
        su.setAddress(fk.address().fullAddress());
        su.setStoreAddress(fk.address().fullAddress());
        su.setContact("9"+fk.number().digits(9));
        su.setStoreGST(fk.business().creditCardNumber());
        su.setEmail(fk.internet().safeEmailAddress());
        su.setUpi(fk.finance().iban());
        su.setFreeTrialType("365");
        return  su;

    }
    public void EnterTheStoreData(Store_User su)
    {
        Free_Trial_Access_Objects ft=new Free_Trial_Access_Objects(driver);
        ft.ClickOnButton("Store Management");
        ft.ClickOnButton("Free Trial Access");

        ft.EnterTheTest("storename",su.getStorename());
        ft.EnterTheTest("username",su.getUsername());
        ft.clickOnSelectCountry();
        driver.findElement(By.xpath("//li[normalize-space()=\"India\"]")).click();
        ft.EnterTheTest("countryCode",su.getCountryCode());
        ft.EnterTheTest("currency",su.getCurrency());
        ft.EnterTheTest("state",su.getState());
        ft.EnterTheTest("pinCode",su.getPinCode());
        ft.EnterTheTest("address",su.getAddress());
        ft.EnterTheTest("storeAddress",su.getStoreAddress());
        ft.EnterTheTest("contact",su.getContact());
        ft.EnterTheTest("storeGST",su.getStoreGST());
        ft.EnterTheTest("email",su.getEmail());
        ft.EnterTheTest("upi",su.getUpi());
        ft.EnterTheTest("password","Praveen@123");
        ft.EnterTheTest("comfirmpassword","Praveen@123");
        ft.EnterTheTest("freeTrialType",su.getFreeTrialType());
        ft.ClickOnSubmit();
    }
    @Test()
    public void Validating_Store_Registration_Form()
    {
        su=StoreDataSetUp();
        EnterTheStoreData(su);

    }
}
