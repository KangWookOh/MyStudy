package com.example.homwork1.board.service;

import com.example.homwork1.board.dto.BoardDto;
import com.example.homwork1.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardService {
    public Long createBoard(BoardDto boardDto, Long m_Id);

    public Page<Board> readBoard(Pageable pageable);

    public void DeleteBoard(Long boardId);
    public Board updateBoard(Long id , BoardDto boardDto);


    }
