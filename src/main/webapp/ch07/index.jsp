<%@ page language="java"  contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript" src="../scipts/jquery-3.5.1.min.js"></script>

</head>
<body>

<script type="text/javascript">

function getUserJson(){
	var url="../User/returnJson";
	var args={};
   $.post(url,args,function(data){});
	
}
</script>
<style type="text/css">.red {
color: red;
}
</style>


<!--get方法请求post  -->

<%-- <a href="../User/test2">GET</a>
<a href="../User/rest/1">GET Rest</a>
<form action="../User/test2" method="post">
<input id="post" type="submit" value="POST">
 <input  type="text" value="${test1} ">
  </form>
 <form  id="restPost" action="../User/rest" method="post">
 
 <input type="submit" value="Rest POST">
 </form>
<form id="restDelete" action="../User/delete/2" method="post">

<input type="hidden" name="_method" value="DELETE">
<input type="submit" value="REST DELETE">
</form>

<form id="restPut" action="../User/put/3" method="post">
<input type="hidden" name="_method" value="PUT">
<input type="submit" value="REST PUT">
 </form>
 <a href='../User/requestParam?loginName=admin&logpwd=123456' >request</a>
<form id='requtes' action='../User/requestParam?loginName=admin&logpwd=123456' method='get'>
<input type='submit' value='requestParam'>
</form>
<form id='saveUser' action='../User/saveUser' method='post'>
code:<input type="text" name="code"><br>
name:<input type="text" name="name"><br>
dept:<input type="text" name="dept"><br>
province:<input type="text" name="addre.province"><br>
city:<input type="text" name="addre.city"><br>
<input type="submit" value="提交">
</form>

<a href="../User/returnModelAndeView">返回值</a>
${user}
<br>
<a href="../User/sessionAttributes">sea</a>
<br>
${sessionScope.Usera}
 --%>

<a href="../User/modelAttribute"> modelAttribute </a>

<br>
${usera1}
<br>
<a href="../User/beanNameViewResolver"> beanNameViewResolver </a>

<br>
<a href="../User/redirect"> redirect </a>


<br>
<a  class='red' href='javascript:void(0)'  id='returnJson' onclick='getUserJson()'>test josn</a>



</body>
</html>