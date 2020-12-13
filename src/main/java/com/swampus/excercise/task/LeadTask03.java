package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.UCSMPlatformConnector;

/**
 * Investigate and create test
 */
public class LeadTask03 {
    private UCSMPlatformConnector ucsmPlatformConnector;
    private String stringLauks = "ABC";


    public String extractUserNameFromHeader() {
        return ucsmPlatformConnector.getHeader().substring(0, 4) + stringLauks;
    }

    public String extractAlfaFromContent(String key) {
        String content = ucsmPlatformConnector.getContent(key);
        return content.substring(4, 6);
    }

}
