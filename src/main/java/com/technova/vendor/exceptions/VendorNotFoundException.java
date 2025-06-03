package com.technova.vendor.exceptions;

import com.technova.exceptions.BaseException;

public class VendorNotFoundException extends BaseException {
    public VendorNotFoundException(String message) {
        super(message);
    }
    public VendorNotFoundException() {}
}
