package com.example.array;

public class MinAndMaxRecursion {

    public int min(final int[] arr, final int p, final int r){

        if(p == r)
            return arr[p];

        int q = (p + r)/2;

        int minLower = min(arr, p, q);

        int minUpper = min(arr, q+1, r);

        if(minLower < minUpper)
            return minLower;
        else
            return  minUpper;
    }

    public int max(final int[] arr, final int p, final int r){

        if(p == r)
            return arr[p];

        int q = (p + r)/2;

        int maxLower = max(arr, p, q);

        int maxUpper = max(arr, q+1, r);

        if(maxLower < maxUpper)
            return maxUpper;
        else
            return  maxLower;
    }

    public int maxArray(final int[] arr){
       return max(arr, 0, arr.length-1);
    }

    public int minArray(final int[] arr){
        return min(arr, 0, arr.length-1);
    }
}
