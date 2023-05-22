package com.ssafy.article.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.article.model.Article;

@Mapper
public interface ArticleMapper {
	
//	------------------- 게시판 --------------------
	List<Article> getBoardList() throws Exception;
	Article getBoard(int articleNo) throws Exception;
	int putBoard(Article article) throws Exception;
	int delBoard(int articleNo) throws Exception;
	int postBoard(Article article) throws Exception;
	int fileRegisterBoard(Article article) throws Exception;
	
//	------------------- 핫플레이스 --------------------
	List<Article> getHotplaceList() throws Exception;
	Article getHotplace(int articleNo) throws Exception;
	int putHotplace(Article article) throws Exception;
	int delHotplace(int articleNo) throws Exception;
	int postHotplace(Article article) throws Exception;
	int fileRegisterHotplace(Article article) throws Exception;

//	------------------- 게시판 --------------------
	List<Article> getBulletinList() throws Exception;
	Article getBulletin(int articleNo) throws Exception;
	int putBulletin(Article article) throws Exception;
	int delBulletin(int articleNo) throws Exception;
	int postBulletin(Article article) throws Exception;
}
