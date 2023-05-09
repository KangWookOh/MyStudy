package com.example.photofolio.service;

import com.example.photofolio.entity.Account;
import com.example.photofolio.entity.Dto.AccountDto;
import com.example.photofolio.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account signUp(AccountDto accountDto)
    {
        Account account = Account.builder()
                .ac_id(accountDto.getAc_Id())
                .ac_pw(accountDto.getAc_Pw())
                .ac_name(accountDto.getAc_Name())
                .ac_birth(accountDto.getAc_Birth())
                .ac_phone(accountDto.getAc_Birth())
                .build();
        return accountRepository.save(account);
    }
    public Account Login(AccountDto accountDto)
    {
        Account account =accountRepository.findById(accountDto.getAc_Id()).orElseThrow(
                ()->new IllegalArgumentException(" 사용자를 찾을 수 없습니다")
        );
        return account;
    }


}
