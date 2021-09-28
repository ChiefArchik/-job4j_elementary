package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEvro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void whenConvert5430RblThen90Dlr() {
        float in = 5430;
        float expected = 90.5f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert354DlrThen21240Rbl() {
        float in = 354;
        float expected = 21240;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert354EuroThen24780Rbl() {
        float in = 354;
        float expected = 24780;
        float out = Converter.evroToRubles(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert450DlrThen385Evro() {
        double in = 450;
        double expected = 385.65;
        double out = Converter.dollarToEvro(in);
        double eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}