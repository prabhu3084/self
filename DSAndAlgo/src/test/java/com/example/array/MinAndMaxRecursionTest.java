package com.example.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinAndMaxRecursionTest {

    private MinAndMaxRecursion minAndMaxRecursion;

    @Before
    public void setUp() {
        minAndMaxRecursion = new MinAndMaxRecursion();
    }

    @Test
    public void MinAndMaxTest() {
        Assert.assertEquals(-3, minAndMaxRecursion.minArray(new int[]{-1, -3, 4, 5}));
        Assert.assertEquals(-1, minAndMaxRecursion.maxArray(new int[]{-1, -3, -4, -5}));
    }
}
