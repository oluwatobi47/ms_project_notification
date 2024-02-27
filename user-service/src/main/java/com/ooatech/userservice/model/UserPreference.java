package com.ooatech.userservice.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = true)
public class UserPreference extends BaseModel{

    @Column(nullable = false)
    private boolean enableNotifications = false;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "notification_preference")
    private UserNotificationPreference notificationPreference;
}
