package com.training;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();
    int input[];
    int output[];
    int output1[];
    int output2[];

    @BeforeMethod
    public void setUp() {
        input = new int[]{1, 2, 3, 4, 5};
        output = new int[]{4, 5, 1, 2, 3};
        output1 = new int[]{2, 3, 4, 5, 1};
        output2 = new int[]{5, 1, 2, 3, 4};
    }

    @Test
    public void test1() {
        Assert.assertEquals(rotateArray.rotate(input, 2), output);
    }

    @Test
    public void test2() {
        Assert.assertEquals(rotateArray.rotateBrute(input, 2), output);
    }

    @Test
    public void test3() {
        Assert.assertEquals(rotateArray.rotate(input, 4), output1);
    }

    @Test
    public void test4() {
        Assert.assertEquals(rotateArray.rotateBrute(input, 4), output1);
    }

    @Test
    public void test5() {
        Assert.assertEquals(rotateArray.rotate(input, 6), output2);
    }

    @Test
    public void test6() {
        Assert.assertEquals(rotateArray.rotateBrute(input, 6), output2);
    }
}
