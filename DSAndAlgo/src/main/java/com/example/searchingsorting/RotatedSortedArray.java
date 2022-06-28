package com.example.searchingsorting;

public class RotatedSortedArray {

    public int search(int[] nums, int target) {

        int p = 0;

        int r = nums.length - 1;

        int pivotElement = pivot(nums, p, r);

        if (pivotElement == -1) {
            return search(nums, p, r, target);
        }

        if (nums[p] <= target && target <= nums[pivotElement]) return search(nums, p, pivotElement, target);
        else return search(nums, pivotElement + 1, r, target);

    }


    public int pivot(int[] arr, int p, int r) {

        if (p > r) return -1;

        int mid = (p + r) / 2;

        if (mid < r && arr[mid] > arr[mid + 1]) return mid;

        if (p < mid && arr[mid - 1] > arr[mid]) {
            return mid - 1;
        }

        if (arr[p] < arr[mid]) return pivot(arr, mid + 1, r);

        return pivot(arr, p, mid - 1);

    }


    public int search(int[] nums, int p, int r, int target) {

        if (p > r) {
            return -1;
        }


        int q = (p + r) / 2;

        if (nums[q] == target) {
            return q;
        }

        if (nums[q] < target) {
            return search(nums, q + 1, r, target);
        }

        return search(nums, p, q - 1, target);

    }
}
