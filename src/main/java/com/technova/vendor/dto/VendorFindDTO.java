package com.technova.vendor.dto;

import com.technova.user.dto.Address;
import com.technova.user.dto.PhoneNumber;

public class VendorFindDTO {

    private String id;

    private String companyName;

    private String companyType;

    private String companyRegistrationNumber;

    private String name;

    private String email;

    private String role;

    private Address address;

    private PhoneNumber phoneNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public VendorFindDTO() {
    }

    public VendorFindDTO(String id, String companyName, String companyType, String companyRegistrationNumber, String name, String email, String role, Address address, PhoneNumber phoneNumber) {
        this.id = id;
        this.companyName = companyName;
        this.companyType = companyType;
        this.companyRegistrationNumber = companyRegistrationNumber;
        this.name = name;
        this.email = email;
        this.role = role;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
