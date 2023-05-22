package com.ssafy.article.model.service;

import java.util.List;

import com.ssafy.article.model.Article;

public interface ArticleService {
	
//	-------------------- 게시판 ------------------------
	List<Article> getBoardList() throws Exception;
	
	Article getBoard(int articleNo) throws Exception;

	int putBoard(Article article) throws Exception;

	int delBoard(int articleNo) throws Exception;

	int postBoard(Article article) throws Exception;
	
//	-------------------- 핫플레이스 ------------------------

	List<Article> getHotplaceList() throws Exception;

	Article getHotplace(int articleNo) throws Exception;

	int putHotplace(Article article) throws Exception;

	int delHotplace(int articleNo) throws Exception;

	int postHotplace(Article article) throws Exception;


}