package org.example.POS_UI_Test.PageObject.InventoryManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Inventory_Objects {

    WebDriver ldriver;
    public static WebElement[] ai;
    public  static  WebElement[] bi;
    public  static  WebElement[] di;


    public Add_Inventory_Objects(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        ai= new WebElement[]{name, inventoryCode, price, quantity, minLevel,expiryDate};
        bi=new WebElement[]{Category,unit,minLevelUnit};
        di=new WebElement[]{Material,kilograms,Gram,Submit};
    }


    @FindBy(xpath = "//p[normalize-space()=\"Inventory Management\"]")
    WebElement InventoryManagement;
    public void ClickONInventoryManagement()
    {
        InventoryManagement.click();
    }

    @FindBy(xpath = "//span[normalize-space()=\"Add Inventory\"]")
    WebElement AddInventory;
    public void ClickONAddInventory()
    {
        AddInventory.click();
    }

    @FindBy(xpath = "//input[@name=\"name\"]")
    WebElement name;

    @FindBy(xpath = "//input[@name=\"inventoryCode\"]")
    WebElement inventoryCode;

    @FindBy(id = "//div[@id=\"mui-component-select-category\"]")
    WebElement Category;

    @FindBy(xpath = "//input[@name=\"price\"]")
    WebElement price;

    @FindBy(xpath = "//input[@name=\"quantity\"]")
    WebElement quantity;

    @FindBy(xpath = "//div[@id=\"mui-component-select-unit\"]")
    WebElement unit;

    @FindBy(xpath = "//input[@name=\"expiryDate\"]")
    WebElement expiryDate;

    @FindBy(xpath = "//input[@name=\"minLevel\"]")
    WebElement minLevel;

    @FindBy(xpath = "//div[@id=\"mui-component-select-minLevelUnit\"]")
    WebElement minLevelUnit;

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement Submit;

    @FindBy(xpath = "//li[normalize-space()=\"Packing Material\"]")
    WebElement Material;

    @FindBy(xpath = "//li[normalize-space()=\"kilograms\"]")
    WebElement kilograms;

    @FindBy(xpath = "//li[normalize-space()=\"Gram\"]")
    WebElement Gram;

    @FindBy(xpath = "//ul[@id=\":r1:\"]")
    WebElement dropdown;



    public void Enter_text_Fields(String name, String value) {
        for (WebElement element : ai) {
            if (element.getAttribute("name").contains(name)) {
                element.sendKeys(value);
                break;
            }
        }
    }
    public void Enter_Dropdown_Fields(String name) {
        for (WebElement element : di) {
            if (element.getAttribute("name").contains(name)) {
                element.click();
                break;
            }
        }
    }


//    public void Click_Operation(String name) {
//        for (WebElement button : ai)
//            if (button.getText().equals(name)) {
//                button.click();
//                break; // Break the loop once the button is found
//            }
//    }
//    public void Enter_DropdownBox()
//    {
//
//    }


}