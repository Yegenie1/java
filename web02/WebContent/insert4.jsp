<%@page import="multi.MovieDAO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />

<!-- 1.전달된 값 받아주세요 (request) -->
<!-- 2.dao에게  값 전달(dao) 생략 -->
<!-- 3. 전달된 값을 출력하는 결과를 브라우저에html로 보내주세요 -->
<%
	///0.클라이언트가 입력한 정보 전달
/*String id = request.getParameter("id");
String name = request.getParameter("name");
String content = request.getParameter("content");
String price = request.getParameter("price");
String company = request.getParameter("company");
String img = request.getParameter("img");*/

//1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
/*ProductVO bag = new ProductVO();
bag.setId(id);
bag.setName(name);
bag.setContent(content);
bag.setPrice(Integer.parseInt(price));
bag.setCompany(company);
bag.setImg(img);*/

//2.dao에게 가방을 전달하면서 insert 해달라고 하자
MovieDAO dao = new MovieDAO();
dao.insert(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: green;
}
</style>
</head>
<body>
	<h3>영화등록 정보</h3>
	<hr color="red">
	상품 id :<%=bag.getId()%><br> 
	상품 name :<%=bag.getTitle()%><br> 
	상품 content :<%=bag.getContent()%><br>
	상품 price :<%=bag.getLocation()%><br> 
	상품 company :<%=bag.getDirector()%><br>
	<!-- img src=img/shoes1.jpg -->
	<%-- <img src="img/<%=bag.getImg()%>" width=200 height=200> --%>
	<br>



</body>
</html>