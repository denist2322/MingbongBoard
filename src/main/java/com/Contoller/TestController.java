package com.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.sqlDaoSupprot;

@Controller
public class TestController {
	
	@RequestMapping(value="/testView", method=RequestMethod.GET)
	public String test(Model model) {
		System.out.println("민봉이 게시판");
		model.addAttribute("dbTest","URL 테스트 결과 정상입니다.");
		return "testView";
	}
	
	@RequestMapping(value="/testDB", method=RequestMethod.GET)
	public String testDB(Model model) {
		model.addAttribute("dbTest",sqlDaoSupprot.getSqlMapClient());
		System.out.println(sqlDaoSupprot.getSqlMapClient());
		return "testView";
	}
	
}
