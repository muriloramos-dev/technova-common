package com.technova.dto.user;

import java.util.Map;
import java.util.Objects;

public class UserLoginResponse {
    private boolean success;
    private String email;
    private String password;
    private String role;

    public UserLoginResponse() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public UserLoginResponse(boolean success, String email, String password, String role) {
        this.success = success;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
