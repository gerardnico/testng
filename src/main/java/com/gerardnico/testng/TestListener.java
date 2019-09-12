package com.gerardnico.testng;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.EclipseInterface;

public class TestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult tr) {

        logShortResult(tr);

    }

    @SuppressWarnings("unused")
    private void logLongResult(ITestResult tr) {

        System.out.println("****************************");
        System.out.println("Name: " + tr.getName());
        System.out.println("Status: " + TestResults.getStatus(tr));
        System.out.println("Instance Name: " + tr.getInstanceName());
        final Throwable throwable = tr.getThrowable();
        String message;
        if (throwable != null) {
            message = throwable.getMessage();
        } else {
            message = "Unknown. Use one of the following Assert static function (" + Assert.class.getName() + ")";
        }
        System.out.println("Message: " + message);
        System.out.println("****************************");

    }

    private void logShortResult(ITestResult tr) {


        System.out.print(TestResults.getStatus(tr)+"\t"+tr.getName()+"\t");

        final Throwable throwable = tr.getThrowable();
        String message;
        if (throwable != null) {
            message = throwable.getMessage();
            if (tr.getStatus() == ITestResult.SUCCESS){
                String testMessage = message.substring(0,message.indexOf(EclipseInterface.ASSERT_LEFT));
                String value = message.substring(message.indexOf(EclipseInterface.ASSERT_LEFT)+(EclipseInterface.ASSERT_LEFT).length(),message.indexOf(EclipseInterface.ASSERT_MIDDLE));
                message = testMessage+ "\t"+value;
            }
        } else {
            message = "Unknown. Use one of the following Assert static function (" + Assert.class.getName() + ")";
        }
        System.out.println(message);

    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        logShortResult(tr);
    }

    @Override
    public void onTestSuccess(ITestResult tr) {

        logShortResult(tr);

    }



}

