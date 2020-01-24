<%@page import="model.NullExampleBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>自治体被災者数入力</title>
</head>
<style>
div,input {
	font-size:xx-large;
}
</style>
<body>
<%request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="nullexample" scope="application" class="model.NullExampleBean"/>
<jsp:setProperty property="city" name="nullexample" param="city"/>
<jsp:setProperty property="number" name="nullexample" param="number"/>
<h1>以下の被災情報を送ります。</h1>
<div>都市名：<jsp:getProperty property="city" name="nullexample"/></div>
<div>被災者数：<jsp:getProperty property="number" name="nullexample"/></div>
<br><br>
<form action="NullExample" method="post">
<input type="submit" value="データを登録します"/>
</form>
</body>
</html>