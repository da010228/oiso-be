package com.ssafy.article.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.article.model.Article;
import com.ssafy.article.model.FileInfo;
import com.ssafy.article.model.mapper.ArticleMapper;

@Service
public class ArticleServiceImpl implements ArticleService {

	private ArticleMapper articleMapper;

	public ArticleServiceImpl(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

//	-------------------- 게시판 ------------------------

	@Override
	public List<Article> getBoardList() throws Exception {
		System.out.println(articleMapper.getBoardList());
		return articleMapper.getBoardList();
	}

	@Override
	public Article getBoard(int articleNo) throws Exception {
		return articleMapper.getBoard(articleNo);
	}

	@Override
	public int putBoard(Article article) throws Exception {
		return articleMapper.putBoard(article);
	}

	@Override
	public int delBoard(int articleNo) throws Exception {
		return articleMapper.delBoard(articleNo);
	}

	@Override
	@Transactional
	public int postBoard(Article article) throws Exception {
		List<FileInfo> file = article.getFileInfos();
		if (file != null && !file.isEmpty()) {
			return articleMapper.postBoard(article) & articleMapper.fileRegisterBoard(article);
		}
		return articleMapper.postBoard(article);
	}

//	-------------------- 핫플레이스 ------------------------

	@Override
	public List<Article> getHotplaceList() throws Exception {
		System.out.println(articleMapper.getBoardList());
		return articleMapper.getBoardList();
	}

	@Override
	public Article getHotplace(int articleNo) throws Exception {
		return articleMapper.getBoard(articleNo);
	}

	@Override
	public int putHotplace(Article article) throws Exception {
		return articleMapper.putBoard(article);
	}

	@Override
	public int delHotplace(int articleNo) throws Exception {
		return articleMapper.delBoard(articleNo);
	}

	@Override
	@Transactional
	public int postHotplace(Article article) throws Exception {
		List<FileInfo> file = article.getFileInfos();
		if (file != null && !file.isEmpty()) {
			return articleMapper.postHotplace(article) & articleMapper.fileRegisterHotplace(article);
		}
		return articleMapper.postBoard(article);
	}

}