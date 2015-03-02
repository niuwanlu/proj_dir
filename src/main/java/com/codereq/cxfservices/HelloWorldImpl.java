package com.codereq.cxfservices;

import com.codereq.cxfservices.HelloWorld;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "com.codereq.cxfservices.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Resource
    WebServiceContext wsctx = new org.apache.cxf.jaxws.context.WebServiceContextImpl();

    @Override
    public String getHelloWorldAsString() {
        MessageContext mctx = wsctx.getMessageContext();

        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) http_headers.get("Username");
        List passList = (List) http_headers.get("Passname");

        String username = "";
        String password = "";

        if (userList!=null) {
            username = userList.get(0).toString();
        }

        if (passList!=null) {
            password = passList.get(0).toString();
        }

        if (username.equals("apple") && password.equals("123456")) {
            return "Hello Valid User!";
        } else {
            return "Unknown User!";
        }

    }

}