<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 1.전달된 값 받아주세요 (request) -->
<!-- 2.dao에게  값 전달(dao) 생략 -->
<!-- 3. 전달된 값을 출력하는 결과를 브라우저에html로 보내주세요 -->
<%
	String no = request.getParameter("no");
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");
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
	<h3>입력한 게시판 정보</h3>
	<hr color = "red">
	게시글 번호 :<%=no%><br> 
	게시글 제목 :<%=title%><br> 
	게시글 내용 :<%=content%><br> 
	작성자 이름 :<%=writer%><br>
</body>
</html>