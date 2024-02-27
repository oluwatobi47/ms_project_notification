package com.ooatech.userservice.service;

import com.ooatech.userservice.dto.UserProfileDTO;
import com.ooatech.userservice.model.UserProfile;

public interface UserService {
    public UserProfile createUserAccount(UserProfileDTO dto);
    public UserProfile getUserProfile(String userId);
    public UserProfile updateUserProfile(String userId, UserProfileDTO dto);
    public boolean deleteUserAccount(String userId);

    // TODO: Validate approach here, seems to be subjective in some way, with no true benefit as well
    public  <T, R> R mapToDTO(T data, DTOConverter<T,R> converter);
}
