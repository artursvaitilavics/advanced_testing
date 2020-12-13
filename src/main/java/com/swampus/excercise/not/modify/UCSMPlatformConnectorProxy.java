package com.swampus.excercise.not.modify;

public class UCSMPlatformConnectorProxy extends UCSMPlatformConnector {
    public UCSMPlatformConnectorProxy() {
    }

    @Override
    public String getHeader() {
//        return super.getHeader();
        return "[GHAHBSGYB^&F%&A(NBOBA^%FGY(UIASD]";
    }


    @Override
    public String getContent(String key) {
        if(key.equals("A")){
            return "[6882763872387872938972368236872348792436823623862348768234]";
        }
        if(key.equals("B")){
            return "[111111222222222233333333333]";
        }
        if(key.equals("C")){
            return "[C22CCCCC22222CCCCC]";
        }
        throw new RuntimeException("Unknown host");
    }
}
