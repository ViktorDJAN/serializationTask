package org.example.client;

import java.io.Serializable;

public class ClientFindInfo implements Serializable {
    private Dul dul;
    private Integer partyId;

    public Dul getDul() {
        return dul;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public ClientFindInfo() {
    }
}
