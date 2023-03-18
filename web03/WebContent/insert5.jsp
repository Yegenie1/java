<%@page import="multi.MusicDAO"%>
<%@page import="multi.MusicVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.MusicVO"></jsp:useBean>
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
/*MusicVO bag = new MusicVO();
bag.setId(id);
bag.setName(name);
bag.setContent(content);
bag.setPrice(Integer.parseInt(price));
bag.setCompany(company);
bag.setImg(img);*/

//2.dao에게 가방을 전달하면서 insert 해달라고 하자
MusicDAO dao = new MusicDAO();
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
	<h3>상품등록 정보</h3>
	<hr color="red">
	
	<table border="1">

			<tr>
				<td class=t1>id:</td>
				<td><%=bag.getId()%></td>
			</tr>

			<tr>
				<td class=t1>title :</td>
				<td><%=bag.getTitle()%></td>
			</tr>
			
			<tr>
				<td class=t1>artist :</td>
				<td><%=bag.getArtist()%></td>
			</tr>

			<tr>
				<td class=t1>content :</td>
				<td><%=bag.getContent()%></td>
			</tr>
			
			<tr>
				<td class=t1>img :</td> 
				<td><img src="img/<%=bag.getImg()%>" width=200 height=200></td>
				
			</tr>

		</table>
	
	

</body>
</html>