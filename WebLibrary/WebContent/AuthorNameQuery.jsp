<%@ page language="java" import="java.util.*,information.*,search.*" pageEncoding="UTF-8"%> 
<%
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<title>图书查询</title>
	<br> 
	 <table width="706" border="0" align="center" height="75">
	  <tr>
	   <td colspan="6" align="center" ><strong>图书查询</strong></td>
	    </tr>
	      <tr>
	       <td align="center" width="500"> <form action="Query" method="get"> 作者名：
	       <input type="text" name="name">
	       <input type="submit"  value="查询" ></form></td>
	     </tr>
	      <td align="right">
	     <p><a href="index.jsp">返回主页</a></p> 
	     </td>
	   </table> 
	   
	 </body> 
</html>
