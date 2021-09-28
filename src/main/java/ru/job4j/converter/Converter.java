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
        System.out.println("140 rubles are " + evro + " evro.");
        float in = 140;
        double expected = 2;
        double out = Converter.rubleToEvro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float dollar = Converter.rubleToDollar(5430);
        System.out.println("5430 rubles are " + dollar + " dollar.");
        in = 5430;
        expected = 90.5F;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("5430 rubles are 90.5. Test result : " + passed);

        float ruble = Converter.dollarToRuble(354);
        System.out.println("354 dollar are " + ruble + " ruble.");
        in = 354;
        expected = 21240.0f;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("354 dollars are 21240. Test result : " + passed);

        float ruble2 = Converter.evroToRubles(354);
        System.out.println("354 evro are " + ruble + " ruble.");
        in = 354;
        expected = 24780.0f;
        out = Converter.evroToRubles(in);
        passed = expected == out;
        System.out.println("354 evro are 24780. Test result : " + passed);

        double evro2 = Converter.dollarToEvro(450);
        System.out.println("450 dollar are " + evro2 + " evro");
        in = 450;
        expected = 385.65;
        out = Converter.dollarToEvro(in);
        passed = expected == out;
        System.out.println("354 evro are 24780. Test result : " + passed);
    }
}
