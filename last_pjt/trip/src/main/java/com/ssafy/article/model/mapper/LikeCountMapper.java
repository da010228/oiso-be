package com.ssafy.article.model.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeCountMapper {
		
	int checkIfLikedBoard(String id, int articleNo) throws Exception;

	void addLikeBoard(String id, int articleNo) throws Exception;

	void removeLikeBoard(String id, int articleNo) throws Exception;
	
	int checkIfLikedHotplace(String id, int articleNo) throws Exception;

	void addLikeHotplace(String id, int articleNo) throws Exception;

	void removeLikeHotplace(String id, int articleNo) throws Exception;
	
	int checkIfLikedBulletin(String id, int articleNo) throws Exception;

	void addLikeBulletin(String id, int articleNo) throws Exception;

	void removeLikeBulletin(String id, int articleNo) throws Exception;
}
