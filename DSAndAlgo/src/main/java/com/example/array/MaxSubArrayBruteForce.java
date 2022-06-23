package com.example.array;

public class MaxSubArrayBruteForce {

    public long maxSubArray(final int[] arr) {

        long globalSum = Long.MIN_VALUE;

        for (int index = 0; index < arr.length; index++) {

            long sum = Long.MIN_VALUE;

            int j = index ;

            long tempSum = 0;

            while (j < arr.length) {
                tempSum = tempSum + arr[j];

                if (tempSum > sum) {
                    sum = tempSum;
                }
                j++;
            }
            if (globalSum < sum) {
                globalSum = sum;
            }
        }
        return globalSum;
    }
}
