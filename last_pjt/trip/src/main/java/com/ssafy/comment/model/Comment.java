package com.ssafy.comment.model;

public class Comment {
	private int commentNo;
	private String id;
	private String comment;
	private String commentTime;
	private int articleNo;
	public Comment() {
		super();
	}
	public Comment(int commentNo, String comment) {
		super();
		this.commentNo = commentNo;
		this.comment = comment;
	}
	public Comment(int commentNo, String id, String comment, String commentTime, int articleNo) {
		super();
		this.commentNo = commentNo;
		this.id = id;
		this.comment = comment;
		this.commentTime = commentTime;
		this.articleNo = articleNo;
	}
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	@Override
	public String toString() {
		return "BoardComment [commentNo=" + commentNo + ", id=" + id + ", comment=" + comment + ", commentTime="
				+ commentTime + ", articleNo=" + articleNo + "]";
	}
}
