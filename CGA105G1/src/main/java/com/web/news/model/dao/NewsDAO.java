package com.web.news.model.dao;


import com.core.model.dao.CoreDAO;
import com.web.news.model.vo.NewsVO;

public interface NewsDAO extends CoreDAO<NewsVO,Integer>{

	public void update(NewsVO newsVO);
	public void delete(Integer id);
}
