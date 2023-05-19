package com.example.homwork1.reply.repository;

import com.example.homwork1.reply.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply,Long> {
    List<Reply> findByBoardId(Long boardId);

}
