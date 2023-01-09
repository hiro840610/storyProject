package com.web.admin.model.service;

import java.util.List;

import com.web.admin.model.dao.AdminFuncDAO;
import com.web.admin.model.dao.impl.*;
import com.web.admin.model.vo.AdminFuncVO;

public class AdminFuncService {

	private AdminFuncDAO dao;

	public AdminFuncService() {
		dao = new AdminFuncDAOImpl();
	}

	public List<AdminFuncVO> getAll() {
		return dao.getAll();
	}

	public void addAdminFunc(AdminFuncVO adminFuncVO) {
		dao.add(adminFuncVO);
	}

	public void editAdminFunc(AdminFuncVO adminFuncVO) {
		dao.update(adminFuncVO);
	}

	public void getOne(Integer adminId) {
        dao.getById(adminId);
	}
}