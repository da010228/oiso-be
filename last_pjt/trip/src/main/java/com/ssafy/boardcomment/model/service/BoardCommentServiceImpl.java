package com.ssafy.boardcomment.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.boardcomment.model.BoardComment;
import com.ssafy.boardcomment.model.mapper.BoardCommentMapper;

@Service
public class BoardCommentServiceImpl implements BoardCommentService {

	private BoardCommentMapper boardCommentMapper;

	public BoardCommentServiceImpl(BoardCommentMapper boardCommentMapper) {
		this.boardCommentMapper = boardCommentMapper;
	}

	@Override
	public List<BoardComment> getCommentList(String articleNo) {
		return boardCommentMapper.getCommentList(articleNo);
	}

	@Override
	public int postComment(BoardComment boardComment) {
		return boardCommentMapper.postComment(boardComment);
	}

	@Override
	public int putComment(BoardComment boardComment) {
		return boardCommentMapper.putComment(boardComment);
	}

	@Override
	public int delComment(String commentNo) {
		return boardCommentMapper.delComment(commentNo);
	}
}
