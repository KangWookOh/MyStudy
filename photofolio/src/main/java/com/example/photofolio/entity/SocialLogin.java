package com.example.photofolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class SocialLogin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Access_Token;
    
}
