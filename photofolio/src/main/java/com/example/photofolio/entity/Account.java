package com.example.photofolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Account_Id;

    private String Account_Pw;

    private String Account_Name;

    private String Account_Birth;

    private String Account_Phone;


    @Builder
    public Account(String account_id, String account_pw,String account_Name,String account_Birth,String account_Phone)
    {
        this.Account_Id = account_id;
        this.Account_Pw =account_pw;
        this.Account_Name =account_Name;
        this.Account_Birth = account_Birth;
        this.Account_Phone =account_Phone;

    }
}
