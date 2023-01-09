package com.admin.model.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.admin.model.dao.AdminDAO;
import com.admin.model.vo.AdminVO;

public class AdminDAOImpl implements AdminDAO {

	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/ipetdb?serverTimezone=Asia/Taipei";
	static final String USER = "root";
	static final String PASSWORD = "0000";

	private final String INSERT = "INSERT INTO ipetdb.staff_admin_per" + "(`ADMIN_PER_ID`,`STAFF_ID`)" + "VALUES(?,?);";
	private final String UPDATE = "UPDATE `ipetdb`.`staff_admin_per` " + "SET `ADMIN_PER_ID` = ? WHERE `STAFF_ID` = ?;";
	private final String SELECT_ONE = "SELECT * FROM ipetdb.staff_admin_per WHERE STAFF_ID = ?;";
	private final String SELECT_ALL = "SELECT * FROM ipetdb.staff_admin_per;";

	@Override
	public void insert(AdminVO adminVO) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(INSERT)) {
			ps.setInt(1, adminVO.getAdminID());
			ps.setInt(2, adminVO.getStaffID());
			System.out.println("新增成功" + ps.executeUpdate() + "筆資料");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(AdminVO adminVO) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(UPDATE)) {
			ps.setInt(1, adminVO.getAdminID());
			ps.setInt(2, adminVO.getStaffID());
			System.out.println("修改成功" + ps.executeUpdate() + "筆資料");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public AdminVO selectOne(Integer staffId) {
		AdminVO adminVO = null;
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(SELECT_ONE)) {
			ps.setInt(1, staffId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				adminVO = new AdminVO();
				adminVO.setAdminID(rs.getInt("ADMIN_PER_ID"));
				adminVO.setStaffID(rs.getInt("STAFF_ID"));
			}
			return adminVO;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<AdminVO> selectAll() {
		List<AdminVO> list = new ArrayList<AdminVO>();
		AdminVO adminVO = null;

		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(SELECT_ALL)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				adminVO = new AdminVO();
				adminVO.setAdminID(rs.getInt("ADMIN_PER_ID"));
				adminVO.setStaffID(rs.getInt("STAFF_ID"));
				list.add(adminVO);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		AdminDAOImpl dao = new AdminDAOImpl();
//		AdminVO VO1 = new AdminVO();
//		VO1.setAdminID(2);
//		VO1.setStaffID(3);
//		dao.insert(VO1);

//		AdminVO VO2 = new AdminVO();
//		VO2.setAdminID(2);
//		VO2.setStaffID(1);
//		dao.update(VO2);

//		AdminVO VO3 = dao.selectOne(1);
//		System.out.println("權限為"+VO3.getAdminID());
		
		List<AdminVO> list = dao.selectAll();
		for(AdminVO e : list) {
			System.out.println(e.getStaffID()+"權限為"+e.getAdminID());
		}

	}
}
