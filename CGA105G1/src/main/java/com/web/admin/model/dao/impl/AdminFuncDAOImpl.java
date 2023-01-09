package com.web.admin.model.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.web.admin.model.dao.AdminFuncDAO;
import com.web.admin.model.vo.AdminFuncVO;

public class AdminFuncDAOImpl implements AdminFuncDAO {
	
	@Override
	public void update(AdminFuncVO adminFuncVO) {

		Session session = getSession();
		AdminFuncVO oldadminFuncVO = session.get(AdminFuncVO.class, adminFuncVO.getAdminID());
		oldadminFuncVO.setAdminID(adminFuncVO.getAdminID());
		oldadminFuncVO.setAdminName(adminFuncVO.getAdminName());
		}
		
	@Override
	public List<AdminFuncVO> getAll() {
		Session session = getSession();
		String hql = "FROM ipetdb.staff_admin_per_func";
		return session.createQuery(hql,AdminFuncVO.class).list();
	}

	@Override
	public AdminFuncVO getById(Integer adminID) {
		Session session = getSession();
		return session.get(AdminFuncVO.class, adminID);
	}

	@Override
	public Integer add(AdminFuncVO adminFuncVO) {
		Session session = getSession();
        session.persist(adminFuncVO);
        return adminFuncVO.getAdminID();
	}

}
