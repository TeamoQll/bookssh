<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>查看页</title>

  </head>
  
  <body>
  <center>
    <table>
    	<tr>
    		<td align="center" colspan="2">查看图书信息</td>
    	</tr>
    	<tr>
    		<td>
    			图书编号:<input type="text" name="book.bookcde" value="${book.bookcde }"/>
    		</td>
    		<td>
    			图书名称:<input type="text" name="book.bookname" value="${book.bookname }"/>
    		</td>
    	</tr>
    	<tr>
    		<td>
    			图书类型:
						<select name="book.booktype">
							<%-- <option>${book.booktype }</option> --%>
							<c:forEach items="${tlist }" var="t">
								<option value="${t.id }" <c:if test="${t.id eq book.booktype }">selected</c:if>>
									${t.typename }
								</option>
							</c:forEach>
						</select>
    		</td>
    		<td>
    			作者:<input type="text" name="book.bookauthor" value="${book.bookauthor }"/>
    		</td>
    	</tr>
    	<tr>
    		<td>
    			出版社:<input type="text" name="book.publishpress" value="${book.publishpress }"/>
    		</td>
    		<td>
    			是否借阅:
    				<select>
    						<c:if test="${book.borrowed==0 }"><option value="">已借阅</option></c:if>
    						<c:if test="${book.borrowed==1 }"><option value="">未借阅</option></c:if>
    				</select>
    		</td>
    	</tr>
    	
    	<tr>
    		<td>
    			入库人:<input type="text" name="book.createdby" value="${book.createdby }"/>
    		</td>
    		<td>
    		
    			入库时间:<input type="text" name="book.publishdate" value="<fmt:formatDate value='${book.publishdate }' pattern='yyyy-MM-dd'/>"/>
    		</td>
    	</tr>
    	
    	<tr>
    		<td align="center" colspan="2">
    			<input type="button" value="返回" onclick="history.go(-1)"/>
    		</td>
    	</tr>
    </table>
    </center>
  </body>
</html>
