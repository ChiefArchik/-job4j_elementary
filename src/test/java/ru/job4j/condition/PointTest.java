package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {
    @Test
    public void when01to23then2dot82() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 3);
        double dist = a.distance(b);
        System.out.println(dist);
    }

    @Test
    public void when89to13then9dot21() {
        Point a = new Point(8, 9);
        Point b = new Point(1, 3);
        double dist = a.distance(b);
        System.out.println(dist);
    }

    @Test
    public void when27to23then4() {
        Point a = new Point(2, 7);
        Point b = new Point(2, 3);
        double dist = a.distance(b);
        System.out.println(dist);
    }

    @Test
    public void whenX12toY23toZ34() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 3);
        Point c = new Point(3, 4);
        double dist1 = a.distance3d(b);
        double dist2 = a.distance3d(c);
        double dist3 = b.distance3d(c);
        System.out.println(dist1 + "  " + dist2 + "  " + dist3);
    }
}