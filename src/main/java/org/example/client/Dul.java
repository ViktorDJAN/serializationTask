package org.example.client;

import java.io.Serializable;

public class Dul implements Serializable {
    private String documentType;
    private String firstName;
    private String lastName;
    private String secondName;
    private Integer number;

    public Dul() {
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getSeries() {
        return series;
    }

    private Integer series;

}
