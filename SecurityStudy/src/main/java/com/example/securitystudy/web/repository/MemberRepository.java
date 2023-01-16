package com.example.securitystudy.web.repository;

import com.example.securitystudy.web.entity.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
