package com.learning.junit;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest extends TestCase {

    Calculator calculator = new Calculator();

    @Test
    public  void testSum(){
        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected,actual);
    }
    @Test
    public void testSubtract() {
        int expected = 3;
        int actual = calculator.subtract(5,2);
        assertEquals(expected,actual);
    }

    //Testing multiple inputs with parameterized tests
    @ParameterizedTest
    @ValueSource(ints = {2,-2,3,-1000000,200000})
    public void testIsEven(int number){

        boolean actual = calculator.isEven(number);

        assertTrue(actual);
    }
}