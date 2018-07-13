package com.gerardnico.testng;

import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import java.util.List;

public class Reporter implements org.testng.IReporter {


    public void generateReport(List<XmlSuite> list, List<ISuite> suites, String outputDirectory) {

        System.out.println("Report !");

    }
}
