package com.ssafy.article.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.article.model.Article;
import com.ssafy.article.model.LikeRequest;
import com.ssafy.article.model.service.ArticleService;
import com.ssafy.article.model.service.LikeCountService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	private ArticleService service;

	public ArticleController(ArticleService service) {
		this.service = service;
	}

	// ------------------- 게시판 -----------------------
	@GetMapping("/board")
	public List<Article> getBoardList() throws Exception {
		List<Article> list = service.getBoardList();
		System.out.println(list);
		return list;
	}

	@GetMapping("/board/{articleNo}")
	public Article getBoard(@PathVariable int articleNo) throws Exception {
		Article board = service.getBoard(articleNo);
		return board;
	}

	@PutMapping("/board/{articleNo}")
	int putBoard(@RequestBody Article article) throws Exception {
		System.out.println(article);
		int cnt = service.putBoard(article);
		return cnt;
	}

	@DeleteMapping("/board/{articleNo}")
	int delBoard(@PathVariable int articleNo) throws Exception {
		int cnt = service.delBoard(articleNo);
		return cnt;
	}

	@PostMapping("/board/new")
	int postBoard(@RequestBody Article article) throws Exception {
		return service.postBoard(article);
	}

	// ------------------- 핫플레이스 -----------------------

	@GetMapping("/hotplace")
	public List<Article> getHotplaceList() throws Exception {
		List<Article> list = service.getHotplaceList();
		return list;
	}

	@GetMapping("/hotplace/{articleNo}")
	public Article getHotplace(@PathVariable int articleNo) throws Exception {
		Article board = service.getHotplace(articleNo);
		return board;
	}

	@PutMapping("/hotplace/{articleNo}")
	int putHotplace(@RequestBody Article article) throws Exception {
		System.out.println(article);
		int cnt = service.putHotplace(article);
		return cnt;
	}

	@DeleteMapping("/hotplace/{articleNo}")
	int delHotplace(@PathVariable int articleNo) throws Exception {
		int cnt = service.delHotplace(articleNo);
		return cnt;
	}

	@PostMapping("/hotplace/new")
	int postHotplace(@RequestBody Article article) throws Exception {
		int cnt = service.postHotplace(article);
		return cnt;
	}

	// ------------------- 공지사항 -----------------------

	@GetMapping("/bulletin")
	public List<Article> getBulletinList() throws Exception {
		List<Article> list = service.getBulletinList();
		System.out.println(list);
		return list;
	}

	@GetMapping("/bulletin/{articleNo}")
	public Article getBulletin(@PathVariable int articleNo) throws Exception {
		Article board = service.getBulletin(articleNo);
		return board;
	}

	@PutMapping("/bulletin/{articleNo}")
	int putBulletin(@RequestBody Article article) throws Exception {
		System.out.println(article);
		int cnt = service.putBulletin(article);
		return cnt;
	}

	@DeleteMapping("/bulletin/{articleNo}")
	int delBulletin(@PathVariable int articleNo) throws Exception {
		int cnt = service.delBulletin(articleNo);
		return cnt;
	}

	@PostMapping("/bulletin/new")
	int postBulletin(@RequestBody Article article) throws Exception {
		int cnt = service.postBulletin(article);
		return cnt;
	}

}
