package com.technova.user.dto;

public class UserCreateDTO {
    private String name;

    private String email;

    private String cpf;

    private String username;

    private String password;

    private PhoneNumber phoneNumber;

    private Address address;

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

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public UserCreateDTO(String name, String email, String cpf, String username, String password, PhoneNumber phoneNumber, Address address) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public UserCreateDTO() {
    }
}
