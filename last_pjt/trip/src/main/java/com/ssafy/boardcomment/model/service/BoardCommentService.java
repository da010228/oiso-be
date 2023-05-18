package com.ssafy.boardcomment.model.service;

import java.util.List;

import com.ssafy.boardcomment.model.BoardComment;

public interface BoardCommentService {
	List<BoardComment> getCommentList(String articleNo);
	int postComment(BoardComment boardComment);
	int putComment(BoardComment boardComment);
	int delComment(String commentNo);
}
