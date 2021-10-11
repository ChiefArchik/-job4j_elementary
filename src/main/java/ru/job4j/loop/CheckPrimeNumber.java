package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        int hold;
        if (number == 1) {
            prime = false;
        }
        for (int index = 2; index <= number / 2; index++) {
            hold = number % index;
            if (hold == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}