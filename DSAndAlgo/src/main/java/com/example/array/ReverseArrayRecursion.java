package com.example.array;

public class ReverseArrayRecursion {

    public void reverse(final int[] array, int p, int r) {
        if (p < r) {
            int temp = array[r];
            array[r] = array[p];
            array[p] = temp;
            reverse(array, p + 1, r - 1);
        }
    }

    public int[] reverseArray(final int[] array) {
        reverse(array, 0, array.length - 1);
        return array;
    }
}
