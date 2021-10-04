package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int start = 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = start * i;
            start = result;

        }
        return result;
    }
}
