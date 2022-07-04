package com.leetcode.divideandconcur;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        for(int i = 1; i<=k; i++) {
            max_heapify(nums, 0, nums.length - i);
            nums[0] = nums[nums.length-i];
        }
        return nums[0];
    }


    public void max_heapify(int[] nums, int i, int length) {

        int l = 2 * i + 1;
        int r = 2 * i + 2;

        int largest = 0;

        if (nums[l] > nums[i] && l <= length) {
            largest = l;
        }

        if (nums[r] > nums[largest] && r <= length) {
            largest = r;
        }

        if (largest != i) {
            int temp = nums[largest];
            nums[largest] = nums[i];
            nums[i] = temp;
            max_heapify(nums, largest, length);
        }

    }
}
