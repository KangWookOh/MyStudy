package com.example.homwork1.member.service;

import com.example.homwork1.member.dto.MemberDto;

public interface MemberService {
    public Long signUp(MemberDto memberDto);
    public String login(String m_Id, String m_Pw);



}
