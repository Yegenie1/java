<%@page import="multi.MusicDAO"%>
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
MusicDAO dao = new MusicDAO();
dao.delete(Integer.parseInt(id));
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 삭제를 원하는 번호는 <%= id %>
<h3> <%= id %>번이 삭제되었습니다</h3>
</body>
</html>