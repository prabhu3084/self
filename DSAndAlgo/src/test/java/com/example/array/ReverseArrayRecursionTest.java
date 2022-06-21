package com.example.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseArrayRecursionTest {

    private  ReverseArrayRecursion reverseArrayRecursion;

    @Before
    public void setUp(){
        reverseArrayRecursion = new ReverseArrayRecursion();
    }

    @Test
    public void  reverseTestWithEven(){
        int[] reverseArray = reverseArrayRecursion.reverseArray(new int[]{1, 2, 3, 4});
        int[] expectedArray = {4, 3, 2, 1};
        Assert.assertArrayEquals(expectedArray, reverseArray);
    }

    @Test
    public void  reverseTestWithOdd(){
        int[] reverseArray = reverseArrayRecursion.reverseArray(new int[]{5, 1, 2, 3, 4});
        int[] expectedArray = {4, 3, 2, 1, 5};
        Assert.assertArrayEquals(expectedArray, reverseArray);
    }
}
