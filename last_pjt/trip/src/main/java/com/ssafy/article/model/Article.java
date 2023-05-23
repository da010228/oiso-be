package com.ssafy.article.model;

import java.util.List;

public class Article {

	private int articleNo;
	private String title;
	private String id;
	private String content;
	private String regTime;
	private List<FileInfo> fileInfos;
	private int viewCnt;
	private int likeCnt;

	public Article() {
		super();
	}

	public Article(int articleNo, String title, String id, String content, String regTime, List<FileInfo> fileInfos,
			int viewCnt, int likeCnt) {
		super();
		this.articleNo = articleNo;
		this.title = title;
		this.id = id;
		this.content = content;
		this.regTime = regTime;
		this.fileInfos = fileInfos;
		this.viewCnt = viewCnt;
		this.likeCnt = likeCnt;
	}

	public Article(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public Article(String title, String id, String content, int viewCnt, int likeCnt) {
		super();
		this.title = title;
		this.id = id;
		this.content = content;
		this.viewCnt = viewCnt;
		this.likeCnt = likeCnt;
	}

	public Article(String title, String id, String content, List<FileInfo> fileInfos, int viewCnt, int likeCnt) {
		this.title = title;
		this.id = id;
		this.content = content;
		this.fileInfos = fileInfos;
		this.viewCnt = viewCnt;
		this.likeCnt = likeCnt;
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

	public List<FileInfo> getFileInfos() {
		return fileInfos;
	}

	public void setFileInfos(List<FileInfo> fileInfos) {
		this.fileInfos = fileInfos;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public int getLikeCnt() {
		return likeCnt;
	}

	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}

	@Override
	public String toString() {
		return "Article [articleNo=" + articleNo + ", title=" + title + ", id=" + id + ", content=" + content
				+ ", regTime=" + regTime + ", fileInfos=" + fileInfos + ", viewCnt=" + viewCnt + ", likeCnt=" + likeCnt
				+ "]";
	}

}
