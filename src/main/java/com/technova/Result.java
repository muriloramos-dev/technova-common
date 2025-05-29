package com.technova;

import com.technova.exceptions.BaseException;

public class Result<T> {
    private T data;
    private BaseException error;
    private boolean hasError;

    public static <T> Result<T> success(T data) {
        Result<T> r = new Result<>();
        r.data = data;
        return r;
    }

    public static <T> Result<T> error(BaseException e) {
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

    public BaseException getError() {
        return error;
    }

    public void setError(BaseException error) {
        this.error = error;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }
}
