<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, java.util.ArrayList, model.NullExampleBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>自治体被災者数入力</title>
</head>
<style>
div {
	font-size: xx-large;
}
</style>
<body>
<h1>各自治体被災者数一覧</h1>
<%
	request.setCharacterEncoding("UTF-8");
	List<NullExampleBean> nullExampleList = (List<NullExampleBean>) this.getServletContext().getAttribute("nullExampleList");
	for(NullExampleBean value:nullExampleList){
%>
<div>
		<%=value.getCity()%>：
		<%=value.getNumber()%>
</div>
<%
	}
%>
<div>
合計：<%=request.getAttribute("total")%>
</div>
<form action="NullExample" method="post">
<div>
<input type="submit" value="再計算"/>
</div>
</form>
</body>
</html>