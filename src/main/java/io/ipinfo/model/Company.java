package io.ipinfo.model;


public class Company {
    private final String name;
    private final String domain;
    private final String type;

    public Company(String name, String domain, String type) {
        this.name = name;
        this.domain = domain;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}