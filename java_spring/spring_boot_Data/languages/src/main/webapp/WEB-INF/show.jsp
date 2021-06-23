<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
Name : ${add.name} <br>
Creator: ${add.creator}<br>
version: ${add.version}<br>

<a href="/edit/${add.id}">Edit</a> <br>
<a href="/delete/${add.id}">Delete</a>
<a href="/">dashborad</a>


</body>
</html>