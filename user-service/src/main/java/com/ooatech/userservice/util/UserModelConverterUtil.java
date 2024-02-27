package com.ooatech.userservice.util;

import com.ooatech.userservice.dto.UserProfileDTO;
import com.ooatech.userservice.model.UserProfile;

public interface UserModelConverterUtil {
    static UserProfileDTO convertUserToDTO(UserProfile userProfile) {
        var dto = new UserProfileDTO();
        dto.setId(userProfile.getId());
        // TODO: Complete Implementation (Can use mapper utility class)
        return dto;
    }
}
