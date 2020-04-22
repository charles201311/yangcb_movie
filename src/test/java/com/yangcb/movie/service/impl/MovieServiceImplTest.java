package com.yangcb.movie.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.yangcb.movie.domain.Movie;
import com.yangcb.movie.service.MovieService;
import com.yangcb.movie.vo.MovieVO;
/**
 * 
 * @ClassName: MovieServiceImplTest 
 * @Description:  单元测试
 * @author: charles
 * @date: 2020年4月18日 上午11:49:07
 */
//启动spring和junit实例
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")//spring的配置文件
public class MovieServiceImplTest {
	@Resource
	private MovieService movieService;

	@Test
	public void testSelects() {
		PageInfo<Movie> info = movieService.selects(new MovieVO(), 1, 10);
		System.out.println(info);
	}

}
