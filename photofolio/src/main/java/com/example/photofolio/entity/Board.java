package com.example.photofolio.entity;

import com.example.photofolio.entity.enums.Category;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long B_id;

    private String b_Title;

    private String b_Contents;

    private String b_Writer;
    @CreationTimestamp
    private LocalDateTime b_CreateTime;
    @UpdateTimestamp
    private LocalDateTime b_UpdateTime;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Category category;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_Id")
    private Account account;

    @Builder
    public Board(String b_title, String b_contents, String b_writer, LocalDateTime b_createtime, LocalDateTime b_updatetime,Category category)
    {
        this.b_Title = b_title;
        this.b_Contents =b_contents;
        this.b_Writer =b_writer;
        this.b_CreateTime =b_createtime;
        this.b_UpdateTime =b_createtime;
        this.category =category;
    }



}
