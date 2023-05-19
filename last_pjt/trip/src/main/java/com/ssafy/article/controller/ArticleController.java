package com.ssafy.article.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;
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

import com.ssafy.article.model.Article;
import com.ssafy.article.model.FileInfo;
import com.ssafy.article.model.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

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
	int postBoard(@RequestPart(value = "key") Article article,
			@RequestPart(value = "files", required = false) MultipartFile[] files) throws Exception {
		System.out.println("article : " + article + ", files : " + files);
		String realPath = "C:\\SSAFY\\OISO_imgs";
		String today = new SimpleDateFormat("yyMMdd").format(new Date());
		File folder = new File(realPath);
		if (!folder.exists()) {
			folder.mkdirs();
		}
		List<FileInfo> fileInfos = new ArrayList<FileInfo>();
		for (MultipartFile mfile : files) {
			FileInfo fileInfo = new FileInfo();
			String originalFileName = mfile.getOriginalFilename();
			if (!originalFileName.isEmpty()) {
				String saveFileName = UUID.randomUUID().toString()
						+ originalFileName.substring(originalFileName.lastIndexOf('.'));
				fileInfo.setSaveFolder(realPath);
				fileInfo.setOriginFile(originalFileName);
				fileInfo.setSaveFile(saveFileName);
				System.out.println(mfile.getOriginalFilename() + "   " + saveFileName);
				System.out.println(folder.getPath());
				mfile.transferTo(new File(folder,saveFileName));
				System.out.println(Paths.get(saveFileName));

			}
			fileInfos.add(fileInfo);
		}
		article.setFileInfos(fileInfos);
		System.out.println(realPath);
		int cnt = service.postBoard(article);
		return cnt;
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
