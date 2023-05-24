package com.ssafy.article.model.service;

import org.springframework.stereotype.Service;

import com.ssafy.article.model.mapper.LikeCountMapper;

@Service
public class LikeCountServiceImpl implements LikeCountService {
	private final LikeCountMapper likeCountMapper;

	public LikeCountServiceImpl(LikeCountMapper likeCountMapper) {
		this.likeCountMapper = likeCountMapper;
	}
	
	@Override
	public boolean checkArticle(String id, int articleNo) throws Exception {
		int check = likeCountMapper.checkIfLiked(id, articleNo);
		System.out.println("서비스 좋아요 체크" + check);
		if(check == 1) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public boolean likeArticle(String id, int articleNo) throws Exception {
		// 이미 좋아요한 게시물인지 확인하는 로직 구현
		boolean alreadyLiked;
		if(likeCountMapper.checkIfLiked(id, articleNo) == 1) {
			alreadyLiked = true;
		}else {
			alreadyLiked = false;
		}
		System.out.println("aleadyLiked : " + alreadyLiked);
		if (alreadyLiked) {
			// 좋아요 취소 처리 로직 구현
			likeCountMapper.removeLike(id, articleNo);
			return false;
		} else {
			// 좋아요 추가 처리 로직 구현
			likeCountMapper.addLike(id, articleNo);
			return true;
		}

	}


	

}
