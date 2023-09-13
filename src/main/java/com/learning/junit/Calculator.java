package com.learning.junit;

public class Calculator {
    public int sum(int x , int y){
        return x+y;
    }
    public int subtract(int x,int y){
        return x-y;
    }
    public int divide(int x, int y) throws IllegalArgumentException {
        if (y == 0) {
            throw new IllegalArgumentException("Ints cannot be divided by zero");
        }
        return x/y;
    }

    public boolean isEven(int i) {
        return i%2 == 0;
    }
}
