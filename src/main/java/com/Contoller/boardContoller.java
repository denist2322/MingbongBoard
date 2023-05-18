package com.Contoller;

import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
	public String boardRead(Model model) throws SQLException {
		
		List boardReadAll = sqlMapper.queryForList("boardSelectAll");
		System.out.println(boardReadAll);
		model.addAttribute("boardAll",boardReadAll);
		return "board/boardView";
	}
	
	//======== Update =========
	
	@RequestMapping(value="/boardUpdate", method=RequestMethod.GET)
	public String boardUpdate(Model model, int bd_no) throws SQLException {
		
		List boardRead = sqlMapper.queryForList("boardSelect", bd_no);
		System.out.println(boardRead);
		model.addAttribute("boardOne",boardRead);
		return "board/oneBoard";
	}
	
	@RequestMapping(value="/boardUpdate", method=RequestMethod.POST)
	public String boardUpdateSQL(int bd_no, String bd_title, String bd_body) throws SQLException {
		System.out.println(bd_no);
		System.out.println(bd_title);
		System.out.println(bd_body);
		HashMap board = new HashMap();
		board.put("id", bd_no);
		board.put("title", bd_title);
		board.put("body", bd_body);
		sqlMapper.update("boardUpdate",board);
		
		return "redirect:/boardRead";
	}
}
