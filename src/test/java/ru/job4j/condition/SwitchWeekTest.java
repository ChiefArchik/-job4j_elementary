package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SwitchWeekTest {

    @Test
    public void whenDay1() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(1);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay2() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(2);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay3() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(3);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay4() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(4);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay5() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(5);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay6() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(6);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay7() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(7);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }
}