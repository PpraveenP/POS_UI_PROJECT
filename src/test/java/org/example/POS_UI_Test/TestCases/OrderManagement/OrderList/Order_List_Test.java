package org.example.POS_UI_Test.TestCases.OrderManagement.OrderList;

import org.example.POS_UI_Test.PageObject.OrderManagement.BillList.Bill_List_Objects;
import org.example.POS_UI_Test.PageObject.OrderManagement.OrderList.Order_List_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.testng.annotations.Test;

public class Order_List_Test extends BaseClass {
    @Test()
    public void Validating_Order_List()
    {
        Order_List_Objects bl=new Order_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Orders List");
    }
    @Test()
    public void Validating_Order_List_Search_Text_Filed()
    {
        Order_List_Objects bl=new Order_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Orders List");
        bl.ClickOnButtons("Search");
    }
    @Test()
    public void Validating_Order_List_Daily_button()
    {
        Order_List_Objects bl=new Order_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Orders List");
        bl.ClickOnButtons("Daily");
    }
    @Test()
    public void Validating_Order_List_Monthly_button()
    {
        Order_List_Objects bl=new Order_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Orders List");
        bl.ClickOnButtons("Monthly");
    }
    @Test()
    public void Validating_Order_List_Yearly_button()
    {
        Order_List_Objects bl=new Order_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Orders List");
        bl.ClickOnButtons("Yearly");
    }
    @Test()
    public void Validating_Order_List_Filter_button()
    {
        Order_List_Objects bl=new Order_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Orders List");
        bl.ClickOnFilter();
    }
    @Test()
    public void Validating_Order_List_Cancel_button()
    {
        Order_List_Objects bl=new Order_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Orders List");
        bl.ClickOnCancel();
    }@Test()
    public void Validating_Order_List_PDF_button()
    {
        Order_List_Objects bl=new Order_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Orders List");
        bl.ClickOnButtons("PDF");
    }
    @Test()
    public void Validating_Order_List_Excel_button()
    {
        Order_List_Objects bl=new Order_List_Objects(driver);
        bl.ClickOnButton("Order Management");
        bl.ClickOnButton("Orders List");
        bl.ClickOnButtons("Excel");
    }
}
