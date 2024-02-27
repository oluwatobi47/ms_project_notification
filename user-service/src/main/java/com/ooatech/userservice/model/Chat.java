package com.ooatech.userservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Set;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
public class Chat extends BaseModel {

    @Column
    private String topic;

    @Column(nullable = false)
    private boolean active = true;

    @ManyToMany
    @JoinTable(name = "chat_member",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<UserProfile> chatMembers;

    @ManyToMany
    @JoinTable(name = "chat_admin",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<UserProfile> chatAdmins;

    @OneToMany(mappedBy = "chat", fetch = FetchType.LAZY)
    private List<ChatMessage> chatMessage;
}
