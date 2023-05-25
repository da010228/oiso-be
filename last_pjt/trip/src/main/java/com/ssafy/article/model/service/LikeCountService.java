package com.ssafy.article.model.service;

public interface LikeCountService {

	public boolean checkBoard(String id, int articleNo) throws Exception;

	public boolean likeBoard(String id, int articleNo) throws Exception;

	public boolean checkHotplace(String id, int articleNo) throws Exception;

	public boolean likeHotplace(String id, int articleNo) throws Exception;

	public boolean checkBulletin(String id, int articleNo) throws Exception;

	public boolean likeBulletin(String id, int articleNo) throws Exception;

}
