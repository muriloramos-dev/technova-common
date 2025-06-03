package com.technova.vendor.dto;

import com.technova.user.dto.Address;
import com.technova.user.dto.PhoneNumber;

public class VendorUpdateDTO {
    private String id;

    private String companyName;

    private String email;

    private String password;

    private String companyType;

    private String companyRegistrationNumber;

    private PhoneNumber phoneNumber;

    private Address address;

    public static VendorUpdateDTO withEmail(String id, String email) {
        VendorUpdateDTO dto = new VendorUpdateDTO();
        dto.email = email;
        dto.id = id;
        return dto;
    }

    public static VendorUpdateDTO withPassword(String id, String password) {
        VendorUpdateDTO dto = new VendorUpdateDTO();
        dto.password = password;
        dto.id = id;
        return dto;
    }

    public static VendorUpdateDTO withPhoneNumber(String id, PhoneNumber phoneNumber) {
        VendorUpdateDTO dto = new VendorUpdateDTO();
        dto.phoneNumber = phoneNumber;
        dto.id = id;
        return dto;
    }

    public static VendorUpdateDTO withAddress(String id, Address address) {
        VendorUpdateDTO dto = new VendorUpdateDTO();
        dto.address = address;
        dto.id = id;
        return dto;
    }

    public static VendorUpdateDTO withCompanyName(String id, String companyName) {
        VendorUpdateDTO dto = new VendorUpdateDTO();
        dto.companyName = companyName;
        dto.id = id;
        return dto;
    }

    public static VendorUpdateDTO withCompanyType(String id, String companyType) {
        VendorUpdateDTO dto = new VendorUpdateDTO();
        dto.companyType = companyType;
        dto.id = id;
        return dto;
    }

    public static VendorUpdateDTO withCompanyRegistrationNumber(String id, String companyRegistrationNumber) {
        VendorUpdateDTO dto = new VendorUpdateDTO();
        dto.companyRegistrationNumber = companyRegistrationNumber;
        dto.id = id;
        return dto;
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

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public VendorUpdateDTO() {
    }

    public VendorUpdateDTO(String id, String companyName, String email, String password, String companyType, String companyRegistrationNumber, PhoneNumber phoneNumber, Address address) {
        this.id = id;
        this.companyName = companyName;
        this.email = email;
        this.password = password;
        this.companyType = companyType;
        this.companyRegistrationNumber = companyRegistrationNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
