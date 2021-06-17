<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
name: <c:out value="${name}"/><br>
location: <c:out value="${loc}"/><br>
language: <c:out value="${lang}"/><br>
comment: <c:out value="${comment }"/><br>
<form action="/">
<button>Go Back</button>
</form>

</body>
</html>