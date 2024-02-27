package com.ooatech.userservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
public class ChatMessage extends BaseModel{
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(columnDefinition = "user_id", nullable = false)
    private UserProfile user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(columnDefinition = "chat_id", nullable = false)
    private Chat chat;

    @Column(nullable = false)
    private String message;
}
