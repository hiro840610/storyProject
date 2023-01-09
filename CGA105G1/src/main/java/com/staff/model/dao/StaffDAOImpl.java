package com.staff.model.dao;

import java.util.*;

import com.staff.model.vo.StaffVO;

import java.sql.*;
import java.sql.Date;

public class StaffDAOImpl implements StaffDAO {

	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/ipetdb?serverTimezone=Asia/Taipei";
	static final String USER = "root";
	static final String PASSWORD = "0000";

	private static final String INSERT = "insert into IPETDB.staff" + "(`NAME`, UID, BTH, SEX, EMAIL, PHONE,TEL,"
			+ "`ADD`,AC,PW,POSI)" + "values(?,?,?,?,?,?,?,?,?,?,?)";

	private static final String UPDATE = "update staff set  `NAME`=?, UID=?, BTH=?, SEX=? ,EMAIL=?, PHONE=?,"
			+ "TEL=?, `ADD`=?,AC=?,PW=?,`STATUS`=?,POSI=?" + " where ID=?; ";

	private static final String SELECT_ONE = "select * from staff where ID=?;";

	private static final String SELECT_ALL = "select * from staff order by ID;";

	@Override
	public int insert(StaffVO StaffVO) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		String columns[] = { "id" };
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(INSERT, columns)) {

			ps.setString(1, StaffVO.getName());
			ps.setString(2, StaffVO.getUid());
			ps.setDate(3, StaffVO.getBth());
			ps.setString(4, StaffVO.getSex());
			ps.setString(5, StaffVO.getEmail());
			ps.setString(6, StaffVO.getPhone());
			ps.setString(7, StaffVO.getTel());
			ps.setString(8, StaffVO.getAdd());
			ps.setString(9, StaffVO.getAc());
			ps.setString(10, StaffVO.getPw());
			ps.setString(11, StaffVO.getPosi());
			System.out.println("新增筆數 =" + ps.executeUpdate() + "筆");

			// 依照當初給的去做反查詢,取得自動編號
			ResultSet rs = ps.getGeneratedKeys();
			int id = 0;
			while (rs.next()) {
				 id = rs.getInt(1);
				System.out.println("ID: " + id);
			}
			return id;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public StaffVO update(StaffVO StaffVO) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(UPDATE)) {

			ps.setString(1, StaffVO.getName());
			ps.setString(2, StaffVO.getUid());
			ps.setDate(3, StaffVO.getBth());
			ps.setString(4, StaffVO.getSex());
			ps.setString(5, StaffVO.getEmail());
			ps.setString(6, StaffVO.getPhone());
			ps.setString(7, StaffVO.getTel());
			ps.setString(8, StaffVO.getAdd());
			ps.setString(9, StaffVO.getAc());
			ps.setString(10, StaffVO.getPw());
			ps.setInt(11, StaffVO.getStatus());
			ps.setString(12, StaffVO.getPosi());
			ps.setInt(13, StaffVO.getId());

			System.out.println("修改成功" + ps.executeUpdate() + "筆資料");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return StaffVO;
	}

	@Override
	public StaffVO findById(Integer id) {
		StaffVO staffVO = null;
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(SELECT_ONE)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				staffVO = new StaffVO();
				staffVO.setId(rs.getInt("ID"));
				staffVO.setName(rs.getString("NAME"));
				staffVO.setUid(rs.getString("UID"));
				staffVO.setBth(rs.getDate("BTH"));
				staffVO.setSex(rs.getString("SEX"));
				staffVO.setEmail(rs.getString("EMAIL"));
				staffVO.setPhone(rs.getString("PHONE"));
				staffVO.setTel(rs.getString("TEL"));
				staffVO.setAdd(rs.getString("ADD"));
				staffVO.setAc(rs.getString("AC"));
				staffVO.setPw(rs.getString("PW"));
				;
				staffVO.setStatus(rs.getInt("STATUS"));
				staffVO.setPosi(rs.getString("POSI"));

			}
		} catch (SQLException e) {
			e.printStackTrace(System.err);
		}

		return staffVO;
	}

	@Override
	public List<StaffVO> getAll() {
		List<StaffVO> list = new ArrayList<StaffVO>();
		StaffVO staffVO = null;

		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(SELECT_ALL)) {
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				staffVO = new StaffVO();
				staffVO.setId(rs.getInt("ID"));
				staffVO.setName(rs.getString("NAME"));
				staffVO.setUid(rs.getString("UID"));
				staffVO.setBth(rs.getDate("BTH"));
				staffVO.setSex(rs.getString("SEX"));
				staffVO.setEmail(rs.getString("EMAIL"));
				staffVO.setPhone(rs.getString("PHONE"));
				staffVO.setTel(rs.getString("TEL"));
				staffVO.setAdd(rs.getString("ADD"));
				staffVO.setAc(rs.getString("AC"));
				staffVO.setPw(rs.getString("PW"));
				;
				staffVO.setStatus(rs.getInt("STATUS"));
				staffVO.setPosi(rs.getString("POSI"));
				list.add(staffVO);
			}
		} catch (SQLException e) {
			e.printStackTrace(System.err);
		}

		return list;
	}

	public static void main(String[] args) {
		StaffDAOImpl dao = new StaffDAOImpl();


		// 新增
		StaffVO VO1 = new StaffVO();
		VO1.setName("小美");
		VO1.setUid("C212345678");
		VO1.setBth(Date.valueOf("2007-09-09"));
		VO1.setSex("女");
		VO1.setEmail("abc0909@gmail.com");
		VO1.setPhone("0912345678");
		VO1.setTel("23456789");
		VO1.setAdd("高雄");
		VO1.setAc("abc0909@gmail.com");
		VO1.setPw("0000");
		VO1.setPosi("住宿管理員");
		int staffID = dao.insert(VO1);

//		update
		StaffVO VO2 = new StaffVO();
		VO2.setName("小美麗");
		VO2.setUid("C212345678");
		VO2.setBth(Date.valueOf("2007-09-09"));
		VO2.setSex("女");
		VO2.setEmail("abc0909@gmail.com");
		VO2.setPhone("0912345678");
		VO2.setTel("23456789");
		VO2.setAdd("高雄");
		VO2.setAc("abc0909@gmail.com");
		VO2.setPw("0000");
		VO2.setStatus(1);
		VO2.setPosi("住宿管理員");
		VO2.setId(staffID);
		dao.update(VO2);

//	使用JDBC拿出資料->OK
//		
		StaffVO VO = dao.findById(1);
		System.out.println(VO.getName());
		
//		拿出所有資料
		List<StaffVO> list = dao.getAll();
		for(StaffVO e  : list) {
			System.out.println(e.getName());
		}
	}

}
