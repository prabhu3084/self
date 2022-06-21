package com.example.array;

public class ReverseArrayIterative {

    public int[] reverseArray(final int[] array){
        int startIndex = 0;
        int endIndex = array.length -1;

        while (startIndex < endIndex){
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            endIndex --;
            startIndex ++;
        }
        return array;
    }
}
