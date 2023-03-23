<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String dollar = request.getParameter("dollar");

int d = Integer.parseInt(dollar);
int won = 1283;
int result = d * won;
%><%=result%>
