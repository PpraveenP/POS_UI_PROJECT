package org.example.POS_UI_Test.TestCases.ProfileSetting.POS_Setting;

import org.example.POS_UI_Test.PageObject.ProfileSetting.POS_Setting.POS_Setting_Objects;
import org.example.POS_UI_Test.TestCases.BaseClass;
import org.testng.annotations.Test;

public class POS_Setting_Test extends BaseClass {
    @Test()
    public static void Validating_POS_Setting_Form()
    {
        POS_Setting_Objects po=new POS_Setting_Objects(driver);
        po.ClickOnButton("Profile Settings");
        po.ClickOnButton("Pos Settings");
        po.EnterTheName("Veg");
        po.ClickOnSubmit();
    }
}
