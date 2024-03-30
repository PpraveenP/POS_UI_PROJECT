package org.example.POS_UI_Test.PageObject.ProfileSetting.POS_Setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POS_Setting_Objects {
    WebDriver ldrivrer;
    WebElement[] bt;
    public POS_Setting_Objects(WebDriver rdriver)
    {
        ldrivrer=rdriver;
        PageFactory.initElements(rdriver,this);
        bt=new WebElement[]{ProfileSettings,PosSettings};
    }
    @FindBy(xpath = "//p[normalize-space()=\"Profile Settings\"]")
    WebElement ProfileSettings;
    @FindBy(xpath = "//span[normalize-space()=\"Pos Settings\"]")
    WebElement PosSettings;
    @FindBy(xpath = "//input[@name=\"name\"]")
    WebElement name;
    public void EnterTheName(String Name)
    {
        name.sendKeys(Name);
    }
    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;
    public void ClickOnSubmit()
    {
        Submit.click();
    }
    public void ClickOnButton(String Name)
    {
        for (WebElement b:bt)
        {
            if (b.getText().equals(Name))
            {
                b.click();
            }
        }
    }

}
