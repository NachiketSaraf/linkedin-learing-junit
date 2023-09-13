package com.learning.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

class HairSaloonTest {

    HairSaloon hairSaloon = new HairSaloon();
    @Test
    public void TestGetOpeningDay() {
        HairSaloon.Day[] expected ={HairSaloon.Day.MONDAY, HairSaloon.Day.TUESDAY};
        HairSaloon.Day[] actual = hairSaloon.getOpeningDay();
        assertArrayEquals(expected,actual);
    }

    //Testing enums with parameterized tests
    @ParameterizedTest
    @EnumSource(value = HairSaloon.Day.class, names = {"MONDAY","TUESDAY"})
    public void testSalonIsOpen(HairSaloon.Day day)  {
        assertTrue(hairSaloon.isOpen(day));
    }

    //Testing enums with parameterized tests
    @ParameterizedTest
    @EnumSource(value = HairSaloon.Day.class, names = {"WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"})
    public void testSalonIsClosed(HairSaloon.Day day)  {
        assertFalse(hairSaloon.isOpen(day));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay(){
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> hairSaloon.isOpen(HairSaloon.Day.valueOf("Hello")));

        String expected ="The weekday argument must end in the letters 'day'";

        String actual = exception.getMessage();

        assertEquals(expected,actual);
    }

    //Using assumptions
    @Test
    public void testApplyDiscount(){
        Calculator calculator = new Calculator();
        assumeTrue(calculator.divide(hairSaloon.getHaircutPrice(),2) == 150);
        int expected = 200;
        int actual = hairSaloon.applyDiscount();
        assertEquals(expected,actual);
    }
}