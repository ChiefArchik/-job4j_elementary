package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class EndWithTest {
    @Test
    public void whenEndWithPostfixThenTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'o'};
        boolean result = EndWith.endWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenEndWithPostfixThenFalse() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'a'};
        boolean result = EndWith.endWith(word, post);
        Assert.assertFalse(result);
    }
}