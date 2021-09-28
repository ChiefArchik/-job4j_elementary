package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Sqare2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K9Sqare3Dot23() {
        double expected = 3.23;
        int p = 12;
        double k = 9;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K23Sqare5Dot06() {
        double expected = 5.06;
        int p = 9;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP58K3Dot7Sqare140Dot86() {
        double expected = 140.86;
        int p = 58;
        double k = 3.7;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
