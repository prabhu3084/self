package com.example.array;

public class MaxSubArray {

    /*
       Expected Time Complexity: O(N)
       Expected Auxiliary Space: O(1)
     */


    private  int findCrossingSum(final int[] arr, int low, int mid, int high){

         return 0;

    }
    public int findMaxSum(final int[] arr, int low, int high){

        if(low == high)
            return arr[low];

        int mid = (low + high)/2;

        long leftSum =  findMaxSum(arr, low, mid);

        long rightSum = findMaxSum(arr, mid+1, high);
        return 0;

    }
}
