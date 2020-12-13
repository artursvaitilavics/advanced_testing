package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.UCMAnalyzer;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeveloperTask02Test {
    DeveloperTask02 developerTask = new DeveloperTask02(new UCMAnalyzer());

    @Test
    public void doAnalyzeAndGetCode() {
        assertEquals(10, developerTask.doAnalyzeAndGetCode(7));
        assertEquals(-2, developerTask.doAnalyzeAndGetCode(-5));
    }

    @Test
    public void isAlfaNumberCategory() {
        assertTrue(developerTask.isAlfaNumberCategory(30));
        assertFalse(developerTask.isAlfaNumberCategory(5));
    }

    @Test
    public void doAnalyzeBettaSectorCode() {
        assertEquals(76,developerTask.doAnalyzeBettaSectorCode(5));
    }
}