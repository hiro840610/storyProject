package com.admin.model.dao;

import java.util.List;

import com.admin.model.vo.AdminVO;

public interface AdminDAO {
//	權限可刪除
	public void insert(AdminVO adminVO);
	public void update(AdminVO adminVO);
	public AdminVO selectOne(Integer staffId);
	public List<AdminVO> selectAll();
}
