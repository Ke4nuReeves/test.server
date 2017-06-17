package com.test.server.data.entity;

/**
 * Created by Dmitriy Titov on 17.06.2017.
 */
public class Country {

    private long id;
    private String name;
    private String capitalName;

    public Country() {

    }

    public Country(String name, String capitalName) {
        this.name = name;
        this.capitalName = capitalName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setId(long id) {

        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }
}
