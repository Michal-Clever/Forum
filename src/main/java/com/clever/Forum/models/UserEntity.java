package com.clever.Forum.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Data
public class UserEntity {

    private int id;
    private String username;
    private String password;

    @Column(name = "email")
    private String email;


}
