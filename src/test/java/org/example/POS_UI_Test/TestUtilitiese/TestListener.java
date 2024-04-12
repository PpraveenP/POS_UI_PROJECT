package org.example.POS_UI_Test.TestUtilitiese;

import org.example.POS_UI_Test.TestCases.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;

public class TestListener implements ITestListener {

    private WebDriver driver;

    public TestListener(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        BaseClass.captureScreenshot(driver, testName);
    }

    // Implement other methods if needed (onTestStart, onTestSuccess, onTestSkipped, etc.)
}
