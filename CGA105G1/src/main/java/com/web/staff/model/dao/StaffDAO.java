package com.web.staff.model.dao;

import java.util.*;

import com.core.model.dao.CoreDAO;
import com.web.staff.model.vo.StaffVO;

public interface StaffDAO extends CoreDAO<StaffVO,Integer> {

	public StaffVO update(StaffVO StaffVO);

	public List<StaffVO> getAll();
}
