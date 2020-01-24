<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>自治体被災者数入力</title>
</head>
<style>
select, input {
	font-size:xx-large;
}

</style>
<body>
<%request.setCharacterEncoding("UTF-8");%>
<h1>該当する自治体を選択して被災者数を入力してください。</h1>
<form action="NullExampleConfirm.jsp" method="post">
<select name="city">
<%!final String cities[] = {"千葉市","市原市","いすみ市","館山市"};%>
<option value=<%=cities[0]%>><%=cities[0]%></option>
<option value=<%=cities[1]%>><%=cities[1]%></option>
<option value=<%=cities[2]%>><%=cities[2]%></option>
<option value=<%=cities[3]%>><%=cities[3]%></option>
<%request.getSession().setAttribute("cities",cities);%>
</select>
<input name="number" type="text"/>
<br>
<br>
<input type="submit"/>
</form>
</body>
</html>