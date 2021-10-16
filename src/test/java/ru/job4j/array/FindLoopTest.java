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

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expexted = 3;
        Assert.assertEquals(expexted, result);
    }

    @Test
    public void whenNoFind4() {
        int[] data = new int[] {6, 2, 7, 23, 11, 6, 9, 4};
        int el = 7;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}