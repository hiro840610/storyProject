<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="com.staff.model.service.*" %>
<%@ page import="com.staff.model.vo.*" %>


<%
StaffService staffSvc = new StaffService();
    List<StaffVO> list = staffSvc.getAll();
    pageContext.setAttribute("list",list);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>員工列表</title>
<style type="text/css">
table, th, td{
border: 1px solid white;
border-collapse: collapse;

 
}
th, td {
  background-color: pink;
}
input#addNew{
 background-color: lightgray;
 border:none;
 border-radius:5px;
}
input#addNew:hover,#search:hover{
cursor: pointer;
}


</style>
</head>
<body>
<form action = "register.jsp">
<input id = "addNew" type ="submit" value = "新增員工">
</form>
<table>
<tr>
<td>員工編號</td>
<td>員工姓名</td>
<td>身份證字號</td>
<td>生日</td>
<td>性別</td>
<td>信箱</td>
<td>手機</td>
<td>市內電話</td>
<td>地址</td>
<td>職稱</td>
<td>狀態</td>
<td></td>
</tr>

<%@ include file="page1.file" %> 
 <c:forEach var="staffVO" items="${list}" begin="<%=pageIndex%>" end="<%=pageIndex+rowsPerPage-1%>">
		
		<tr>
			<td>${staffVO.id}</td>
			<td>${staffVO.name}</td>
			<td>${staffVO.uid}</td>
			<td>${staffVO.bth}</td>
			<td>${staffVO.sex}</td>
			<td>${staffVO.email}</td>
			<td>${staffVO.phone}</td> 
			<td>${staffVO.tel}</td>
			<td>${staffVO.add}</td>
			<td>${staffVO.posi}</td>
			<td>${staffVO.status == 0 ? "在職" : "離職"}</td>
			<td>
			  <FORM METHOD="post" ACTION="<%=request.getContextPath()%>/backEnd/staff/register" style="margin-bottom: 0px;">
			     <input type="submit" value="修改">
			     <input type="hidden" name="staffId"  value="${staffVO.getId()}">
			     <input type="hidden" name="action"	value="updateTemp">
			    </FORM>
			</td>
		
		</tr>
	</c:forEach>


</table>
<%@ include file="page2.file" %>
<script>
</script>
</body>
</html>