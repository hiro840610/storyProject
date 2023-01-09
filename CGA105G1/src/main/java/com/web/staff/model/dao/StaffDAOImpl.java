package com.web.staff.model.dao;

import java.util.*;

import org.hibernate.Session;

import com.web.staff.model.vo.StaffVO;


public class StaffDAOImpl implements StaffDAO {


	@Override
	public StaffVO update(StaffVO StaffVO) {
		Session session = getSession();
		StaffVO oldstaffVO = session.get(StaffVO.class, StaffVO.getId());
		oldstaffVO.setName(StaffVO.getName());
		oldstaffVO.setUid(StaffVO.getUid());
		oldstaffVO.setBth(StaffVO.getBth());
		oldstaffVO.setSex(StaffVO.getSex());
		oldstaffVO.setEmail(StaffVO.getEmail());
		oldstaffVO.setPhone(StaffVO.getPhone());
		oldstaffVO.setTel(StaffVO.getTel());
		oldstaffVO.setAdd(StaffVO.getAdd());
		oldstaffVO.setAc(StaffVO.getAc());
		oldstaffVO.setPw(StaffVO.getPw());
		oldstaffVO.setStatus(StaffVO.getStatus());
		oldstaffVO.setPosi(StaffVO.getPosi());
		oldstaffVO.setId(StaffVO.getId());
		return StaffVO;
	}

	@Override
	public List<StaffVO> getAll() {
		Session session = getSession();
        String hql = "FROM Staff";
        return session.createQuery(hql, StaffVO.class).list();
	}
		
	@Override
	public StaffVO getById(Integer id) {
		 Session session = getSession();
	        return session.get(StaffVO.class, id);
		
	}
	

	@Override
	public Integer add(StaffVO staffVO) {
		Session session = getSession();
		session.persist(staffVO);
		return staffVO.getId();
	}

}
