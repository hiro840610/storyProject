package com.web.staff.model.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.admin.model.service.AdminService;
import com.web.admin.model.vo.AdminVO;
import com.web.staff.model.service.StaffService;
import com.web.staff.model.vo.StaffVO;

public class StaffServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
//		insert
		if ("insert".equals(action)) {
			insert(req, res);
		}
		if ("updateTemp".equals(action)) {
			Integer staffId = Integer.valueOf(req.getParameter("staffId"));
			StaffService staffSvc = new StaffService();
			AdminService adminSvc = new AdminService();
			AdminVO adminVO = adminSvc.getOneAdmin(staffId);
			StaffVO staffVO = staffSvc.getStaff(staffId);

			req.setAttribute("staffVO", staffVO);
			req.setAttribute("adminVO", adminVO);
			String url = "update.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}
		if ("update".equals(action)) {
			update(req, res);
		}
	}

	private void update(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String sname = req.getParameter("sname");
		String uid = req.getParameter("uid");
		String birthStr = req.getParameter("birth");
		String sex = req.getParameter("sex");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String tel = req.getParameter("tel");
		String address = req.getParameter("address");
		String acount = req.getParameter("acount");
		String password = req.getParameter("password");
		String posi = req.getParameter("job");
		String statusStr = req.getParameter("status");
		String idStr = req.getParameter("staffId");
		java.sql.Date birth = Date.valueOf(birthStr);

		Integer status = Integer.valueOf(statusStr);
		Integer id = Integer.valueOf(idStr.toString().trim());

		StaffVO staffVO = new StaffVO();
		staffVO.setId(id);
		staffVO.setName(sname);
		staffVO.setUid(uid);
		staffVO.setBth(birth);
		staffVO.setSex(sex);
		staffVO.setEmail(email);
		staffVO.setPhone(phone);
		staffVO.setTel(tel);
		staffVO.setAdd(address);
		staffVO.setAc(acount);
		staffVO.setPw(password);
		staffVO.setPosi(posi);
		staffVO.setStatus(status);

		StaffService staffSvc = new StaffService();
		staffSvc.updateStaff(staffVO);

//			轉交
		String url = "staffList.jsp";
		RequestDispatcher successView = req.getRequestDispatcher(url);
		successView.forward(req, res);
	}

	private void insert(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String sname = req.getParameter("sname");
		String uid = req.getParameter("uid");
		String birthStr = req.getParameter("birth");
		String sex = req.getParameter("sex");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String tel = req.getParameter("tel");
		String address = req.getParameter("address");
		String acount = req.getParameter("acount");
		String password = req.getParameter("password");
		String posi = req.getParameter("job");
		String[] adminStr = req.getParameterValues("admin");

		List<String> errorMsgs = getErrorMsgs(sname, uid, birthStr, sex, email, phone, address, acount, password, posi,
				adminStr);

		java.sql.Date birth = Date.valueOf(birthStr);

		Integer adminInt[] = new Integer[adminStr.length];

		for (int idx = 0; idx < adminStr.length; idx++) {
			adminInt[idx] = Integer.valueOf(adminStr[idx].trim());
		}

		StaffVO staffVO = new StaffVO();
		staffVO.setName(sname);
		staffVO.setUid(uid);
		staffVO.setBth(birth);
		staffVO.setSex(sex);
		staffVO.setEmail(email);
		staffVO.setPhone(phone);
		staffVO.setTel(tel);
		staffVO.setAdd(address);
		staffVO.setAc(acount);
		staffVO.setPw(password);
		staffVO.setPosi(posi);

		if (!errorMsgs.isEmpty()) {
			req.setAttribute("staffVO", staffVO); // 含有輸入格式錯誤的empVO物件,也存入req
			RequestDispatcher failureView = req.getRequestDispatcher("/backEnd/staff/register.jsp");
			failureView.forward(req, res);
			return;
		}

		StaffService staffSvc = new StaffService();
		int id = staffSvc.addStaff(staffVO);

		AdminService adminSvc = new AdminService();
		for (int idx = 0; idx < adminInt.length; idx++) {
			AdminVO adminVO = adminSvc.addAdminOnStaff(adminInt[idx], id);
		}
//			轉交
		String url = "staffList.jsp";
		RequestDispatcher successView = req.getRequestDispatcher(url);
		successView.forward(req, res);
	}

	private List<String> getErrorMsgs(String sname, String uid, String birthStr, String sex, String email, String phone,
			String address, String acount, String password, String posi, String[] adminStr) {
		List<String> errorMsgs = new LinkedList<String>();
		String snameReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9_)]{2,10}$";
		if (sname == null || sname.trim().length() == 0) {
			errorMsgs.add("員工姓名: 請勿空白");
		} else if (!sname.trim().matches(snameReg)) {
			errorMsgs.add("員工姓名: 只能是中、英文字母、數字和_ , 且長度必需在2到10之間");
		}

		if (uid == null || uid.trim().length() == 0) {
			errorMsgs.add("請勿空白");
		}

		try {
			java.sql.Date birth = Date.valueOf(birthStr);
		} catch (IllegalArgumentException e) {
			errorMsgs.add("請輸入日期!");
		}

		if (sex == null || sex.trim().length() == 0) {
			errorMsgs.add("請勿空白");
		}

		if (email == null || email.trim().length() == 0) {
			errorMsgs.add("請勿空白");
		}

		if (phone == null || phone.trim().length() == 0) {
			errorMsgs.add("請勿空白");
		} else if (phone.trim().length() != 10) {
			errorMsgs.add("手機號碼錯誤");
		}

		if (address == null || address.trim().length() == 0) {
			errorMsgs.add("請勿空白");
		}

		if (acount == null || acount.trim().length() == 0) {
			errorMsgs.add("請勿空白");

			if (password == null || password.trim().length() == 0) {
				errorMsgs.add("請勿空白");
			}

			if (posi == null || posi.trim().length() == 0) {
				errorMsgs.add("請選擇職稱");
			}

			if (adminStr == null) {
				errorMsgs.add("請選擇權限");
			} 
			return errorMsgs;
		}
		return errorMsgs;
	}

	public static void main(String[] args) {
		Integer admin = Integer.valueOf(null);
		System.out.println(admin);
	}

}
