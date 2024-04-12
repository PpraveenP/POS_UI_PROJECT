package org.example.POS_UI_Test.PageObject.ProfileSetting.TaxSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tax_Setting_Objects {
    WebDriver ldriver;
    WebElement[] tb;
    WebElement[] bt;

    public Tax_Setting_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
         tb=new WebElement[]{name,rate};
         bt=new WebElement[]{ProfileSettings,TaxSettings};
    }
    @FindBy(xpath = "//p[normalize-space()=\"Profile Settings\"]")
    WebElement ProfileSettings;
    @FindBy(xpath = "//span[normalize-space()=\"Tax Settings\"]")
    WebElement TaxSettings;
    @FindBy(xpath = "//span[normalize-space()=\"+\"]")
    WebElement Tax;
    public void ClickonTax()
    {
        Tax.click();
    }
    @FindBy(xpath = "//input[@id=\"outlined-adornment-name\"]")
    WebElement name;
    @FindBy(xpath = "//input[@id=\"outlined-adornment-rate\"]")
    WebElement rate;
    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;
    public void ClickonSubmit()
    {
        Submit.click();
    }
    public void EnterTheText(String name,String value)
    {
        for (WebElement t:tb)
        {
            if (t.getAttribute("name").equals(name))
            {
                t.sendKeys(value);
            }
        }
    }
    public void ClickOnButtons(String name)
    {
        for (WebElement b:bt)
        {
            if (b.getText().equals(name))
            {
                b.click();
            }
        }
    }

}
