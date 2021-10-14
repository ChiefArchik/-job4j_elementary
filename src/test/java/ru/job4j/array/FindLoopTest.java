package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Than0() {
        int[] data = {5, 2, 3, 4};
        int el = 5;
        int result = FindLoop.index0f(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas9ThanMinus1() {
        int[] data = {6, 2, 3, 4};
        int el = 9;
        int result = FindLoop.index0f(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}