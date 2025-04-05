package com.technova.dto.user;

import java.util.Map;
import java.util.Objects;

public class UserLoginResponse {
    private boolean success;
    private Map<String, String> data;

    public UserLoginResponse() {
    }

    public UserLoginResponse(boolean success, Map<String, String> data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
