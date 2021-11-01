package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {
    @Test
    public void whenMax1To2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax16To3() { /*максимальное первое число*/
        int left = 16;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 16;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To9() { /*максимальное второе число*/
        int left = 4;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To8() { /*оба числа равны*/
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}