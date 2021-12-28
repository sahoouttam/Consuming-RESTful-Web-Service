package com.example.ConsumingRest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    
    private long id;
    private String quote;

    public Value(long id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
        "id=" + id +
        ", quote='" + quote + '\'' +
        '}';
    }
    
}
