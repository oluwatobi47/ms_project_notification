package com.ooatech.userservice.dto;

import lombok.Data;

@Data
public class UserProfileDTO extends ModelDTO {
    public record Address(String streetNo, String city, String Country, String province) {}

    private String email;
    private String phoneNumber;
    private Address address;

}
