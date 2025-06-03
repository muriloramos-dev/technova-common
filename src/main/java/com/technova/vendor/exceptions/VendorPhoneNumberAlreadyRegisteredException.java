package com.technova.vendor.exceptions;

import com.technova.exceptions.BaseException;

public class VendorPhoneNumberAlreadyRegisteredException extends BaseException {
    public VendorPhoneNumberAlreadyRegisteredException(String message) {
        super(message);
    }
    public VendorPhoneNumberAlreadyRegisteredException(){}
}
