package org.example.POS_UI_Test.PageObject.UserManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_User_Objects {
    WebDriver ldrivrer;
    WebElement[] tx;
    WebElement[] bt;
    public Add_User_Objects(WebDriver rdriver)
    {
        ldrivrer=rdriver;
        PageFactory.initElements(rdriver,this);
      tx=new WebElement[]{username,email,contact,address,password,comfirmpassword};
        bt=new WebElement[]{UserManagement,AddUser};
    }
    @FindBy(xpath = "//p[normalize-space()=\"User Management\"]")
    WebElement UserManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Add User\"]")
    WebElement AddUser;
    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement username;
    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//input[@name=\"contact\"]")
    WebElement contact;
    @FindBy(xpath = "//input[@name=\"address\"]")
    WebElement address;
    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//input[@name=\"comfirmpassword\"]")
    WebElement comfirmpassword;
    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;
    public void CliciOnSubmit()
    {
        Submit.click();
    }
    @FindBy(xpath = "df")
    WebElement dd;

    public void EnterTheText(String name,String value)
    {
        for (WebElement t:tx)
        {
            if (t.getAttribute("name").equals(name))
            {
                t.sendKeys(value);
            }
        }

    }
    public  void ClickOnButton(String name)
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
