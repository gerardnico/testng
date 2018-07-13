package com.gerardnico.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {

    @Test
    public void testGood() {

        Asserts.assertEquals("1","1","test");

    }

}
