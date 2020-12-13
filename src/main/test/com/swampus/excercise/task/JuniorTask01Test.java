package com.swampus.excercise.task;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class JuniorTask01Test {
    private JuniorTask01 juniorTask01 = new JuniorTask01();

    @Test
    public void calculateInterests() {
        long calculateInterests = juniorTask01.calculateInterests(2);
        assertEquals(7, calculateInterests);
    }

    @Test
    public void createEncryptedString() {
        String testString = juniorTask01.createEncryptedString("_test_");
        assertEquals("HAYSFUASC_test_HAYSFUASC", testString);
    }

    @Test
    public void checkNotNegative() {
        juniorTask01.checkNotNegative(5);
        try {
            juniorTask01.checkNotNegative(-5);
            fail();
        }catch (RuntimeException e) {
            assertEquals("Negative!", e.getMessage());
        }
    }

    @Test
    public void containsTwoSimilarElements() {
        List<String> strings = new ArrayList<>();
        strings.add("test");
        strings.add("potato");
        strings.add("card");

        strings.add("weird name");
        strings.add("weird name");

        strings.add("weird name");

        assertTrue(juniorTask01.containsTwoSimilarElements(strings));
    }
}