package com.leetcode.heap;

import java.util.*;
/*
https://leetcode.com/problems/remove-stones-to-minimize-the-total/
 */

public class RemoveStonestoMinimize {

    public int minStoneSum(int[] piles, int k) {
        List<Integer> list = new ArrayList<>();
        for(Integer pile: piles){
            list.add(pile);
        }
        Collections.sort(list, Comparator.reverseOrder());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.addAll(list);
        int index = 0 ;
        int sum =0;
        while(index < k){
            Integer value =  priorityQueue.poll();
            int temp = value;
            value = value -(temp)/2;
            priorityQueue.add(value);
            index++;
        }
        for(Integer value : priorityQueue){
            sum = sum + value;
        }

        return sum;
    }

}
