package com.learning.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HairSaloonTest {

    HairSaloon hairSaloon = new HairSaloon();
    @Test
    public void TestGetOpeningDay() {
        String[] expected ={"Monday","Tuesday"};
        String[] actual = hairSaloon.getOpeningDay();
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() throws IllegalAccessException {
        assertTrue(hairSaloon.isOpen("Monday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday() throws IllegalAccessException {
        assertFalse(hairSaloon.isOpen("Wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay(){
        Exception exception = assertThrows(IllegalStateException.class,
                () -> hairSaloon.isOpen("Hello"));

        String expected ="The weekday argument must end in the letters 'day'";

        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }
}