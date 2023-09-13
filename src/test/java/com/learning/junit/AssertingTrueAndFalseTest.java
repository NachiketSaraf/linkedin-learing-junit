package com.learning.junit;

import junit.framework.TestCase;
import org.junit.Test;

public class AssertingTrueAndFalseTest extends TestCase {
    AssertingTrueAndFalse assertingTrueAndFalse = new AssertingTrueAndFalse();
    @Test
    public void testIsEven() {
        boolean actual = assertingTrueAndFalse.isEven(4);

        assertTrue(actual);
    }

    @Test
    public void testIsOdd() {
        boolean actual = assertingTrueAndFalse.isEven(3);

        assertFalse(actual);
    }
}