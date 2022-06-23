package com.example.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxSubArrayBruteForceTest {

    private MaxSubArrayBruteForce maxSubArrayBruteForce;


    @Before
    public void setUp(){
        maxSubArrayBruteForce = new MaxSubArrayBruteForce();
    }

    @Test
    public void maxSubArrayTest(){
        long sum = maxSubArrayBruteForce.maxSubArray(new int[]{1, 2,-10, 5, -4});
        Assert.assertEquals(5, sum);
    }
}
