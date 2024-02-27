package com.ooatech.userservice.service;

@FunctionalInterface
public interface DTOConverter <T, R> {
    R convertToDTO(T data);
}
