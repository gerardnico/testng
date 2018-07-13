package com.gerardnico.testng;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestContextTest {


    @Test
    public void testBase(ITestContext iTestContext) {

        // How to pass value
        iTestContext.setAttribute("attrName","attrValue");


    }
}
