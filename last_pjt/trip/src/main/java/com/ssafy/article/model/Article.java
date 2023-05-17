package com.ssafy.article.model;

public class Article {

	private int articleNo;
	private String title;
	private String id;
	private String content;
	private String regTime;
	
	public Article() {
		super();
	}
	public Article(int articleNo, String title, String id, String content, String regTime) {
		super();
		this.articleNo = articleNo;
		this.title = title;
		this.id = id;
		this.content = content;
		this.regTime = regTime;
	}
	public Article( String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	public Article( String title, String id, String content) {
		super();
		this.title = title;
		this.id = id;
		this.content = content;
	}
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	@Override
	public String toString() {
		return "Article [articleNo=" + articleNo + ", title=" + title + ", id=" + id + ", content=" + content
				+ ", regTime=" + regTime + "]";
	}
	

}
