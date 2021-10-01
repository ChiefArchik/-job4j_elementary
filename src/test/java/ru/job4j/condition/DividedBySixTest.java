package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class DividedBySixTest {

    @Test
    public void whenNuberDividedBy6() {
        int in = 24;
        String result = DividedBySix.checkNumber(in);
        String expected = "Исходное число делится на 6.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDividedBy3AndNotEven() {
        int in = 9;
        String result = DividedBySix.checkNumber(in);
        String expected = "Исходное число делится на 3, но не является четным.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDividedBy3AndEven() {
        int in = 14;
        String result = DividedBySix.checkNumber(in);
        String expected = "Число не делится на 3, но является четным.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDividedBy3AndNotEvrn() {
        int in = 25;
        String result = DividedBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3 и не является четным.";
        Assert.assertEquals(expected, result);
    }
}