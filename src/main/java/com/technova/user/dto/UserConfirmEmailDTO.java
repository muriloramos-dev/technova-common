package com.technova.user.dto;

public class UserConfirmEmailDTO {
    public Boolean approved;

    public String email;

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserConfirmEmailDTO(Boolean approved, String email) {
        this.approved = approved;
        this.email = email;
    }

    public UserConfirmEmailDTO() {
    }
}
