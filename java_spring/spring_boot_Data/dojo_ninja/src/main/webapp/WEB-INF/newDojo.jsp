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
<form:form action ="/tocreate" method="post" modelAttribute="dojo">
<form:label path="name">Name</form:label>
<form:input path="name"/>
<input type="submit" value="Create">

</form:form>

<a href="/ninja">to ninja</a>

</body>
</html>