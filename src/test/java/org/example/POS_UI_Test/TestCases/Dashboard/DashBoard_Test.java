package org.example.POS_UI_Test.TestCases.Dashboard;

import org.example.POS_UI_Test.PageObject.Dashboard.Dashboard_Object;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DashBoard_Test extends BaseClass {
    @Test()
    public void Validating_Dashboard_Button_Link() throws InterruptedException {
        String[] ds ={"Dashboard","TodayIncome","NewOrder","PendingOrder","OrderList","AddFood","BillReport","AddUser","AddInventory","ProfileSetting","MostSellingFood"};
        Dashboard_Object DO=new Dashboard_Object(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("TodayIncome");
//        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("NewOrder");
//        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("PendingOrder");
//        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("OrderList");
//        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("AddFood");
//        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("BillReport");
//        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("AddUser");
//        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("AddInventory");
//        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("ProfileSetting");
//        DO.DashboardSubOptionClick("Dashboard");
//
//        DO.DashboardSubOptionClick("MostSellingFood");
//        DO.DashboardSubOptionClick("Dashboard");
//

        for (int i=0;i< ds.length-1;i++)
        {
            DO.DashboardSubOptionClick(ds[i+1]);
            Thread.sleep(2000);
            DO.DashboardSubOptionClick(ds[0]);
        }
    }
}
