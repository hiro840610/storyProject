package com.news.model.dao;

import java.util.List;

import com.news.model.vo.NewsVO;

public interface NewsDAO {

	public int insert(NewsVO newsVO);
	public void update(NewsVO newsVO);
	public void delete(NewsVO newsVO);
	public NewsVO selectOne(Integer newsID);
	public List<NewsVO> selectAll();
}
