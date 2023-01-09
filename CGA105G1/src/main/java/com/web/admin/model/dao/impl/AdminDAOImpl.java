package com.web.admin.model.dao.impl;

import java.util.List;
import org.hibernate.Session;
import com.web.admin.model.dao.AdminDAO;
import com.web.admin.model.vo.AdminVO;

public class AdminDAOImpl implements AdminDAO {


	@Override
	public void update(AdminVO adminVO) {
		Session session = getSession();
		AdminVO oldAdminVO = session.get(AdminVO.class, adminVO.getAdminID());
		oldAdminVO.setAdminID(adminVO.getAdminID());
		oldAdminVO.setStaffID(adminVO.getStaffID());
	
	}
		
	
	@Override
	public List<AdminVO> getAll() {
		   Session session = getSession();
	        String hql = "FROM ipetdb.staff_admin_per";
	        return session.createQuery(hql, AdminVO.class).list();
	    }

	@Override
	public AdminVO getById(Integer staffId) {
		Session session = getSession();
        return session.get(AdminVO.class, staffId);
	}

	@Override
	public Integer add(AdminVO adminVO) {
		Session session = getSession();
        session.persist(adminVO);
        return adminVO.getStaffID();
	}
}
