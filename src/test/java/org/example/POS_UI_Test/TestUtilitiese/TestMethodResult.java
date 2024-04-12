package org.example.POS_UI_Test.TestUtilitiese;

public class TestMethodResult {
    private String testName;
    private String testStatus;

    public TestMethodResult(String testName, String testStatus) {
        this.testName = testName;
        this.testStatus = testStatus;
    }

    public String getTestName() {
        return testName;
    }

    public String getTestStatus() {
        return testStatus;
    }
}
