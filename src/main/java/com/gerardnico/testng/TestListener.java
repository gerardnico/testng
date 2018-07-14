package com.gerardnico.testng;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

@SuppressWarnings("unused")
public class TestListener extends TestListenerAdapter {
    private int m_count = 0;

    @Override
    public void onTestFailure(ITestResult tr) {

        logResult(tr);

    }

    private void logResult(ITestResult tr) {

        System.out.println("****************************");
        log("Name: "+tr.getName());
        log("Status: "+TestResults.getStatus(tr));
        log("Instance Name: "+tr.getInstanceName());
        log("Message: "+tr.getThrowable().getMessage());
        System.out.println("****************************");

    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        log("Skipped");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {

        logResult(tr);

    }

    private void log(String string) {
        System.out.println(string);
    }

}

