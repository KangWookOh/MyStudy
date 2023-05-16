package com.example.homwork1.reply.entity;

import com.example.homwork1.board.entity.Board;
import com.example.homwork1.member.entity.Member;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
public class Reply {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    private LocalDateTime createTime;

    @ManyToOne(fetch = FetchType.LAZY)
    Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    Board board;

    public void updateReply(String comment){
        this.comment =comment;

    }

    @Builder
    public Reply(String comment, LocalDateTime createTime, Member member, Board board) {
        this.comment = comment;
        this.createTime = createTime;
        this.member = member;
        this.board = board;
    }
}
