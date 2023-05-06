package com.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value="/testView", method=RequestMethod.GET)
	public String test() {
		System.out.println("πŒ∫¿¿Ã ∞‘Ω√∆«");
		return "testView";
	}
}
