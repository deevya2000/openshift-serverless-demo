package com.ibm;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@Path("/")
public class ProductPriceResource {

	@POST
	public void process(String message) {
		System.out.println(
				"Kafka message received with Quarkus reactive and Knative: product-price-updated - Sending email : " + message);
	}
	
//	@Incoming("product-price-updated")
    public String processMessage(String message) {
        System.out.println("Kafka message received in Quarkus reactive: product-price-updated - " + message);
        return message;
    }  

	@GET
	@Path("/pricechanged/{productId}/{newPrice}")
	@Produces(MediaType.TEXT_PLAIN)
	public String pricechanged(@PathParam("productId") String productId, @PathParam("newPrice") String newPrice) {
		System.out.println("Serverless call invoked for product ID : "+productId+", price has changed to "+newPrice);
		return "Serverless called !!";
	}
	
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello Rest Easy";
	}
}