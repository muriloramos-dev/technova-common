package com.technova.vendor.exceptions;

import com.technova.exceptions.BaseException;

public class VendorAddressAlreadyRegisteredException extends BaseException {
    public VendorAddressAlreadyRegisteredException(String message) {
        super(message);
    }
    public VendorAddressAlreadyRegisteredException(){}
}
