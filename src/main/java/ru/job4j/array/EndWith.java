package ru.job4j.array;

public class EndWith {

    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
            }
        }
        return result;
    }
}