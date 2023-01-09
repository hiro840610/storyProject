package com.web.news.model.dao;


import java.util.List;
import org.hibernate.Session;
import com.web.news.model.vo.NewsVO;

public class NewsDAOImpl implements NewsDAO {
	
	@Override
	public void update(NewsVO newsVO) {
		Session session = getSession();
		NewsVO oldNewsVO = session.get(NewsVO.class, newsVO.getId());
		oldNewsVO.setId(newsVO.getId());
		oldNewsVO.setTitle(newsVO.getTitle());
		oldNewsVO.setText(newsVO.getText());
	}
	
	@Override
	public void delete(Integer newsID) {
		Session session = getSession();
		NewsVO newsVO = new NewsVO();
		newsVO.setId(newsID);
		session.remove(newsVO);
	}
		

	@Override
	public List<NewsVO> getAll() {
		Session session = getSession();
		String hql = "FROM ipetdb.news";
		return session.createQuery(hql,NewsVO.class).list();
	}

	@Override
	public NewsVO getById(Integer newsID) {
		Session session = getSession();
		return session.get(NewsVO.class, newsID);
	}

	@Override
	public Integer add(NewsVO newsVO) {
		Session session = getSession();
		session.persist(newsVO);
		return newsVO.getId();

	}

	
}
