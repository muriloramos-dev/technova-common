package com.technova.dto;

public class Result<T> {
    private T data;
    private RuntimeException error;
    private boolean hasError;

    public static <T> Result<T> success(T data) {
        Result<T> r = new Result<>();
        r.data = data;
        return r;
    }

    public static <T> Result<T> error(RuntimeException e) {
        Result<T> r = new Result<>();
        r.error = e;
        r.hasError = true;
        return r;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public RuntimeException getError() {
        return error;
    }

    public void setError(RuntimeException error) {
        this.error = error;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }
}

