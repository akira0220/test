<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=" utf-8" >
<title>TEST</title>

</head>
<body>

<p>こんにちは！<%=request.getParameter("user") %>さん！</p>

<form method="post" action="total-out.jsp">
<input type="text"name="price">
<input type="text" name="count">
個+送料
<input type="text" name="delivery">
円=
<input type="submit" value="計算">
</form>




</body>
</html>