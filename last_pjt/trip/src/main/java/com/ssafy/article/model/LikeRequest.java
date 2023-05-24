package com.ssafy.article.model;

public class LikeRequest {
	private String id;
	private int articleNo;

	public LikeRequest(String id, int articleNo) {
		this.id = id;
		this.articleNo = articleNo;
	}

	public LikeRequest() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}

	@Override
	public String toString() {
		return "LikeRequest [id=" + id + ", articleNo=" + articleNo + "]";
	}

}
