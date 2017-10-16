<%@ page language="java" import="java.util.*,information.*,search.*" pageEncoding="UTF-8"%> 
<%
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<br> 
	 <table width="706" border="0" align="right" height="75">
	  <tr>
	   <td colspan="6" align="right" ><strong>请输入新增图书信息：</strong></td>
	    </tr>
	     <tr>
	     <td colspan="6" align="right" >&nbsp;</td>
	      </tr>
	      <tr>
	       <form  name="form" method="post" action="update"> 
	       <td align="right" width="500">ISBN：
	       <input type="text" name="isbn">
	       </tr>
	       <tr>
	       <td align="right" width="500">Title：
	       <input type="text" name="title">
	       </tr>
	       <tr>
	       <td align="right" width="500">Name：
	       <input type="text" name="name">
	       </tr>
	       <tr>
	       <td align="right" width="500"> Publisher：
	       <input type="text" name="publisher">
	       </tr>
	       <tr>
	       <td align="right" width="500"> PublishDate：
	       <input type="text" name="publishDate">
	       </tr>
	       <tr>
	       <td align="right" width="500">Price：
	       <input type="text" name="price">
	       </tr>
	       <tr>
	  	   <tr>
	       <td align="right" width="500">AuthorID：
	       <input type="text" name="id">
	       </tr>
	       <tr>
	       <td align="right" width="500">Age：
	       <input type="text" name="age">
	       </tr>
	       <tr>
	       <td align="right" width="500">Country：
	       <input type="text" name="country">
	       </tr>
	    	<td align="right">
	       <input type="submit"  value="确定" ></td>
			</form>
	     </tr>
	       <tr>
	     <td align="right">
	     <p><a href="index.jsp">返回主页</a></p> 
	     </td>
	     </tr>
	   </table> 
	 </body> 
</html>
