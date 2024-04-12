package org.example.POS_UI_Test.PageObject.RoleManagement.UserRoleAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Role_Access_Objects {
    WebDriver ldriver;
    WebElement[] bt;

    public User_Role_Access_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
        bt=new WebElement[]{RolePermission,UserRoleAccess};

    }
    @FindBy(xpath = "//p[normalize-space()=\"Role Permission\"]")
    WebElement RolePermission;
    @FindBy(xpath = "//span[normalize-space()=\"User Role Access\"]")
    WebElement UserRoleAccess;
    @FindBy(xpath = "//div[@id=\"mui-component-select-username\"]")
    WebElement selectusername;
    public void ClickonSelectUsername()
    {
        selectusername.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;
    public void clickOnSubmit()
    {
        Submit.click();
    }
    public void ClickonButton(String name)
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
