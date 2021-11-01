package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2, 7};
        int[] result = Turn.back(input);
        int[] expected = new int[]{7, 2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray2() {
        int[] input = new int[]{4, 1, 6, 2, 7, 10, 44, 55};
        int[] result = Turn.back(input);
        int[] expected = new int[]{55, 44, 10, 7, 2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }
}