package com.technova.vendor.exceptions;

import com.technova.exceptions.BaseException;

public class VendorAlreadyExistsException extends BaseException {
    public VendorAlreadyExistsException(String message) {
        super(message);
    }
    public VendorAlreadyExistsException() {}
}
