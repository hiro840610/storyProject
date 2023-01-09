package com.web.admin.model.dao;


import com.core.model.dao.CoreDAO;
import com.web.admin.model.vo.AdminVO;

public interface AdminDAO extends CoreDAO<AdminVO,Integer>{
//	權限可刪除
	public void update(AdminVO adminVO);
}
