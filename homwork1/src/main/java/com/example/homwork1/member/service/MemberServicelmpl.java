package com.example.homwork1.member.service;

import com.example.homwork1.member.dto.MemberDto;
import com.example.homwork1.member.entity.Member;
import com.example.homwork1.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServicelmpl implements MemberService{

    private MemberRepository memberRepository;
    @Override
    public Long signUp(MemberDto memberDto) {
        Long id = memberRepository.save(
                Member.builder()
                .m_Id(memberDto.getM_Id())
                .m_Pw(memberDto.getM_Pw())
                .build())
                .getId();
        return id;
    }

    @Override
    public String login(String m_Id, String m_Pw) {
        return null;
    }
}
