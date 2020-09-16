package com.trl.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

/**
 * This class is designed to represent DTO object of bank data of user.
 *
 * @author Tsyupryk Roman
 */
public class BankDataDTO {

    private UUID id;

    @NotEmpty(message = "Bank Account Number must not be null nor empty.")
    @Size(min = 24, message = "Bank Account Number should have at least 24 characters.")
    private String bankAccountNumber;

    @Future(message = "Date of expiry must be in the future.")
    @NotEmpty(message = "Date of expiry must not be null nor empty.")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateOfExpiry;

    @NotEmpty(message = "CVI must not be null nor empty.")
    @Size(min = 3, message = "CVI should have at least 3 characters.")
    private Integer cvi;

    @JsonIgnore
    private UserDTO user;

    public BankDataDTO() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public Integer getCvi() {
        return cvi;
    }

    public void setCvi(Integer cvi) {
        this.cvi = cvi;
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
        BankDataDTO that = (BankDataDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(bankAccountNumber, that.bankAccountNumber) &&
                Objects.equals(dateOfExpiry, that.dateOfExpiry) &&
                Objects.equals(cvi, that.cvi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bankAccountNumber, dateOfExpiry, cvi);
    }

    @Override
    public String toString() {
        return "BankDataDTO{" +
                "id=" + id +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", dateOfExpiry=" + dateOfExpiry +
                ", cvi=" + cvi +
                '}';
    }
}
