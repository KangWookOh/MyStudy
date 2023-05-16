package com.example.homwork1.board.dto;

import com.example.homwork1.member.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BoardDto {

    private String title;

    private String content;

    private String writer;

    @CreationTimestamp
    private LocalDateTime createTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;

    private Member member;

    @Builder
    public BoardDto(String title, String content, String writer, LocalDateTime createTime, LocalDateTime updateTime, Member member) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.member = member;
    }
}
