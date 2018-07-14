package com.gerardnico.testng;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {


    @Override
    public void onStart(ISuite suite) {

        System.out.println("****************************");
        System.out.println("Starting suite ("+suite.getName()+")");
        System.out.println("****************************\n\n");
    }

    @Override
    public void onFinish(ISuite suite) {

        System.out.println("\n\n****************************");
        System.out.println("Finishing suite ("+suite.getName()+")");
        System.out.println("File at "+suite.getXmlSuite().getFileName());
        System.out.println("****************************\n");

    }


}


