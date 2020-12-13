package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.UCMAnalyzer;

/**
 * Investigate and create unit tests for methods
 */
public class DeveloperTask02 {
    private UCMAnalyzer ucmAnalyzer;

    public DeveloperTask02(UCMAnalyzer ucmAnalyzer) {
        this.ucmAnalyzer = ucmAnalyzer;
    }

    public DeveloperTask02() {

    }

    public int doAnalyzeAndGetCode(int code) {
        return ucmAnalyzer.increaseUcm(code) + 1;
    }

    public boolean isAlfaNumberCategory(int candidate) {
        return candidate / 2 > 11;
    }

    public int doAnalyzeBettaSectorCode(int code) {
        return ucmAnalyzer.increaseUcm(code) + 1 + ucmAnalyzer.increaseUcm(11) + 55;
    }



}
