package com.gerardnico.testng;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

@SuppressWarnings("unused")
public class TestListener extends TestListenerAdapter {
    private int m_count = 0;

    @Override
    public void onTestFailure(ITestResult tr) {

        log("Failure: ");
        log("Test Name: "+tr.getTestName());
        log("Test Method: "+ tr.getMethod());
        log("Name: "+tr.getName());
        log("Parameters: "+tr.getParameters().toString());
        log("Instance Name: "+tr.getInstanceName());
        log("Error message: "+tr.getThrowable().getMessage());


    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        log("Skipped");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        log("Success !");
    }

    private void log(String string) {
        System.out.println(string);
        if (++m_count % 40 == 0) {
            System.out.println("");
        }
    }

}

