package org.example.POS_UI_Test.TestCases;

import org.example.POS_UI_Test.PageObject.Authendication.Authedication_Object;
import org.example.POS_UI_Test.TestUtilitiese.ReadConfiger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {


    public static WebDriver driver;
    public static ReadConfiger rc;
    public static String username;
    public static String password;

    @Parameters("browser")
    @BeforeTest()
    public void setup(String br) {
        rc = new ReadConfiger();
        if (br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", rc.getChrome());
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (br.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", rc.getFirefox());
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else if (br.equals("ie")) {
            System.setProperty("webdriver.ie.driver", rc.getIEexplore());
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
        }

    }

    @BeforeMethod
    public void loginMethod()
    {
       username = rc.getUsername();
        password = rc.getPassword();
        driver.get(rc.getURL());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Authedication_Object AO=new Authedication_Object(driver);
        AO.LoginOperation("username",rc.getUsername());
        AO.LoginOperation("password",rc.getPassword());
        AO.LoginOperation("login","l");
    }

//    @AfterMethod
//    public void logoutMethod() throws InterruptedException {
//        Authedication_Object Ao=new Authedication_Object(driver);
//        driver.navigate().refresh();
//        Ao.LogoutOperation("profile");
//        Ao.LogoutOperation("Logout");
//        Thread.sleep(3000);
//
//    }
//    @AfterTest
//    public void quitMethod()
//    {
//        driver.quit();
//    }

    public void LogoutMethod() throws InterruptedException {
        Authedication_Object Ao=new Authedication_Object(driver);
        driver.navigate().refresh();
        Ao.LogoutOperation("profile");
        Ao.LogoutOperation("Logout");
        Thread.sleep(3000);
    }

    public void LoginMethod(String username,String password)
    {
        Authedication_Object AO=new Authedication_Object(driver);
        AO.LoginOperation("username",username);
        AO.LoginOperation("password",password);
        AO.LoginOperation("login","l");
    }
}