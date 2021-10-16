package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class CharTest {

    @Test
    public void whenStartsWithPrefixIsTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'e'};
        boolean result = Char.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNoStartsWithPrefixIsTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'i'};
        boolean result = Char.startsWith(word, pref);
        Assert.assertFalse(result);
    }
}