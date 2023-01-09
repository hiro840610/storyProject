package com.admin.model.service;

import java.util.List;

import com.admin.model.dao.AdminFuncDAO;
import com.admin.model.dao.impl.*;
import com.admin.model.vo.AdminFuncVO;

public class AdminFuncService {

	private AdminFuncDAO dao;

	public AdminFuncService() {
		dao = new AdminFuncDAOImpl();
	}

	public List<AdminFuncVO> getAll() {
		return dao.selectAll();
	}

	public void addAdminFunc(AdminFuncVO adminFuncVO) {
		dao.insert(adminFuncVO);
	}

	public void editAdminFunc(AdminFuncVO adminFuncVO) {
		dao.update(adminFuncVO);
	}

	public void getOne(Integer adminId) {
        dao.selectOne(adminId);
	}
}