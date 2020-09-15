package com.trl.student;

public enum OperatingSystem {

    LINUX("Linux"),
    MAC_OS("Mac OS"),
    WINDOWS("Windows");

    private String name;

    OperatingSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
