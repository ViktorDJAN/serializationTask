package org.example.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindPersonInfo {
    @JsonProperty("PersonName")
    public PersonName personName;
    @JsonProperty("IdentityCard")
    public IdentityCard identityCard;
    @JsonProperty("PartyID")
    public Integer PartyId;

    public FindPersonInfo(PersonName personName, IdentityCard identityCard, Integer partyId) {
        this.personName = personName;
        this.identityCard = identityCard;
        PartyId = partyId;
    }

    public FindPersonInfo() {
    }
}
