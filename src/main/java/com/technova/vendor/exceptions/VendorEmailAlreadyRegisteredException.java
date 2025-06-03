package com.technova.vendor.exceptions;

import com.technova.exceptions.BaseException;

public class VendorEmailAlreadyRegisteredException extends BaseException {
    public VendorEmailAlreadyRegisteredException(String message) {
        super(message);
    }
    public VendorEmailAlreadyRegisteredException(){}
}
