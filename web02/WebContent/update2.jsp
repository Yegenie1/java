<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받아야함 >자바로 짜야함  -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->
<%//스크립트릿 -- 조금 코드를 써서 만드는 작은 프로그램
	//자바코드 넣는 부분
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜 놓음!!
String no = request.getParameter("no");//id의 값을 가져옴==>string 저장하자
String content = request.getParameter("content");


//1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
BbsVO bag = new BbsVO();
bag.setNo(Integer.parseInt(no));
bag.setContent(content);

//2.dao에게 가방을 전달하면서 insert 해달라고 하자
BbsDAO dao = new BbsDAO();
dao.update(bag);
%>

<!-- 3.브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>
게시판 수정이 요청되었음
<hr color = "red">

<a href="update2.html">
		<button id="b1">이전페이지로</button><br>
	</a>
수정할 번호 : <%= no %> <br>
수정할 내용 : <%= content %> <br>
</body>
</html>