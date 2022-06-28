package com.example.searchingsorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotatedSortedArrayTest {

    private RotatedSortedArray rotatedSortedArray;


    @Before
    public void setUp(){

        rotatedSortedArray = new RotatedSortedArray();
    }

    @Test
    public void rotatedSortedArrayTest(){
        Assert.assertEquals(5, rotatedSortedArray.search(new int[]{4,5,6,7, 0, 1,2}, 1));

        Assert.assertEquals(-1, rotatedSortedArray.search(new int[]{4,5,6,7, 0, 1,2}, 8));

        Assert.assertEquals(2, rotatedSortedArray.search(new int[]{4,5,6,7, 0, 1,2}, 6));

        Assert.assertEquals(0, rotatedSortedArray.search(new int[]{4,1,2}, 4));

        Assert.assertEquals(1, rotatedSortedArray.search(new int[]{5,1,2,3,4}, 1));

        Assert.assertEquals(1, rotatedSortedArray.search(new int[]{8,9,2,3,4}, 9));




    }

}
