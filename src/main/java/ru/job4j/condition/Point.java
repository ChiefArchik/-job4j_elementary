package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double amount = first + second;
        double rsl = Math.sqrt(amount);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 2, 3, 4);
        double result3 = Point.distance(5, 3, 6, 1);
        System.out.println("result (0,0) to (2,0) " + result1);
        System.out.println("result (1,2) to (3,4) " + result2);
        System.out.println("result (5,3) to (6,1) " + result3);
    }
}