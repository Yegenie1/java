<%@page import="multi.MusicVO"%>
<%@page import="multi.MusicDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
MusicDAO dao = new MusicDAO();
//5,6 dao가 리턴한 productVO가 들어간 arraylist를 받아서 저장
ArrayList<MusicVO> list = dao.list();
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
	color: black;
}
</style>
</head>

<body>
<h3>등록노래 개수 :  <%=list.size()%>개</h3>
<%if(list.size()==0){%>
<h3>등록된 노래가 없습니다.</h3>
<img src="img/re.png" width="250" height="250">
	
<%}else{ %>

	<table class="table table-danger table-striped">
		<tr>
			<td>id</td>
			<td>title</td>
			<td>artist</td>
			<td>content</td>
			<td>img</td>

		</tr>
		<%
			for (MusicVO bag2 : list) {
		%>

		<tr>
			<td><%=bag2.getId()%></td>
			<td><a href="one5.jsp?id=<%=bag2.getId()%>">
					<%=bag2.getTitle() %></a></td>
			<td><%=bag2.getArtist()%></td>
			<td><%=bag2.getContent()%></td>
			<td><img src="img/<%=bag2.getImg()%>" width="150" height="150"></td>

		</tr>

		<%}%>
	</table>
	
	<%} %>
</body>
</html>