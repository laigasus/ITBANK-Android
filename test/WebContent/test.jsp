<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%

	request.setCharacterEncoding("utf-8");
	Connection conn = null;
try {
	String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
	String id = "root";
	String pw = "qwer";

	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(url, id, pw);

	String str1 = request.getParameter("str1");
	String str2 = request.getParameter("str2");

	System.out.println(str1);
	System.out.println(str2);

	
	out.println(str1);
	out.println(str2);

	out.print("제대로 연결되었습니다");
	
} catch (Exception e) {
	e.printStackTrace();
}
%>