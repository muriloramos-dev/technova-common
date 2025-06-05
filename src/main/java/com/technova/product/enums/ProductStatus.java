package com.technova.product.enums;

public enum ProductStatus {
    AVAILABLE("Available"),
    UNAVAILABLE("Unavailable"),
    DISCONTINUED("Discontinued");

    private final String status;

    ProductStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
