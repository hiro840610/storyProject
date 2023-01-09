package com.admin.model.service;

import java.util.List;

import com.admin.model.dao.AdminDAO;
import com.admin.model.dao.impl.AdminDAOImpl;
import com.admin.model.vo.AdminVO;

public class AdminService {
	private AdminDAO dao;
	
	public AdminService() {
		dao = new AdminDAOImpl();
	}
	
	public AdminVO addAdminOnStaff(Integer adminId,Integer staffId) {
		
		AdminVO adminVO = new AdminVO();
		adminVO.setAdminID(adminId);
		adminVO.setStaffID(staffId);
		dao.insert(adminVO);
		
		return adminVO;
	}
	public List<AdminVO> getAll(){
		return dao.selectAll();
	}
	
	public AdminVO getOneAdmin(Integer staffId) {
		return dao.selectOne(staffId);
	}
	
	
	
}
