package com.example.securitystudy.web.entity.member;

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
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String member_id;

    private String member_pw;

    private String member_name;




    @Builder
    public Member(String member_id,String member_pw,String member_name)
    {
        this.member_id =member_id;
        this.member_pw =member_pw;
        this.member_name= member_name;
    }


}
