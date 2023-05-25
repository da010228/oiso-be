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
	public boolean checkBoard(String id, int articleNo) throws Exception {
		int check = likeCountMapper.checkIfLikedBoard(id, articleNo);
		System.out.println("서비스 좋아요 체크" + check);
		if(check == 1) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public boolean likeBoard(String id, int articleNo) throws Exception {
		// 이미 좋아요한 게시물인지 확인하는 로직 구현
		boolean alreadyLiked;
		if(likeCountMapper.checkIfLikedBoard(id, articleNo) == 1) {
			alreadyLiked = true;
		}else {
			alreadyLiked = false;
		}
		System.out.println("aleadyLiked : " + alreadyLiked);
		if (alreadyLiked) {
			// 좋아요 취소 처리 로직 구현
			likeCountMapper.removeLikeBoard(id, articleNo);
			return false;
		} else {
			// 좋아요 추가 처리 로직 구현
			likeCountMapper.addLikeBoard(id, articleNo);
			return true;
		}

	}
	
	
	@Override
	public boolean checkHotplace(String id, int articleNo) throws Exception {
		int check = likeCountMapper.checkIfLikedHotplace(id, articleNo);
		System.out.println("서비스 좋아요 체크" + check);
		if(check == 1) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public boolean likeHotplace(String id, int articleNo) throws Exception {
		// 이미 좋아요한 게시물인지 확인하는 로직 구현
		boolean alreadyLiked;
		if(likeCountMapper.checkIfLikedHotplace(id, articleNo) == 1) {
			alreadyLiked = true;
		}else {
			alreadyLiked = false;
		}
		System.out.println("aleadyLiked : " + alreadyLiked);
		if (alreadyLiked) {
			// 좋아요 취소 처리 로직 구현
			likeCountMapper.removeLikeHotplace(id, articleNo);
			return false;
		} else {
			// 좋아요 추가 처리 로직 구현
			likeCountMapper.addLikeHotplace(id, articleNo);
			return true;
		}

	}
	
	@Override
	public boolean checkBulletin(String id, int articleNo) throws Exception {
		int check = likeCountMapper.checkIfLikedBulletin(id, articleNo);
		System.out.println("서비스 좋아요 체크" + check);
		if(check == 1) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public boolean likeBulletin(String id, int articleNo) throws Exception {
		// 이미 좋아요한 게시물인지 확인하는 로직 구현
		boolean alreadyLiked;
		if(likeCountMapper.checkIfLikedBulletin(id, articleNo) == 1) {
			alreadyLiked = true;
		}else {
			alreadyLiked = false;
		}
		System.out.println("aleadyLiked : " + alreadyLiked);
		if (alreadyLiked) {
			// 좋아요 취소 처리 로직 구현
			likeCountMapper.removeLikeBulletin(id, articleNo);
			return false;
		} else {
			// 좋아요 추가 처리 로직 구현
			likeCountMapper.addLikeBulletin(id, articleNo);
			return true;
		}

	}


	

}
