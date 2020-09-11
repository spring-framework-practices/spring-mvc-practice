package com.trl.student;

public enum ProgrammingLanguage {

    JAVA("Java"),
    PYTHON("Python"),
    JAVA_SCRIPT("JavaScript");

    private final String name;

    ProgrammingLanguage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
