package com.example.homwork1.reply.service;

import com.example.homwork1.reply.dto.ReplyDto;

public interface ReplyService {
    public Long CreateReply(ReplyDto replyDto, Long userId, Long boardId);
    public void DeleteReply(Long id);


}
