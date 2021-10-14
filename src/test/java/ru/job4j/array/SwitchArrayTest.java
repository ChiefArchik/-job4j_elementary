package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = new int[] {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1To8() {
        int[] input = new int[] {8, 6, 4, 6, 44, 3, 23, 11, 3, 0};
        int source = 1;
        int dest = 8;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {8, 3, 4, 6, 44, 3, 23, 11, 6, 0};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to1() {
        int[] input = new int[] {1, 2, 3, 4};
        int source = 2;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to3() {
        int[] input = new int[] {1, 2, 3, 4};
        int source = input.length - 3;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 4, 3, 2};
        Assert.assertArrayEquals(expected, result);
    }
}
