package com.gerardnico.testng;

public class AssertionSuccess extends RuntimeException {

    public AssertionSuccess() {
        super();
    }

    public AssertionSuccess(String message) {
        super(message);
    }

    public AssertionSuccess(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionSuccess(Throwable cause) {
        super(cause);
    }

}
