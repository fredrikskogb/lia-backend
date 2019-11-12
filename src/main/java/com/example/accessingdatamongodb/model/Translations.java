package com.example.accessingdatamongodb.model;

import org.springframework.data.annotation.Id;

public class Translations {

    @Id
    private String id;
    private String locale;
    private String key;
    private String value;

    public Translations(String locale, String key, String value) {
        this.locale = locale;
        this.key = key;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
