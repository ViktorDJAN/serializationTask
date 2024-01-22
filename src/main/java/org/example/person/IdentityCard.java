package org.example.person;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class IdentityCard implements Serializable {
    @JsonProperty("IdType")
    public String idType;
    @JsonProperty("IdSeries")
    public Integer idSeries;
    @JsonProperty("IdNum")
    public Integer idNum;

    public IdentityCard(String idType, Integer idSeries, Integer idNum) {
        this.idType = idType;
        this.idSeries = idSeries;
        this.idNum = idNum;
    }

    public IdentityCard() {
    }
}
