package com.example.photofolio.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
public class Reply {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long r_Id;

    private String r_Contents;

    private String r_Writer;


    @CreationTimestamp
    private LocalDateTime r_CreateTime;

    @UpdateTimestamp
    private LocalDateTime r_UpdateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "b_Id")
    private Board board;

    @Builder
    public Reply(String r_contents,String r_writer, LocalDateTime r_createtime,LocalDateTime r_updatetime)
    {
        this.r_Contents =r_contents;
        this.r_Writer =r_writer;
        this.r_CreateTime =r_createtime;
        this.r_UpdateTime = r_createtime;
    }


}
