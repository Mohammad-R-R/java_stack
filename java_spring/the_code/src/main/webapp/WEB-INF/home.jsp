<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<style>
div{
color :red ;}
</style>
<body>
<div>
<h1>
<c:out value="${error}"/>
</h1>
</div>
<h1>What is the code ?</h1>
<form action="/check" method="POST">
<input type = "text" name="thecode" >
<button type="submit">Try code</button>
 </form>

</body>
</html>