package com.example.homwork1.member.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberDto {

    private String m_Id;

    private String m_Pw;

    @Builder
    public MemberDto(String m_Id, String m_Pw) {
        this.m_Id = m_Id;
        this.m_Pw = m_Pw;
    }
}
