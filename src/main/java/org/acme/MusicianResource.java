package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("musicians")
@ApplicationScoped
public class MusicianResource {

    @Inject
    String guitarist;

    @GET
    public String getMusician() {
        return guitarist;
    }
}
