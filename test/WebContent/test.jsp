<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	Connection conn = null;
try {
	String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
	String id = "root";
	String pw = "qwer";

	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(url, id, pw);
	out.print("����� ����Ǿ����ϴ�");
} catch (Exception e) {
	e.printStackTrace();
}
%>