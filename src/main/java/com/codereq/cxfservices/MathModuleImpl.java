package com.codereq.cxfservices;

import javax.jws.WebService;

@WebService(endpointInterface = "com.codereq.cxfservices.MathModule")
public class MathModuleImpl implements MathModule {

    public boolean isOdd(Integer number) {
        if (number == null) {
            return false;
        }
        if (number.intValue() % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}