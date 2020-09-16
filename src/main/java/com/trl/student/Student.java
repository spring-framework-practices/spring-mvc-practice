package com.trl.student;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteProgrammingLanguage;
    private String [] favoriteOperatingSystem;

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

    public String[] getFavoriteOperatingSystem() {
        return favoriteOperatingSystem;
    }

    public void setFavoriteOperatingSystem(String[] favoriteOperatingSystem) {
        this.favoriteOperatingSystem = favoriteOperatingSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(country, student.country) &&
                Objects.equals(favoriteProgrammingLanguage, student.favoriteProgrammingLanguage) &&
                Arrays.equals(favoriteOperatingSystem, student.favoriteOperatingSystem);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, country, favoriteProgrammingLanguage);
        result = 31 * result + Arrays.hashCode(favoriteOperatingSystem);
        return result;
    }


}
