<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>列表页</title>
  </head>
  
  <body>
    <form action="topage" method="post">
    	<center>
    		<table border="1">
    			<thead>
    				<tr>
    					<td align="center" colspan="8">
    						<h2>图书借阅系统-后台管理</h2>
    						图书名称：<!-- 模糊查询 -->
    							<input name="wp.sendName" value="${wp.sendName }"/><br/>
    							<input type="submit" value="查询"/>
    							<a href="toadd2"><input type="button" value="新增"/></a>
    					</td>
    				</tr>
    			</thead>
    			<tbody>
    				<tr>
    					<td>图书编号</td>
    					<td>图书分类</td>
    					<td>图书名称</td>
    					<td>作者</td>
    					<td>出版社</td>
    					<td>入库时间</td>
    					<td>是否借阅</td>
    					<td>操作</td>
    				</tr>
    				
    				<c:forEach items="${blist }" var="b" varStatus="status">
    					<tr>
	    					<td>${b.bookcde }</td>
	    					<td>
	    						<c:if test="${b.booktype==1 }">小说</c:if>
	    						<c:if test="${b.booktype==2 }">科学</c:if>
	    						<c:if test="${b.booktype==3 }">艺术</c:if>
	    						<c:if test="${b.booktype==4 }">历史</c:if>
	    						<c:if test="${b.booktype==5 }">杂志</c:if>
	    					</td>
	    					<td>${b.bookname }</td>
	    					<td>${b.bookauthor }</td>
	    					<td>${b.publishpress }</td>
	    					<td><fmt:formatDate value="${b.publishdate }" pattern="yyyy-MM-dd"></fmt:formatDate></td>
	    					<td>
	    						<c:if test="${b.borrowed==0 }">已借阅</c:if>
	    						<c:if test="${b.borrowed==1 }">未借阅</c:if>
	    					</td>
	    					<td>
	    						<a href="toview?bid=${b.bookid }">查看</a>
	    						<a href="toupdate?bid=${b.bookid }">修改</a>
	    						<a href="todel?bid=${b.bookid }" onclick="return confirm('确认删除吗？')">删除</a>
	    					</td>
    					</tr>
    				</c:forEach>
    			</tbody>
    			
    			<thead>
    				<tr>
    					<td align="center" colspan="8">
    						共${totalRows }条记录&nbsp;&nbsp;每页显示<input type="text" name="pageSize" value="${pageSize }" style="width: 30px"/>条&nbsp;&nbsp;
    						<a href="${basePath }topage?curPage=1&pageSize=${pageSize}">首页</a>
    						<a href="${basePath }topage?curPage=${curPage - 1 }&pageSize=${pageSize}" onclick="return syi()">上一页</a>
    						<a href="${basePath }topage?curPage=${curPage + 1 }&pageSize=${pageSize}" onclick="return xyi()">下一页</a>
    						<a href="${basePath }topage?curPage=${totalPage }&pageSize=${pageSize}">末页</a>
    						第${curPage }页/共${totalPage }页&nbsp;&nbsp;
    						到第<input type="text" name="curPage" value="${curPage }" style="width: 30px"/>页
    						<input type="submit" value="确定"/>
    					</td>
    				</tr>
    			</thead>
    		</table>
    	</center>
    </form>
  </body>
  
  <script type="text/javascript">
  	function syi(){
  		if(${curPage > 1}){
  			return true;
  		}else{
  			return false;
  		}
  	}
  	
  	function xyi(){
  		if(${curPage < totalPage}){
  			return true;
  		}else{
  			return false;
  		}
  	}
  </script>
</html>
