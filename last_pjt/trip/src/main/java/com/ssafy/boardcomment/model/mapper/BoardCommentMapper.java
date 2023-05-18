package com.ssafy.boardcomment.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.boardcomment.model.BoardComment;

@Mapper
public interface BoardCommentMapper {
	List<BoardComment> getCommentList(String articleNo);
	int postComment(BoardComment boardComment);
	int putComment(BoardComment boardComment);
	int delComment(String commentNo);
}
