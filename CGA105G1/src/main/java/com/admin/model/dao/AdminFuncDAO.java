package com.admin.model.dao;

import java.util.List;

import com.admin.model.vo.AdminFuncVO;

public interface AdminFuncDAO {

		public int insert(AdminFuncVO adminFuncVO) ;
		public void update(AdminFuncVO adminFuncVO) ;
//		不會對功能做刪除,資料會變斷頭資料
		public AdminFuncVO selectOne(Integer adminID) ;
		public List<AdminFuncVO> selectAll();
}
