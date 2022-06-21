package com.example.array;

public class MinAndMaxIterative {

    public int min(final int[] array ){

         int min = Integer.MAX_VALUE;

        for(int index = 0; index<array.length; index++){
            if(array[index] < min){
                min = array[index];
            }
        }
        return min;
    }

    public int max(final int[] array ){

        int max = Integer.MIN_VALUE;

        for(int index = 0; index<array.length; index++){
            if(array[index] > max){
                max = array[index];
            }
        }
        return max;
    }
}
