package com.learning.junit;

public class AssertingAnExceptionIsThrown {

    public int divide(int x, int y) throws IllegalArgumentException {
        if (y == 0) {
            throw new IllegalArgumentException("Ints cannot be divided by zero");
        }
        return x/y;
    }
}
