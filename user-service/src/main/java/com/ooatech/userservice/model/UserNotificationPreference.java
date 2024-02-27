package com.ooatech.userservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
public class UserNotificationPreference extends BaseModel{
    @Column
    private boolean enableEmailNotifications;
    @Column
    private boolean enablePushNotifications;
    @Column
    private boolean enableSMSNotifications;
}
