package com.ssafy.article.model.service;

public interface LikeCountService {

	public boolean checkArticle(String id, int articleNo) throws Exception;

	public boolean likeArticle(String id, int articleNo) throws Exception;

	public boolean checkHotplace(String id, int articleNo) throws Exception;

	public boolean likeHotplace(String id, int articleNo) throws Exception;

	public boolean checkBulletin(String id, int articleNo) throws Exception;

	public boolean likeBulletin(String id, int articleNo) throws Exception;

}
