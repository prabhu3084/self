package com.leetcode.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
 https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(Integer pile: nums){
            list.add(pile);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.addAll(list);
        int index = 0 ;
        Integer value = null;
        while(index < k){
            value =  priorityQueue.poll();
            index++;
        }
       if(value == null){
           return -1 ;
       }
       return value;
    }
}
