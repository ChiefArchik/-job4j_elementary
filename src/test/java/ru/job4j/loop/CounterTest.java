package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumByEvenFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whemSunByEvenFromFourToNinetyThenTwentySixtyEight() {
        int start = 4;
        int finish = 90;
        int result = Counter.sumByEven(start, finish);
        int expected = 2068;
        Assert.assertEquals(expected, result);
    }
}