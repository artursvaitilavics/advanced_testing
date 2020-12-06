package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.UCSMPlatformConnector;

public class LeadTask03 {
    private UCSMPlatformConnector ucsmPlatformConnector;

    public LeadTask03(UCSMPlatformConnector ucsmPlatformConnector) {
        this.ucsmPlatformConnector = ucsmPlatformConnector;
    }

    public String extractUserNameFromHeader() {
        return ucsmPlatformConnector.getHeader().substring(0, 4);
    }

    public String extractAlfaFromContent(String key) {
        String content = ucsmPlatformConnector.getContent(key);
        return content.substring(4, 4);
    }
}
