package com.isaac.example.coffee;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@Path("orders")
@Produces(MediaType.APPLICATION_JSON)
public class CoffeeOrdersResource {

    @GET
    public List<CoffeeOrder> order() {
        CoffeeOrder order = new CoffeeOrder();
        order.setType(CoffeeType.CAPPUCCINO);
        return List.of(order);
    }

}
