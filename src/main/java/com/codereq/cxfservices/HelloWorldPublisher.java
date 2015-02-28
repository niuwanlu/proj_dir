package com.codereq.cxfservices;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/cxf-service-one/HelloWorld?wsdl", new HelloWorldImpl());
    }

}