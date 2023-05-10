package com.Contoller;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.ArticleDaoImp;
import com.dao.sqlDaoSupprot;
import com.dto.ArticleDto;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

@Controller
public class boardContoller {
	
	public static SqlMapClient sqlMapper;
	static String path = "/ibatis/SqlMapConfig.xml";
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader(path);
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	//======== Read =========
	
	@RequestMapping(value="/boardRead", method=RequestMethod.GET)
	public String test(Model model) throws SQLException {
		
		List boardReadAll = sqlMapper.queryForList("boardSelect");
		System.out.println(boardReadAll);
		model.addAttribute("boardAll",boardReadAll);
		return "board/boardView";
	}
}
