package com.leetcode;

/*
https://leetcode.com/problems/sort-an-array/

 */
public class MergeSort {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }

    }

    public void merge(int[] num, int start, int mid, int end) {
        int l = mid - start + 1;
        int r = end - mid;
        int[] left = new int[l + 1];
        int[] right = new int[r + 1];
        for (int i = 0; i < l; i++) {
            left[i] = num[start + i];
        }
        for (int j = 0; j < r; j++) {
            right[j] = num[mid + 1 + j];
        }
        left[l] = Integer.MAX_VALUE;
        right[r] = Integer.MAX_VALUE;
        l = 0;
        r = 0;

        for (int index = start; index <= end; index++) {
            if (left[l] < right[r]) {
                num[index] = left[l];
                l++;
            } else {
                num[index] = right[r];
                r++;
            }

        }
    }
}
