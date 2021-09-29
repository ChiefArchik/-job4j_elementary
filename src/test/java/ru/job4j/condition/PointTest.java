package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when01to23then2dot82() {
        double expected = 2.82;
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when89to13then9dot21() {
        double expected = 9.21;
        int x1 = 8;
        int y1 = 9;
        int x2 = 1;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27to23then4() {
        double expected = 4;
        int x1 = 2;
        int y1 = 7;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}