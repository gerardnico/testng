package com.gerardnico.testng;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {


    @Override
    public void onStart(ISuite suite) {
        System.out.println("Starting suite "+suite.getName());
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Finishing suite "+suite.getName());
    }


}


