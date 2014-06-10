package com.ao;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.util.concurrent.ExecutionException;

/**
 * Created by elena on 6/9/14.
 */
public class CxfClient {

    public static void main(String[] args) {
//        run();
        runAsync();
    }

    public static void run() {
        while (true) {
            MyService port = new MyServiceService().getMyServicePort();
            System.out.println("got:" + port.sayHello());
        }
    }

    public static void runAsync() {
        MyService port = new MyServiceService().getMyServicePort();
        while (true) {
            port.sayHelloAsync(new AsyncHandler<SayHelloResponse>() {
                @Override
                public void handleResponse(Response<SayHelloResponse> res) {
                    try {
                        System.out.println("got: " + res.get().getReturn());
                    } catch (InterruptedException | ExecutionException e) {
                    }
                }
            });
            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }*/
        }
    }
}
