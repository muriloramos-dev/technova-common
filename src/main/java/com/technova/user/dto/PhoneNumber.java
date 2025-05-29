package com.technova.user.dto;

import jakarta.persistence.Embeddable;

@Embeddable
public class PhoneNumber {
    private String countryCode;

    private String stateCode;

    private String phoneNumber;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.phoneNumber = number;
    }

    public PhoneNumber(String countryCode, String stateCode, String number) {
        this.countryCode = countryCode;
        this.stateCode = stateCode;
        this.phoneNumber = number;
    }

    public PhoneNumber(String number) {
        if (number != null && number.contains("-")) {
            String[] parts = number.split("-");
            this.countryCode = parts.length > 0 ? parts[0] : null;
            this.stateCode = parts.length > 1 ? parts[1] : null;
            this.phoneNumber = parts.length > 2 ? parts[2] : null;
        } else {
            this.phoneNumber = number;
        }
    }

    public PhoneNumber() {
    }
}