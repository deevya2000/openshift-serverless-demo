package com.ibm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/")
@RegisterRestClient
public interface NotificationService {

	@GET
	@Path("/pricechanged/{id}/{price}")
	String handePriceChange(@PathParam String id, @PathParam String price);

}
