package org.example.POS_UI_Test.PageObject.UserManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_List_Objects {
    WebDriver ldriver;
    public User_List_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);

    }
    @FindBy(xpath = "//p[normalize-space()=\"User Management\"]")
    WebElement UserManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Users List\"]")
    WebElement UsersList;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    WebElement Search;
    @FindBy(xpath = "//span[normalize-space()=\"+\"]")
    WebElement AddUser;
    public void ClickOnAddUser()
    {
        AddUser.click();
    }
    @FindBy(xpath = "//button[normalize-space()=\"PDF\"]")
    WebElement PDF;
    @FindBy(xpath = "//button[normalize-space()=\"Excel\"]")
    WebElement Excel;
    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/a[1]//*[name()=\"svg\"]")
    WebElement Edit;
    public void ClickOnEdit()
    {
        Edit.click();
    }
    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/div[1]//*[name()=\"svg\"]")
    WebElement Delete;
    public void ClickOnDelete()
    {
        Delete.click();
    }

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Update;
    public void ClickOnUpdate()
    {
        Update.click();
    }


    @FindBy(xpath = "//button[normalize-space()=\"Yes\"]")
    WebElement DeleteYes;
    public void ClickOnDeleteYes()
    {
        DeleteYes.click();
    }



    public void ClickOnButton(String name)
{
    WebElement[] bt=new WebElement[]{UserManagement,UsersList};
    for (WebElement b:bt)
    {
        if (b.getText().contains(name))
        {
            b.click();
        }
    }
}
    public void ClickOnButtons(String name)
    {
        WebElement[] bt=new WebElement[]{Search,PDF,Excel};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
                b.click();
            }
        }
    }


}
