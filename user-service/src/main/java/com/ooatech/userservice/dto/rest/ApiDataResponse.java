package com.ooatech.userservice.dto.rest;

public interface ApiDataResponse<T> {
    T getData();
    boolean isValid();
    String getMessage();

}
