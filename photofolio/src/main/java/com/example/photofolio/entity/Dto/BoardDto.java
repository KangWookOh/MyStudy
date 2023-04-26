package com.example.photofolio.entity.Dto;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Setter
@NoArgsConstructor
public class BoardDto {

    private String b_Title;

    private String b_Contents;

    private String b_Writer;
    @CreationTimestamp
    private LocalDateTime b_CreateTime;
    @UpdateTimestamp
    private LocalDateTime b_UpdateTime;

    @Builder

    public BoardDto(String b_title, String b_contents, String b_writer, LocalDateTime b_createtime, LocalDateTime b_updatetime)
    {
        this.b_Title = b_title;
        this.b_Contents =b_contents;
        this.b_Writer =b_writer;
        this.b_CreateTime =b_createtime;
        this.b_UpdateTime =b_createtime;
    }

}
