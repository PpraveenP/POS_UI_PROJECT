package org.example.POS_UI_Test.PageObject.Authendication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authedication_Object {

    WebDriver ldriver;
    public Authedication_Object(WebDriver redriver)
    {
        ldriver=redriver;
        PageFactory.initElements(redriver,this);
    }
    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement username;
    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()=\"Login\"]")
    WebElement Login;
    @FindBy(xpath = "//div[@class=\"MuiStack-root css-1hu592v\"]")
    WebElement profile;

    @FindBy(xpath = "//p[normalize-space()=\"Logout\"]")
    WebElement Logout;
    public void LoginOperation(String name , String value)
    {
       if (name.contains("username"))
       {
//           username.click();
           username.sendKeys(value);
       }
       else if (name.contains("password"))
       {
//           password.click();
           password.sendKeys(value);
       }
       else if (name.contains("login"))
       {
           Login.click();
       }

       }

    public void LogoutOperation(String name)
    {
        if (name.contains("Logout"))
        {
            Logout.click();
        }
        else if (name.contains("profile"))
        {
            profile.click();
        }
    }
}
