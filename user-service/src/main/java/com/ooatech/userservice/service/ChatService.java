package com.ooatech.userservice.service;

import com.ooatech.userservice.dto.ChatDTO;
import com.ooatech.userservice.dto.UserProfileDTO;

import java.util.Set;

public interface ChatService {
    public boolean createChat(ChatDTO dto);

    public boolean updateChatTopic(String chatId, String newTopic);

    public ChatDTO getChat(String chatId);

    public boolean addUsersToChat(String chatId, Set<UserProfileDTO> users);

    public boolean addUsersToChatAdmins(String chatId, Set<UserProfileDTO> users);

    public boolean removeUsersFromChat(String chatId, Set<UserProfileDTO> users);

    public boolean removeUsersFromChatAdmins(String chatId, Set<UserProfileDTO> users);

    public boolean deleteChat(ChatDTO dto);
}
