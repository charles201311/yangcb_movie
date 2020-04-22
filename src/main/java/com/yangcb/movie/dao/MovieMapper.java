package com.yangcb.movie.dao;

import java.util.List;

import com.yangcb.movie.domain.Movie;
import com.yangcb.movie.vo.MovieVO;

public interface MovieMapper {

	
	//查询
	List <Movie> selects(MovieVO movieVO);
	//批量删除
	int deleteBatch(Integer[] ids);
	
}
