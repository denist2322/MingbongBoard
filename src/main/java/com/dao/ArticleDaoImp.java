package com.dao;

import java.util.List;

import com.dto.ArticleDto;

public class ArticleDaoImp extends SqlSupport implements ArticleDao {

	@Override
	public List<ArticleDto> selectArticle() throws Exception {
	
		return (List<ArticleDto>) sqlMapper.queryForObject("boardSelect");
	}

}
