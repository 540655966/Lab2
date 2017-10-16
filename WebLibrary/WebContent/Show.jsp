<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>删除书籍</title>



</head>

<body>

	<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/BookDB" user="root" password="" />

	<sql:query dataSource="${snapshot}" var="result">SELECT * from book;
	</sql:query>
	<h1>所有书目:</h1>
	<table border="1" width="100%">
		<tr>
			<th>ISBN</th>
			<th>Title</th>
			<th>AuthorID</th>
			<th>Publisher</th>
			<th>PublishDate</th>
			<th>Price</th>
			<th>功能</th>
		</tr>
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.ISBN}" /></td>
				<td><c:out value="${row.Title}" /></td>
				<td><c:out value="${row.AuthorID}" /></td>
				<td><c:out value="${row.Publisher}" /></td>
				<td><c:out value="${row.PublishDate}" /></td>
				<td><c:out value="${row.Price}" /></td>
				<td>
					<input type="button" value="删除"
					onclick="SuccessResult.jsp" />
					</td>

			</tr>
		</c:forEach>

	</table>
	     <align="right">
	     <p><a href="index.jsp">返回主页</a></p> 
</body>
</html>
