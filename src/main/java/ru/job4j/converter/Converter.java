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
        float evro1 = Converter.rubleToEvro(140);
        float dollar = Converter.rubleToDollar(5430);
        float ruble1 = Converter.dollarToRuble(354);
        float ruble2 = Converter.evroToRubles(354);
        double evro2 = Converter.dollarToEvro(450);
        System.out.println("140 rubles are " + evro1 + " evro.");
        System.out.println("5430 rubles are " + dollar + " dollar.");
        System.out.println("354 dollar are " + ruble1 + " ruble.");
        System.out.println("354 evro are " + ruble2 + " ruble.");
        System.out.println("450 dollar are " + evro2 + " evro");
        float inEv = 140;
        float expectedEv = 2;
        float outEv = Converter.rubleToEvro(inEv);
        boolean passedEv = expectedEv == outEv;
        System.out.println("140 rubles are 2. Test result : " + passedEv);
        float inDol = 5430;
        float expectedDol = 90.5F;
        float outDol = Converter.rubleToDollar(inDol);
        boolean passedDol = expectedDol == outDol;
        System.out.println("5430 rubles are 90.5. Test result : " + passedDol);
        float inRu1 = 354;
        float expectedRu1 = 21240.0f;
        float outRu1 = Converter.dollarToRuble(inRu1);
        boolean passedRu1 = expectedRu1 == outRu1;
        System.out.println("354 dollars are 21240. Test result : " + passedRu1);
        float inRu2 = 354;
        float expectedRu2 = 24780.0f;
        float outRu2 = Converter.evroToRubles(inRu2);
        boolean passedRu2 = expectedRu2 == outRu2;
        System.out.println("354 evro are 24780. Test result : " + passedRu2);
        double inE2 = 450;
        double expectedE2 = 385.65;
        double outE2 = Converter.dollarToEvro(inE2);
        boolean passedE2 = expectedE2 == outE2;
        System.out.println("354 evro are 24780. Test result : " + passedE2);
    }
}
