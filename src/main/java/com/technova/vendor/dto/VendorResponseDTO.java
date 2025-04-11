package com.technova.vendor.dto;

import com.technova.user.dto.Address;
import com.technova.user.dto.PhoneNumber;

public class VendorResponseDTO {
    private String id;
    private String companyName;
    private String email;
    private String password;
    private String role;
    private Address address;
    private PhoneNumber phoneNumber;


    public VendorResponseDTO() {
    }

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

    public VendorResponseDTO(String id, String companyName, String email, String password, String role, Address address, PhoneNumber phoneNumber) {
        this.id = id;
        this.companyName = companyName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
