package com.trl.user;

import com.trl.validation.CourseCode;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.*;

/**
 * This class is designed to represent DTO object of user.
 *
 * @author Tsyupryk Roman
 */
public class UserDTO {

    private UUID id;

    @NotEmpty(message = "First name must not be null nor empty.")
    @Size(min = 2, message = "First name should have at least 2 characters.")
    private String firstName;

    @NotEmpty(message = "Last name must not be null nor empty.")
    @Size(min = 2, message = "Last name should have at least 2 characters.")
    private String lastName;

    @NotEmpty(message = "User name must not be null nor empty.")
    @Size(min = 2, message = "User name should have at least 2 characters.")
    private String userName;

    @Email(regexp = "^(.+)@(.+)$", message = "Email should by valid.")
    @NotEmpty(message = "Email must not be null nor empty.")
    private String email;

    @NotEmpty(message = "Password must not be null nor empty.")
    @Size(min = 6, message = "Password should have at least 6 characters.")
    private String password;

    private List<BankDataDTO> bankData;
    private List<AddressDTO> address;

//    @NotEmpty(message = "Birthday must not be null nor empty.")
    @Past(message = "Birthday must be in the past.")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate birthday;

    @Min(value = 0, message = "Must be greater that or equal to zero.")
    @Max(value = 10, message = "Must be less that or equal to 10.")
    private int freePasses;

    @CourseCode
    private String courseCode;

    public UserDTO() {
        this.id = UUID.randomUUID();
        this.freePasses = 0;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<BankDataDTO> getBankData() {
        return bankData;
    }

    public void setBankData(List<BankDataDTO> bankData) {
        this.bankData = bankData;
    }

    public List<AddressDTO> getAddress() {
        return address;
    }

    public void setAddress(List<AddressDTO> address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return freePasses == userDTO.freePasses &&
                Objects.equals(id, userDTO.id) &&
                Objects.equals(firstName, userDTO.firstName) &&
                Objects.equals(lastName, userDTO.lastName) &&
                Objects.equals(userName, userDTO.userName) &&
                Objects.equals(email, userDTO.email) &&
                Objects.equals(password, userDTO.password) &&
                Objects.equals(bankData, userDTO.bankData) &&
                Objects.equals(address, userDTO.address) &&
                Objects.equals(birthday, userDTO.birthday) &&
                Objects.equals(courseCode, userDTO.courseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, userName, email, password, bankData, address, birthday, freePasses, courseCode);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bankData=" + bankData +
                ", address=" + address +
                ", birthday=" + birthday +
                ", freePasses=" + freePasses +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}
