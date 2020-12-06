package com.swampus.excercise.task;

import java.util.List;

/**
 * Investigate class and create test class for its methods
 */
public class JuniorTask01 {

    private final String ENC = "HAYSFUASC";

    public long calculateInterests(long num) {
        return Math.round(num + (num * 0.05) + 5);
    }

    public String createEncryptedString(String string) {
        return ENC + string + ENC;
    }

    public void checkNotNegative(int num) {
        if (num < 0) {
            throw new RuntimeException("Negative!");
        }
    }

    public boolean containsTwoSimilarElements(List<String> elements) {
        return elements.stream().distinct().count() > 1;
    }
}
