package com.ssafy.article.model.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ssafy.article.model.Article;

public interface ArticleService {
	List<Article> getBoardList() throws Exception;
	
//	List<Article> fileInfoList() throws Exception;

	Article getBoard(int articleNo) throws Exception;

	int putBoard(Article article) throws Exception;

	int delBoard(int articleNo) throws Exception;

	int postBoard(Article article) throws Exception;

	List<Article> getHotplaceList() throws Exception;

	Article getHotplace(int articleNo) throws Exception;

	int putHotplace(Article article) throws Exception;

	int delHotplace(int articleNo) throws Exception;

	int postHotplace(Article article) throws Exception;

	List<Article> getBulletinList() throws Exception;

	Article getBulletin(int articleNo) throws Exception;

	int putBulletin(Article article) throws Exception;

	int delBulletin(int articleNo) throws Exception;

	int postBulletin(Article article) throws Exception;

}