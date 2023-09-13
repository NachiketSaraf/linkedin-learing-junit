package com.learning.junit;

public class AssertingAnExceptionIsThrown {

    public int divide(int x, int y) throws IllegalAccessException {
        if (y == 0) {
            throw new IllegalAccessException("Ints cannot be divided by zero");
        }
        return x/y;
    }
}
