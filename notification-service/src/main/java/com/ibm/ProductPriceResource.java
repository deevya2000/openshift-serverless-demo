package com.ibm;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import javax.enterprise.context.ApplicationScoped;

@Path("/")
public class ProductPriceResource {

@POST
    public void process(String message) {
        System.out.println("Kafka message received in Quarkus reactive: product-price-updated - Sending email : " + message);
    }   
}