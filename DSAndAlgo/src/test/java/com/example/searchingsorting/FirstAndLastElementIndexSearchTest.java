package com.example.searchingsorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstAndLastElementIndexSearchTest {

    private FirstAndLastElementIndexSearch firstAndLastElementIndexSearch;

    @Before
    public void setUp(){
        firstAndLastElementIndexSearch = new FirstAndLastElementIndexSearch();
    }

    @Test
    public void firstAndLastElementIndexSearchBruteForceTest(){
        Assert.assertArrayEquals(new int[]{
                3, 5
        },firstAndLastElementIndexSearch.firstAndLastBruteForce(new int[]{1,2,3,4,4,4,5}, 4));
    }
}
