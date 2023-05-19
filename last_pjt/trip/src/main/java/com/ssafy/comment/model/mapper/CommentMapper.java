package com.ssafy.comment.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.comment.model.Comment;

@Mapper
public interface CommentMapper {
	List<Comment> getCommentList(String articleNo);
	int postComment(Comment boardComment);
	int putComment(Comment boardComment);
	int delComment(String commentNo);
	

	List<Comment> getCommentListHot(String articleNo);
	int postCommentHot(Comment hotplaceComment);
	int putCommentHot(Comment hotplaceComment);
	int delCommentHot(String commentNo);
}
