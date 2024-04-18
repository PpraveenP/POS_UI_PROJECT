package org.example.POS_UI_Test.TestCases.OrderManagement.BillList;

import org.example.POS_UI_Test.PageObject.OrderManagement.BillList.Bill_List_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.testng.annotations.Test;

public class Bill_List_Test extends BaseClass {
    @Test()
    public void Validating_Bill_List()
    {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
    }
    @Test()
    public void Validating_Bill_List_Search_Text_Filed()
    {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
        bl.ClickOnButtons("Search");
    }
    @Test()
    public void Validating_Bill_List_Daily_button()
    {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
        bl.ClickOnButtons("Daily");
    }
    @Test()
    public void Validating_Bill_List_Monthly_button()
    {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
        bl.ClickOnButtons("Monthly");
    }
    @Test()
    public void Validating_Bill_List_Yearly_button()
    {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
        bl.ClickOnButtons("Yearly");
    }
    @Test()
    public void Validating_Bill_List_Filter_button()
    {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
        bl.ClickOnFilter();
    }
    @Test()
    public void Validating_Bill_List_Cancel_button()
    {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
        bl.ClickOnCancel();
    }@Test()
    public void Validating_Bill_List_PDF_button()
    {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
        bl.ClickOnButtons("PDF");
    }
    @Test()
    public void Validating_Bill_List_Excel_button()
    {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
        bl.ClickOnButtons("Excel");
    }
    @Test()
    public void Validating_Bill_List_Print_button() throws InterruptedException {
        Bill_List_Objects bl=new Bill_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Bill List");
        Thread.sleep(2000);
        bl.ClickOnPrint();
    }

}
