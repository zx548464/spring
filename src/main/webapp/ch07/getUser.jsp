<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="getUser" action='../User/getUser' method='post'>
code:<input type='text'  name="uMap['u1'].code">
name:<input type='text'  name="uMap['u1'].name">
code:<input type='text'  name="uMap['u2'].code">
name:<input type='text'  name="uMap['u2'].name">
code:<input type='text'  name="uMap['u2'].addre.city">
<input type='submit' value='提交'  > 



</form>
</body>
</html>