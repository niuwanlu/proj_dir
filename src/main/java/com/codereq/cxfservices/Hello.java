package com.codereq.cxfservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Hello {

    @WebMethod
    public String hello(String name) {
        return "Hello," + name + "\n";
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
//        Endpoint endpoint = Endpoint.publish("http://localhost:8080/hello",hello);
    }
}