package com.gerardnico.testng;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MethodListener implements IInvokedMethodListener {



    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

        //System.out.println("Method Listener : Before Invocation. Status: "+TestResults.getStatus(iTestResult));

    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

        // The message will say that the Assert method of com.gerarnico.testng.Assert
        // must be used in the case if Throwable is null
        if (iTestResult.getThrowable()!=null) {
            //System.out.println("Method Listener : After Invocation. Status: "+TestResults.getStatus(iTestResult));
            if (iTestResult.getThrowable().getClass() == AssertionSuccess.class) {
                iTestResult.setStatus(ITestResult.SUCCESS);
            }
            //System.out.println("Method Listener : After Invocation. Status: "+TestResults.getStatus(iTestResult));
        }


    }
}
