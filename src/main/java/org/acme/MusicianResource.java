package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("some-coffee")
@ApplicationScoped
public class MusicianResource {

    @Inject
    String barista;

    @GET
    public String getCoffee() {
        return barista;
    }
}
