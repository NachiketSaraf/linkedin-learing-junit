package com.learning.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertingAnExceptionIsThrownTest {
    AssertingAnExceptionIsThrown at= new AssertingAnExceptionIsThrown();
    @Test
    void testDivide() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> at.divide(5,0) );
        String expected = "Ints cannot be divided by zero";

        String actual = exception.getMessage();
        assertEquals(expected,actual);
    }
}