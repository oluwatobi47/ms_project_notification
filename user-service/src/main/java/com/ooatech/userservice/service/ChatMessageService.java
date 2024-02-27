package com.ooatech.userservice.service;

import com.ooatech.userservice.dto.ChatDTO;

public interface ChatMessageService {
    void sendMessage(ChatDTO.ChatMessage message);
    void editMessage(String messageId, ChatDTO.ChatMessage message);
    void deleteMessage(String messageId);
}
