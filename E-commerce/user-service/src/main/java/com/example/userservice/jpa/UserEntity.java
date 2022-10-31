package com.example.userservice.jpa;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;


@Getter //DB와 연결되는 것인데 불변하지 않다는 것은 말이 안됨, setter 지양
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = false, unique = true)
    private String encryptedPwd;

}
