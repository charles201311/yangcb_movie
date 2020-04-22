package com.yangcb.movie.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.yangcb.movie.domain.Movie;
import com.yangcb.movie.service.MovieService;
import com.yangcb.movie.vo.MovieVO;
// 张三的提交
@Controller
public class MovieController {
	@Resource
	private MovieService movieService;
	
	public void test1() {
		System.out.println("aaaaaa");//1712d改变
	}
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 列表
	 * @param model
	 * @param movieVO
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: String
	 */
	@RequestMapping("selects")
	public String selects(Model model, MovieVO movieVO,@RequestParam(defaultValue = "1" )Integer pageNum,
			@RequestParam(defaultValue = "3" ) Integer pageSize) {
		PageInfo<Movie> info = movieService.selects(movieVO, pageNum, pageSize);
		model.addAttribute("info", info);//封装查询结果
		model.addAttribute("movieVO", movieVO);//封装查询条件
	
		return "movies";
		
	}
	/**
	 * 
	 * @Title: deleteBatch 
	 * @Description: 批量删除
	 * @return
	 * @return: boolean
	 */
	@ResponseBody
	@RequestMapping("deleteBatch")
	public boolean deleteBatch(@RequestParam("ids[]")Integer[] ids) {
		return movieService.deleteBatch(ids)>0;
	}

}
