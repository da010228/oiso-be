package com.ssafy.article.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.ssafy.article.model.Article;
import com.ssafy.article.model.FileInfo;
import com.ssafy.article.model.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ServletContext servletContext;

	@Value("${file.imgPath}")
	private String uploadImgPath;

	private ArticleService service;

	public ArticleController(ArticleService service) {
		super();
		this.service = service;
	}

	@GetMapping("/board")
	public List<Article> getBoardList() throws Exception {
		List<Article> list = service.getBoardList();
		return list;
	}

//	@GetMapping("/board/imgs")
//	public List<Article> fileInfoList() throws Exception {
//		List<Article> list = service.fileInfoList();
//		return list;
//	}

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
		System.out.println(article);
		return service.postBoard(article);
	}

	@GetMapping("/hotplace")
	public List<Article> getHotplaceList() throws Exception {
		List<Article> list = service.getBoardList();
		return list;
	}

	@GetMapping("/hotplace/{articleNo}")
	public Article getHotplace(@PathVariable int articleNo) throws Exception {
		Article board = service.getBoard(articleNo);
		return board;
	}

	@PutMapping("/hotplace/{articleNo}")
	int putHotplace(@RequestBody Article article) throws Exception {
		System.out.println(article);
		int cnt = service.putBoard(article);
		return cnt;
	}

	@DeleteMapping("/hotplace/{articleNo}")
	int delHotplace(@PathVariable int articleNo) throws Exception {
		int cnt = service.delBoard(articleNo);
		return cnt;
	}

//	@PostMapping("/hotplace/new")
//	int postHotplace(@RequestBody Article article) throws Exception {
//		int cnt = service.postBoard(article);
//		return cnt;
//	}

}
