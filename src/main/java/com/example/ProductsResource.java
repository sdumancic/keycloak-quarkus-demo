package com.example;

import io.quarkus.security.Authenticated;
import io.quarkus.security.identity.SecurityIdentity;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.jboss.logging.Logger;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/products")
@Authenticated
public class ProductsResource {

    @Inject
    Logger logger;

    @Inject
    SecurityIdentity securityIdentity;

    @Inject
    ProductsService service;

    @Inject
    JsonWebToken jwt;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        logger.info("name = " + securityIdentity.getPrincipal().getName());
        return Response.ok(service.getProducts()).build();
    }
}
