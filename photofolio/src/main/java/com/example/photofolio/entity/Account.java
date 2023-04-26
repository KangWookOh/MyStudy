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

    private String ac_Id;

    private String ac_Pw;

    private String ac_Name;

    private String ac_Birth;

    private String ac_Phone;

    @Builder
    public Account(String ac_id, String ac_pw,String ac_name,String ac_birth,String ac_phone)
    {
        this.ac_Id = ac_id;
        this.ac_Pw =ac_pw;
        this.ac_Name = ac_name;
        this.ac_Birth = ac_birth;
        this.ac_Phone =ac_phone;
    }


}
