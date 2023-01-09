package com.web.staff.model.service;



import java.util.List;

import com.web.staff.model.dao.StaffDAO;
import com.web.staff.model.dao.StaffDAOImpl;
import com.web.staff.model.vo.StaffVO;

public class StaffService {

	private StaffDAO dao;

	public StaffService() {
		dao = new StaffDAOImpl();
	}

	int id = 0;

	public int addStaff(StaffVO staffVO) {
		id = dao.add(staffVO);
		return id;
	}
	
	public StaffVO updateStaff(StaffVO staffVO) {
		return dao.update(staffVO);
	}
	
	
	public StaffVO getStaff(int id) {
		StaffVO staffVO = dao.getById(id);
		return staffVO;
	}
	public List<StaffVO> getAll() {
		return dao.getAll();
	}



}
