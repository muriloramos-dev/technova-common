package com.technova.vendor.exceptions;

import com.technova.exceptions.BaseException;

public class VendorCompanyRegistrationNumberAlreadyRegisteredException extends BaseException {
    public VendorCompanyRegistrationNumberAlreadyRegisteredException(String message) {
        super(message);
    }
    public VendorCompanyRegistrationNumberAlreadyRegisteredException(){}
}
