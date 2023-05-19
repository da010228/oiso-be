package com.ssafy.comment.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.comment.model.Comment;
import com.ssafy.comment.model.mapper.CommentMapper;

@Service
public class CommentServiceImpl implements CommentService {

	private CommentMapper commentMapper;

	public CommentServiceImpl(CommentMapper commentMapper) {
		this.commentMapper = commentMapper;
	}

	@Override
	public List<Comment> getCommentList(String articleNo) {
		return commentMapper.getCommentList(articleNo);
	}

	@Override
	public int postComment(Comment boardComment) {
		return commentMapper.postComment(boardComment);
	}

	@Override
	public int putComment(Comment boardComment) {
		return commentMapper.putComment(boardComment);
	}

	@Override
	public int delComment(String commentNo) {
		return commentMapper.delComment(commentNo);
	}

	@Override
	public List<Comment> getCommentListHot(String articleNo) {
		System.out.println(articleNo);
		return commentMapper.getCommentListHot(articleNo);
	}

	@Override
	public int postCommentHot(Comment hotplaceComment) {
		return commentMapper.postCommentHot(hotplaceComment);
	}

	@Override
	public int putCommentHot(Comment hotplaceComment) {
		return commentMapper.putCommentHot(hotplaceComment);
	}

	@Override
	public int delCommentHot(String commentNo) {
		return commentMapper.delCommentHot(commentNo);
	}
}
