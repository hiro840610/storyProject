package com.staff.model.dao;

import java.util.*;

import com.staff.model.vo.StaffVO;

public interface StaffDAO {
	public int insert(StaffVO StaffVO);

	public StaffVO update(StaffVO StaffVO);

	public StaffVO findById(Integer id);

	public List<StaffVO> getAll();
}
