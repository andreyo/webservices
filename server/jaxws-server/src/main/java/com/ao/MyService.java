package com.ao;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by elena on 6/9/14.
 */
@WebService
public class MyService {
    private AtomicInteger counter = new AtomicInteger();

    public String sayHello() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        int returnValue = counter.incrementAndGet();
        System.out.println(returnValue);
        return String.valueOf(returnValue);
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/my", new MyService());
    }
}
