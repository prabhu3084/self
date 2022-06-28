package com;

import java.util.Arrays;

public class Solution {


    public int solution(int[] A) {
        // write your code in Java SE 8

        int index = 0;
        Arrays.sort(A);
        while(index < A.length) {
           int postion = Arrays.binarySearch(A, index);
           if(postion < 0 ) {
               return  index;
           }
           index++;
        }

        return index;
    }
}
