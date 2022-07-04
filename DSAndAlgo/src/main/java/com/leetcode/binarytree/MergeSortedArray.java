package com.leetcode.binarytree;

/*
https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        for(int index=0; index<n; index++){

            int key = nums2[index];

            int j = m + index -1;

            while(j >= 0 && nums1[j] > key){
                nums1[j+1]=nums1[j];
                j--;
            }
            nums1[j+1] = key;
        }

    }
}
