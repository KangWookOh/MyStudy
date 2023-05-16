package com.example.homwork1.board.entity;

import com.example.homwork1.member.entity.Member;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String writer;

    @CreationTimestamp
    private LocalDateTime createTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @Builder
    public Board(String title, String content, String writer, LocalDateTime createTime, LocalDateTime updateTime, Member member) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.member = member;
    }
}
