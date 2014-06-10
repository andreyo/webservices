package com.ao;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-06-09T15:07:20.157+03:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://ao.com/", name = "MyService")
@XmlSeeAlso({ObjectFactory.class})
public interface MyService {

    @WebMethod(operationName = "sayHello")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ao.com/", className = "com.ao.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ao.com/", className = "com.ao.SayHelloResponse")
    public Response<com.ao.SayHelloResponse> sayHelloAsync();

    @WebMethod(operationName = "sayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ao.com/", className = "com.ao.SayHelloResponse")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ao.com/", className = "com.ao.SayHello")
    public Future<?> sayHelloAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<com.ao.SayHelloResponse> asyncHandler
    );

    @WebMethod
    @Action(input = "http://ao.com/MyService/sayHelloRequest", output = "http://ao.com/MyService/sayHelloResponse")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ao.com/", className = "com.ao.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ao.com/", className = "com.ao.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello();
}