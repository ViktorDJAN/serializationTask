package org.example.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;


public class ClientInfo implements Serializable  {

    private ClientFindInfo clientFindInfo;

    public ClientFindInfo getClientFindInfo() {
        return clientFindInfo;
    }

    public ClientInfo() {
    }
}
