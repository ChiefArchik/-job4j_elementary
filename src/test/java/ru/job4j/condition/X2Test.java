package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        /*входные параметра*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /*ожидаемое значение*/
        int expected = 40;
        /*вызов метода для проверки*/
        int rsl = X2.calc(a, b, c, x);
        /*сравнение значений*/
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        /*входные параметра*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /*ожидаемое значение*/
        int expected = 3;
        /*вызов метода для проверки*/
        int rsl = X2.calc(a, b, c, x);
        /*сравнение значений*/
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        /*входные параметра*/
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /*ожидаемое значение*/
        int expected = 2;
        /*вызов метода для проверки*/
        int rsl = X2.calc(a, b, c, x);
        /*сравнение значений*/
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        /*входные параметра*/
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /*ожидаемое значение*/
        int expected = 2;
        /*вызов метода для проверки*/
        int rsl = X2.calc(a, b, c, x);
        /*сравнение значений*/
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        /*входные параметра*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /*ожидаемое значение*/
        int expected = 1;
        /*вызов метода для проверки*/
        int rsl = X2.calc(a, b, c, x);
        /*сравнение значений*/
        Assert.assertEquals(expected, rsl);
    }

}