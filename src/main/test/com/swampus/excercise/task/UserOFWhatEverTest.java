package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.WhatEver;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserOFWhatEverTest {

    private WhatEver whatEver = spy(new WhatEver());
    private UserOFWhatEver userOFWhatEver = new UserOFWhatEver(whatEver);

    @Test
    public void methodOne() {
        assertEquals(15, userOFWhatEver.methodOne(10));
    }

    @Test
    public void methodTwo() {
        Mockito.doReturn(5).when(whatEver).badMethod(5);
        assertEquals(15, userOFWhatEver.methodTwo(5));

    }
}