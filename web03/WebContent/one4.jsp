<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	// Car car = new Car();
    	//HttpServletRequest request = new HttpServletRequest(); 
    	//car.run();
    	String id = request.getParameter("id"); //String, "100" 
    	//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
    	
		//2.dao에게 가방을 전달하면서 insert 해달라고 하자
		MovieDAO dao = new MovieDAO();
		MovieVO bag2= dao.one(id);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
당신이 검색을 원하는 id는 <%= id %>
<hr color="red">
 <table class="table table-danger table-striped">
 	<tr>
 		<td>영화아이디</td>
 		<td><%= bag2.getId() %></td>
 	</tr>
 	<tr>
 		<td>영화제목</td>
 		<td><%= bag2.getTitle() %></td>
 	</tr>
 	<tr>
 		<td>영화내용</td>
 		<td><%= bag2.getContent() %></td>
 	</tr>
 	<tr>
 		<td>개봉장소</td>
 		<td><%= bag2.getLocation() %></td>
 	</tr>
 	<tr>
 		<td>영화감독</td>
 		<td><%= bag2.getDirector() %></td>
 	</tr>
 </table>
</body>
</html>