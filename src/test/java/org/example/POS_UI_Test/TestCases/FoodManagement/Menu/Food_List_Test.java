package org.example.POS_UI_Test.TestCases.FoodManagement.Menu;

import org.example.POS_UI_Test.PageObject.FoodManagement.Menu.Food_List_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;

import org.testng.annotations.Test;

public class Food_List_Test extends BaseClass {
    @Test()
    public void Validating_Food_List()
    {
        Food_List_Objects fl=new Food_List_Objects(driver);
        fl.ClickOnButton("Food Management");
        fl.ClickOnButton("Food List");
    }
    @Test()
    public void Validating_Food_List_SearchText_Box()
    {
        Food_List_Objects fl=new Food_List_Objects(driver);
        fl.ClickOnButton("Food Management");
        fl.ClickOnButton("Food List");
        fl.ClickOnButtons("Search");
    }
    @Test()
    public void Validating_Food_List_SubCategory_Button()
    {
        Food_List_Objects fl=new Food_List_Objects(driver);
        fl.ClickOnButton("Food Management");
        fl.ClickOnButton("Food List");
        fl.ClickOnSubCategory();
    }
    @Test()
    public void Validating_Food_List_Category_Button()
    {
        Food_List_Objects fl=new Food_List_Objects(driver);
        fl.ClickOnButton("Food Management");
        fl.ClickOnButton("Food List");
        fl.ClickOncategory();
    }
    @Test()
    public void Validating_Food_List_Menu_Button()
    {
        Food_List_Objects fl=new Food_List_Objects(driver);
        fl.ClickOnButton("Food Management");
        fl.ClickOnButton("Food List");
        fl.ClickOnMenue();
    }
    @Test()
    public void Validating_Food_List_PDF_Button()
    {
        Food_List_Objects fl=new Food_List_Objects(driver);
        fl.ClickOnButton("Food Management");
        fl.ClickOnButton("Food List");
        fl.ClickOnButtons("PDF");
    }
    @Test()
    public void Validating_Food_List_Excel_Button()
    {
        Food_List_Objects fl=new Food_List_Objects(driver);
        fl.ClickOnButton("Food Management");
        fl.ClickOnButton("Food List");
        fl.ClickOnButtons("Excel");
    }
    @Test()
    public void Validating_Food_List_Edit_Button()
    {
        Food_List_Objects fl=new Food_List_Objects(driver);
        fl.ClickOnButton("Food Management");
        fl.ClickOnButton("Food List");
        fl.ClickOnEdit();
    }
    @Test()
    public void Validating_Food_List_Delete_Button()
    {
        Food_List_Objects fl=new Food_List_Objects(driver);
        fl.ClickOnButton("Food Management");
        fl.ClickOnButton("Food List");
        fl.ClickOnDelete();
    }

}
