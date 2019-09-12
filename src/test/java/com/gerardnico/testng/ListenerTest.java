package com.gerardnico.testng;

import org.testng.annotations.Test;

public class ListenerTest {

    @Test
    public void testGood() {

        Assert.assertEquals("1","1","good test");

    }

    @Test
    public void testBad() {

        Assert.assertEquals("1","2","bad test");

    }

}
