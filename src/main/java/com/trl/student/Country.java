package com.trl.student;

public enum Country {

    SPAIN("Spain", "ES"),
    GERMAN("German", "DE"),
    FRANCE("France", "FR"),
    UNITED_STATES("United States", "US");

    private final String fullName;
    private final String shortName;

    Country(String fullName, String shortName) {
        this.fullName = fullName;
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }
}
