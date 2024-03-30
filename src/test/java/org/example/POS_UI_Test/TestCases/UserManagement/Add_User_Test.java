package org.example.POS_UI_Test.TestCases.UserManagement;

import com.github.javafaker.Faker;
import org.example.POS_UI_Test.PageObject.UserManagement.Add_User_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.example.UserPayLoads.Add_Vendor;
import org.testng.annotations.Test;

public class Add_User_Test extends BaseClass {
    @Test()
    public void Validating_Add_User_Form()
    {
        Add_Vendor av=new Add_Vendor();
        Faker fk=new Faker();
        av.setVendorName(fk.name().firstName());
        av.setEmail(fk.internet().safeEmailAddress());
        av.setMobileNo("9"+fk.number().digits(9));
        av.setVendorAddress(fk.address().fullAddress());

        Add_User_Objects au=new Add_User_Objects(driver);
        au.ClickOnButton("User Management");
        au.ClickOnButton("Add User");

        au.EnterTheText("username",av.getVendorName());
        au.EnterTheText("email",av.getEmail());
        au.EnterTheText("contact",av.getMobileNo());
        au.EnterTheText("address",av.getVendorAddress());
        au.EnterTheText("password","Praveen@123");
        au.EnterTheText("comfirmpassword","Praveen@123");
        au.CliciOnSubmit();

    }
}
