// Search.java
package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
    @JsonProperty
    private String city;

    public Search() {} // Required for Jackson deserialization

    public Search(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}