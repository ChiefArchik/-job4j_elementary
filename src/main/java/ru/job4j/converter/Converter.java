package ru.job4j.converter;

public class Converter {
    public static float rubleToEvro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static float evroToRubles(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static double dollarToEvro(double value) {
        double rsl = value * 0.857;
        return rsl;
    }

    public static void main(String[] args) {
        float evro = Converter.rubleToEvro(140);
        float dollar = Converter.rubleToDollar(5430);
        float ruble1 = Converter.dollarToRuble(354);
        float ruble2 = Converter.evroToRubles(354);
        double evro2 = Converter.dollarToEvro(450);
        System.out.println("140 rubles are " + evro + " evro.");
        System.out.println("5430 rubles are " + dollar + " dollar.");
        System.out.println("354 dollar are " + ruble1 + " ruble.");
        System.out.println("354 evro are " + ruble2 + " ruble.");
        System.out.println("450 dollar are " + evro2 + " evro");
    }
}
