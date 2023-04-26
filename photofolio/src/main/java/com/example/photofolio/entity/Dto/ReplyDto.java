package com.example.photofolio.entity.Dto;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Setter
@NoArgsConstructor
public class ReplyDto {

    private String r_Contents;

    private String r_Writer;


    @CreationTimestamp
    private LocalDateTime r_CreateTime;

    @UpdateTimestamp
    private LocalDateTime r_UpdateTime;

    @Builder
    public ReplyDto(String r_contents,String r_writer, LocalDateTime r_createtime,LocalDateTime r_updatetime)
    {
        this.r_Contents =r_contents;
        this.r_Writer =r_writer;
        this.r_CreateTime =r_createtime;
        this.r_UpdateTime = r_createtime;
    }

}
