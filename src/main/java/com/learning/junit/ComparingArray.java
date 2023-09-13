package com.learning.junit;

public class ComparingArray {

    public int[] incrementArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0 ; i<arr.length;i++) {
            newArr[i] = arr[i]+1;
        }
        return newArr;
    }
}
