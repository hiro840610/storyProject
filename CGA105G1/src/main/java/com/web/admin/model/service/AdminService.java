package com.web.admin.model.service;

import java.util.List;

import com.web.admin.model.dao.AdminDAO;
import com.web.admin.model.dao.impl.AdminDAOImpl;
import com.web.admin.model.vo.AdminVO;

public class AdminService {
	private AdminDAO dao;
	
	public AdminService() {
		dao = new AdminDAOImpl();
	}
	
	public AdminVO addAdminOnStaff(Integer adminId,Integer staffId) {
		
		AdminVO adminVO = new AdminVO();
		adminVO.setAdminID(adminId);
		adminVO.setStaffID(staffId);
		dao.add(adminVO);
		
		return adminVO;
	}
	public List<AdminVO> getAll(){
		return dao.getAll();
	}
	
	public AdminVO getOneAdmin(Integer staffId) {
		return dao.getById(staffId);
	}
	
	
	
}
