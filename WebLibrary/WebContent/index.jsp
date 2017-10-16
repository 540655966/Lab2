<%@ page language="java" import="java.util.*,information.*,search.*" pageEncoding="UTF-8"%> 
<%
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<br> 
	 <table width="706" border="0" align="center" height="75">
	  <tr>
	   <td colspan="6" align="center" ><strong>请点击要进行的操作:</td>
	    </tr>
	    	
	    	<td align="center">
			<p><a href="addBook.jsp">添加</a></p> 
			</td>
			<td align="center">
			<p><a href="Show.jsp">删除</a></p> 
			</td>
			<td align="center">
			<p><a href="AuthorNameQuery.jsp">查询</a></p> 
			</td>
			<td align="center">
			<p><a href="Update.jsp">修改</a></p> 
			</td>
			</table> 
	 </body> 
</html>
