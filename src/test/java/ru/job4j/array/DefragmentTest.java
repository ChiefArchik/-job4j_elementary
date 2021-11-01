package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class DefragmentTest {
    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }
}