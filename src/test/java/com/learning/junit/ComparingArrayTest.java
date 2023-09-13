package com.learning.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingArrayTest {

    ComparingArray comparingArray =new ComparingArray();
    @Test
    public void testIncrementArray() {
        int[] expected = {2,3,4};
        int[] actual = comparingArray.incrementArray(new int[]{1,2,3});
        assertArrayEquals(expected,actual);
    }
}