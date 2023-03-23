<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String m = request.getParameter("money");
    String c = request.getParameter("choice");
    int money=Integer.parseInt(m); 
    if(c.equals("1")){
    	 money-=1000;
    }else if(c.equals("2")){
    	money+=1000;
    }
    %><%= money%>
