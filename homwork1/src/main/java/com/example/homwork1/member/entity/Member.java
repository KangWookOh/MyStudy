package com.example.homwork1.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String m_Id;

    private String m_Pw;

    @Builder
    public Member(String m_Id, String m_Pw){
        this.m_Id = m_Id;
        this.m_Pw = m_Pw;
    }
}
