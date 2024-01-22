package org.example.person;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT, use= JsonTypeInfo.Id.NAME)
public class PersonInfo  {
    @JsonProperty("FindPersonInfo")
    public FindPersonInfo findPersonInfo;

    public PersonInfo(FindPersonInfo findPersonInfo) {
        this.findPersonInfo = findPersonInfo;
    }

    public PersonInfo() {
    }
}
