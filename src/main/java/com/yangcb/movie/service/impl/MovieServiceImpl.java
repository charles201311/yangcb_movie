package com.yangcb.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangcb.movie.dao.MovieMapper;
import com.yangcb.movie.domain.Movie;
import com.yangcb.movie.service.MovieService;
import com.yangcb.movie.vo.MovieVO;

@Service
public class MovieServiceImpl implements MovieService {
	@Resource
	private MovieMapper movieMapper;

	@Override
	public PageInfo<Movie> selects(MovieVO movieVO, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Movie> list = movieMapper.selects(movieVO);
		return new PageInfo<Movie>(list);
	}

	@Override
	public int deleteBatch(Integer[] ids) {
		// TODO Auto-generated method stub
		return movieMapper.deleteBatch(ids);
	}

}
