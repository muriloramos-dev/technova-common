package com.technova.dto.user;

public class UserResponseDTO {
    private Object id;
    private String email;
    private String password;
    private String role;
    private Address address;
    private PhoneNumber phoneNumber;


    public UserResponseDTO() {
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
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

    public UserResponseDTO(Object id, String email, String password, String role, Address address, PhoneNumber phoneNumber) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
