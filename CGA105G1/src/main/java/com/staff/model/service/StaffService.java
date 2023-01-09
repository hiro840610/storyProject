package com.staff.model.service;



import java.util.List;

import com.staff.model.dao.StaffDAO;
import com.staff.model.dao.StaffDAOImpl;
import com.staff.model.vo.StaffVO;

public class StaffService {

	private StaffDAO dao;

	public StaffService() {
		dao = new StaffDAOImpl();
	}

	int id = 0;

	public int addStaff(StaffVO staffVO) {
		id = dao.insert(staffVO);
		return id;
	}
	
	public StaffVO updateStaff(StaffVO staffVO) {
		return dao.update(staffVO);
	}
	
	
	public StaffVO getStaff(int id) {
		StaffVO staffVO = dao.findById(id);
		return staffVO;
	}
	public List<StaffVO> getAll() {
		return dao.getAll();
	}



}
