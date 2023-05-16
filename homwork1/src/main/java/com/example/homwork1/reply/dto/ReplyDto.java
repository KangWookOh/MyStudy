package com.example.homwork1.reply.dto;

import com.example.homwork1.board.entity.Board;
import com.example.homwork1.member.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
public class ReplyDto {

    private String comment;

    private LocalDateTime createTime;
    private Member member;
    private Board board;

    @Builder
    public ReplyDto(String comment, LocalDateTime createTime, Member member, Board board) {
        this.comment = comment;
        this.createTime = createTime;
        this.member = member;
        this.board = board;
    }
}
