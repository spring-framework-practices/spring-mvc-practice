package com.trl.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.*;
import java.util.Objects;
import java.util.UUID;

/**
 * This class is designed to represent DTO object of address of user.
 *
 * @author Tsyupryk Roman
 */
public class AddressDTO {

    private UUID id;

    @NotEmpty(message = "Country must not be null nor empty.")
    @Size(min = 1, message = "Country name should have at least 1 characters.")
    private String country;

    @NotEmpty(message = "City must not be null nor empty.")
    @Size(min = 1, message = "City name should have at least 1 characters.")
    private String city;

    @NotEmpty(message = "Street must not be null nor empty.")
    @Size(min = 1, message = "Street name should have at least 1 characters.")
    private String street;

    @NotEmpty(message = "House number must not be null nor empty.")
    @Size(min = 1, message = "House Number should have at least 1 characters.")
    private String houseNumber;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Postcode should have only 5 chars or digits.")
    @NotEmpty(message = "Postcode must not be null nor empty.")
    private String postcode;

    @JsonIgnore
    private UserDTO user;

    public AddressDTO() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDTO that = (AddressDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(country, that.country) &&
                Objects.equals(city, that.city) &&
                Objects.equals(street, that.street) &&
                Objects.equals(houseNumber, that.houseNumber) &&
                Objects.equals(postcode, that.postcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, city, street, houseNumber, postcode);
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", postcode=" + postcode +
                '}';
    }
}
