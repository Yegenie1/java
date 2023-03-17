<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 1.전달된 값 받아주세요 (request) -->
<!-- 2.dao에게  값 전달(dao) 생략 -->
<!-- 3. 전달된 값을 출력하는 결과를 브라우저에html로 보내주세요 -->
<%
///0.클라이언트가 입력한 정보 전달
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

//1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
BbsVO bag = new BbsVO();
bag.setTitle(title);
bag.setContent(content);
bag.setWriter(writer);

//2.dao에게 가방을 전달하면서 insert 해달라고 하자
BbsDAO dao = new BbsDAO();
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
	<h3>입력한 게시판 정보</h3>
	<hr color = "red">
	게시글 제목 :<%=title%><br> 
	게시글 내용 :<%=content%><br> 
	작성자 이름 :<%=writer%><br>
</body>
</html>