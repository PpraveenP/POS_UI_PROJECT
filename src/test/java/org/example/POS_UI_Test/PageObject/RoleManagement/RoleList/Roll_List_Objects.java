package org.example.POS_UI_Test.PageObject.RoleManagement.RoleList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roll_List_Objects {
    WebDriver ldrivrer;
    public Roll_List_Objects(WebDriver rdriver)
    {
        ldrivrer=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//p[normalize-space()=\"Role Permission\"]")
    WebElement RolePermission;
    @FindBy(xpath = "//span[normalize-space()=\"Role List\"]")
    WebElement RoleList;
//    @FindBy(xpath = "")
//    WebElement dd;
//    @FindBy(xpath = "")
//    WebElement dd;
//    @FindBy(xpath = "")
//    WebElement dd;
//    @FindBy(xpath = "")
//    WebElement dd;
//    @FindBy(xpath = "")
//    WebElement dd;
//    @FindBy(xpath = "")
//    WebElement dd;
}
