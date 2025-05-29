package com.technova.exceptions;


import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.CLASS,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@class"
)
public class BaseException extends RuntimeException {
  public BaseException(String message) {
    super(message);
  }

    public BaseException() {}
}