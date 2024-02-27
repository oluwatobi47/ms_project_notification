package com.ooatech.userservice.dto;

import lombok.Data;

@Data
public class UserPreferenceDTO {
    public record NotificationPreference(boolean enableEmailNotifications, boolean enablePushNotifications, boolean enableSMSNotifications){}

    private NotificationPreference notificationPreference;
    private boolean enableNotifications;
}
