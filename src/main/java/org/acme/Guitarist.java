package org.acme;

import jakarta.enterprise.inject.Produces;

public class Guitarist {

    @Produces
    public String makeSong() {
        return "Carlos santana";
    }
}
