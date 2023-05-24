package com.ssafy.article.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.article.model.LikeRequest;
import com.ssafy.article.model.service.LikeCountService;

@RestController
@RequestMapping("/article")
public class ArticleLikeController {

	private LikeCountService service;

	public ArticleLikeController(LikeCountService service) {
		this.service = service;
	}

	// ------------------- 게시판 좋아요 -----------------------

	@GetMapping("/board/{articleNo}/like/{id}")
	public boolean checkBoard(@PathVariable String id, @PathVariable int articleNo) throws Exception {
		return service.checkBoard(id, articleNo);
	}

	@PostMapping("/board/{articleNo}/like")
	public boolean likeBoard(@PathVariable int articleNo, @RequestBody LikeRequest likeRequest) throws Exception {
		// 좋아요 요청 처리
		boolean success = service.likeBoard(likeRequest.getId(), articleNo);
		if (success) {
			return true;
		} else {
			return false;
		}
	}

	// ------------------- 핫플레이 좋아요 -----------------------

	@GetMapping("/hotplace/{articleNo}/like/{id}")
	public boolean checkHotplace(@PathVariable String id, @PathVariable int articleNo) throws Exception {
		return service.checkHotplace(id, articleNo);
	}

	@PostMapping("/hotplace/{articleNo}/like")
	public boolean likeHotplace(@PathVariable int articleNo, @RequestBody LikeRequest likeRequest) throws Exception {
		// 좋아요 요청 처리
		boolean success = service.likeHotplace(likeRequest.getId(), articleNo);
		if (success) {
			return true;
		} else {
			return false;
		}
	}

	// ------------------- 공지사항 좋아요 -----------------------

	@GetMapping("/bulletin/{articleNo}/like/{id}")
	public boolean checkBulletin(@PathVariable String id, @PathVariable int articleNo) throws Exception {
		return service.checkBulletin(id, articleNo);
	}

	@PostMapping("/bulletin/{articleNo}/like")
	public boolean likeBulletin(@PathVariable int articleNo, @RequestBody LikeRequest likeRequest) throws Exception {
		// 좋아요 요청 처리
		boolean success = service.likeBulletin(likeRequest.getId(), articleNo);
		if (success) {
			return true;
		} else {
			return false;
		}
	}

}
