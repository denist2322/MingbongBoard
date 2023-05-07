package com.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.sqlDaoSupprot;

@Controller
public class TestController {
	
	@RequestMapping(value="/testView", method=RequestMethod.GET)
	public String test() {
		System.out.println("πŒ∫¿¿Ã ∞‘Ω√∆«");
		return "testView";
	}
	
	@RequestMapping(value="/testDB", method=RequestMethod.GET)
	public String testDB() {
		System.out.println(sqlDaoSupprot.getSqlMapClient());
		return "testView";
	}
	
}
