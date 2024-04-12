package org.example.POS_UI_Test.TestCases;

import org.apache.commons.io.FileUtils;
import org.example.POS_UI_Test.PageObject.Authendication.Authedication_Object;
import org.example.POS_UI_Test.TestUtilitiese.ReadConfiger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {


    public static WebDriver driver;
    public static ReadConfiger rc;
    public static String username;
    public static String password;
    public static String Techusername;
    public static String Techpassword;


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

    @BeforeClass
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

    @AfterMethod
    public void RefreshMethod()
    {
        driver.navigate().refresh();
    }
    @AfterClass()
    public void LogoutMethod() throws InterruptedException
    {

//        driver.navigate().refresh();
//        Authedication_Object Ao=new Authedication_Object(driver);
//        Ao.LogoutOperation("profile");
//        Ao.LogoutOperation("Logout");
//        Ao.ClickOnProfile();
//        Thread.sleep(200);
//        Ao.ClickOnLogout();

        driver.navigate().refresh();
        Authedication_Object Ao=new Authedication_Object(driver);
        driver.navigate().refresh();
        Thread.sleep(2000);
        Ao.ClickOnProfile();
        Thread.sleep(200);
        Ao.ClickOnLogout();
    }
    @AfterTest
    public void quitMethod()

    {
        driver.quit();
    }

    public void Logout_Method() throws InterruptedException {
//        Authedication_Object Ao=new Authedication_Object(driver);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        Ao.LogoutOperation("profile");
//        Ao.LogoutOperation("Logout");
//        Thread.sleep(3000);

        driver.navigate().refresh();
        Authedication_Object Ao=new Authedication_Object(driver);
        driver.navigate().refresh();
        Thread.sleep(2000);
        Ao.ClickOnProfile();
        Thread.sleep(200);
        Ao.ClickOnLogout();
    }

    public  void LoginMethod(String username,String password)
    {
        Authedication_Object AO=new Authedication_Object(driver);
        AO.LoginOperation("username",username);
        AO.LoginOperation("password",password);
        AO.LoginOperation("login","l");
    }
    public void TechLogin()
    {
        Techusername=rc.getTechPassword();
        Techpassword=rc.getTechUsername();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Authedication_Object AO=new Authedication_Object(driver);
        AO.LoginOperation("username",rc.getTechUsername());
        AO.LoginOperation("password",rc.getTechPassword());
        AO.LoginOperation("login","l");
    }


    public static String captureScreenshot(WebDriver driver, String testName) {
        if (driver instanceof TakesScreenshot) {
            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
            File screenshot = screenshotDriver.getScreenshotAs(OutputType.FILE);
            String screenshotDir = System.getProperty("user.dir") + "/screenshots/";
            String screenshotPath = screenshotDir + testName + "_failure.png" ;

            try {
                FileUtils.copyFile(screenshot, new File(screenshotPath));
                System.out.println("Screenshot captured for test failure: " + testName);
            } catch (IOException e) {
                System.out.println("Failed to capture screenshot for test failure: " + e.getMessage());
            }
        }
        return testName;
    }
    public static void Validation(String expected, String actual, WebDriver driver)
    {

        if (!actual.equals(expected)) {
            captureScreenshot(driver, actual);
        }

        Assert.assertEquals(actual, expected);

    }

}