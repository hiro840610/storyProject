package com.web.admin.model.dao;


import com.core.model.dao.CoreDAO;
import com.web.admin.model.vo.AdminFuncVO;

public interface AdminFuncDAO extends CoreDAO<AdminFuncVO,Integer>{

		public void update(AdminFuncVO adminFuncVO) ;
//		不會對功能做刪除,資料會變斷頭資料
}
