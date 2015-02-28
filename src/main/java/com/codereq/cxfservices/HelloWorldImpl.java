package com.codereq.cxfservices;

import com.codereq.cxfservices.HelloWorld;
import javax.jws.WebService;

@WebService(endpointInterface = "com.codereq.cxfservices.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World " + name;
    }

}