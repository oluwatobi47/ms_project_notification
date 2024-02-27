package com.ooatech.userservice.dto;


import lombok.Data;

import java.util.List;

@Data
public class ChatDTO extends ModelDTO {
    public record ChatMessage(UserProfileDTO user, String message) {}

    private String topic;
    private List<ChatMessage> chatMessages;
}
