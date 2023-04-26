package com.example.photofolio.entity.Dto;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class AccountDto {


    private String ac_Id;

    private String ac_Pw;

    private String ac_Name;

    private String ac_Birth;

    private String ac_Phone;

    @Builder
    public AccountDto(String ac_id, String ac_pw,String ac_name,String ac_birth,String ac_phone)
    {
        this.ac_Id = ac_id;
        this.ac_Pw =ac_pw;
        this.ac_Name = ac_name;
        this.ac_Birth = ac_birth;
        this.ac_Phone =ac_phone;
    }

}
