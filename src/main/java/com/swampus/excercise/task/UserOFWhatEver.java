package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.WhatEver;

public class UserOFWhatEver {
    private WhatEver whatEver;

    public UserOFWhatEver(WhatEver whatEver) {
        this.whatEver = whatEver;
    }


    public int methodOne(int number){
        return whatEver.addFive(number);
    }

    public int methodTwo(int number){
        return whatEver.badMethod(number) + 10;
    }
}
