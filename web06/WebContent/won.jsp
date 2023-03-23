<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String won=request.getParameter("won");
 
    int w = Integer.parseInt(won);
    int dollar = 1283;
    int result =w/dollar;

    %><%=result%>
