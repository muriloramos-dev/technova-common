package com.technova.vendor.dto;

public class VendorLoginRequest {
    private String email;
    private String password;

    public VendorLoginRequest() {
    }

    public VendorLoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
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
}
