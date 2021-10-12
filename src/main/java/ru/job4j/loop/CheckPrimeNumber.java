package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index <= number / 2; index++) {
            number = number % index;
            if (number == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}