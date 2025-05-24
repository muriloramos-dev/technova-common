package com.technova.user.dto;

public class UserUpdateDTO {

    private String id;

    private String email;

    private String password;

    private PhoneNumber phoneNumber;

    private Address address;

    private UserUpdateDTO() {
    }

    public static UserUpdateDTO withEmail(String id, String email) {
        UserUpdateDTO dto = new UserUpdateDTO();
        dto.email = email;
        dto.id = id;
        return dto;
    }

    public static UserUpdateDTO withPassword(String id, String password) {
        UserUpdateDTO dto = new UserUpdateDTO();
        dto.password = password;
        dto.id = id;
        return dto;
    }

    public static UserUpdateDTO withPhoneNumber(String id, PhoneNumber phoneNumber) {
        UserUpdateDTO dto = new UserUpdateDTO();
        dto.phoneNumber = phoneNumber;
        dto.id = id;
        return dto;
    }

    public static UserUpdateDTO withAddress(String id, Address address) {
        UserUpdateDTO dto = new UserUpdateDTO();
        dto.address = address;
        dto.id = id;
        return dto;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
