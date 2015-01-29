<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<body>
<h2>Hello World!</h2><br>
<a href="<%=basePath %>hotel/save.do?name=香格里拉大酒店">Hotel Save</a>
</body>
</html>
