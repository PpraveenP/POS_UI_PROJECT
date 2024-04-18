package org.example.POS_UI_Test.TestCases.ChashManagement;

import org.example.POS_UI_Test.PageObject.CashManagement.Cash_Register_List_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Cash_Register_List_Test extends BaseClass {
    @Test()
    public void Validating_Cash_Register_List()
    {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Cash Register List");
    }
    @Test()
    public void Validating_Cash_Register_List_PDF_Button()
    {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Cash Register List");
        cr.ClickOnButtons("PDF");
    }
    @Test()
    public void Validating_Cash_Register_List_Excel_Button()
    {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Cash Register List");
        cr.ClickOnButtons("Excel");
    }
    @Test()
    public void Validating_Cash_Register_List_CashRegister_Button()
    {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Cash Register List");
        cr.ClickOnButtons("Excel");
    }
    @Test()
    public void Validating_Cash_Register_List_Daily_Button()
    {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Daily");
    }
    @Test()
    public void Validating_Cash_Register_List_Monthly_Button()
    {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Cash Register List");
        cr.ClickOnButton("Monthly");
    }
    @Test()
    public void Validating_Cash_Register_List_Yearly_Button() throws InterruptedException {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Cash Register List");
        cr.ClickOnButton("Yearly");

    }
    @Test()
    public void Validating_Cash_Register_List_Filter_Button()
    {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Cash Register List");
        cr.ClickOnFilter();
    }
    @Test()
    public void Validating_Cash_Register_List_Cancel_Button()
    {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Cash Register List");
        cr.ClickOnCancel();
    }
    @Test()
    public void Validating_Cash_Register_List_SearchTextBox()
    {
        Cash_Register_List_Objects cr=new Cash_Register_List_Objects(driver);
        cr.ClickOnButton("Cash Management");
        cr.ClickOnButton("Cash Register List");
        cr.ClickOnButtons("Search");
    }


}
