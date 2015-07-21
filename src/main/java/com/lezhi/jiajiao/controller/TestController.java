package com.lezhi.jiajiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/access/")
public class TestController {
	@RequestMapping(value="test")
	public ModelAndView  test(){
		
		ModelAndView mv =new ModelAndView();
        mv.addObject("spring", "SpringMVC");
        mv.setViewName("index");
        return mv;
        
	}

}
