package com.leetcode.binarytree;

public class OneFiveDelete {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = Integer.MIN_VALUE;
        String withFive = String.valueOf(N);
        int index = 0;
        while(index<withFive.length()){
            if(withFive.charAt(index) == '5'){
                String withoutFive = withFive.substring(0, index) + withFive.substring(index+1);
                if(result < Integer.valueOf(withoutFive)){
                    result = Integer.parseInt(withoutFive);
                }
            }
            index++;
        }
        return result;
    }
}
