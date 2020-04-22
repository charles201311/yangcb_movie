package com.yangcb.movie.service;

import com.github.pagehelper.PageInfo;
import com.yangcb.movie.domain.Movie;
import com.yangcb.movie.vo.MovieVO;
/**
 * 
 * @ClassName: MovieService 
 * @Description: 
 * * @author: charles
 * @date: 2020年4月18日 上午11:42:50
 */
public interface MovieService {
	
	//批量删除
		int deleteBatch(Integer[] ids);

	/**
	 * 
	 * @Title: selects 
	 * @Description: 电影的模糊查询
	 * @param movieVO  查询条件
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: PageInfo<Movie>
	 */
	PageInfo<Movie>  selects(MovieVO movieVO,Integer pageNum,Integer pageSize);
}
