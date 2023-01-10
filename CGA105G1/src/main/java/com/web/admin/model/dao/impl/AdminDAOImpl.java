package com.web.admin.model.dao.impl;

import java.util.List;
import org.hibernate.Session;
import com.web.admin.model.dao.AdminDAO;
import com.web.admin.model.entities.Admin;

public class AdminDAOImpl implements AdminDAO {


	@Override
	public void update(Admin admin) {
		Session session = getSession();
		Admin oldAdmin = session.get(Admin.class, admin.getAdminID());
		oldAdmin.setAdminID(admin.getAdminID());
		oldAdmin.setStaffID(admin.getStaffID());
	
	}
		
	
	@Override
	public List<Admin> getAll() {
		   Session session = getSession();
	        String hql = "FROM Admin";
	        return session.createQuery(hql, Admin.class).list();
	    }

	@Override
	public Admin getById(Integer staffId) {
		Session session = getSession();
        return session.get(Admin.class, staffId);
	}

	@Override
	public Integer add(Admin admin) {
		Session session = getSession();
        session.persist(admin);
        return admin.getStaffID();
	}
}
