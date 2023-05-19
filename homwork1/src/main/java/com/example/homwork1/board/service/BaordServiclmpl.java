package com.example.homwork1.board.service;

import com.example.homwork1.board.dto.BoardDto;
import com.example.homwork1.board.entity.Board;
import com.example.homwork1.board.repository.BoardRepository;
import com.example.homwork1.member.entity.Member;
import com.example.homwork1.member.repository.MemberRepository;
import com.example.homwork1.reply.entity.Reply;
import com.example.homwork1.reply.repository.ReplyRepository;
import jakarta.persistence.EntityExistsException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class BaordServiclmpl implements BoardService{

    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;

    private final ReplyRepository replyRepository;


    @Override
    public Long createBoard(BoardDto boardDto, Long m_Id) {
        Optional<Member> member =  memberRepository.findById(m_Id);
        if(!member.isPresent()){
            throw new EntityExistsException("User not exist.");
        }
        Board board = Board.builder()
                .title(boardDto.getTitle())
                .content(boardDto.getContent())
                .writer(boardDto.getWriter())
                .createTime(boardDto.getCreateTime())
                .updateTime(boardDto.getUpdateTime())
                .member(member.get())
                .build();

        return boardRepository.save(board).getId();

    }

    @Override
    public Page<Board> readBoard(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1,
                pageable.getPageSize());
        return boardRepository.findAll(pageable);
    }

    @Override
    public void DeleteBoard(Long boardId) {
        Optional<Board> optionalBoard = boardRepository.findById(boardId);
        List<Reply> replyList = replyRepository.findByBoardId(boardId);
        if(optionalBoard.isEmpty()){
            log.error("Board is not exist");
            throw new EntityExistsException("NoBoard");
        }
        for(Reply r : replyList){
            replyRepository.delete(r);
        }
        boardRepository.delete(optionalBoard.get());
    }

    @Override
    public Board updateBoard(Long id, BoardDto boardDto) {
        Board board = boardRepository.findById(id).orElseThrow(()->new NoSuchElementException("fail"));
        board.updateBoard(boardDto.getTitle(),boardDto.getContent(),boardDto.getUpdateTime());
        return boardRepository.save(board);
    }
}
