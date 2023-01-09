package com.news.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.news.model.vo.NewsVO;

public class NewsDAOImpl implements NewsDAO {
	static final String URL = "jdbc:mysql://localhost:3306/ipetdb?serverTimezone=Asia/Taipei";
	static final String USER = "root";
	static final String PASSWORD = "0000";
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String INSERT = "insert into IPETDB.NEWS(TITLE,`TEXT`)values(?,?);";
	private static final String UPDATE = "update IPETDB.NEWS set TITLE = ?,`TEXT` = ? where ID = ?;";
	private static final String DELETE = "delete from IPETDB.NEWS  where ID = ?;";
	private static final String SELECT_ONE = "select * from IPETDB.NEWS where ID = ? ;";
	private static final String SELECT_ALL = "select * from IPETDB.NEWS order by ID;";

	@Override
	public int insert(NewsVO newsVO) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		String columns[] = { "id" };
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(INSERT, columns)) {
			ps.setString(1, newsVO.getTitle());
			ps.setString(2, newsVO.getText());
			System.out.println("新增成功" + ps.executeUpdate() + "筆資料");

			int id = 0;
			ResultSet rs = ps.getGeneratedKeys();
			while (rs.next()) {
				id = rs.getInt(1);
				System.out.println("ID:"+id);
			}
			return id;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public void update(NewsVO newsVO) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(UPDATE)) {
			ps.setString(1, newsVO.getTitle());
			ps.setString(2, newsVO.getText());
			ps.setInt(3, newsVO.getId());
			System.out.println("修改成功" + ps.executeUpdate() + "筆資料");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(NewsVO newsVO) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(DELETE)) {
			ps.setInt(1, newsVO.getId());
			System.out.println("刪除成功" + ps.executeUpdate() + "筆資料");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public NewsVO selectOne(Integer newsID) {
		NewsVO newsVO = null;
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(SELECT_ONE)) {
			ps.setInt(1, newsID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				newsVO = new NewsVO();
				newsVO.setId(rs.getInt("ID"));
				newsVO.setTitle(rs.getString("Title"));
				newsVO.setText(rs.getString("Text"));
				newsVO.setTime(rs.getDate("Time"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return newsVO;
	}

	@Override
	public List<NewsVO> selectAll() {
		List<NewsVO> list = new ArrayList<NewsVO>();
		NewsVO newsVO = null;

		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement ps = connection.prepareStatement(SELECT_ALL)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				newsVO = new NewsVO();
				newsVO.setId(rs.getInt("ID"));
				newsVO.setTitle(rs.getString("Title"));
				newsVO.setText(rs.getString("Text"));
				newsVO.setTime(rs.getDate("Time"));
				list.add(newsVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String[] args) {

		NewsDAOImpl dao = new NewsDAOImpl();
////		insert
//		NewsVO VO1 = new NewsVO();
//		VO1.setTitle("第X篇文章");
//		VO1.setText("內容內容內容");
//		int id = dao.insert(VO1);
		
////		update
//		NewsVO VO2 = new NewsVO();
//		VO2.setId(id);
//		VO2.setTitle("第X篇文章");
//		VO2.setText("汪汪汪");
//		dao.update(VO2);
		
////		delete
//		NewsVO VO3 = new NewsVO();
//		VO3.setId(5);
//		dao.delete(VO3);
		
////		select
//		NewsVO VO4 = dao.selectOne(1);
//		System.out.println(VO4.getTitle());
//		System.out.println(VO4.getText());
//		System.out.println(VO4.getTime());
//		System.out.println(VO4.getId());
		
//		select all
		List<NewsVO> list = dao.selectAll();
		for(NewsVO e : list) {
			System.out.println(e.getTitle());
			System.out.println(e.getText());
			System.out.println(e.getTime());
			System.out.println("==============");
		}
	}
}
