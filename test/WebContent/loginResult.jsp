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

	String email = request.getParameter("email");
	String name = request.getParameter("name");
	String password = request.getParameter("password");

	System.out.println(email);
	System.out.println(name);
	System.out.println(password);

	out.println(email);
	out.println(name);
	out.println(password);

	
} catch (Exception e) {
	e.printStackTrace();
}
%>