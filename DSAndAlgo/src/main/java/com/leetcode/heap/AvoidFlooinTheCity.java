package com.leetcode.heap;

import java.util.ArrayList;
import java.util.List;

public class AvoidFlooinTheCity {

    public int[] avoidFlood(int[] rains) {
        int[] result = new int[rains.length];
        List<Integer> fullLake = new ArrayList<>();
        List<Integer> needToDry = new ArrayList<>();
        int numberOfLaketoDry = 0;
        for(int index =0 ; index<rains.length; index++){
            if(rains[index] > 0 ){
                if(fullLake.contains(index)){
                    needToDry.add(index);
                }
                else {
                    fullLake.add(index);
                }
            }
            if(rains[index] == 0){
                numberOfLaketoDry++;
            }
        }

        if(needToDry.size() == numberOfLaketoDry){

            for(int index =0 ; index < rains.length; index++){
                if(rains[index] > 0){
                    if(fullLake.contains(index)) {
                        result[index] = -1;
                        index++;
                    }
                }else if( rains[index] == 0){

                }
            }


        }else {
            return new int[];
        }
    }
}
