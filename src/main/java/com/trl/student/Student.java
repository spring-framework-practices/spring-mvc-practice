package com.trl.student;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteProgrammingLanguage;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(country, student.country) &&
                Objects.equals(favoriteProgrammingLanguage, student.favoriteProgrammingLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, country, favoriteProgrammingLanguage);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", favoriteProgrammingLanguage='" + favoriteProgrammingLanguage + '\'' +
                '}';
    }
}
