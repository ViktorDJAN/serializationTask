package org.example.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonName {
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("MiddleName")
    public String middleName;


    public PersonName(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public PersonName() {
    }
}
