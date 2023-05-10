package com.dao;

import java.util.List;

import com.dto.ArticleDto;

public interface ArticleDao {
	
	public List<ArticleDto> selectArticle() throws Exception;

}
