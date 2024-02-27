package com.ooatech.userservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.EqualsAndHashCode;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@EqualsAndHashCode(callSuper = true)
public class UserProfile extends BaseModel {
    @Column
    private String email;

    @Column
    private String phoneNumber;

    @ManyToMany(mappedBy = "chatMembers")
    private List<Chat> chats;

    @ManyToMany(mappedBy = "chatAdmins")
    private Set<Chat> adminChats;

}
