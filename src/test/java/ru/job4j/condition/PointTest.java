package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when1011to1213then() {
        double expected = 2.82;
        int x1 = 10;
        int y1 = 11;
        int x2 = 12;
        int y2 = 13;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when89to13then() {
        double expected = 9.21;
        int x1 = 8;
        int y1 = 9;
        int x2 = 1;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus107to2minus9then() {
        double expected = 32.64;
        int x1 = 23;
        int y1 = 7;
        int x2 = 2;
        int y2 = 32;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}