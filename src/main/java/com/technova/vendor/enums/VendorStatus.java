package com.technova.vendor.enums;

public enum VendorStatus {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    PENDING("PENDING"),
    SUSPENDED("SUSPENDED");

    private final String status;

    VendorStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
