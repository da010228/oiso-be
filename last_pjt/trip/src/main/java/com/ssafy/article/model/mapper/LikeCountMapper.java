package com.ssafy.article.model.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeCountMapper {
		
	int checkIfLiked(String id, int articleNo) throws Exception;

	void addLike(String id, int articleNo) throws Exception;

	void removeLike(String id, int articleNo) throws Exception;
}
