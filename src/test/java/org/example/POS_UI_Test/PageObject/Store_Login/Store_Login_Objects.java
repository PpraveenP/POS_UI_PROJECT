package org.example.POS_UI_Test.PageObject.Store_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Store_Login_Objects {

    WebDriver ldriver;
    WebElement[] tb;
    WebElement[] bt;
    public Store_Login_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
//        tb=new WebElement[]{storename,username,countryCode,currency,state,pinCode,address,storeAddress,
//                contact,storeGST,email,upi,password,comfirmpassword};
        bt=new WebElement[]{StoreManagement,StoreList};
    }
    @FindBy(xpath = "//p[normalize-space()=\"Store Management\"]")
    WebElement StoreManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Store List\"]")
    WebElement StoreList;




    public void ClickOnButton(String name)
    {
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }
    }
}
