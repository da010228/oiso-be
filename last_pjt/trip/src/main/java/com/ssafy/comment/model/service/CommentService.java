package com.ssafy.comment.model.service;

import java.util.List;

import com.ssafy.comment.model.Comment;

public interface CommentService {
	List<Comment> getCommentList(String articleNo);
	int postComment(Comment boardComment);
	int putComment(Comment boardComment);
	int delComment(String commentNo);

	List<Comment> getCommentListHot(String articleNo);
	int postCommentHot(Comment hotplaceComment);
	int putCommentHot(Comment hotplaceComment);
	int delCommentHot(String commentNo);
}
