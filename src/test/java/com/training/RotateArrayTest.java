package com.training;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();
    int input[];
    int output[];

    @BeforeMethod
    public void setUp() {
        input = new int[]{1, 2, 3, 4, 5};
        output = new int[]{4, 5, 1, 2, 3};
    }

    @Test
    public void test1() {
        Assert.assertEquals(rotateArray.rotate(input, 2), output);
    }

    @Test
    public void test2() {
        Assert.assertEquals(rotateArray.rotateBrute(input, 2), output);
    }
}
