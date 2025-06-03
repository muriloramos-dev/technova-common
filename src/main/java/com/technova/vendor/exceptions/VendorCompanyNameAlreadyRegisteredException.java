package com.technova.vendor.exceptions;

import com.technova.exceptions.BaseException;

public class VendorCompanyNameAlreadyRegisteredException extends BaseException {
    public VendorCompanyNameAlreadyRegisteredException(String message) {
        super(message);
    }
    public VendorCompanyNameAlreadyRegisteredException(){}
}
