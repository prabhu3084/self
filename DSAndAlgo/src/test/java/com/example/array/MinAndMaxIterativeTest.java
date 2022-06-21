package com.example.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinAndMaxIterativeTest {

    private  MinAndMaxIterative minAndMaxIterative;

    @Before
    public void setUp(){
        minAndMaxIterative = new MinAndMaxIterative();
    }

    @Test
    public void MinAndMaxTest(){
       Assert.assertEquals(-3 ,minAndMaxIterative.min(new int[]{-1, -3, 4 ,5}));
        Assert.assertEquals(5  ,minAndMaxIterative.max(new int[]{-1, -3, 4 ,5}));
    }
}
