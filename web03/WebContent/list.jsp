<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MemberDAO3 dao = new MemberDAO3();
//5,6 dao가 리턴한 bbsVO가 들어간 arraylist를 받아서 저장
ArrayList<MemberVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js">
	
</script>
<style>
a {
	text-decoration: none;
	color: white;
}
</style>
</head>

<body>


	<table class="table table-success">
		<tr>
			<td>id</td>
			<td>pw</td>
			<td>name</td>
			<td>tel</td>

		</tr>
		<%
			for (MemberVO bag2 : list) {
		%>

		<tr>
			<td><%=bag2.getId()%></td>
			<td><a
				href="http://localhost:8888/web02/one.jsp?id=<%=bag2.getId()%>">
					<%=bag2.getPw()%></a></td>
			<td><%=bag2.getName()%></td>
			<td><%=bag2.getTel()%></td>

		</tr>

		<%}%>
	</table>
</body>
</html>