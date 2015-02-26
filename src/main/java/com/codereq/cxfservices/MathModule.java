package com.codereq.cxfservices;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService
public interface MathModule {
    public boolean isOdd(Integer number);
}