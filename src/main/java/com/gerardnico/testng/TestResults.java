package com.gerardnico.testng;

import org.testng.ITestResult;

public class TestResults {


    static public String getStatus(ITestResult iTestResult) {
        switch (iTestResult.getStatus()) {
            case ITestResult.SUCCESS:
                return "SUCCESS";
            case ITestResult.FAILURE:
                return "FAILURE";
            case ITestResult.SKIP:
                return "SKIP";
            case ITestResult.SUCCESS_PERCENTAGE_FAILURE:
                return "SUCCESS_PERCENTAGE_FAILURE";
            case ITestResult.STARTED:
                return "STARTED";
            default:
                throw new RuntimeException("Integer value ("+iTestResult.getStatus()+") is not known.");
        }
    }

}
