package com.technova.vendor.exceptions;

import com.technova.exceptions.BaseException;

public class VendorPasswordAlreadyRegisteredException extends BaseException {
    public VendorPasswordAlreadyRegisteredException(String message) {
        super(message);
    }
    public VendorPasswordAlreadyRegisteredException(){}
}
