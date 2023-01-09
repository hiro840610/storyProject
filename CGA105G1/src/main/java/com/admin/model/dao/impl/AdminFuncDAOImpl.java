package com.admin.model.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.admin.model.dao.AdminFuncDAO;
import com.admin.model.vo.AdminFuncVO;

public class AdminFuncDAOImpl implements AdminFuncDAO {
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/ipetdb?serverTimezone=Asia/Taipei";
	static final String USER = "root";
	static final String PASSWORD = "0000";

	private static final String INSERT = "insert into IPETDB.staff_admin_per_func" + "(`NAME`) values(?)";
	private static final String UPDATE = "update staff_admin_per_func set `NAME` = ? where ID = ?;";
	private static final String SELECT_ONE = "select * from staff_admin_per_func where ID = ?;";
	private static final String SELECT_ALL = "select * from staff_admin_per_func;";

	@Override
	public int insert(AdminFuncVO adminFuncVO) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		String columns[] = { "ID" };
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(INSERT, columns)) {
			ps.setString(1, adminFuncVO.getAdminName());

			System.out.println("新增成功" + ps.executeUpdate() + "筆");

			ResultSet rs = ps.getGeneratedKeys();
			int id = 0;
			while (rs.next()) {
				id = rs.getInt(1);
				System.out.println("ID:" + id);
			}
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public void update(AdminFuncVO adminFuncVO) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(UPDATE)) {
			ps.setString(1, adminFuncVO.getAdminName());
			ps.setInt(2,adminFuncVO.getAdminID());

			System.out.println("修改成功" + ps.executeUpdate() + "筆");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public AdminFuncVO selectOne(Integer adminID) {
		AdminFuncVO adminFuncVO = null;
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(SELECT_ONE)) {
			ps.setInt(1, adminID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				adminFuncVO = new AdminFuncVO();
				adminFuncVO.setAdminID(rs.getInt("ID"));
				adminFuncVO.setAdminName(rs.getString("NAME"));
			}
			return adminFuncVO;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<AdminFuncVO> selectAll() {
		List<AdminFuncVO> list = new ArrayList<AdminFuncVO>();
		AdminFuncVO adminFuncVO = null;
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(SELECT_ALL)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				adminFuncVO = new AdminFuncVO();
				adminFuncVO.setAdminID(rs.getInt("ID"));
				adminFuncVO.setAdminName(rs.getString("NAME"));
				list.add(adminFuncVO);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		AdminFuncDAOImpl dao = new AdminFuncDAOImpl();
		
		AdminFuncVO VO1 = new AdminFuncVO();
		VO1.setAdminName("人事管理員");
		int id = dao.insert(VO1);
		
		AdminFuncVO VO2 = new AdminFuncVO();
		VO2.setAdminID(id);
		VO2.setAdminName("人事管理");
		dao.update(VO2);
		
		AdminFuncVO VO3 = dao.selectOne(1);
		System.out.println(VO3.getAdminName());
		
		List<AdminFuncVO> list = dao.selectAll();
		for(AdminFuncVO e : list) {
			System.out.println(e.getAdminName());
		}
	}

}
