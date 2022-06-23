package com.example.nio;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;

public class SynchronisedCollectionDemo {


    @Test
    public void concurrentModificationDemoTestInSingleThread(){
        List<Integer> integerList = Collections.synchronizedList(new ArrayList<>(){
            {
                add(1);
                add(2);
                add(3);
            }
        });
        Assert.assertThrows(ConcurrentModificationException.class, () -> {
            for(Integer x : integerList){
                System.out.println(x);
                integerList.remove(1);
            }
        });
    }

}
