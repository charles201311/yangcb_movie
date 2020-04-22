package com.yangcb.movie.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.util.MyUtil;

@Controller
public class TabesController {
	
	@RequestMapping("tables")
	public String tables(Model model) {
		
		List<String> list = MyUtil.getTable();//调用工具类
		model.addAttribute("list",list);
		return "tables";
		
	}

}
