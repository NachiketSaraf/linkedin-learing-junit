package com.learning.junit;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    Calculator calculator = new Calculator();

    @Test
    public  void testSum(){
        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected,actual);
    }

    public void testSubtract() {
        int expected = 3;
        int actual = calculator.subtract(5,2);
        assertEquals(expected,actual);
    }
    public void testIsEven(){

        boolean actual = calculator.isEven(4);

        assertTrue(actual);
    }
}