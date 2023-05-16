package com.ssafy.article.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.article.model.Article;
import com.ssafy.article.model.mapper.ArticleMapper;

@Service
public class ArticleServiceImpl implements ArticleService {
	private ArticleMapper articleMapper;

//
	public ArticleServiceImpl(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	@Override
	public List<Article> getBoardList() throws Exception {
		return articleMapper.getBoardList();
	}

	@Override
	public Article getBoard(int articleNo) throws Exception {
		// TODO Auto-generated method stub
		return articleMapper.getBoard(articleNo);
	}

	@Override
	public int putBoard(Article article) throws Exception {
		// TODO Auto-generated method stub
		return articleMapper.putBoard(article);
	}

	@Override
	public int delBoard(int articleNo) throws Exception {
		// TODO Auto-generated method stub
		return articleMapper.delBoard(articleNo);
	}

	@Override
	public int postBoard(Article article) throws Exception {
		// TODO Auto-generated method stub
		return articleMapper.postBoard(article);
	}

	@Override
	public List<Article> getHotplaceList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article getHotplace(int articleNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int putHotplace(Article article) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delHotplace(int articleNo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int postHotplace(Article article) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Article> getBulletinList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article getBulletin(int articleNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int putBulletin(Article article) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delBulletin(int articleNo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int postBulletin(Article article) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}