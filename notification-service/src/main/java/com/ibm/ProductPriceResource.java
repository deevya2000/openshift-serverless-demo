package com.ibm;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class ProductPriceResource {

	@POST
	public void process(String message) {
		System.out.println(
				"Kafka message received in Quarkus reactive: product-price-updated - Sending email : " + message);
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello RESTEasy";
	}
}