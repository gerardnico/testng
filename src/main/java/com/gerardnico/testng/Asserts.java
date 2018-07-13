package com.gerardnico.testng;

import org.testng.Assert;
import org.testng.internal.EclipseInterface;

public class Asserts {

    public static void assertEquals(Object actual, Object expected, String message) {

        Assert.assertEquals(actual,expected,message);

        throw new AssertionSuccess(format(actual, expected, message));

    }

    /**
     * Copy of {@link Assert#format(Object, Object, String)}
     * because it's not public.
     * I have made it public. It's also used by IDE to show diff between values.
     *
     * @param actual - actual value
     * @param expected - expected value
     * @param message - message
     * @return formatted message that can be parsed.
     */
    public static String format(Object actual, Object expected, String message) {
        String formatted = "";
        if (null != message) {
            formatted = message + " ";
        }

        return formatted + EclipseInterface.ASSERT_LEFT + expected + EclipseInterface.ASSERT_MIDDLE + actual + EclipseInterface.ASSERT_RIGHT;
    }

}
