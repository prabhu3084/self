package com.example.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReverseArrayIterativeTest {

    private  ReverseArrayIterative reverseArrayIterative;


    @Before
      public void setUp(){
     reverseArrayIterative = new ReverseArrayIterative();
    }

    @Test
    public void  reverseTestWithEven(){
        int[] reverseArray = reverseArrayIterative.reverseArray(new int[]{1, 2, 3, 4});
        int[] expectedArray = {4, 3, 2, 1};
        Assert.assertArrayEquals(expectedArray, reverseArray);
    }

    @Test
    public void  reverseTestWithOdd(){
        int[] reverseArray = reverseArrayIterative.reverseArray(new int[]{5, 1, 2, 3, 4});
        int[] expectedArray = {4, 3, 2, 1, 5};
        Assert.assertArrayEquals(expectedArray, reverseArray);
    }
}
