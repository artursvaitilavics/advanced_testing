package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.UCSMPlatformConnector;
import com.swampus.excercise.not.modify.UCSMPlatformConnectorProxy;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.Whitebox;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LeadTask03Test {


//    private UCSMPlatformConnector connector = mock(UCSMPlatformConnector.class);
//
//    private LeadTask03 leadTask = new LeadTask03(connector);


    private UCSMPlatformConnector connector = mock(UCSMPlatformConnector.class);

    private LeadTask03 leadTask = new LeadTask03();


    @Before
    public void setUp() throws Exception {
        Whitebox.setInternalState(leadTask, "ucsmPlatformConnector", connector);
        System.out.println(Whitebox.getInternalState(leadTask, "stringLauks"));
    }

    @Test
    public void extractUserNameFromHeader() {
        when(connector.getHeader()).thenReturn("1234");
        Whitebox.setInternalState(leadTask, "stringLauks", "");
        assertEquals("1234", leadTask.extractUserNameFromHeader());
    }

    @Test
    public void extractAlfaFromContent() {
        when(connector.getContent("A")).thenReturn("ABCDEFGH");
        when(connector.getContent("B")).thenReturn("01234567");
        when(connector.getContent("C")).thenReturn("TABAKABRUNA");

        assertEquals("EF", leadTask.extractAlfaFromContent("A"));
        assertEquals("45", leadTask.extractAlfaFromContent("B"));
        assertEquals("KA", leadTask.extractAlfaFromContent("C"));
    }
}